package tabelaverdade;

public class Pilha
{

	private char[] dados= new char[256];
	private int topo=0;

	public boolean Cheia()
	{
		return (this.topo==256);
	}

	public boolean Vazia()
	{
		return (this.topo==0);
	}

	public char Top()
	{
     		if(!Vazia())
			return dados[this.topo];
		else
			return ' ';
	}

	public boolean Empilha (char s)
	{
		if(!Cheia())
		{
			this.topo++;
			dados[this.topo]=s;
      			return false;
		}
		else
		      return false;
	}

	public char Desempilha()
	{
		if(!Vazia())
		{
			this.topo--;
			return dados[this.topo+1];
		}
		else
			return ' ';
	}
}
