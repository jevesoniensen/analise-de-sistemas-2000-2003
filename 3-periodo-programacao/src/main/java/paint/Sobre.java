package paint;

import javax.swing.*;
import java .awt.event.*;
import java .awt.*;

public class Sobre extends JDialog implements ActionListener
{

	JLabel lbTitulo,lbJeveson,lbMarcus,lbAlunos,lbTurma,lbHalley;
	JButton btOK;

	JPanel paLinha1,paLinha2,paLinha3,paLinha4,paLinha5,paLinha6;

	public Sobre(JFrame owner,String titulo, boolean modal)
	{
		super(owner,titulo,modal);
		
		getContentPane().setLayout(new GridLayout(7,1));
		this.setBounds(150,150,250,300);
		lbTitulo =  new JLabel("Paint Vers�o 1.0",JLabel.CENTER);
		lbAlunos = new  JLabel("Alunos:                                     ");
		lbJeveson = new JLabel(" - Jeveson Iensen                      ");
		lbMarcus =  new JLabel(" - Marcus Vinicius W. Ferreira  ");
		lbHalley =  new JLabel(" - Halley H. Nikolak            ");
		lbTurma = new JLabel(" - Turma B                               ");
		btOK = new JButton("OK");
		
		paLinha1 = new JPanel();


		getContentPane().add(lbTitulo);
		getContentPane().add(lbAlunos);
		getContentPane().add(lbJeveson);
		getContentPane().add(lbMarcus);
		getContentPane().add(lbHalley);
		getContentPane().add(lbTurma);
		getContentPane().add(paLinha1);
		Font fonte= new Font("Verdana",Font.PLAIN,11);
		lbTitulo.setFont(new Font("Verdana",Font.BOLD,14));
		lbAlunos.setFont(fonte);
		lbJeveson.setFont(fonte);
		lbMarcus.setFont(fonte);
		lbHalley.setFont(fonte);
		lbTurma.setFont(fonte);

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






