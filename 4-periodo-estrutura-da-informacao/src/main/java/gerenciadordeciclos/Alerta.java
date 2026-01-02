package gerenciadordeciclos;

import javax.swing.*;
import java .awt.event.*;
import java .awt.*;
import java .util.*;

public class Alerta extends JDialog implements ActionListener
{

	JLabel lbTitulo,lbJeveson,lbMarcus,lbAlunos,lbTurma,lbFlavia;
	JButton btOK;

	JPanel paLinha1,paLinha2,paLinha3,paLinha4,paLinha5,paLinha6;

	public Alerta(JFrame owner,String titulo, boolean modal, Vector ciclo)
	{
		super(owner,titulo,modal);
		
		//Vector aux = ciclo;
		
		getContentPane().setLayout(new GridLayout(7,1));
		this.setBounds(150,150,250,300);
		lbTitulo =  new JLabel("Gerenciador de Tarefas 2.0",JLabel.CENTER);
		lbAlunos = new  JLabel("  � Impossivel Resolver");
		lbJeveson = new JLabel("   O Seguinte Ciclo entre as Tarefas: ");
		lbMarcus =  new JLabel("  " + ciclo.toString());
		lbFlavia =  new JLabel("  ");
		lbTurma = new JLabel(" ");
		btOK = new JButton("OK");
		
		paLinha1 = new JPanel();


		getContentPane().add(lbTitulo);
		getContentPane().add(lbAlunos);
		getContentPane().add(lbJeveson);
		getContentPane().add(lbMarcus);
		getContentPane().add(lbFlavia);
		getContentPane().add(lbTurma);
		getContentPane().add(paLinha1);
		
		paLinha1.setLayout(new FlowLayout());
		paLinha1.add(btOK);

		btOK.addActionListener(this);
		setVisible(true);
		enableEvents(WindowEvent.WINDOW_CLOSING);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() instanceof JButton)
		{
			JButton temp = (JButton)e.getSource();
			if(temp == btOK)
			{
				setVisible(false);
			}
		}
		
	}
}






