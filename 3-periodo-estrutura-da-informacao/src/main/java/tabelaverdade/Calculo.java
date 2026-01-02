package tabelaverdade;

public class Calculo
{
	// preenche a tabela verdade padrão com o numero distinto de proposições,
	// não repete operandos.
	public int[][] preencheTabela(int nprop)
	{
		int lin = (int)Math.pow(2,nprop);

		int[][] mat = new int[lin][nprop+1];
		for (int i=0; i < lin; i++)
			for (int j=0; j < nprop; j++)
				mat[i][nprop - j - 1] = (i & (1 << j)) == 0 ? 1 : 0;

		return mat;
	}


        // retorna a quantidade de condicões distintas exemplo(p->q^p=pq)
	public String numProp(String s)
 	{
		String aux = " ";
		boolean ri = true;

		for(int i=0; i < s.length(); i++)
		{
			for(int j=0; j < aux.length(); j++)
			{
				ri=true;
				if(s.charAt(i) != aux.charAt(j))
				{
					switch(s.charAt(i))
					{
						case 'p':
						case 'q':
						case 'r':
						case 's':
						case 't':
						case 'u':
						case 'v': ri = false;
					}
				}
				else
				{
					ri = true;
					break;
				}
			}
			if(ri == false)
				aux = aux + s.charAt(i);			
		}
		return aux;
	}

	// é o verdadeiro numero de colunas exemplo(p->q^p = 3)
	public String numColunas(String s)
	{
		String aux = " ";

		for(int i = 0; i<s.length();i++)
			switch(s.charAt(i))
                        {
                        	case 'p':
                                case 'q':
                                case 'r':
                                case 's':
                                case 't':
                                case 'u':
                                case 'v': aux = aux + s.charAt(i); 
			}
		return aux;
	}



}