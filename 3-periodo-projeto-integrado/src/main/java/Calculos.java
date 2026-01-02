import java.util.Vector;

public class Calculos
{
	Vector tarefas,camCritico;
	int numtarefas,ncaminhos;
	int[][] mat,arcos;
	int[] tmce,tmte,fe,tmca,tmta,fla,fta;
	
	
	public Calculos(Vector tarefas,int numtarefas)
	{
		this.tarefas=tarefas;
		this.numtarefas=numtarefas;
		camCritico = new Vector();
		mat = new int[numtarefas][numtarefas];
		tmce = new int[numtarefas];
		tmte = new int[numtarefas];
		fe =  new int[numtarefas];
			
		for(int i=0;i<numtarefas;i++)
			for(int j=0;j<numtarefas;j++)
				mat[i][j]=-1;
				
		Relacionamentos taref;
		
		for(int i=0;i<tarefas.size();i++)
		{
			taref=(Relacionamentos)tarefas.elementAt(i);
			mat[taref.getTarefaA()-1][taref.getTarefaB()-1]=taref.getTempoExec();
		}
		
		calculaNumeroCaminhos();
		
		arcos= new int[ncaminhos][2];		
		tmca = new int[ncaminhos];
		tmta = new int[ncaminhos];
		fla =  new int[ncaminhos];
		fta =  new int[ncaminhos];
		
		encontraArcos();
		
		for(int i=0;i<numtarefas;i++)
		{
			tmce[i]=0;

		}
		calculaTempoMinimo();
		calculaTMTE();
		calculaFE();
		calculaTMCA();
		calculaTMTA();
		calculaFLA();
		calculaFTA();
		calculaCaminhoCritico();
	}	

	public void calculaTempoMinimo()
	{
		tmce[0]=0;
		int aux;

		for(int i=1;i<numtarefas;i++)
		{
				tmce[i]=mat[0][i];							
		}		
		for(int i=1;i<numtarefas;i++)
		{	
			for(int j=0;j<numtarefas;j++)
			{				
				if(mat[i][j]!=-1)
				{
					aux = tmce[i] + mat[i][j];
					if(aux>tmce[j])
					{
							tmce[j]=aux;
					}
				}
			}
		}		
	}
		
	public void calculaTMTE()
	{
		int aux,x;
		
		tmte[numtarefas-1] = tmce[numtarefas-1]; //O ultimo valor TMTE recebe o ultimo valor de TMCE
		for(int i=numtarefas-2; i>=0; i--)
		{
			aux = 999999;
			for(int j=0; j<numtarefas; j++)
			{
				if(mat[i][j] != -1)
				{
					x = tmte[j] - mat[i][j];
					if( x < aux)      //Teste para pegar o menor
						aux = x;
				}
			}
			tmte[i]= aux;
		
		}		
	}
	
	public void calculaFE()
	{
		for(int i=0; i<numtarefas; i++)
		{
			fe[i] = tmte[i] - tmce[i];		
		}		
	}
	
	public void calculaNumeroCaminhos()
	{
		int x=0;
		for(int i=0; i<numtarefas; i++)
			for(int j=0; j<numtarefas; j++)
				if(mat[i][j] != -1)
					x++;		
		ncaminhos=x;
	}
	
	public void encontraArcos()
	{	
		int x=0;
		for(int i=0; i<numtarefas; i++)
			for(int j=0; j<numtarefas; j++)
				if(mat[i][j] != -1)
				{
					arcos[x][0] = i;//primeira coluna
					arcos[x][1] = j;//segunda coluna
					x++;
				}	
	}

	public void calculaTMCA()
	{
	   	for(int i=0; i<tmca.length; i++)   	   	
			tmca[i] = tmce[arcos[i][0]] + mat[arcos[i][0]][arcos[i][1]];	
	}
	
	public void calculaTMTA()
	{
	   	for(int i=0; i<tmca.length; i++)
		    tmta[i]= tmte[arcos[i][1]] - mat[arcos[i][0]][arcos[i][1]];
	}
	
	public void calculaFLA()
	{
		for(int i=0; i<fla.length; i++)
		    fla[i] = tmce[arcos[i][1]] - tmca[i];
	}
	
	public void calculaFTA()
	{
		for(int i=0; i<fta.length; i++)
   	   		fta[i] = fe[arcos[i][1]] + fla[i];
	}
	
	public void calculaCaminhoCritico()
	{
		int cont=0;
		for(int i=0; i<fla.length; i++)
			if(fla[i] == 0 && fta[i] == 0)
      		{
	 			cont+=1;
	 			camCritico.add(String.valueOf(arcos[i][0]+1));			
      		}
      		camCritico.add(String.valueOf(arcos[arcos.length-1][1]+1));
      		getCamCritico();      	
	}
	
	
	public Vector getCamCritico()
	{
			return camCritico;
	}
	
		
	public int getTempoMinimo()
	{
		return tmce[numtarefas-1];	
	}	
}