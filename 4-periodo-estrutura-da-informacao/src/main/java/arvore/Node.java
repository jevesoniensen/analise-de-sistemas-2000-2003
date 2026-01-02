package arvore;

/* Classe que define a estrutura basica de uma arvore - um no  */
/* =========================================================== */
public class Node
{

   private int key;
   private Object value;
   private Node left, right;

/* Construtor da classe Node        */
/* ================================ */
   public Node(int key, Object value)
   {
      this.key = key;
      this.value = value;
      left = null;
      right = null;
   }

/* Insere um no na arvore           */
/* ================================ */
   public void insert(int key, Object value)
   {

     if (this.key > key)
     {
        if (left == null)
           left = new Node(key, value);
        else
           left.insert(key, value);
     }
     else {
        if (right == null)
            right = new Node(key, value);
        else
            right.insert(key, value);
     }
    }

/* Encontra um no na arvore, dada a chave, e retorna uma referencia */
/* ============================================================== */
   public Node getNode(int key) 
   {
	
      if (this.key == key){
         return this;
      }
      else{
		if (key < this.key && left!=null) 
			return left.getNode(key);
      	else 
			if(key > this.key && right!=null) 
				return right.getNode(key);
      	return null;
	}
   }

/* Mostra os dados de um no                  */
/* ========================================= */
   public void showNode() {
        System.out.println(this.key+" "+this.value);

  }


/* Dada a chave, retorna uma referencia para o pai de um no que contem esta chave  */
/* =============================================================================== */
   public Node getFather(int key) {
        Node curr, father;
 
        if (this.key == key) father = null;
        else {
           curr=this; father=this;
 	     while (curr.key != key) {
                 father=curr;
                 if (key < curr.key) curr = curr.left;
                 else if (key > curr.key) curr = curr.right;
           }
       }
       return father;
  }
  
  
  public void setRight(Node no)
  {
  	right=no;
  }
  
  public void setKey(int key,Object value)
  {
  	this.key = key;
  	this.value = value;
  }
  
  public void setLeft(Node no)
  {
  	left=no;
  }
  
  public int getKey()
  {
  	return key;
  }
  
  public Node getRight()
  {
  		return right;
  }
  
  public Object getValue()
  {
  	return value;
  }
  
  public Node getLeft()
  {
  		return left;
  }

/* Mostra arvore                     */
/* ================================= */
     public void showTree(int tab)
   {

      for(int x=0; x<tab; x++)
         System.out.print("\t");
      System.out.println("Chave = "+key+" "+"Nome="+value);
      if(left!=null) left.showTree(tab+1);
      else {
          for(int x=0; x<=tab; x++)
              System.out.print("\t");
          System.out.println("Sem subarvore esquerda");
      }
      if(right!=null) right.showTree(tab+1);
      else {
          for(int x=0; x<=tab; x++)
              System.out.print("\t");
          System.out.println("Sem subarvore direita");
      }

   } 



/* Realiza o caminhamento pre-ordem  */
/* ================================= */
   public void preordem()
   {
       System.out.print(key+" "+value+",");
       if(left!=null) left.preordem();
       if(right!=null) right.preordem();
   } 


/* Realiza o caminhamento in-ordem  */
/* ================================= */
    public void inordem()
   {

       if(left!=null) left.inordem();
       System.out.print(key+" "+value+",");
       if(right!=null) right.inordem();
   } 


/* Realiza o caminhamento pos-ordem  */
/* ================================= */
     public void posordem()
   {

       if(left!=null) left.posordem();
       if(right!=null) right.posordem();
       System.out.print(key+" "+value+",");
   } 

	public int numFilhos()
	{
		int cont = 0;
		if(right != null)
		    cont++;
		if(left != null)
			cont++;		
		return cont;
	}
	
	public int posicaoFilho(Node no)
	{
		if(right == no)
			return 0;
		else
			if(left == no)
				return 1;
		return -1;
	}

}