package gerenciadordeciclos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MostraDescTarefa extends JDialog implements ActionListener
{	
	JLabel lbTarefa,lbDescr,lbResp;
	JButton btOK;
	JPanel jpn;
	int numtarefa;
	String descricao,responsavel;
	public MostraDescTarefa(JFrame owner, String titulo, boolean modal,int numtarefa,String descricao,String responsavel)
	{
		super(owner,titulo,modal);
		this.numtarefa=numtarefa;
		this.descricao=descricao;
		this.responsavel=responsavel;
		lbTarefa = new JLabel("Tarefa " + numtarefa);			
		lbDescr =   new JLabel("Descri��o: " + descricao);
		lbResp=	new JLabel("Respons�vel: " + responsavel);
		btOK = new JButton("OK");			
		getContentPane().setLayout(new GridLayout(4,1));
		getContentPane().add(lbTarefa);	
		getContentPane().add(lbDescr);
		getContentPane().add(lbResp);	
		getContentPane().add(btOK);	
		btOK.addActionListener(this);
		pack();
		setLocation(362,297);
		setVisible(true);
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