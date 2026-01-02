package tabelaverdade;

import java.io.*;

public class TV
{
	String ex = "";

	public void imprimeMenu()
	{
		System.out.println("\n\n\n   ***   MENU   ***\n");
		System.out.println("   1-Digite sua Expressao");
		System.out.println("   2-Sair");
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
             		if(op < 1 || op > 2)
               			System.out.println("***   Opcao Invalida   ***  -  IF");
			else
				return op;
		}
	}

	public static void main(String args[])
	{
		TV e = new TV();
		e.executa();
	}

	public String expressao()
	{
		System.out.println("Digite sua expressao");
		ex = leTeclado();
		return ex;
	}


	public void executa()
	{
		Posfixo p =new Posfixo();
		int op = leMenu();
		int m[][],res[][];
		while(op != 2)
		{
			switch(op)
			{
					 case 1:
						LimpaTela();
						String pol = p.Polonesa(expressao());
						Calculo c = new Calculo();
						String numcol = c.numColunas(pol);
                                                String numprop = c.numProp(pol);
						System.out.println(numcol + "___" + numprop);
 
						/*int numprop = c.numProp(pol);
						int numlin = (int)Math.pow(2,numprop);
						System.out.println("Numero de colunas = " + numcol);
                                                m = c.preencheTabela(numprop);
                                                m = c.Resultado(pol,m,numlin);
						for(int i = 0;i < numlin;i++)
							for(int j = 0; j < numcol+1;j++)
							{
								System.out.print("[" + m[i][j] + "]");
								if(j == (numcol))
									System.out.print('\n');
							}*/
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

}