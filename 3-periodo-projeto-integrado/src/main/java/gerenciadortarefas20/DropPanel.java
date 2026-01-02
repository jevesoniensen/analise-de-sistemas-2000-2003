package gerenciadortarefas20;

import javax.swing.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;


public class DropPanel extends JPanel implements DropTargetListener,MouseListener,ActionListener
{
	DropTarget dropTarget;

	Icone l;
	
 	JFrame jfPai;
 	JLabel aux;
	
	Vector vecx1y1,vecx2y2,vecTempoTarefas,vecTarefas,vecSalvar;
	
	int x1,y1,cont,cont1,guardaNomeTarefa,numComponentes;
	
	JPopupMenu popup;	
	JMenuItem miPropriedades;
		
	public DropPanel(JFrame jfPai)
	{		
		super(null);
		this.jfPai = jfPai;
		cont = 0;
		x1 = 0;
		y1 =0;
		setBackground(Color.lightGray);
		dropTarget = new DropTarget(this,this);		
		vecx1y1 = new Vector();
		vecx2y2 = new Vector();
		vecTempoTarefas = new Vector();
		vecTarefas=new Vector();
		vecSalvar= new Vector();
		//serializa�ao
		
		adicionaVecSalvar();
		
		//-------------
		

		popup=new JPopupMenu();
		miPropriedades = new JMenuItem("Propriedades");
		popup.add(miPropriedades);
		miPropriedades.addActionListener(this);

	}
	
	public void adicionaVecSalvar()
	{
		vecSalvar.add(vecx1y1);
		vecSalvar.add(vecx2y2);
		vecSalvar.add(vecTempoTarefas);
		vecSalvar.add(vecTarefas);
	}
	
	public void dragEnter(DropTargetDragEvent e)
	{
		e.acceptDrag(DnDConstants.ACTION_COPY_OR_MOVE);
	}
	
	public void dragExit(DropTargetEvent e)
	{}
	
	public void dragOver(DropTargetDragEvent e)
	{}
	
