package gerenciadordeciclos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CadastraTarefa extends JDialog implements ActionListener
{	
	DropPanel dp;
	JLabel lbTarefa,lbDescr,lbResp;
	JTextField tfDescr,tfResp;
	JButton btCadastrar;
	JPanel jpn;
	int numtarefa;
	JLabel l;
	public CadastraTarefa(JFrame owner, String titulo, boolean modal,int numtarefa,DropPanel dp,JLabel l)
	{
		super(owner,titulo,modal);
		this.numtarefa=numtarefa;
		this.dp=dp;
		this.l=l;
		lbTarefa = new JLabel("Tarefa " + numtarefa);			
		lbDescr =   new JLabel("Descri��o: ");			
		tfDescr = new JTextField(30);
		lbResp =    new JLabel("Respons�vel: ");			
		tfResp = new JTextField(30);
		btCadastrar = new JButton("Cadastrar");			
		getContentPane().setLayout(new GridLayout(4,1));
		jpn=new JPanel();
		jpn.setLayout(new FlowLayout());
		jpn.add(lbDescr);
		jpn.add(tfDescr);
		getContentPane().add(lbTarefa);	
		getContentPane().add(jpn);	
		jpn=new JPanel();
		jpn.setLayout(new FlowLayout());
		jpn.add(lbResp);
		jpn.add(tfResp);
		getContentPane().add(jpn);			
		getContentPane().add(btCadastrar);	
		btCadastrar.addActionListener(this);
		pack();
		setLocation(362,297);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() instanceof JButton)
		{
			JButton temp = (JButton)e.getSource();
			if(temp == btCadastrar)
			{
				setVisible(false);
				Tarefas t = new Tarefas(numtarefa,tfDescr.getText(),tfResp.getText(),l);
				((DropPanel)dp).vecTarefas.add(t);
			}
		}
	}
}