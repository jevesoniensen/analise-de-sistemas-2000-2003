package agenda;

public class Cliente
{
	private String cpf;
	private String nome;
	private String contato;

	public Cliente(String nome, String cpf, String contato) throws Exception
	{
		if(!setNome(nome) || !setCpf(cpf) || !setContato(contato))
			throw new Exception();
		
	}

	public boolean setNome(String var)
	{
		if(var.equals(""))
			return false;
		else
		{
			nome = var;
			return true;
		}
	}

	public boolean setCpf(String var)
	{
		int aux=0;
		if(var.length() == 11)
		{
			for(int i=0; i < 11; i++)
			{
				if(var.charAt(i) >= '0' && var.charAt(i) <= '9')
					cpf=var;
				else
					return false;
			}
			return true;		
		}
		return false;
	}

	public boolean setContato(String var)
	{
		if(var.equals(""))
			return false;
		else
		{
			contato = var;
			return true;
		}
	}

	public String getNome()
	{
		return nome;
	}

	public String getCpf()
	{
		return cpf;
	}

	public String getContato()
	{
		return contato;
	}
}