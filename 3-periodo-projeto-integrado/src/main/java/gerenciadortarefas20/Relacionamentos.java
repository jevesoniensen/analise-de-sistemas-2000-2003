package gerenciadortarefas20;

import java.io.Serializable;

public class Relacionamentos implements Serializable
{
	private int tarefaA,tarefaB,tempoExec;
	
	public Relacionamentos(int tarefaa, int tarefab ,int tempoexec)
	{
		tarefaA = tarefaa;
		tarefaB = tarefab;
		tempoExec = tempoexec; 
	}
	
	public int getTarefaA()
	{
		return tarefaA;
	}
	
	public int getTarefaB()
	{
		return tarefaB;
	}
	
	public int getTempoExec()
	{
		return tempoExec;
	}	
	
	public void setTarefaA(int tarefa)
	{
		tarefaA = tarefa;
	}
	
	public void setTarefaB(int tarefa)
	{
		tarefaB = tarefa;
	}
	
	public void setTempoExec(int tempo)
	{
		tempoExec = tempo;
	}
}