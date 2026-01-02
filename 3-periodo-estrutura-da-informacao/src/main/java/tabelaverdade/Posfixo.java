package tabelaverdade;

public class Posfixo
{

	public int f(char s)
	{
		switch(s)
		{
			case '=': return 1;
			case '*': return 3;
			case '-': return 5;
			case '|': return 7;
			case '&': return 9;
			case '!': return 12;
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w': return 13;
			case '(': return 15;
			case ')': return 0;
			default: return -1;
		  }
	}
	public int g(char s)
	{
		switch(s)
		{
			case '=': return 2;
			case '*': return 4;
			case '-': return 6;
			case '|': return 8;
			case '&': return 10;
			case '!': return 11;
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w': return 14;
			case '(': return 0;
			default: return -1;
		  }
	}
	public boolean Parentesis(String infix)
	{
		int p=0;

		for(int i=0; i< infix.length();i++)
		{
			if(infix.charAt(i)=='(')
		             p++;
		        else
	 	               if(infix.charAt(i) == ')')
		                    p--;
		}
		return p==0;
	}
	public String Polonesa(String infix) //throws Exception
	{

		Pilha p = new Pilha();

		char next=' ',temp=' ';
		String polish="";
		boolean rp=false;
		infix=infix + ')';
		//if(!Parentesis(infix))
			//throw new Exception;
		p.Empilha('(');
		for(int i=0;i<infix.length();i++)
		{
			next= infix.charAt(i);
			rp=false;
			while(f(next) <= g(p.Top()))
			{
				temp= p.Desempilha();
		                if (f(next) < g(temp))
					polish=polish+temp;
		               	else
				{
		                        rp= true;
		                        break;
				}
			}
		        if(!rp)
				p.Empilha(next);
		}
		return polish;
	}
}