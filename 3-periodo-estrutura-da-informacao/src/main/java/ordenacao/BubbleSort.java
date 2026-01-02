package ordenacao;//(int)(Math.random()*100-100)

class BubbleSort 
{
    static int v[] = new int[100000];

	public static void main(String[] args) 
	{
   	    int s = v.length;
		System.out.println("TAMANHO VETOR: "+s);
		//PREENCHE_VETOR_CRESCENTE(s);		
		//PREENCHE_VETOR_DECRESCENTE(s);		
		PREENCHE_VETOR_ALEATORIO(s);		
		ORDENA(s);
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
	   //   System.out.println(v[i2]);
	}

	public static void ORDENA(int s)
	{
	   //System.out.print(s); 
   	   long tempo1 = System.currentTimeMillis();
	   int i,j,t;
	   for(i=0;i<s-1;i++)
	   {
	      for(j=i;j<s;j++)
	      {
		     if(v[i]>v[j])
			 {
			    t = v[i];
				v[i] = v[j];
				v[j] = t;
			 }
	      }
	   }
	   //for(int i2=0;i2<s;i2++)
	   //   System.out.println(v[i2]);
   	   long tempo2 = System.currentTimeMillis();
       System.out.println("TEMPO ENTRADA: "+tempo1);
       System.out.println("TEMPO SAIDA  : "+tempo2);
	}
}