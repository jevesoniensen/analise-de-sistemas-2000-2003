package agenda;

import java.io.*;

public class Aplicacao
{

	public void imprimeMenu()
	{
		System.out.println("\n\n\n   ***   MENU   ***\n");
		System.out.println("   1-Cadastra agenda.Cliente");
		System.out.println("   2-Consulta agenda.Cliente");
		System.out.println("   3-Remove um cliente de uma determinada posicao");
		System.out.println("   4-Altera cadastro");
		System.out.println("   5-Organiza por CPF");
		System.out.println("   6-Organiza por Nome");
		System.out.println("   7-Numero de Clientes");
		System.out.println("   8-Sair");
		System.out.print("   Opcao: ");
	}
	
	public String leTeclado()
	{
		String lido = "";

		BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
		try
        	{
        		lido = leia.readLine();
        	}
        	catch(IOException e1)
        	{
        		System.out.println("Valor Invalido para Opcao -IOException!!!");
        	}
        	catch(NumberFormatException e1)
		{
			System.out.println("Valor Invalido para Opcao - NumberFormatException!!!");
		}
		return lido;
	}
	
	public int leInteiro()
	{
		try
		{
			return Integer.parseInt(leTeclado());
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Valor Invalido para Opcao - NumberFormatException!!!");
		}
		return -1;
	}

	public void LimpaTela()
      	{
        	int i;
          	for(i=0;i<31;i++)
          	System.out.println("\n");
        }
  	public void Pausa()
      	{
        	String tmp;
	        System.out.println("\n\n Pressione ENTER para continuar\n\n");
        	tmp=leTeclado();	
		LimpaTela();
        }
	
	public Cliente leCliente()
	{
		Cliente c;
		String nome, cpf, contato;
		while(true)
		{
			try
			{
				System.out.print("Digite o nome do agenda.Cliente: ");
				nome=leTeclado();
				System.out.print("\nDigite o CPF do agenda.Cliente: ");
				cpf=leTeclado();
				System.out.print("\nDigite o contato do agenda.Cliente: ");
				contato=leTeclado();
				c = new Cliente(nome,cpf,contato);
				return c;
			}
			catch(Exception e1)
			{
				System.out.println("Voce digitou algum valor invalido!!!\nDigite tudo novamente!!\nHAHAHAHAHA\n\n");
			}
		}
	}

	public int leMenu()
	{	
		int op = 0;
		while (true)
    		{       
			LimpaTela();   	  
		        imprimeMenu();
           		try
	     		{
               			op =Integer.parseInt(leTeclado());
            		}
			catch(NumberFormatException e2)
               		{
                  		System.out.println("Valor Invalido para Opcao - NumberFormatException.Menu\nTry Again!!!");
               		}
             		if(op < 1 || op > 8)
               			System.out.println("***   Opcao Invalida   ***  -  IF");
			else	
				return op;
		}
	}

	public void mostraPos(int lt, Cliente c)
	{
		System.out.println("Posicao: "+ (lt+1));
		System.out.println("\nNome: " + c.getNome());
		System.out.println("CPF: " + c.getCpf());
		System.out.println("Contato: " + c.getContato());
	}

	public void executa()
	{
		Cliente estCliente;
		int op = leMenu();
		ModeloCliente modelo = new ModeloCliente();
		
		while(op != 8)
		{
			switch(op)
			{
					 case 1:
						LimpaTela(); 
						modelo.addItem(leCliente());
						break;

					 case 2:
						LimpaTela();
						System.out.print("Digite a posicao em que o cliente se encontra:");
						int lt = leInteiro()-1;
						LimpaTela(); 
						if(lt >= 0 && lt <= (modelo.getTamanho()-1))
						{
							mostraPos(lt,modelo.getItem(lt));
							Pausa();
						}
						else
						{
							if(lt != -2)
								System.out.println("Nao existe cliente na Posicao " + (lt+1)+ "\n\n");
							else
								System.out.println("Posicao Invalida!!");

							Pausa();		
						}
     						break;
     				
					case 3:
							LimpaTela();
							System.out.print("Digite a Posicao que sera removida: ");
							int lt1 = leInteiro()-1;
							LimpaTela();
							if(lt1 >= 0 && lt1 <= (modelo.getTamanho()-1))
							{
								mostraPos(lt1,modelo.getItem(lt1));
								while(true)
								{
									System.out.println("\n\n\n\n\n\n\n\nTem certeza que deseja remover a posicao? (S/N)");
									if(leTeclado().equalsIgnoreCase("s"))
									{
										modelo.remove(lt1);
										LimpaTela();
										System.out.print("Posicao " + (lt1+1) + " removida com sucesso!\n\n\n\n");
										break;
									}
									else
									{
										LimpaTela();
										System.out.print("A Posicao " + (lt1+1) + " nao foi removida!\n\n\n\n");
										break;
									}
								}
								Pausa();
							}
							if(lt1 != -2)
								System.out.println("Nao existe cliente na Posicao " + (lt1+1)+ "\n\n");
							else
								System.out.println("Posicao Invalida!!");

							Pausa();		
						break;
     				
					case 4: 	
							LimpaTela();
							System.out.print("Digite a posicao em que o cliente se encontra: ");					        
							int lt2 = leInteiro()-1;
							LimpaTela();
							if(lt2 >= 0 && lt2 <= (modelo.getTamanho()-1))
							{
								mostraPos(lt2,modelo.getItem(lt2));
								while(true)
								{
									System.out.println("\n\n\n\n\n\n\n\nTem certeza que deseja alterar a posicao? (S/N)");
									if(leTeclado().equalsIgnoreCase("s"))
									{
										modelo.setItem(leCliente(),lt2);
										LimpaTela();
										System.out.print("Posicao " + (lt2+1) + " alterada com sucesso!\n\n\n\n");
										break;
									}
									else
									{
										LimpaTela();
										System.out.print("A Posicao " + (lt2+1) + " nao foi alterada!\n\n\n\n");
										break;
									}
								}
								Pausa();
								break;		
							}
							if(lt2 != -2)
								System.out.println("Nao existe cliente na Posicao " + (lt2+1)+ "\n\n");
							else
								System.out.println("Posicao Invalida!!");

							Pausa();
							break;
					case 5:
							LimpaTela();
							if(modelo.getTamanho()>0)
							{
								modelo.orgCpf();
								System.out.println("Organizacao por CPF concluida...\n");
							}
							else
								System.out.println("Nao existe elementos no cadastro\n");
							Pausa();
							break;

					case 6:
							LimpaTela();
							if(modelo.getTamanho()>0)
							{
								modelo.orgNome();
								System.out.println("Organizacao por Nome concluida...\n");
							}
							else
								System.out.println("Nao existe elementos no cadastro\n");
							Pausa();
							break;
			
					case 7:
							LimpaTela();
							System.out.print("Numero total de clientes: ");
							System.out.println(modelo.getTamanho() + "\n\n\n\n\n\n\n\n");
							Pausa();
							break;
			}
			op = leMenu();		
		}
		LimpaTela();
		System.out.println("                                  ***************");
		System.out.println("                                  ***** FIM *****");
		System.out.println("                                  ***************\n\n\n\n");
		System.out.println("     Turma B\n\n\n\n");
		System.out.println("     - Jeveson Iensen");					
		System.out.println("     - Marcus Vinicus Woiski Ferreira");
		System.out.println("     - Vladimir Ricardo Moresqui\n\n\n");
	}
	
	public static void main(String args[])
	{
		Aplicacao e = new Aplicacao();
		e.executa();		 				
	}
}
		