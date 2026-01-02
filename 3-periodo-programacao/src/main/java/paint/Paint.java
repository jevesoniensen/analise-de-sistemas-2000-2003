package paint;

import java.util.Vector;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Paint extends JFrame implements ActionListener,ItemListener,MouseListener,MouseMotionListener
{
	private JMenuBar mbMenu;
	private JMenu mnArquivo,mnDesenho,mnTipo,mnAjuda;
	private JMenuItem miSair,miNovo,miAbrir,miSalvar,miSalvar_Como,miSobre;//Arquivo
	private JMenuItem miTrocaCor,miDesloca,miEscala,miRemover; // PopUp
	private JCheckBoxMenuItem cbmiReta,cbmiQuadrado,cbmiElipse,cbmiTriangulo,cbmiCirculo;
	private JButton btCor;
	private Container frame;
	private JPanel pnCor,pnMenu;
	private JCheckBox jcbCor;
	private Color corSelecionada;
	private PaintPanel pp;
	private EditorGrafico eg;
	private String arquivo = null;
	private int x1,x2,y1,y2;
	private JColorChooser jccCor;
	private JPopupMenu pmnBotaoDireito;
	private Primitiva primSelecionada = null;
	private boolean desloca;
	
	public Paint()
	{
		this("Paint");
	}
	
	public Paint(String titulo)
	{
		super(titulo);
		setSize(640,480);
		setLocation(100,100);
		desloca = false;
		
		// Instanciando Componentes		
		eg = new EditorGrafico();
		pp = new PaintPanel();
		pp.setBackground(Color.white);
		jcbCor = new JCheckBox("Cor selecionada");
		jcbCor.setEnabled(false);
		btCor = new JButton("Cor");
		pnCor = new JPanel();
		pnMenu = new JPanel(new GridLayout(3,1));
		mbMenu = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnDesenho = new JMenu("Desenho");
		mnAjuda = new JMenu("Ajuda");
		mnTipo = new JMenu("Tipo de desenho");
		miSair = new JMenuItem("Sair");
		miNovo = new JMenuItem("Novo");
		miAbrir = new JMenuItem("Abrir");
		miSobre = new JMenuItem("Sobre");
		miSalvar_Como = new JMenuItem("Salvar Como");
		miSalvar = new JMenuItem("Salvar");
		cbmiReta = new JCheckBoxMenuItem("Reta");
		cbmiQuadrado = new JCheckBoxMenuItem("Quadrado");
		cbmiElipse = new JCheckBoxMenuItem("Elipse");
		cbmiTriangulo = new JCheckBoxMenuItem("Tri�ngulo");
		cbmiCirculo = new JCheckBoxMenuItem("Circulo");
		pmnBotaoDireito = new JPopupMenu("Op��es para o desenho");
		miTrocaCor = new JMenuItem("Troca a Cor");
		miDesloca = new JMenuItem("Deslocar");
		miEscala = new JMenuItem("Escala");
		miRemover = new JMenuItem("Remover");
		jccCor = new JColorChooser();
		
		frame = getContentPane();		
		
		// Alocando Componentes no Frame
		pnCor.add(btCor);
		pnMenu.add(pnCor);
		pnMenu.add(jcbCor);
		frame.setLayout(new BorderLayout());
		frame.add(pnMenu,BorderLayout.WEST);
		frame.add(pp,BorderLayout.CENTER);
		mnArquivo.add(miNovo);
		mnArquivo.add(miAbrir);
		mnArquivo.add(miSalvar);
		mnArquivo.add(miSalvar_Como);
		mnArquivo.add(new JSeparator());
		mnArquivo.add(miSair);
		mnDesenho.add(mnTipo);
		mnTipo.add(cbmiReta);
		mnTipo.add(cbmiQuadrado);
		mnTipo.add(cbmiElipse);
		mnTipo.add(cbmiCirculo);
		mnTipo.add(cbmiTriangulo);
		mnAjuda.add(miSobre);
		mbMenu.add(mnArquivo);
		mbMenu.add(mnDesenho);
		mbMenu.add(mnAjuda);
		pmnBotaoDireito.add(miTrocaCor);
		pmnBotaoDireito.add(miDesloca);
		pmnBotaoDireito.add(miEscala);
		pmnBotaoDireito.add(miRemover);
		setJMenuBar(mbMenu);
		
		//Listeners
		pp.addMouseListener(this);
		pp.addMouseMotionListener(this);
		btCor.addActionListener(this);
		miSair.addActionListener(this);
		miNovo.addActionListener(this);
		miAbrir.addActionListener(this);
		miSalvar.addActionListener(this);
		miSalvar_Como.addActionListener(this);
		cbmiReta.addItemListener(this);
		cbmiQuadrado.addItemListener(this);
		cbmiElipse.addItemListener(this);
		cbmiTriangulo.addItemListener(this);
		cbmiCirculo.addItemListener(this);
		miTrocaCor.addActionListener(this);
		miDesloca.addActionListener(this);
		miEscala.addActionListener(this);
		miRemover.addActionListener(this);
		miSobre.addActionListener(this);

		cbmiReta.setState(true);
						
		enableEvents(WindowEvent.WINDOW_CLOSING);
	}
	
	public void processWindowEvent(WindowEvent e)
	{
		if(e.getID() == WindowEvent.WINDOW_CLOSING)
			System.exit(0);
	}

	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource() instanceof JButton)
		{
			JButton temp = (JButton)e.getSource();
			if(temp == btCor)
			{
				corSelecionada = jccCor.showDialog(this,"Cores",Color.black);
				jcbCor.setBackground(corSelecionada);
			}
		}
		if(e.getSource() instanceof JMenuItem)
		{
			JMenuItem temp = (JMenuItem)e.getSource();
			if(temp == miSair)
				System.exit(0);
			else			
			if(temp == miNovo)
			{
				eg.apaga();
				pp.repaint();
				arquivo = null;
			}
			else			
			if(temp == miAbrir)
			{
				arquivo = eg.abrir(this);
				pp.repaint();
			}
			else
			if(temp == miSalvar_Como)
				arquivo = eg.salvarComo(this);
			else
			if(temp == miSalvar)
			{
				if(arquivo != null)
					eg.salvar(arquivo);
				else
					arquivo = eg.salvarComo(this);			
			}
			else
			if(temp == miTrocaCor)
			{
				corSelecionada = jccCor.showDialog(this,"Cores",Color.black);
				jcbCor.setBackground(corSelecionada);
				primSelecionada.trocaCor(corSelecionada);
				pp.repaint();	
			}	
			else
			if(temp == miDesloca)
			{
				cbmiReta.setState(false); 
				cbmiQuadrado.setState(false); 
				cbmiElipse.setState(false); 
				cbmiTriangulo.setState(false); 
				cbmiCirculo.setState(false);
				desloca = true;				 
			}
			else
			if(temp ==miEscala)
			{
				new DialogoEscala(this,"Escala", true);
			}
			else
			if(temp == miRemover)
			{
				eg.delete(primSelecionada);
				pp.repaint();
			}
			else
			if(temp == miSobre)
			{
					new Sobre(this,"Sobre o Paint 1.0 Alfa",true);	
			}							
		}
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() instanceof JCheckBoxMenuItem)
		{
			JCheckBoxMenuItem temp = (JCheckBoxMenuItem)e.getSource();
			if(temp == cbmiReta)
			{	
				if(cbmiReta.getState())
				{
					cbmiQuadrado.setState(false);
					cbmiElipse.setState(false);
					cbmiTriangulo.setState(false);
					desloca = false;
					return;
				}
				else
					desloca = false;
			}
			else
			if(temp == cbmiQuadrado)
			{	
				if(cbmiQuadrado.getState())
				{
					cbmiReta.setState(false);
					cbmiElipse.setState(false);
					cbmiTriangulo.setState(false);
					cbmiCirculo.setState(false);
					desloca = false;
					return;
				}
				else
					desloca = false;
			}
			else
			if(temp == cbmiElipse)
			{	
				if(cbmiElipse.getState())
				{
					cbmiReta.setState(false);
					cbmiQuadrado.setState(false);
					cbmiTriangulo.setState(false);
					cbmiCirculo.setState(false);
					desloca = false;
					return;
				}
				else
					desloca = false;
			}
			else
			if(temp == cbmiTriangulo)
			{	
				if(cbmiTriangulo.getState())
				{
					cbmiReta.setState(false);
					cbmiQuadrado.setState(false);
					cbmiElipse.setState(false);
					cbmiCirculo.setState(false);
					desloca = false;
					return;
				}
				else
					desloca = false;
			}
			else
			if(temp == cbmiCirculo)
			{	
				if(cbmiCirculo.getState())
				{
					cbmiReta.setState(false);
					cbmiQuadrado.setState(false);
					cbmiElipse.setState(false);
					cbmiTriangulo.setState(false);
					desloca = false;
					return;
				}
				else
					desloca = false;
			}
		}
	}

	public void mouseDragged(MouseEvent e)
	{
		if(e.getModifiers() == MouseEvent.BUTTON1_MASK)
		{	
			desenhar(false,e);
			pp.repaint();
		}
	}
	
	public void mouseMoved(MouseEvent e)
	{}
	
	public void mouseClicked(MouseEvent e)
	{}

	private void desenhar(boolean desenhar,MouseEvent e)
	{
		boolean desenha = false;		
		Primitiva r = null;
		if(e.getModifiers() == e.BUTTON1_MASK)
		{
			if(!desloca)
			{
				x2 = e.getX();
				y2 = e.getY();
			}
			if(cbmiReta.getState())
			{
				r = new Reta(x1,y1,x2,y2,corSelecionada);
				desenha = true;
			}
			else
			{
				if(cbmiQuadrado.getState())
				{
					r = new Quadrado(x1,y1,x2,y2,corSelecionada);
					desenha = true;
				}
				else
				{
					if(cbmiElipse.getState())
					{
						r = new Elipse(x1,y1,x2,y2,corSelecionada);
						desenha = true;
					}
					else
					{
						if(cbmiTriangulo.getState())
						{
							r = new Triangulo(x1,y1,x2,y2,corSelecionada);
							desenha = true;
						}
						else
						{
							if(cbmiCirculo.getState())
							{
								r = new Circulo(x1,y1,x2,y2,corSelecionada);
								desenha = true;
							}
							else						
							{
								if(primSelecionada!=null)
								{
									primSelecionada.x1 = e.getX() - x1;
									primSelecionada.y1 = e.getY() - y1;
									primSelecionada.x2 = e.getX() + x2;
									primSelecionada.y2 = e.getY() + y2;
									primSelecionada.desloca(primSelecionada.x1,primSelecionada.y1,primSelecionada.x2,primSelecionada.y2);
									pp.pri = primSelecionada;
								}
							}
						}
					}
				}
			}
		}
		if(!desenhar)
		{
			pp.pri = r;
		}		
		if(desenha && desenhar)
		{
			eg.addDesenho(r);
			pp.repaint();
		}
	}
	private boolean primitivaSelecionada(MouseEvent e,boolean popup)
	{
			Vector prim = eg.getGraficos();
			Primitiva prima = null;
			for(int i = prim.size()-1;i>=0;i--)
			{
				prima = (Primitiva)prim.elementAt(i);
				if(prima.pontoInterno(e.getX(),e.getY()))
				{
					primSelecionada = prima;
					if(popup)
						this.pmnBotaoDireito.show(this,e.getX(),e.getY());
					return true;
				}				
			}
			primSelecionada = null;
			return false;
	}
	public void mousePressed(MouseEvent e)
	{
		if(e.getModifiers() == MouseEvent.BUTTON1_MASK)
		{
			if(!desloca)
			{
				x1 = e.getX();
		   		y1 = e.getY();
		   	}
		   	else
		   	{
		   		if(primitivaSelecionada(e,false))
		   		{
		   			x1 = e.getX() - primSelecionada.x1;
		   			y1 = e.getY() - primSelecionada.y1; 
		   			x2 = primSelecionada.x2 - e.getX();
		   			y2 = primSelecionada.y2 - e.getY(); 
		   		}
			}		   	
		}
		else
		{
			primitivaSelecionada(e,true);
		}
	}
	
	public void mouseReleased(MouseEvent e)
	{
		if(e.getModifiers() == MouseEvent.BUTTON1_MASK)
		{			
			if(!desloca)
			{
				desenhar(true,e);
				pp.pri = null;
			}
			else
			{
				if(primSelecionada != null)
				{
					primSelecionada.x1 = e.getX() - x1;
					primSelecionada.y1 = e.getY() - y1;
					primSelecionada.x2 = e.getX() + x2;
					primSelecionada.y2 = e.getY() + y2;
					repaint();
				}
			}
		}	
	}
	
	public void mouseEntered(MouseEvent e)
	{}
	
	public void mouseExited(MouseEvent e)
	{}

	public static void main(String args[])
	{
		System.out.println("Iniciando Paint...");
		Paint mainFrame = new Paint();
		mainFrame.setVisible(true);
	}
	
	class PaintPanel extends JPanel
	{
		Primitiva pri = null;
		public void paint(Graphics g)
		{
			super.paint(g);
			Vector p = eg.getGraficos();
			for(int i=0;i<p.size();i++)
				((Primitiva)p.elementAt(i)).desenha(g);
			if(pri != null)
				pri.desenha(g);
		}
	}
	class DialogoEscala extends JDialog implements ActionListener
	{
		JLabel lbEscala,lbPorcento;
		JTextField tfEscala;
		JButton btOk,btCancelar;
		JPanel  paResto,
				paBotoes;
		Container frame;
		DialogoEscala(JFrame owner,String titulo, boolean modal)
		{
			paResto = new JPanel(new FlowLayout());	
			paBotoes = new JPanel(new FlowLayout());
			
			
			lbEscala = new JLabel("Digite a escala: ");
			tfEscala = new JTextField("100");
			lbPorcento = new JLabel("%");
			btOk = new JButton("OK");
			btCancelar = new JButton("Cancelar");					
			
			paBotoes.add(btOk);
			paBotoes.add(btCancelar);
			
			paResto.add(lbEscala);
			paResto.add(tfEscala);
			paResto.add(lbPorcento);
			
			frame = getContentPane();
			frame.setLayout(new BorderLayout());
			
			frame.add("Center",paResto);						
			frame.add("South",paBotoes);
				
			btOk.addActionListener(this);	
			btCancelar.addActionListener(this);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() instanceof JButton)
			{
				JButton temp = (JButton)e.getSource();
				if(temp == btOk)
				{
					try
					{
						int escala = Integer.parseInt(tfEscala.getText());
						primSelecionada.escala(escala);
						pp.repaint();
						setVisible(false);
					}
					catch(Exception ex)
					{}
				}
				else
				if(temp == btCancelar)
				{
					setVisible(false);
				}
			}
		}
	}
}