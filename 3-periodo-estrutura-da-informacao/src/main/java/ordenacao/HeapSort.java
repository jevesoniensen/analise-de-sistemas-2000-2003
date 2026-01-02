package ordenacao;//(int)(Math.random()*100-100)

class HeapSort
{
    static int v[] = new int[100000];
    static int s = v.length;

	public static void main(String[] args) 
	{   	    
   	    System.out.println("TAMANHO VETOR: "+s);
		
		//PREENCHE_VETOR_CRESCENTE(s);		
		//PREENCHE_VETOR_DECRESCENTE(s);		
		PREENCHE_VETOR_ALEATORIO(s);		
   	    
   	    long tempo1 = System.currentTimeMillis();		
		
		HeapSort(v, s);
		
		long tempo2 = System.currentTimeMillis();
	    
	//    for(int i2=0;i2<s;i2++)
	//       System.out.print(v[i2]);	          	   
        
        System.out.println("\nTEMPO ENTRADA: "+tempo1);
        System.out.println("TEMPO SAIDA  : "+tempo2);		
        
        long tempofinal = tempo2 - tempo1;
        System.out.println("TEMPO FINAL  : "+tempofinal);		
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

       //System.out.println("\n"); 

       //for(int i2=0;i2<num_elementos;i2++)
	   //   System.out.print(v[i2]);
       //System.out.println("\n"); 	      
	}
	
	public static void Heapify(int v[], int i, int heapsize)
    {
 	   int l, r, largest, temp;

	   l = 2*i+1;
	   r = 2*i+2;
	   
	   //System.out.println("i: "+ i + " " + "l: "+ l + " " + "r: "+r);

	   largest = i;

	   if( l < heapsize)
	      if(v[l] > v[i])
		     largest = l;

	   if( r < heapsize)
	      if( v[r] > v[largest])
		     largest = r;

	   if(largest != i)
	   {
		  temp = v[i];
		  v[i] = v[largest];
		  v[largest] = temp;

	      Heapify(v, largest, heapsize);
	   }
   }


   public static void BuildHeap(int v[], int heapsize)
   {
	  int i;

	  for(i = (int)(heapsize >> 1); i >= 0; i--)
	 	 Heapify(v, i, heapsize);
   }


   public static void HeapSort(int v[], int heapsize)
   {
	  int i, temp;

	  BuildHeap(v, heapsize);
	
	  for(i = heapsize - 1; i > 0; i--)
	  {
		 temp = v[0];
		 v[0] = v[i];
		 v[i] = temp;

		 heapsize--;

		 Heapify(v, 0, heapsize);
	  }
   }   
}