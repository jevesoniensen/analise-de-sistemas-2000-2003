import java .awt.*;
import java .awt.event.*;


public class Principal extends Frame implements ActionListener,FocusListener
{

	Panel p,p1;
	Grafico g;

	Button	btResolver,btReiniciar,btSair,btCancelar;
	TextField tfPassos,tfDiscos;
	Label lbTitulo,lbDiscos;

	public Principal(String titulo)
	{
		super(titulo);
		setLayout(new BorderLayout());

		p = new Panel();
		p.setBackground(Color.lightGray);
		p.setFont(new Font("Verdana",Font.BOLD,30));
		lbTitulo= new Label("Torres de Hanoi");
		p.add(lbTitulo);
		add("North",p);

		p = new Panel();
		g = new Grafico(this);
		add("Center",g);
		
		p = new Panel();
		p.setLayout(new GridLayout(2,1));
		add("South",p);
		
		
		p1 = new Panel();
		p1.add(new Label("Passos:"));
		tfPassos = new TextField(3);
		tfPassos.disable();
		p1.add(tfPassos);
		
		
		tfDiscos = new TextField(0);
		p1.add(new Label("     Nº de Discos:"));
		p1.add(tfDiscos);		
		
		p.add(p1);		


		p1 = new Panel();
		btResolver=new Button("Resolver");
		p1.add(btResolver);

		
		btCancelar=new Button("Cancelar");
		p1.add(btCancelar);	
		btCancelar.disable();	
		
		btReiniciar=new Button("Reiniciar");
		btReiniciar.disable();
		p1.add(btReiniciar);
		
		btSair=new Button("     Sair     ");
		p1.add(btSair);
		
		p.add(p1);
		
		pack();

		enableEvents(WindowEvent.WINDOW_CLOSING);
		
		btResolver.addActionListener(this);
		btReiniciar.addActionListener(this);
		btCancelar.addActionListener(this);
		btSair.addActionListener(this);
		tfDiscos.addFocusListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() instanceof Button)
		{
			Button btTemp = (Button)e.getSource();
			if(btTemp == btResolver)
			{
				g.iniciaGrafico(true);
				btResolver.disable();
				btCancelar.enable();
			}
			else 
			if(btTemp == btReiniciar)
			{
				tfPassos.setText("");
				btResolver.enable();
				btReiniciar.disable();
				tfDiscos.enable();
				g.inicio();
			}
			else
			if(btTemp == btSair)
			{
				System.exit(0);
			}
			else
			if(btTemp == btCancelar)
			{
				g.iniciaGrafico(false);
				tfPassos.setText("");
				btResolver.enable();
				btCancelar.disable();
			}
			
		}		
	}
	public void focusGained(FocusEvent e) 
	{
		if(e.getSource() instanceof TextField)
		{
			TextField tfTemp = (TextField)e.getSource();
			if(tfTemp == tfDiscos)
			{
				System.out.println("recebe_foco");
				btResolver.disable();				
			}		
		}
	}
	public void focusLost(FocusEvent e) 
	{		
		if(e.getSource() instanceof TextField)
		{
			TextField tfTemp = (TextField)e.getSource();
			if(tfTemp == tfDiscos)
			{
				btResolver.enable();
				int temp = 0;
				temp = Integer.parseInt(tfDiscos.getText());
				System.out.println("perde_foco");
				g.setNumDiscos(temp);
			}		
		}
	}


	/*if(e.getSource() instanceof TextField)
		{
			TextField txTemp = (TextField)e.getSource();
			if(txTemp == tfDiscos)
			{
				g.setNumDiscos(16);
				System.out.println("Deu Certo");
			}
		}*/



	public void processWindowEvent(WindowEvent e) 
	{
		switch (e.getID())
		{
			case WindowEvent.WINDOW_CLOSING: 
				System.exit(0);
				return;

			default:
				super.processWindowEvent(e);
		}
	}
	public static void main(String args[])
	{
		Principal principal=new Principal("Hanoi");
		principal.setVisible(true);
	}

}

