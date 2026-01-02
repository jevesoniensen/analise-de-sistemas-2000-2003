import java.io.*;
class Forca {
public static void main(String[] args)
	{
	BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
	String[][] mat = new String[20][4];
	String[] tracinho = new String[15];
	String[] letras = new String[27];
	int op = 0, v = 0, erro = 0, va = 0, cont = 0, r = 0, jaesc = 0, nl = 0, ve = 0, e = 0, chance = 7;
	String nome = "", palavra = "", ld = "";
	char j;
  	
	mat[0][0] = "viagem";		mat[0][1] = "ferias";			mat[0][2] = "familia";			mat[0][3] = "farofa";
	mat[1][0] = "monitor";		mat[1][1] = "perif�rico";   		mat[1][2] = "fica na sua frente";	mat[1][3] = "liga e desliga";
	mat[2][0] = "mala";		mat[2][1] = "tem al�a";			mat[2][2] = "tem rodinha";		mat[2][3] = "considerado um cara chato";
	mat[3][0] = "pernambuco";	mat[3][1] = "um estado";		mat[3][2] = "esta no Brasil";		mat[3][3] = "la e muito quente";
	mat[4][0] = "batata";		mat[4][1] = "frita-se";			mat[4][2] = "come-se";			mat[4][3] = "planta-se";
	mat[5][0] = "pessego";		mat[5][1] = "+-redondo";		mat[5][2] = "tem pelo";			mat[5][3] = "tem caro�o";
	mat[6][0] = "ovo";		mat[6][1] = "quem nasceu primeiro";	mat[6][2] = "colombo";			mat[6][3] = "coelho da pascoa";
	mat[7][0] = "cheetos";		mat[7][1] = "tem cheiro de chule";	mat[7][2] = "salgado";			mat[7][3] = "vem em pacote";
	mat[8][0] = "oculos";		mat[8][1] = "tem aro";			mat[8][2] = "quatro olho";		mat[8][3] = "est� na cara";
	mat[9][0] = "cueca";		mat[9][1] = "de algod�o";		mat[9][2] = "tem um super heroi";	mat[9][3] = "veste por baixo";
	mat[10][0] = "luva";		mat[10][1] = "tem 5 pontas";		mat[10][2] = "est� na m�o";		mat[10][3] = "frio";
	mat[11][0] = "moto";		mat[11][1] = "tem aros";		mat[11][2] = "tem guid�o";		mat[11][3] = "jaqueta de couro";
	mat[12][0] = "professor";	mat[12][1] = "fala bastante";		mat[12][2] = "usa giz";			mat[12][3] = "est� no quadro";
	mat[13][0] = "cadeira";		mat[13][1] = "tem pernas";		mat[13][2] = "estofada ou n�o";		mat[13][3] = "mesa";
	mat[14][0] = "banana";		mat[14][1] = "torta";			mat[14][2] = "macaco";			mat[14][3] = "amarelo";
	mat[15][0] = "chicletes";	mat[15][1] = "mastiga-se";		mat[15][2] = "� doce";			mat[15][3] = "borrachudo";
	mat[16][0] = "anel";		mat[16][1] = "redondo";			mat[16][2] = "noivos";			mat[16][3] = "ouro";
	mat[17][0] = "borracha";	mat[17][1] = "apaga";			mat[17][2] = "escolar";			mat[17][3] = "faz farelo quando usada";
	mat[18][0] = "pirulito";	mat[18][1] = "crian�a adora";		mat[18][2] = "doce";			mat[18][3] = "tem cabo";
	mat[19][0] = "pudim";		mat[19][1] = "mole";			mat[19][2] = "doce";			mat[19][3] = "sobremesa";

	for(cont=0;cont<27;cont++)
		letras[cont]="";	

	System.out.println(" Ai sua praga entre com seu nome:.....");

		while(true)
		{
			try
			{
				nome = leia.readLine();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				break;
			}
			catch(IOException e1)
			{
				System.out.println("Errou mane");
			}
			catch(NumberFormatException e2)
			{
				System.out.println("Errou idiota");
			}
		}
		System.out.println("  		"+nome+"  escolha ai....");
		System.out.println("  		 ** +-----------Jogo da forca---|  *******");
		System.out.println(" 		 ** |              Menu         O  *******");
		System.out.println(" 		 ** |        1-Inicio do jogo  /|\\ *******");
		System.out.println(" 		 ** |        2-Ajuda            |  *******");
		System.out.println(" 		 ** |        3-Sair            / \\ *******");
		System.out.println("  		 ** +----------------------------  *******");
		System.out.print("  		 ******Escolha: ");
		
		while (op != 3)
		{
			while (op < 1 || op > 3)
			{
				try
				{
					op = Integer.parseInt(leia.readLine());
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					if (op < 1 || op > 3 )
					System.out.println(" OP Invalido");
				}
				catch(IOException e1)
				{
					System.out.println("Errou mane");
				}
				catch(NumberFormatException e2)
				{
					System.out.println("Errou idiota");
				}
			}
			switch(op)
			{				
				case 1:
					va = (int)(20 * Math.random()); // acha palavra aleatoria	
					palavra = mat[va][0];  // recebe palavra aleatoria
					for(cont = 0; cont < 15; cont++)
						tracinho[cont]="_";
					
					for(cont = 0; cont < palavra.length(); cont++)
					{
          					System.out.print(tracinho[cont]+" ");
					}	
					erro = 0;
					v = 0;

					while(v != 1)
					{	
						
						
						nl = 0;
						ve = 0;					
						switch(erro)
						{
							case 0:
								System.out.println("\n		  ______  ");
								System.out.println(" 		  |    !  ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");									System.out.println("		  |       ");
								System.out.println(" 		  ------  ");
																
							case 1:
								System.out.println("		  ______  ");
								System.out.println(" 		  |    !  ");
								System.out.println("		  |    o  ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");									
								System.out.println(" 		  ------  ");
								break;
							case 2:
								System.out.println("		  ______  ");
								System.out.println(" 		  |    !  ");
								System.out.println("		  |    o  ");
								System.out.println("		  |   /   ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");									
								System.out.println(" 		  ------  ");
								break;
							case 3:
								System.out.println("		  ______  ");
								System.out.println(" 		  |    !  ");
								System.out.println("		  |    o  ");
								System.out.println("		  |   / \\");
								System.out.println("		  |       ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");									
								System.out.println(" 		  ------  ");
								break;
							case 4:
								System.out.println("		  ______  ");
								System.out.println(" 		  |    !  ");
								System.out.println("		  |    o  ");
								System.out.println("		  |   /|\\");
								System.out.println("		  |       ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");									
								System.out.println(" 		  ------  ");
								break;
							case 5:
								System.out.println("		  ______  ");
								System.out.println(" 		  |    !  ");
								System.out.println("		  |    o  ");
								System.out.println("		  |   /|\\");
								System.out.println("		  |    |   ");
								System.out.println("		  |       ");
								System.out.println("		  |       ");									
								System.out.println(" 		  ------  ");
								break;
							case 6:
								System.out.println("		  ______  ");
								System.out.println(" 		  |    !  ");
								System.out.println("		  |    o  ");
								System.out.println("		  |   /|\\");
								System.out.println("		  |    |   ");
								System.out.println("		  |   /   ");
								System.out.println("		  |       ");									
								System.out.println(" 		  ------  ");
								break;
						}
						
						for(cont = 0; cont < palavra.length(); cont++)
						{
          						System.out.print(tracinho[cont]+" ");
						}		
						System.out.println("\n");
						System.out.println(nome + " voce " + chance + " colheres de cha!!!!!");
						System.out.println("\n ... Colher de cha ...\n");
						System.out.print("1: ");
						if(erro>=2)
						System.out.print(mat[va][1]);
						System.out.print("\n2: ");
						if(erro>=4)
						System.out.print(mat[va][2]);
						System.out.print("\n3: ");
						if(erro>=6)
						System.out.print(mat[va][3]);
						if(erro == 7)
						{
							System.out.println("\n		  ______  ");
							System.out.println(" 		  |    !  ");
							System.out.println("		  |    o  ");
							System.out.println("		  |   /|\\");
							System.out.println("		  |    |   ");
							System.out.println("		  |   / \\ ");
							System.out.println("		  |       ");									
							System.out.println(" 		  ------  ");
							System.out.println("  		"+nome+" voce perdeu entao o que deseja fazer: ");
							System.out.println(" 		 ****** 1-Voltar ao Inicio do jogo *******");
							System.out.println("		 ****** 2-Pedir ajuda ********************");
							System.out.println(" 		 ****** 3- Ou sair do jogo ***************");
							System.out.print("  		 ******Escolha: ");
							v = 1;
							op = 0;
							break;
						}
						for(cont=0;cont<palavra.length();cont++)
							if(tracinho[cont].equalsIgnoreCase("_"))
								ve = 1;
							
						if(ve != 1)
						{
							System.out.println("\n\n           Parabens " + nome + ", Voce venceu o jogo!!");
							System.out.println(" 		 ****** 1-Voltar ao Inicio do jogo *******");
							System.out.println("		 ****** 2-Pedir ajuda ********************");
							System.out.println(" 		 ****** 3- Ou sair do jogo ***************");
							System.out.print("  		 ******Escolha: ");
							v = 1;
							op = 0;
							break;
						}
						
						System.out.print("\n\nLetras ja escolhidas: ");
						for(cont=0;cont<20;cont++)
						{
						System.out.print(letras[cont]+" ");
						} 

						while(true)
				    	        {
				       			try
				      			{	
								 System.out.print("\nDigite uma letra:");			
								 ld = leia.readLine();
							 
								 if (ld.equals(""))
                                                	         continue;
								
								 j = ld.toUpperCase().charAt(0);

                                                       		 if (j < 'A' || j > 'Z')
                                                         	 continue;
								
								 r = 0;

                                                                 for(cont=0;cont<jaesc;cont++)
                                                                 	if(ld.equalsIgnoreCase(letras[cont]))
                                                                        	r++;
                                                                 if(r==0)
                                                                 break;
								 	else
									System.out.print(nome + ", Voce ja digitou a letra [ " + ld + " ], Digite outra: "); 		
							}
							catch(IOException e1)
			      				{
				   				 System.out.println("Errou mane");
		                        		}
						}
							
						for(cont=0;cont<palavra.length();cont++)
						{
                                                       	if(ld.equalsIgnoreCase(String.valueOf(palavra.charAt(cont))))
							{
								tracinho[cont]=ld;
								nl = nl+1;
							}
						}
						if(nl==0)
						{
							erro=erro+1;
							chance--;
						}
						letras[e] = ld;
						jaesc++;
						e++;
					}
					op = 0;
					break;
				case 2:
					System.out.println("		*********************ajuda*********************");
					System.out.println("  		"+nome+"  que se que mane: ...................");
					System.out.println("  		****** 1-Voltar ao Inicio do jogo *******");
					System.out.println(" 		****** 2-Pedir ajuda novamente **********");
					System.out.println(" 		****** 3- Ou sair do jogo ***************");
					System.out.print("  		******Escolha: ");
					op = 0;
				        break;
			}
		}
	}
}