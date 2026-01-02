package agenda;

import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class App extends Frame implements ActionListener,FocusListener
{	

	Cliente c;
	ModeloCliente modelo;
	
	Dialog dlgMensagem,dlgConsulta,dlgConsultaNome;
	
	int lt2; 

	//Layout
	CardLayout cl;
	
	//Labels
	Label 	lbTitulo,
			lbNome,
			lbCPF,
			lbContato,
			lbNomeMen,
			lbCPFMen,
			lbPosMen,
			lbContatoMen,
			lbPosicao,
			lbNumRegistros,
			lbMensagem;
	
	//TextFields
	TextField tfNomeCad,tfCPFCad,tfContatoCad;
	TextField tfNomeAlt,tfCPFAlt,tfContatoAlt,tfPosicaoAlt;
	TextField tfNomePos,tfCPFPos,tfContatoPos,tfPosicaoPos; 
	TextField tfNomeRem,tfCPFRem,tfContatoRem,tfPosicaoRem;
	 
	//buttons
	Button	btOK,
			btCancOK,
			btGravar,
			btCancelarCad,
			btCancelarRem,
			btCancelarPos,
			btAltera,
			btProcurarPos,
			btProcurarNome,
			btProcurarCpf,
			btRemover,
			btCancelarAlt,
			btFechar,
			btFecharCPF;

	//frame	
	Panel paPrincipal;
	Panel paCadastro;
	Panel paConsulta;
	Panel paAltera;
	Panel paConsultaPosicao;
	Panel paRemover;
	
	//Panels
	Panel paTitulo;
	Panel paLinha1;
	Panel paLinha2;
	Panel paLinha3;
	Panel paLinha4;
	Panel paLinha5;
	Panel paLinha6;
	
	
	//Menus
	
	MenuBar mbBarTarefas;
	Menu mnItens,mnOrganiza,mnAjuda;
	MenuItem	miRemover,
				miNumElementos,
				miCadastro,
				miConsulta,
				miSair,
				miSeparador,
				miAltera,
				miOrgCPF,
				miOrgNome,
				miSobre;
	
	public void mostraMenu()
	{
		mbBarTarefas = new MenuBar();
		
		mnItens = new Menu("Arquivo");
		mnOrganiza = new Menu("Organizar");
		mnAjuda = new Menu("Ajuda");
		
		miCadastro = new MenuItem("Cadastro");
		miConsulta = new MenuItem("Consulta");
		miConsulta.setEnabled(false); 
		miRemover = new MenuItem("Remover");
		miRemover.setEnabled(false);
		miOrgNome = new MenuItem("Nome");
		miOrgNome.setEnabled(false);
		miOrgCPF = new MenuItem("CPF");
		miOrgCPF.setEnabled(false);
		miAltera = new MenuItem("Altera");
		miAltera.setEnabled(false);
		miNumElementos = new MenuItem("Numero de Registros");
		miSeparador = new MenuItem("-");
		miSair = new MenuItem("Sair");
		miSobre = new MenuItem("agenda.Sobre");

		//adiciona ao Menu
		mbBarTarefas.add(mnItens);
		mbBarTarefas.add(mnAjuda);
		setMenuBar(mbBarTarefas);
		
		mnOrganiza.add(miOrgNome);
		mnOrganiza.add(miOrgCPF);

		mnAjuda.add(miSeparador);
		mnAjuda.add(miSobre);
		
		mnItens.add(miCadastro);
		mnItens.add(miConsulta);
		mnItens.add(miAltera);
		mnItens.add(miRemover);
		mnItens.add(mnOrganiza);
		mnItens.add(miNumElementos);
		mnItens.add(miSeparador);
		mnItens.add(miSair);

	}
	
	public void cadastro()
	{	
		lbTitulo = new Label("Cadastro de Clientes");
		lbNome = new Label("    Nome: ",Label.LEFT);
		lbCPF = new Label("      CPF: ",Label.LEFT);
		lbContato = new Label(" Contato: ",Label.LEFT);
				
		tfNomeCad = new TextField(30);		
		tfCPFCad = new TextField(10);		
		tfContatoCad = new TextField(30);
		
		btGravar = new Button("Gravar");
		btCancelarCad = new Button("Cancelar");
				
		paCadastro = new Panel();
		add("Cadastro", paCadastro);
		
		paCadastro.setLayout(new GridLayout(5,1));
		paTitulo = new Panel();
		paLinha1 = new Panel();
		paLinha2 = new Panel();
		paLinha3 = new Panel();
		paLinha4 = new Panel();
						
		paTitulo.setLayout(new FlowLayout());
		paTitulo.add(lbTitulo);
		
		paLinha1.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha1.add(lbNome);
		paLinha1.add(tfNomeCad);

		paLinha2.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha2.add(lbCPF);
		paLinha2.add(tfCPFCad);


		paLinha3.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha3.add(lbContato);
		paLinha3.add(tfContatoCad);
		
		paLinha4.setLayout(new FlowLayout());
		paLinha4.add(btGravar);
		paLinha4.add(btCancelarCad);
		
				
		paCadastro.add(paTitulo);
		paCadastro.add(paLinha1);
		paCadastro.add(paLinha2);
		paCadastro.add(paLinha3);
		paCadastro.add(paLinha4);
		paCadastro.setBackground(Color.gray);		
	}
	
	public void consulta()
	{	
		lbTitulo = new Label("Consulta agenda.Cliente ");
		lbNome = new Label("    Nome: ",Label.LEFT);
		lbCPF = new Label("      CPF: ",Label.LEFT);
		lbContato = new Label(" Contato: ",Label.LEFT);
		lbPosicao = new Label(" Posi��o: ",Label.LEFT);
		
		tfNomePos = new TextField(30);		
		tfCPFPos = new TextField(11);		
		tfContatoPos = new TextField(30);
		tfPosicaoPos = new TextField(10);
				
		btProcurarPos = new Button("Procurar Pos");
		btProcurarNome = new Button("Procurar Nome");
		btProcurarCpf = new Button("Procurar CPF");
		btCancelarPos = new Button("Limpar");
		
		paConsultaPosicao = new Panel();
		add("Consulta", paConsultaPosicao);
		
		paConsultaPosicao.setLayout(new GridLayout(6,1));
		
		paTitulo = new Panel();
		paLinha1 = new Panel();
		paLinha2 = new Panel();
		paLinha3 = new Panel();
		paLinha4 = new Panel();
		paLinha5 = new Panel();
		
		
		paTitulo.setLayout(new FlowLayout());
		paTitulo.add(lbTitulo);
		
		paLinha1.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha1.add(lbPosicao);
		paLinha1.add(tfPosicaoPos);
		paLinha1.add(btProcurarPos);
		
		paLinha2.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha2.add(lbNome);
		paLinha2.add(tfNomePos);
		paLinha2.add(btProcurarNome);
		
		paLinha3.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha3.add(lbCPF);
		paLinha3.add(tfCPFPos);
		paLinha3.add(btProcurarCpf);
		
		
		paLinha5.setLayout(new FlowLayout());
		paLinha5.add(btCancelarPos);
		
		paConsultaPosicao.add(paTitulo);
		paConsultaPosicao.add(paLinha1);
		paConsultaPosicao.add(paLinha2);
		paConsultaPosicao.add(paLinha3);
		paConsultaPosicao.add(paLinha5);
		paConsultaPosicao.setBackground(Color.gray);
	}

	public void remove()
	{	
		lbTitulo = new Label("Remove Registro");
		lbNome = new Label("    Nome: ",Label.LEFT);
		lbCPF = new Label("      CPF: ",Label.LEFT);
		lbContato = new Label(" Contato: ",Label.LEFT);
		lbPosicao = new Label(" Posi��o: ",Label.LEFT);
		
		tfNomeRem = new TextField(30);		
		tfCPFRem = new TextField(11);		
		tfContatoRem = new TextField(30);
		tfPosicaoRem = new TextField(10);
		
		tfNomeRem.setBackground(Color.lightGray);
		tfCPFRem.setBackground(Color.lightGray);
		tfContatoRem.setBackground(Color.lightGray);
		
		tfNomeRem.setEnabled(false);
		tfCPFRem.setEnabled(false);
		tfContatoRem.setEnabled(false);
		
		btRemover = new Button("Remover");
		btCancelarRem = new Button("Cancelar");
		
		paRemover = new Panel();
		add("Remover", paRemover);
		
		paRemover.setLayout(new GridLayout(7,1));
		
		paTitulo = new Panel();
		paLinha1 = new Panel();
		paLinha2 = new Panel();
		paLinha3 = new Panel();
		paLinha4 = new Panel();
		paLinha5 = new Panel();
				
		paTitulo.setLayout(new FlowLayout(FlowLayout.LEFT));
		paTitulo.add(lbTitulo);
		
		paLinha1.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha1.add(lbPosicao);
		paLinha1.add(tfPosicaoRem);
		
		paLinha2.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha2.add(lbNome);
		paLinha2.add(tfNomeRem);
		
		paLinha3.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha3.add(lbCPF);
		paLinha3.add(tfCPFRem);
		
		paLinha4.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha4.add(lbContato);
		paLinha4.add(tfContatoRem);
		
		paLinha5.setLayout(new FlowLayout());
		paLinha5.add(btRemover);
		paLinha5.add(btCancelarRem);
		
			
		paRemover.add(paTitulo);
		paRemover.add(paLinha1);
		paRemover.add(paLinha2);
		paRemover.add(paLinha3);
		paRemover.add(paLinha4);
		paRemover.add(paLinha5);
			
		paRemover.setBackground(Color.gray);
	}
	
	public void altera()
	{	
		lbTitulo = new Label("Altera Cadastro de Clientes");
		lbNome = new Label("     Nome: ",Label.LEFT);
		lbCPF = new Label("       CPF: ",Label.LEFT);
		lbContato = new Label("  Contato: ",Label.LEFT);
		lbPosicao = new Label("  Posicao: ",Label.LEFT);
				
		tfNomeAlt = new TextField(30);		
		tfCPFAlt = new TextField(10);		
		tfContatoAlt = new TextField(30);
		tfPosicaoAlt = new TextField(4);		
		tfNomeAlt.setBackground(Color.lightGray);
		tfCPFAlt.setBackground(Color.lightGray);
		tfContatoAlt.setBackground(Color.lightGray);
		tfNomeAlt.setEnabled(false);
		tfCPFAlt.setEnabled(false);
		tfContatoAlt.setEnabled(false);

		
		btAltera = new Button("Altera");
		btCancelarAlt = new Button("Cancelar");
				
		paAltera = new Panel();
		add("Altera", paAltera);
		
		paAltera.setLayout(new GridLayout(7,1));
		paTitulo = new Panel();
		paLinha1 = new Panel();
		paLinha2 = new Panel();
		paLinha3 = new Panel();
		paLinha4 = new Panel();
		paLinha6 = new Panel();
				
		paTitulo.setLayout(new FlowLayout());
		paTitulo.add(lbTitulo);
		
		paLinha6.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha6.add(lbPosicao);
		paLinha6.add(tfPosicaoAlt);

		paLinha1.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha1.add(lbNome);
		paLinha1.add(tfNomeAlt);

		paLinha2.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha2.add(lbCPF);
		paLinha2.add(tfCPFAlt);


		paLinha3.setLayout(new FlowLayout(FlowLayout.LEFT));
		paLinha3.add(lbContato);
		paLinha3.add(tfContatoAlt);
		
		paLinha4.setLayout(new FlowLayout());
		paLinha4.add(btAltera);
		paLinha4.add(btCancelarAlt);
					
		paAltera.add(paTitulo);
		paAltera.add(paLinha6);					
		paAltera.add(paLinha1);
		paAltera.add(paLinha2);
		paAltera.add(paLinha3);
		paAltera.add(paLinha4);		
		
		paAltera.setBackground(Color.gray);	
	}
	
	public void mostraPos(Cliente c)
	{
		tfNomeAlt.setText(c.getNome());
		tfCPFAlt.setText(c.getCpf());
		tfContatoAlt.setText(c.getContato());
	}
	
	public void mostraRem(Cliente c)
	{
		tfNomeRem.setText(c.getNome());
		tfCPFRem.setText(c.getCpf());
		tfContatoRem.setText(c.getContato());
	}
	
	public void mostraConsulta(Cliente c)
	{
		lbNomeMen.setText("Nome: " + c.getNome());
		lbCPFMen.setText("CPF: " + c.getCpf());
		lbContatoMen.setText("Contato: " + c.getContato());
	}
		

	public void mostraMensagem()
	{
		dlgMensagem= new Dialog(this,"agenda.Cliente 2.0",true);
		dlgMensagem.setLocation(300,250);
		btOK = new Button("OK");
		btCancOK = new Button("OK");
		lbMensagem=new Label("",Label.CENTER);
		lbMensagem.setFont(new Font("Verdana",Font.BOLD,13));
		paTitulo=new Panel();						
		paTitulo.setLayout(new FlowLayout());
		paTitulo.add(btOK);
		dlgMensagem.setLayout(new BorderLayout());
		dlgMensagem.add("Center",lbMensagem);
		dlgMensagem.add("South",paTitulo);
		
	}
	
	public void retornaConsulta(Cliente c)
	{
			dlgConsultaNome.add(new Label("Nome: " + c.getNome()));
			dlgConsultaNome.add(new Label("CPF: " + c.getCpf()));
			dlgConsultaNome.add(new Label("Contato: " + c.getContato()));
	}

	public void mensagemConsulta()
	{
		dlgConsulta = new Dialog(this,"agenda.Cliente 2.0",true);
		dlgConsulta.setLocation(300,250);
		btCancOK = new Button("OK");
		lbNomeMen = new Label("",Label.LEFT);
		lbCPFMen = new Label("",Label.LEFT);
		lbContatoMen = new Label("",Label.LEFT);
		lbPosMen = new Label("",Label.LEFT);
		lbNomeMen.setFont(new Font("Verdana",Font.BOLD,13));
		lbCPFMen.setFont(new Font("Verdana",Font.BOLD,13));
		lbContatoMen.setFont(new Font("Verdana",Font.BOLD,13));
		lbPosMen.setFont(new Font("Verdana",Font.BOLD,13));
		paTitulo=new Panel();						
		paTitulo.setLayout(new FlowLayout());
		paTitulo.add(btCancOK);
	}
	
	public void limpaCampos()
	{
		tfNomeCad.setText("");
		tfCPFCad.setText("");
		tfContatoCad.setText("");
		tfNomeAlt.setText("");
		tfCPFAlt.setText("");
		tfContatoAlt.setText("");
		tfPosicaoAlt.setText("");
		tfNomePos.setText("");
		tfCPFPos.setText("");
		tfContatoPos.setText("");
		tfPosicaoPos.setText("");
		tfNomeRem.setText("");
		tfCPFRem.setText("");
		tfContatoRem.setText("");
		tfPosicaoRem.setText("");		
	}
	
	public App()
	{
		this("");
	}

	public App(String titulo)
	{	
		super(titulo);			
		cl = new CardLayout();
		lbTitulo = new Label("Seja Bem Vindo ao agenda.Cliente 2.0",Label.CENTER);
		lbTitulo.setFont(new Font("Verdana",Font.BOLD,18));
		setLayout(cl);
		mostraMenu();
		paPrincipal = new Panel();
		paPrincipal.setLayout(new BorderLayout());		
		paPrincipal.add("Center",lbTitulo);

		modelo = new ModeloCliente();
		
		cadastro(); // Panel de Cadastro
		consulta();
		remove();
		altera(); // Panel de Altera��o
		mostraMensagem();
		mensagemConsulta();
		add("agenda.Principal", paPrincipal);
		
		paPrincipal.setBackground(Color.gray);	
		
		btRemover.setEnabled(false);
		btAltera.setEnabled(false);
		
		btFechar = new Button("Fechar");
		btFecharCPF = new Button("Fechar");
	
		cl.show(this,"agenda.Principal");
		btGravar.addActionListener(this);
		btAltera.addActionListener(this);
		btCancelarCad.addActionListener(this);
		btCancelarAlt.addActionListener(this);
		btCancelarRem.addActionListener(this);
		btCancelarPos.addActionListener(this);
		btOK.addActionListener(this);
		btFechar.addActionListener(this);
		btFecharCPF.addActionListener(this);
		btCancOK.addActionListener(this);
		btProcurarPos.addActionListener(this);
		btProcurarNome.addActionListener(this);
		btProcurarCpf.addActionListener(this);
		btRemover.addActionListener(this);
		miSair.addActionListener(this);
		miCadastro.addActionListener(this);
		miSobre.addActionListener(this);
		miAltera.addActionListener(this);
		miConsulta.addActionListener(this);
		miRemover.addActionListener(this);
		miNumElementos.addActionListener(this);
		miOrgNome.addActionListener(this);
		miOrgCPF.addActionListener(this);
		tfPosicaoAlt.addFocusListener(this);
		tfPosicaoRem.addFocusListener(this);
		enableEvents(WindowEvent.WINDOW_CLOSING);
		pack();

	}
	
	public void focusGained(FocusEvent e) 
	{
		if(e.getSource() instanceof TextField)
		{
			TextField tfTemp = (TextField)e.getSource();
			if(tfTemp == tfPosicaoAlt)
			{
				System.out.println("recebe_foco Altera");							
			}		
		}
		else
		if(e.getSource() instanceof TextField)
		{
			TextField tfTemp = (TextField)e.getSource();
			if(tfTemp == tfPosicaoRem)
			{
				System.out.println("recebe_foco Remove");							
			}		
		}
	}
	
	public void focusLost(FocusEvent e) 
	{		
		if(e.getSource() instanceof TextField)
		{
			TextField tfTemp = (TextField)e.getSource();
			if(tfTemp == tfPosicaoAlt)
			{
				lt2 = Integer.parseInt(tfPosicaoAlt.getText()) - 1;
				if(lt2 >= 0 && lt2 <= (modelo.getTamanho()-1))
				{
					tfNomeAlt.setEnabled(true);
					tfCPFAlt.setEnabled(true);
					tfContatoAlt.setEnabled(true);
					tfNomeAlt.setBackground(Color.white);
					tfCPFAlt.setBackground(Color.white);
					tfContatoAlt.setBackground(Color.white);	
					mostraPos(modelo.getItem(lt2));	
					btAltera.setEnabled(true);										
				}
				else
				{
					tfNomeAlt.setEnabled(false);
					tfCPFAlt.setEnabled(false);
					tfContatoAlt.setEnabled(false);
					tfNomeAlt.setBackground(Color.lightGray);
					tfCPFAlt.setBackground(Color.lightGray);
					tfContatoAlt.setBackground(Color.lightGray);					
					limpaCampos();			
					lbMensagem.setText("Posi��o Inv�lida!");
					dlgMensagem.pack();
					dlgMensagem.setVisible(true);									
				}
									
			}
			else		
			if(tfTemp == tfPosicaoRem)
			{
				lt2 = Integer.parseInt(tfPosicaoRem.getText()) - 1;
				if(lt2 >= 0 && lt2 <= (modelo.getTamanho()-1))
				{
					mostraRem(modelo.getItem(lt2));						
					btRemover.setEnabled(true);										
				}
				else
				{
					limpaCampos();
					lbMensagem.setText("Posicao Inv�lida!!");
					dlgMensagem.pack();
					dlgMensagem.setVisible(true);									
				}									
			}		
		}
	}	
	
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource() instanceof Button)
		{
			Button btTemp =(Button)evento.getSource();
			if(btTemp == btGravar)
			{		

				try
				{
					c = new Cliente(tfNomeCad.getText(),tfCPFCad.getText(),tfContatoCad.getText());
					modelo.addItem(c);	
					lbMensagem.setText("Cadastro inserido com sucesso");
					dlgMensagem.pack();
					dlgMensagem.setVisible(true);
					miConsulta.setEnabled(true); 
					miRemover.setEnabled(true);
					miOrgNome.setEnabled(true);
					miOrgCPF.setEnabled(true);
					miAltera.setEnabled(true);					
					tfNomeCad.setText("");				
					tfCPFCad.setText("");
					tfContatoCad.setText("");					
				}
				catch(Exception e1)
				{
					lbMensagem.setText("Dados Incorretos");
					dlgMensagem.pack();
					dlgMensagem.setVisible(true);										
				}
			}
			else
			if(btTemp == btAltera)
			{					
				try
				{
					c = new Cliente(tfNomeAlt.getText(),tfCPFAlt.getText(),tfContatoAlt.getText());
					modelo.setItem(c,lt2);	
					tfNomeAlt.setText("");				
					tfCPFAlt.setText("");
					tfPosicaoAlt.setText("");
					tfContatoAlt.setText("");
					lbMensagem.setText("Cadastro Alterado com sucesso");
					dlgMensagem.pack();
					dlgMensagem.setVisible(true);					
					btAltera.setEnabled(false);			
					tfNomeAlt.setEnabled(false);
					tfCPFAlt.setEnabled(false);
					tfContatoAlt.setEnabled(false);		
					tfNomeAlt.setBackground(Color.lightGray);
					tfCPFAlt.setBackground(Color.lightGray);
					tfContatoAlt.setBackground(Color.lightGray);	
				}
				catch(Exception e1)
				{	
					lbMensagem.setText("Dados Incorretos");
					dlgMensagem.pack();
					dlgMensagem.setVisible(true);			
				}
			}
			else				
			if(btTemp == btCancelarCad)
			{
				tfNomeCad.setText("");				
				tfCPFCad.setText("");
				tfContatoCad.setText("");				
			}			
			else
			if(btTemp == btCancelarAlt)
			{
				tfNomeAlt.setText("");	
				tfPosicaoAlt.setText("");			
				tfCPFAlt.setText("");
				tfContatoAlt.setText("");
				btAltera.setEnabled(false);
				tfNomeAlt.setEnabled(false);
				tfCPFAlt.setEnabled(false);
				tfContatoAlt.setEnabled(false);
				tfNomeAlt.setBackground(Color.lightGray);
				tfCPFAlt.setBackground(Color.lightGray);
				tfContatoAlt.setBackground(Color.lightGray);	
				tfNomeAlt.setEnabled(false);
				tfCPFAlt.setEnabled(false);
				tfContatoAlt.setEnabled(false);
			}
			else
			if(btTemp == btOK)
			{
				dlgMensagem.setVisible(false);	
			}
			else
			if(btTemp == btFechar)
			{
				dlgConsultaNome.setVisible(false);	
			}
			else 
			if(btTemp == btFecharCPF)
			{
				dlgConsultaNome.setVisible(false);	
			}
			else			
			if(btTemp == btCancOK)
			{
				dlgConsulta.setVisible(false);
			}
			else
			if(btTemp == btRemover)
			{
				modelo.remove(Integer.parseInt(tfPosicaoRem.getText())-1);
				if(modelo.getTamanho()==0)
				{
					miConsulta.setEnabled(false); 
					miRemover.setEnabled(false);
					miOrgNome.setEnabled(false);
					miOrgCPF.setEnabled(false);
					miAltera.setEnabled(false);
				}
								
				lbMensagem.setText("Registro removido");
				dlgMensagem.pack();
				dlgMensagem.setVisible(true);	
				tfNomeRem.setText("");
				tfCPFRem.setText("");
				tfContatoRem.setText("");
				tfPosicaoRem.setText("");
				btRemover.setEnabled(false);
			}
			else
			if(btTemp == btCancelarPos)
					limpaCampos();
			else
			if(btTemp == btCancelarRem)
			{
				tfNomeRem.setText("");				
				tfCPFRem.setText("");
				tfContatoRem.setText("");
				tfPosicaoRem.setText("");
				btRemover.setEnabled(false);					
			}				
			else
			if(btTemp == btProcurarPos)
			{
				lt2 = Integer.parseInt(tfPosicaoPos.getText()) - 1;
				if(lt2 >= 0 && lt2 <= (modelo.getTamanho()-1))
				{
					mostraConsulta(modelo.getItem(lt2));
					dlgConsulta = new Dialog(this,"agenda.Cliente 2.0",true);
					dlgConsulta.setLocation(300,250);												
					lbPosMen.setText("Posi��o: " + tfPosicaoPos.getText());
					paTitulo=new Panel();
					paTitulo.add(btCancOK);
					dlgConsulta.setLayout(new GridLayout(5,1));
					dlgConsulta.add(lbPosMen);
					dlgConsulta.add(lbNomeMen);
					dlgConsulta.add(lbCPFMen);
					dlgConsulta.add(lbContatoMen);
					dlgConsulta.add(paTitulo);
					dlgConsulta.pack();		
					dlgConsulta.setVisible(true);
				}
				else
				{
					lbMensagem.setText("Posi��o Inexistente");
					dlgMensagem.pack();
					dlgMensagem.setVisible(true);									
				}								
				
			}
			else
			if(btTemp == btProcurarNome)
			{
				Vector aux;
				aux=modelo.localizaCliente(tfNomePos.getText());
				if(aux.size()>0)
				{

					dlgConsultaNome = new Dialog(this,"agenda.Cliente 2.0",true);
					dlgConsultaNome.setLocation(300,10);
					paTitulo=new Panel();						
					paTitulo.setLayout(new FlowLayout());
					paTitulo.add(btFechar);
				
					dlgConsultaNome.setLayout(new GridLayout(aux.size()*4+1,1));
					for(int j=0;j<aux.size();j++)
					{				
					    int temp = Integer.parseInt((String)aux.elementAt(j))+1;
			            dlgConsultaNome.add(new Label("Posi��o: " + temp));	
						retornaConsulta(modelo.getItem(Integer.parseInt((String)aux.elementAt(j))));
					
					}
					dlgConsultaNome.add(paTitulo);
					dlgConsultaNome.pack();				
					dlgConsultaNome.setVisible(true);
				}
				else
				{
					lbMensagem.setText("Nenhuma ocorr�ncia para\""+tfNomePos.getText()+"\"");
					dlgMensagem.pack();
					dlgMensagem.setVisible(true);									
				}								
			}										
			else
			if(btTemp == btProcurarCpf)
			{
				Vector aux;
				aux=modelo.localizaCPF(tfCPFPos.getText());
				if(aux.size()>0)
				{

					dlgConsultaNome = new Dialog(this,"agenda.Cliente 2.0",true);
					dlgConsultaNome.setLocation(300,10);
					paTitulo=new Panel();						
					paTitulo.setLayout(new FlowLayout());
					paTitulo.add(btFecharCPF);
				
					dlgConsultaNome.setLayout(new GridLayout(aux.size()*4+1,1));
					for(int j=0;j<aux.size();j++)
					{				
					    int temp = Integer.parseInt((String)aux.elementAt(j))+1;
			            dlgConsultaNome.add(new Label("Posi��o: " + temp));	
						retornaConsulta(modelo.getItem(Integer.parseInt((String)aux.elementAt(j))));
					
					}
					dlgConsultaNome.add(paTitulo);
					dlgConsultaNome.pack();				
					dlgConsultaNome.setVisible(true);
				}
				else
				{
					lbMensagem.setText("Nenhuma ocorr�ncia para\""+tfCPFPos.getText()+"\"");
					dlgMensagem.pack();
					dlgMensagem.setVisible(true);									
				}								
			}

		}
		
		if(evento.getSource() instanceof MenuItem)
		{	
			MenuItem mnTemp =(MenuItem)evento.getSource();

			if( mnTemp == miCadastro)
			{
				limpaCampos();
				cl.show(this,"Cadastro");
			}
			else
			if( mnTemp == miAltera)
			{
				limpaCampos();
				cl.show(this,"Altera"); 
			}
			else
			if( mnTemp == miSair)
			{
				setVisible(false);
				Principal pri = new Principal("agenda.Cliente 2.0");
				pri.setLocation(300,250);
				pri.setVisible(true);
			}
			else
			if( mnTemp == miSobre)
			{
				Sobre dlg =  new Sobre(this, "agenda.Sobre o agenda.Cliente 2.0",true);
				dlg.setVisible(true);			  
			}
			else
			if( mnTemp == miRemover)
			{
				limpaCampos();
				cl.show(this,"Remover");
			}
			else
			if( mnTemp == miNumElementos)
			{
				dlgMensagem.setSize(200,100);
				lbMensagem.setText("Quantidade de Registros: "+modelo.getTamanho());
				dlgMensagem.setVisible(true);
			}
			else
			if(mnTemp == miOrgNome)
			{
				if(modelo.getTamanho()==0)
					lbMensagem.setText("N�o existem registros armazenados!");
				else
				{
					modelo.orgNome();
					lbMensagem.setText("Organiza��o por Nome conclu�da com sucesso!");
				}
				dlgMensagem.pack();
				dlgMensagem.setVisible(true);
				cl.show(this,"Consulta");
			}
			else
			if(mnTemp == miConsulta)
			{
				cl.show(this,"Consulta");
				lbMensagem.setText("Organiza��o por Nome conclu�da com sucesso!");
			}							
			else
			if(mnTemp == miOrgCPF)
			{
				modelo.orgCpf();
				lbMensagem.setText("Organiza��o por CPF conclu�da com sucesso!");
				dlgMensagem.pack();
				dlgMensagem.setVisible(true);
				limpaCampos();
				cl.show(this,"Consulta");
			}	
		}
	}	

	public void processWindowEvent(WindowEvent e) 
	{
		switch (e.getID())
		{
			case WindowEvent.WINDOW_CLOSING: 
				setVisible(false);
				Principal pri = new Principal("agenda.Cliente 2.0");
				pri.setLocation(300,250);
				pri.setVisible(true);
				return;

			default:
				super.processWindowEvent(e);
		}
	}
}