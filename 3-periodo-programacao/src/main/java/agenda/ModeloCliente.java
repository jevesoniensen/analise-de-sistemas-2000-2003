package agenda;

import java.util.*;

public class ModeloCliente
{
	private Vector cadastro = new Vector();		

	public void addItem(Cliente c)
	{
		cadastro.add(c);
	}

	public Cliente getItem(int idx)
	{
		return (Cliente)cadastro.elementAt(idx);
	}
	
	public void remove(int idx)
	{
		cadastro.removeElementAt(idx); 
	} 
	
	public void setItem(Cliente c, int idx)
	{
		cadastro.setElementAt(c,idx);
	}
	
	public int getTamanho()
	{
		return cadastro.size();
	}
	
	public void orgCpf()
	{
		Cliente temp;
		for(int i=0; i < cadastro.size()-1; i++)
		{					
			for(int j=i+1; j < cadastro.size(); j++)
			{
				if(((Cliente)cadastro.elementAt(i)).getCpf().compareToIgnoreCase(((Cliente)cadastro.elementAt(j)).getCpf()) >= 0)
				{
					temp = (Cliente)cadastro.elementAt(i);
					cadastro.setElementAt(cadastro.elementAt(j), i);
					cadastro.setElementAt(temp,j);
				}						
			}
		}
	}
 
	public void orgNome()
	{
		Cliente temp;
		for(int i=0; i < cadastro.size()-1; i++)
		{					
			for(int j=i+1; j < cadastro.size(); j++)
			{
				if(((Cliente)cadastro.elementAt(i)).getNome().compareToIgnoreCase(((Cliente)cadastro.elementAt(j)).getNome()) >= 0)
				{
					temp = (Cliente)cadastro.elementAt(i);
					cadastro.setElementAt(cadastro.elementAt(j), i);
					cadastro.setElementAt(temp,j);
				}						
			}
		}
	}
	
	public boolean comparStr(String str, String busca)
	{ 
		str=str.toLowerCase();
		busca=busca.toLowerCase();
		while(str.length() > 0)
		{
			if(str.startsWith(busca))												
				return true;			
			else
				str = str.substring(1,str.length()); 	
		}
		return false;
	}	
	
	public Vector localizaCliente(String busca)
	{
		Vector aux= new Vector();
		for(int i = 0; i < cadastro.size(); i++)
		{
			if(comparStr(((Cliente)cadastro.elementAt(i)).getNome(), busca))
			{
				aux.add(String.valueOf(i));
			}			
		}		
		return aux;
	}	
	
	public Vector localizaCPF(String busca)
	{
		Vector aux= new Vector();
		for(int i = 0; i < cadastro.size(); i++)
		{
			if(comparStr(((Cliente)cadastro.elementAt(i)).getCpf(), busca))
			{
				aux.add(String.valueOf(i));
			}			
		}		
		return aux;
	}
}
