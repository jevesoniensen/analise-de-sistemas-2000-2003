import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;

public class Grafico extends Canvas implements Runnable// ActionListener 
{
	Vector A;
	Vector B;
	Vector C;

	Principal principal;
	
	String disco;

	Thread t;
	
	int n=16;
	int i=0;

	int[] tam_disc;
	int[] cent_disc;


	public void setNumDiscos(int num)
	{
		this.n=num;
		inicio();
		A.removeElementAt(0);
	}


	public void tamanho()
	{
		for(int j = 0; j < n; j++)
			tam_disc[j] = (j+1) * 10;
	}

	public void center()
	{
		for(int j = 0; j < n; j++)
			cent_disc[j]= 109 + 2 - (tam_disc[j]/2);
	}


	public Grafico(Principal principal)
	{		
		A = new Vector();
		B = new Vector();
		C = new Vector();
		tam_disc = new int[n];
		cent_disc = new int[n];
		setSize(635,330);
		setBackground(Color.lightGray );
		this.principal=principal;
		inicio();
		show();
		tamanho();
		center();
		enableEvents(WindowEvent.WINDOW_CLOSING);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.darkGray);
		for(int i=0; i < 3; i++)	//100	  200
			g.fillRect(109 + i * 200, 140, 5, 160);

		g.setColor(Color.red);

		for(int i=0; i < A.size();i++)
		{
			g.fillRect(cent_disc[Integer.parseInt((String)A.elementAt(i))-1], 294-(10*i), tam_disc[Integer.parseInt((String)A.elementAt(i))-1], 5);
		}

		for(int i=0; i < B.size();i++)
		{
			g.fillRect(cent_disc[Integer.parseInt((String)B.elementAt(i))-1]+200, 294-(10*i), tam_disc[Integer.parseInt((String)B.elementAt(i))-1], 5);
		}

		for(int i=0; i < C.size();i++)
		{
			g.fillRect(cent_disc[Integer.parseInt((String)C.elementAt(i))-1]+400, 294-(10*i), tam_disc[Integer.parseInt((String)C.elementAt(i))-1], 5);
		}
	}

	public void inicio()
	{
		
		
		if(A.size()!=0)
			for(i=A.size()-1;i>0;i--)
				A.removeElementAt(A.size()-1);				
		if(B.size()!=0)
			for(i=B.size()-1;i>0;i--)
				B.removeElementAt(B.size()-1);
		if(C.size()!=0)
			for(i=C.size()-1;i>=0;i--)
				C.removeElementAt(C.size()-1);
		for(int i=0;i<n;i++)
		{
			disco=disco.valueOf(n-i);
			A.add(disco);
		}
		this.i=0;
		repaint();
	}
	
	public void iniciaGrafico(boolean inicia)
	{
		if(inicia)
		{
			t =new Thread(this);
			t.start();
		}
		else
		{
			inicio();
			A.removeElementAt(0);
			B.removeElementAt(0);
			t.stop();		
		}
	}

	public void run()
	{		
		processa(n,A,B,C);
		principal.btReiniciar.enable();
		principal.tfDiscos.disable();
	}

	public void processa(int n,Vector A,Vector B, Vector C)
 	{
   		if( n == 1 )
   		{

		    C.add((String)A.elementAt(A.size()-1));
		    A.removeElementAt(A.size()-1);
		  	repaint();
			principal.tfPassos.setText(String.valueOf(++i));
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exceçao!!");
			}
		}
	 	else
   		{
	    	processa( n - 1, A, C, B );
			C.add((String)A.elementAt(A.size()-1));
			A.removeElementAt(A.size()-1);
			repaint();
			principal.tfPassos.setText(String.valueOf(++i));
			try
			{
					Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exceçao!!");
			}
		    processa( n - 1, B, A, C );
			repaint();
		}
 	}
}