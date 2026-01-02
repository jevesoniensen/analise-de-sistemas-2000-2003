package gerenciadordeciclos;

import javax.swing.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class Tela extends JFrame implements ActionListener
{
	
	JMenuBar mbMenu;
	JMenu mnArquivo,mnAjuda;
	JMenuItem miSair,miNovo,miAbrir,miSalvar,miSalvar_Como,miSobre;//Arquivo
	
	
	Serial serial;
	JPanel pnEsq,pnDir,pnTarefas,panel,pnDirCentro,pnCentro,pnInferior;
	DropPanel pnDrop;
	JButton btSair,btCalcular;
	JLabel  lbTarefas;

	JTextField tfTempomin,tfCamCritico;
	
	String arquivo=null;
	
	JList lsTarefas;
	DefaultListModel listModel;
			
	public Tela(String Titulo)
	{
		super(Titulo);
		getContentPane().setLayout(new BorderLayout());
		inicializaPanelEsq();
		inicializaPanelDir();
		inicializaPanelCentro();
		inicializaPanelInferior();
		
		serial=new Serial();
		mbMenu = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnAjuda = new JMenu("Ajuda");
		miSobre = new JMenuItem("Sobre");
		miSair = new JMenuItem("Sair");
		miNovo = new JMenuItem("Novo");
		miAbrir = new JMenuItem("Abrir");
		miSalvar_Como = new JMenuItem("Salvar Como");
		miSalvar = new JMenuItem("Salvar");
		mnArquivo.add(miNovo);
		mnArquivo.add(miAbrir);
		mnArquivo.add(miSalvar);
		mnArquivo.add(miSalvar_Como);
		mnArquivo.add(new JSeparator());
		mnArquivo.add(miSair);
		mnAjuda.add(miSobre);
		mbMenu.add(mnArquivo);
		mbMenu.add(mnAjuda);
		setJMenuBar(mbMenu);
		
		
		setSize(700,500);
		setLocation(50,50);
		setVisible(true);		
		enableEvents(WindowEvent.WINDOW_CLOSING);		
		btSair.addActionListener(this);	
		btCalcular.addActionListener(this);
		miSair.addActionListener(this);
		miNovo.addActionListener(this);
		miAbrir.addActionListener(this);
		miSalvar.addActionListener(this);
		miSalvar_Como.addActionListener(this);
		miSobre.addActionListener(this);
	}
	
	public void inicializaPanelEsq()
	{
		listModel = new DefaultListModel();
		listModel.addElement("    Tarefas                Tempo");
		lsTarefas =  new JList(listModel);
		lsTarefas.setSelectedIndex(0);
		
		pnTarefas = new JPanel();
		pnEsq = new JPanel();		           
		lbTarefas = new JLabel("Cadastro de Tarefas",JLabel.CENTER);		
		pnTarefas.setLayout(new BorderLayout());
		pnEsq.setLayout(new BorderLayout());
		pnTarefas.add("North", lbTarefas);
		pnTarefas.add("South", new DragItem(new ImageIcon("middle.gif")));		
		pnEsq.add("North", pnTarefas);
		pnEsq.add("Center", lsTarefas);
		getContentPane().add("West",pnEsq);		
	}

	public void inicializaPanelInferior()
	{
		tfCamCritico = new JTextField(50);
		tfCamCritico.setEnabled(false);
		pnInferior= new JPanel();
		pnInferior.setLayout(new FlowLayout());
		pnInferior.add(new JLabel("Caminho Cr�tico: "));
		pnInferior.add(tfCamCritico);
		pnCentro.add("South",pnInferior);

	}
	public void inicializaPanelDir()
	{
		tfTempomin=new JTextField(10);
		tfTempomin.setEnabled(false);

		btSair = new JButton("Sair");
		btCalcular = new JButton("Calcular");
		this.pnDirCentro=new JPanel();
		this.pnDirCentro.setLayout(new FlowLayout());
		pnDirCentro.add(this.tfTempomin);
		panel= new JPanel();
		panel.setLayout(new GridLayout(2,1));
		pnDir = new JPanel();
		lbTarefas = new JLabel("Tempo M�nimo",JLabel.CENTER);		
		panel.add(btCalcular);
		panel.add(btSair);
		pnDir.setLayout(new BorderLayout());
		pnDir.add("North",lbTarefas);
	    pnDir.add("South", panel);
	    pnDir.add("Center", pnDirCentro);
		getContentPane().add("East",pnDir);
	}
		
	public void inicializaPanelCentro()
	{
		pnCentro = new JPanel();
		pnDrop = new DropPanel(this);
		this.pnDrop=pnDrop;
		pnCentro.setLayout(new BorderLayout());
		pnCentro.add("Center",pnDrop);
		getContentPane().add("Center",pnCentro);
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

	public void novo()
	{
		pnDrop.setVisible(false);
		remove(pnDrop);
		listModel.clear();
		tfCamCritico.setText("");
		this.tfTempomin.setText("");
		listModel.addElement("    Tarefas                Tempo");
		lsTarefas.setSelectedIndex(0);
		//inicializaPanelCentro();	
		pnDrop= new DropPanel(this);
		pnCentro.add("Center",pnDrop);
		arquivo=null;		
		
	}	
	
	
	public void calculoTotal()
	{
		Vector aux, aux2;
		aux2 =  new Vector();
		Calculos calculo = new Calculos(pnDrop.vecTempoTarefas,pnDrop.numComponentes,true);				
		aux = calculo.retornaCiclos();
		if(aux == null)
		{
			int tempo = calculo.getTempoMinimo();
			Vector cc = calculo.getCamCritico();
			String caminho="";
			for(int i=0;i<cc.size();i++)
			{
				if(i != cc.size()-1)
					caminho = caminho + cc.elementAt(i) + " - ";
				else
					caminho = caminho + cc.elementAt(i);
			}
			tfCamCritico.setText(caminho);	
			tfTempomin.setText(String.valueOf(tempo));	
		}
		else
		{
				      aux2   =  new Vector();
			int       value  = 0,
			          v_test = -1;
			boolean adiciona = false;
			for(int i = 0; i < aux.size();i++)
			{
				value  = ((Integer)aux.elementAt(i)).intValue() + 1 ;
				v_test = ((Integer)aux.elementAt(aux.size() -1)).intValue() + 1 ;
				if(value == v_test)
					adiciona = true;
			
				if(adiciona)
					aux2.add(new Integer(value));
			}
			new Alerta(this,"DeadLock", true, aux2);		
		}
	}
		
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() instanceof JButton)
		{
			JButton temp = (JButton)e.getSource();
			if(temp == btSair)
			{
				System.exit(0);
			}
			else
			if(temp == btCalcular)
			{
				calculoTotal();
			}
		}
		else
		if(e.getSource() instanceof JMenuItem)
		{
			JMenuItem temp1 = (JMenuItem)e.getSource();
			if(temp1 == miSobre)
			{
				new Sobre(this,"Sobre o Gerenciador de Tarefas 2.0 ",true);
			}
			else
			if(temp1 == miSair)
				System.exit(0);
			else			
			if(temp1 == miNovo)
			{
				novo();
			}
			else			
			if(temp1 == miAbrir)
			{
				tfCamCritico.setText("");
				this.tfTempomin.setText("");
				//pnDrop.setVisible(false);
				arquivo = serial.abrir(this,pnDrop);
				listModel.clear();
				listModel.addElement("    Tarefas                Tempo");
				lsTarefas.setSelectedIndex(0);				
				pnDrop.vecx1y1 = (Vector)pnDrop.vecSalvar.elementAt(0);
				pnDrop.vecx2y2 = (Vector)pnDrop.vecSalvar.elementAt(1);
				pnDrop.vecTempoTarefas = (Vector)pnDrop.vecSalvar.elementAt(2);
				pnDrop.vecTarefas = (Vector)pnDrop.vecSalvar.elementAt(3);
				pnDrop.removeAll();				
				for(int x=0;x<pnDrop.vecTarefas.size();x++)
				{
					pnDrop.add(((Tarefas)pnDrop.vecTarefas.elementAt(x)).getIcone());
					((Tarefas)pnDrop.vecTarefas.elementAt(x)).getIcone().addMouseListener(pnDrop);
				}
				pnDrop.numComponentes=pnDrop.getComponentCount();
				pnDrop.cont1=pnDrop.vecTarefas.size();
				for(int i=0;i<pnDrop.vecTempoTarefas.size();i++)
				{
					Relacionamentos rel = (Relacionamentos)pnDrop.vecTempoTarefas.elementAt(i);
					listModel.addElement("      "+ rel.getTarefaA() +" --> "+ rel.getTarefaB() +"                      "+rel.getTempoExec());
				}
				pnDrop.numComponentes=((Tarefas)pnDrop.vecTarefas.elementAt(pnDrop.vecTarefas.size()-1)).getTarefa();
				calculoTotal();
				pnDrop.repaint();
			}
			else
			{
				Component[] comps = pnDrop.getComponents();
				for(int x=0; x<comps.length;x++)
				{
					if(comps[x] instanceof Icone)
						((Icone)comps[x]).removeMouseListener(pnDrop);					
				}
				if(temp1 == miSalvar_Como)
					arquivo = serial.salvarComo(this,pnDrop.vecSalvar);
				else
				if(temp1 == miSalvar)
				{
					if(arquivo != null)
						serial.salvar(arquivo,pnDrop.vecSalvar);
					else
						arquivo = serial.salvarComo(this,pnDrop.vecSalvar);			
				}
				for(int x=0; x<comps.length;x++)
				{
					if(comps[x] instanceof Icone)
						((Icone)comps[x]).addMouseListener(pnDrop);					
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Iniciando o Gerenciador de Tarefas...");
		new Tela("Gerenciador de Tarefas");
	}
	
}