package agenda;

import java .awt.*;
import java .awt.event.*;

public class Principal extends Frame implements ActionListener
{
	Button btConsole,btGrafico,btSair;	
	Label lbTitulo,lbOpcao;
	

	
	Panel paTitulo;
	Panel paLinha1;
		
	public Principal()
	{
		this("");
	}

	public Principal(String titulo)
	{
		super(titulo);
		setLayout(new GridLayout(2,1));	

		btConsole = new Button(" Console ");
		btGrafico = new Button("Gráfico");
		btSair = new Button("    Sair    ");

		lbTitulo = new Label(" -=- agenda.Cliente Versão 2.0 -=-",Label.CENTER);
		lbOpcao = new Label("Texto");	

		lbTitulo.setFont(new Font("Verdana",Font.BOLD,16));
		
		Panel paLinha1 = new Panel();
					
		add(lbTitulo);
		add(paLinha1);
		
		
		paLinha1.setLayout(new FlowLayout());
		paLinha1.add(btConsole);
		paLinha1.add(btGrafico);
		paLinha1.add(btSair);
		
		btConsole.addActionListener(this);	
		btGrafico.addActionListener(this);	
		btSair.addActionListener(this);	
		pack();
		
		enableEvents(WindowEvent.WINDOW_CLOSING);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() instanceof Button)
		{
			Button temp = (Button)e.getSource();
			if(temp == btConsole)
			{
				Aplicacao c = new Aplicacao(
					);
				c.executa();
			}
		}
		
		if(e.getSource() instanceof Button)
		{
			Button temp = (Button)e.getSource();
			if(temp == btGrafico)
			{
				App a = new App("agenda.Cliente 2.0");
				a.setLocation(250,200);
				a.setVisible(true);
				this.setVisible(false);
			}
		}
		
		if(e.getSource() instanceof Button)
		{
			Button temp = (Button)e.getSource();
			if(temp == btSair)
			{
				System.exit(0);
			}
		}
	}
	
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
		Principal a = new Principal("agenda.Cliente 2.0");
		a.setLocation(300,250);
		a.setVisible(true);
	}
	
}