	public void drop(DropTargetDropEvent e)
	{
		try
		{
			Transferable tr = e.getTransferable();
			DataFlavor MyDataFlavor = new DataFlavor(Icone.class,DataFlavor.javaJVMLocalObjectMimeType);
			if(tr.isDataFlavorSupported(MyDataFlavor))
			{
				e.acceptDrop(DnDConstants.ACTION_COPY);
				l = (Icone)tr.getTransferData(MyDataFlavor);
				add(l);
				l.setText("Tarefa " + (++cont1));
				l.setVerticalTextPosition(JLabel.BOTTOM);
				l.setHorizontalTextPosition(JLabel.CENTER);
				l.setLocation(e.getLocation());
				l.addMouseListener(this);
				l.setVisible(true);
				l.setSize(l.getPreferredSize());
				e.dropComplete(true);
				validate();
				String msg="Tarefa "+(cont1);
				CadastraTarefa dlg = new CadastraTarefa(jfPai,msg,true,cont1,this,l);
				//dlg.setVisible(true);
			}
			else{
				System.out.println("Errado");
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
			e.rejectDrop();
		}
	}
	
	public void dropActionChanged(DropTargetDragEvent e)
	{}
	
	
	public int getPosicaoComponente(Component e)
	{
		Component[] aux = getComponents();
		for(int i=0; i < aux.length;i++)
			if(e == aux[i])	
				return i+1;
		return -1;					
	}
		
	public void mousePressed(MouseEvent e)
	{					
		if(e.getModifiers() == MouseEvent.BUTTON1_MASK)
		{	
			if(cont == 0)
			{		  			
				guardaNomeTarefa = getPosicaoComponente(e.getComponent());
		   		vecx1y1.add(e.getComponent());
		   		vecSalvar.setElementAt(vecx1y1,0);
		   		cont++;
			}
	    	else
	    	{	
	    			vecx2y2.add(e.getComponent());
		   			vecSalvar.setElementAt(vecx2y2,1);	    	 
					cont = 0;
					repaint();
					new GuardaTempos(jfPai,"Tempo da Tarefa",true,guardaNomeTarefa,getPosicaoComponente(e.getComponent()),this);
			}
		}
		else
		{
			aux = (JLabel) e.getComponent();
			popup.show(e.getComponent(),e.getX(),e.getY());
		}
	}


	public void paint(Graphics g)
	{
		super.paint(g);
		int deslocX,deslocY,largCompo,largIcone;
		Point x1,x2;
		Component comp1,comp2;
		JLabel jl;
		if(vecSalvar.size() !=0)
		{
			Vector aux=(Vector)vecSalvar.elementAt(3);
			for(int i=0;i<vecTarefas.size();i++)
			{
				jl= ((Tarefas)aux.elementAt(i)).getIcone();
				jl.setVisible(true);
			}
			aux=(Vector)vecSalvar.elementAt(0);
			Vector aux1=(Vector)vecSalvar.elementAt(1);
			for(int i=0;i<aux1.size();i++)
			{
				comp1=(Component)aux.elementAt(i);
				comp2=(Component)aux1.elementAt(i);
				largCompo = comp1.getWidth();
	    		largIcone = ((Icone)comp1).getIcon().getIconWidth();
	    		deslocX = ((largCompo - largIcone)/2) + (largIcone/2);
	    		deslocY = ((Icone)comp1).getIcon().getIconHeight()/2;	 		 
				x1=comp1.getLocation();
				x2=comp2.getLocation();
		 		g.drawLine((int)x1.getX()+deslocX,(int)x1.getY()+deslocY,(int)x2.getX()+deslocX,(int)x2.getY()+deslocY);
			}		 
		}
	}
		 
	public void mouseReleased(MouseEvent e)
	{}
			
	public void mouseEntered(MouseEvent e)
	{}
	
	public void mouseExited(MouseEvent e)
	{}
	
	public void mouseClicked(MouseEvent e)
	{}	
	
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource() instanceof JMenuItem)
		{
			JMenuItem temp = (JMenuItem)e.getSource();
			Tarefas t;
			String str;
			if(temp == miPropriedades)
			{
				System.out.println(vecTarefas.size());
				for(int i=0;i<vecTarefas.size();i++)
				{
					t = (Tarefas)vecTarefas.elementAt(i);
					if(t.getIcone()==aux)
					{
						str="Tarefa " + t.getTarefa();
						new MostraDescTarefa(jfPai,str,true,t.getTarefa(),t.getDescricao(),t.getResponsavel());
						break;
					}						
						
				}
		
			}
		}		
	}
	class GuardaTempos extends JDialog implements ActionListener
	{	
		DropPanel dp;
		JLabel lbMensagem;
		JTextField tfTempo;
		JButton btGravar;
		int tarefaa,tarefab;
		GuardaTempos(JFrame owner, String titulo, boolean modal,int tarefaa, int tarefab,DropPanel dp)
		{
			super(owner,titulo,modal);
			this.dp=dp;
			lbMensagem = new JLabel("Digite O tempo de Execu��o da Tarefa " + tarefaa + " at� a Tarefa " + tarefab);			
			tfTempo = new JTextField(5);
			btGravar = new JButton("Gravar");			
			getContentPane().setLayout(new BorderLayout());
			getContentPane().add("North",lbMensagem);	
			getContentPane().add("Center",tfTempo);	
			getContentPane().add("South",btGravar);	
			btGravar.addActionListener(this);
			this.tarefaa = tarefaa;
			this.tarefab = tarefab;
			pack();
			setLocation(362,297);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() instanceof JButton)
			{
				JButton temp = (JButton)e.getSource();
				if(temp == btGravar)
				{
					if(tfTempo.getText() != "")
					{
						vecTempoTarefas.add(new Relacionamentos(tarefaa,tarefab,Integer.parseInt(this.tfTempo.getText())));
						setVisible(false);
						((Tela)jfPai).listModel.addElement("      "+tarefaa +" --> "+tarefab+"                      "+tfTempo.getText());
						numComponentes=dp.getComponentCount();
					}
				}
			}
		}
	}
}
	