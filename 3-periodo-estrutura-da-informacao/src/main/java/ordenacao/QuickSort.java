package ordenacao;//(int)(Math.random()*100-100)

class QuickSort 
{
    static int v[] = new int[100000];
    static int s = v.length;

	public static void main(String[] args) 
	{   	    
   	    int left = 0;
   	    int right = s-1;
		System.out.println("TAMANHO VETOR: "+s);
		
		//PREENCHE_VETOR_CRESCENTE(s);		
		//PREENCHE_VETOR_DECRESCENTE(s);		
		PREENCHE_VETOR_ALEATORIO(s);		
   	    
   	    long tempo1 = System.currentTimeMillis();		
		
		ORDENA(v, left, right);
		
		long tempo2 = System.currentTimeMillis();
	    
	    long tempofinal = tempo2 - tempo1;
        System.out.println("TEMPO FINAL  : "+tempofinal);
	    
	    //for(int i2=0;i2<s;i2++)
	       //System.out.println(v[i2]);   	   
        
        System.out.println("TEMPO ENTRADA: "+tempo1);
        System.out.println("TEMPO SAIDA  : "+tempo2);		
	}

	public static void PREENCHE_VETOR_CRESCENTE(int num_elementos)
	{

	   for(int i=0;i<num_elementos;i++)
	      v[i]=i;

       //for(int i2=0;i2<num_elementos;i2++)
	   //   System.out.println(v[i2]);
	}

	public static void PREENCHE_VETOR_DECRESCENTE(int num_elementos)
	{
	   int i = num_elementos-1;
	   int aux=0;
	   while(i>0)
	   {
	      v[aux]=i;
		  i = i-1;
		  aux++;
       } 

       //for(int i2=0;i2<num_elementos;i2++)
	   //   System.out.println(v[i2]);
	}

	public static void PREENCHE_VETOR_ALEATORIO(int num_elementos)
	{
	   for(int i=0;i<num_elementos;i++)
	      v[i]=(int)(Math.random()*num_elementos);

       //for(int i2=0;i2<num_elementos;i2++)
	     // System.out.println(v[i2]);
	}

    public static int Partition(int v[], int left, int right)
    {
	   int x, temp;

	   x = v[ (left + right) / 2];

	   left--;
	   right++;

	   while(true)
	   {
		  do
		  {
		 	 left++;
		  }
		  while( v[left] < x);

		  do
		  {
		 	 right--;
		  }
		  while( v[right] > x);


		  if(left < right)
		  {
		 	 temp = v[left];
			 v[left] = v[right];
			 v[right] = temp;
		  }
		  else
		 	 break;
	   }
	   return right;	   	
    }


	public static void ORDENA(int v[], int left, int right)
	{
	   //System.out.print(s); 
	   	
	   int p;

  	   if(left < right)
	   {
		  p = Partition(v, left, right);

		  ORDENA(v, left, p);
		  ORDENA(v, p +1, right);
	   }	   
	}
}