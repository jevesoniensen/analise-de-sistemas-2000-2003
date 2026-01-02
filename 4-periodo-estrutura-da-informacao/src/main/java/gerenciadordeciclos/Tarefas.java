package gerenciadordeciclos;

import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Tarefas implements Serializable 
{
	private int tarefa;
	private String descricao,responsavel;
//	private JLabel icone;
	private Icone icone;
	
	public Tarefas(int tarefa,String descricao,String responsavel,JLabel icone)
	{
		this.icone=(Icone)icone;
		this.tarefa=tarefa;
		this.descricao=descricao;
		this.responsavel=responsavel;
	}
	
	public int getTarefa()
	{
		return tarefa;
	}
	
	public JLabel getIcone()
	{
		return icone;
	}
		
	public String getDescricao()
	{
		return descricao;
	}	
	
	public String getResponsavel()
	{
		return responsavel;
	}	
	
	public void setTarefa(int tarefa)
	{
		this.tarefa = tarefa;
	}
	
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
}