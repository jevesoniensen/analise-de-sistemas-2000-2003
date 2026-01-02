package ordenacao;//(int)(Math.random()*100-100)

class MergeSort
{
    static int v[] = new int[100000];
    static int s = v.length;
    static int aux[] = new int[100000];

	public static void main(String[] args) 
	{   	    
   	    int left = 0;
   	    int right = s-1;
		System.out.println("TAMANHO VETOR: "+s);
		
		//PREENCHE_VETOR_CRESCENTE(s);		
		//PREENCHE_VETOR_DECRESCENTE(s);		
		PREENCHE_VETOR_ALEATORIO(s);		
   	    
   	    long tempo1 = System.currentTimeMillis();		
		
		MergeSort(v, left, right);
		
		long tempo2 = System.currentTimeMillis();
	    
	    //for(int i2=0;i2<s;i2++)
	      // System.out.print(v[i2]);	          	   
        
        System.out.println("\nTEMPO ENTRADA: "+tempo1);
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

//       System.out.println("\n"); 

  //     for(int i2=0;i2<num_elementos;i2++)
	//      System.out.print(v[i2]);
      // System.out.println("\n"); 	      
	}

    public static void MergeSort(int v[], int left, int right)
    {
	  int mid;

	  if(left<right)
	  {
	 	 mid=(int)((left+right)>>1);
		
		 MergeSort(v,left,mid);
		 MergeSort(v,mid+1,right);
		 Merge(v,left,mid,right);
	  }
    }

    public static void Merge(int v[], int left, int mid, int right)
    {  
	   int i, j, k;	  

	   for(i = mid +1; i > left; i--)
	      aux[i-1]=v[i-1];

	   for(j=mid;j<right;j++)
		  aux[right+mid-j]=v[j+1];

	   for(k=left;k<=right;k++)
	   {
		  if(aux[i]<aux[j])
		  	 v[k]=aux[i++];
		  else
			 v[k]=aux[j--];
	   }
   }
}