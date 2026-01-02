package arvore;/* Este programa cria uma arvore binaria de pesquisa utilizando a classe Node  */
/* A chamada deste programa deve ter o seguinte formato: java Reader dados.txt */
/* onde o arquivo dados.txt contem os dados a serem inseridos na arvore        */

import java.io.*;
import java.util.*;

public class Reader
{
   private Node root;
   
   public static void menu()
   {
   		System.out.println ("Arvore Binaria ");
   		System.out.println ("Apagar No --> A");
   		System.out.println ("Sair 	   --> S");
   }
   
   public static void limpaTela()
   {
   		for(int i=0;i<25;i++)
   			System.out.println('\n');
   }
   
   public static String leString()
   {
   		String s_dado = "";
   		
   		BufferedReader buf_dado = new BufferedReader(new InputStreamReader(System.in));
   		try
   		{
   			s_dado = buf_dado.readLine();
   		}
   		catch(IOException e1)
   		{
   			System.out.println ("digite um numero");
   		}
   		
   		return s_dado;
   }
   
   public static int leInteiro() 
   { 
   		int i_dado = -1;
   		  	
   		try 
   		{
   			i_dado = Integer.parseInt(leString());
   		}
   		catch(NumberFormatException e1)
   		{
   			System.out.println ("digite um numero");
   		}
   		
   		return i_dado;
   }
   
   
   public static void main(String[] args) 
   {
     try {
       File f = new File(Reader.class.getResource("dados.txt").toURI());
       if(!f.exists())
          throw new Exception("Arquivo nao existe");
       Reader r = new Reader();
       
       r.createTree(f);
       String op="";
       int no=0;
		while(true)
		{
			limpaTela();
       		menu();
       		op = leString();
       		if(op.equalsIgnoreCase("A"))
       		{              
       		    limpaTela();
       			r.printTree();
       
       			System.out.print("\nDigite o no que deseja apagar: ");
       			no=leInteiro();
       			if((r.root).getNode(no) != null)
				{             
       				r.clearNode(no);
       				limpaTela();
       				r.printTree();
       				System.out.println("\nPressione [ENTER] para continuar..");
       				leString();
       			}
       			else
       			{
       				limpaTela();
       				System.out.println("\n\n\n   No " + no + " nao existe!\n\n\n");
       				System.out.println("\nPressione [ENTER] para continuar..");
       				leString();       				
       			}
       		}
       		else if(op.equalsIgnoreCase("S"))
       			break;       
       		//r.consult(12); /* consulta a arvore dada a chave 12 */
         }
	   }

	   catch(Exception e)
   	   {
      		System.out.println(e.getMessage());
	   }
}

/* Cria a arvore binaria de pesquisa a partir de um arquivo de entrada tipo texto */
/* composto de registros com dois campos separados por espaco                     */
/*================================================================================*/
private void createTree(File f) throws Exception
{

   BufferedReader reader = new BufferedReader(new FileReader(f));

   String line;
   String key, value;
   int ikey;

   while((line = reader.readLine()) != null)
   {

     StringTokenizer tokens = new StringTokenizer(line," ");
     try
     {
       key=tokens.nextToken();
       value=tokens.nextToken();
       ikey=Integer.parseInt(key);
     }

     catch(NoSuchElementException e)
     {
       throw new Exception("Formato do arquivo invalido");
     }

     catch(NumberFormatException e)
     {
       throw new Exception("Formato da chave invalido");
     }

     if(tokens.hasMoreTokens())
        throw new Exception("Formato do arquivo invalido");

     if (root == null)
         root = new Node(ikey, value);
     else
         root.insert(ikey, value);
    }

 }

/* Recupera um elemento da arvore atraves de sua chave */
/* Mostra tambem o pai do elemento consultado          */
/*=====================================================*/
   private void consult(int key)
   {
     Node p, father;  
     p=root.getNode(key);
 
     System.out.println("\n\n\n"+"===> Dados do no consultado");
     if (p!=null)  p.showNode();

     System.out.println("\n"+"===> Pai do no consultado");
     father=root.getFather(key);
     if (father!=null)  father.showNode(); else System.out.println("Pai da raiz = nulo");
   }

/* Realiza os caminhamentos pre-ordem, in-ordem e pos-ordem */
/* em uma arvore binaria de pesquisa                        */
/*==========================================================*/

	public void clearNode(int chave)
	{
		Node no, pai;
		no = root.getNode(chave);
										
		if(no.numFilhos() == 0)	
		{
			
			if(no == root)
				root = null;			
			else
			{	
				pai = root.getFather(no.getKey());

				if(pai.posicaoFilho(no) == 0)
					pai.setRight(null);
				else
					if(pai.posicaoFilho(no) == 1)				
						pai.setLeft(null);			
			}
		}
		else
		if(no.numFilhos() == 1)	
		{		
			if(no.getRight() != null)
			{
				if(no == root)
					root = no.getRight();
				else
				{
					pai = root.getFather(no.getKey());
				
					if(pai.posicaoFilho(no) == 0)
						pai.setRight(no.getRight());
					else
					if(pai.posicaoFilho(no) == 1)				
						pai.setLeft(no.getRight());
				}
				
			}
			else
			{
				if(no == root)
					root = no.getLeft();
				else
				{	
					pai = root.getFather(no.getKey());
					if(pai.posicaoFilho(no) == 0)
						pai.setRight(no.getLeft());
					else
					if(pai.posicaoFilho(no) == 1)				
						pai.setLeft(no.getLeft());
				}
			}	
		}
		else
		{	
			Node result, no_pai;
			result = buscaMaiorEsquerda(no.getLeft());
			
			if(result.numFilhos() == 0)
			{							
				no_pai = root.getFather(result.getKey());					
				no.setKey(result.getKey(),result.getValue());
				no_pai.setLeft(null);
				
			}	
			else
			{
				no_pai = root.getFather(result.getKey());					
				no.setKey(result.getKey(),result.getValue());
				no_pai.setRight(result.getLeft());
				no_pai.setLeft(null);
			}					
		}
			
				
	}
	
   private Node buscaMaiorEsquerda(Node no)
   {
   		if(no.getRight() != null)
   			return buscaMaiorEsquerda(no.getRight());
   		
   		return no;
   }
	
   private void printTree()
   {
      if(root == null)
        System.out.println("Arvore Vazia");
      else {
        System.out.println("\n"+"===> Arvore Binaria de Pesquisa");
        root.showTree(0);
        //System.out.println("\n"+"===> Caminhamentos");
        //System.out.println("\n"+"a) Pre-ordem");
       // root.preordem();
        //System.out.println("\n"+"b) In-ordem");
        //root.inordem();
        //System.out.println("\n"+"c) Pos-ordem");
        //root.posordem(); 
      }
   }

}
   
