package agenda;

import java .awt.*;
import java .awt.event.*;

public class Sobre extends Dialog implements ActionListener
{

	Label lbTitulo,lbJeveson,lbMarcus,lbAlunos,lbTurma;
	Button btOK;

	Panel paLinha1,paLinha2,paLinha3,paLinha4,paLinha5,paLinha6;

	public Sobre(Frame owner,String titulo, boolean modal)
	{
		super(owner,titulo,modal);
		
		setLayout(new GridLayout(6,1));
		lbTitulo =  new Label("agenda.Cliente Vers�o 2.0",Label.CENTER);
		lbAlunos = new  Label("Alunos:                                     ");
		lbJeveson = new Label(" - Jeveson Iensen                      ");
		lbMarcus =  new Label(" - Marcus Vinicius W. Ferreira  ");
		lbTurma = new Label(" - Turma B                               ");
		btOK = new Button("OK");
		
		paLinha1 = new Panel();


		add(lbTitulo);
		add(lbAlunos);
		add(lbJeveson);
		add(lbMarcus);
		add(lbTurma);
		add(paLinha1);
		Font fonte= new Font("Verdana",Font.PLAIN,11);
		lbTitulo.setFont(new Font("Verdana",Font.BOLD,14));
		lbAlunos.setFont(fonte);
		lbJeveson.setFont(fonte);
		lbMarcus.setFont(fonte);
		lbTurma.setFont(fonte);

		paLinha1.setLayout(new FlowLayout());
		paLinha1.add(btOK);

		btOK.addActionListener(this);
		enableEvents(WindowEvent.WINDOW_CLOSING);
		pack();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() instanceof Button)
		{
			Button temp = (Button)e.getSource();
			if(temp == btOK)
			{
				setVisible(false);
			}
		}
		
	}
	
	public void processWindowEvent(WindowEvent e) 
	{
		switch (e.getID())
		{
			case WindowEvent.WINDOW_CLOSING:
				setVisible(false); 
				return;

			default:
				super.processWindowEvent(e);
		}
	}
}






