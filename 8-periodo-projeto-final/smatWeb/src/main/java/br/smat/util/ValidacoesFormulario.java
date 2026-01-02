package br.smat.util;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ValidacoesFormulario {
	
	public static String retiraCharAlfabeticos(String num){
	   String	retorno = "";

	   for(int i=0;i<num.length();i++){
          if(FuncoesComuns.isNumeric(String.valueOf(num.charAt(i))))
	               retorno+=num.charAt(i);
	   }
	   return retorno;
	}	

	/*****************************************************************************************************
	* Função para preservar determinados caracteres de uma determinada String
	* Recebe como parametro uma Cadeia de Caracteres(num), e dois outros Caracteres(caracter1,caracter2)
	* para efeito de comparação.
	* Retorna a String somente com os carcteres desejados
	******************************************************************************************************/
	private static String preservaCaracter(String num,char caracter1,char caracter2){
	 for(int i=0; i < num.length(); i++){
	     if(!(num.charAt(i) >= caracter1 && num.charAt(i) <= caracter2)){
	         num = num.substring(0,i) + num.substring(i+1,num.length());
	         i--;
	     }
	 }
	 return num;
	}

	/*******************************************************************************
	* Função generica para calculo de digitos verificadores
	* Deve ser passado como parametro o numero(codigo) e o parametro para o calculo
	********************************************************************************/
	private static int calcDV(String codigo,int parar){

	   int conta_parar = 2;
	   int soma = 0;
	   int tamStr = codigo.length(); 
	
	   while(tamStr > 0){   	
	        soma = soma + (Integer.parseInt(codigo.substring(tamStr-1,tamStr)) * conta_parar);
	        conta_parar++;
	        if(conta_parar > parar){
	            conta_parar = 2;
	        }
	        tamStr--;
	   }
	   soma = 11 - (soma % 11);
	   if(soma>9)
	         soma=0;
         
	   return soma;
	}

	/************************************************************
	* Função para calculo dos digitos verificadores do CPF 
	* Depende da função "calc_dv","preservaCaracter"
	* Retorna o digito verificador do Cpf
	*************************************************************/
	
	private static int calcDVCPF(String codigo){				
		int primeiroDigito = calcDV(codigo,10);
		return  Integer.parseInt(String.valueOf(calcDV(codigo,10)) + String.valueOf(calcDV(codigo + primeiroDigito,11)));
	}
	
	/**************************************************************
	* Função para validar o CPF 
	* Recebe como parametro uma Cadeia de Caracteres(num)
	***************************************************************/
	public static boolean validaCPF(String cpf){
	    cpf=retiraCharAlfabeticos(cpf);
	    
	    if(cpf.length()!=11){
	          return false;
	    }
	
		int 	tamCadeia 	= cpf.length();
		int 	cont		= 1;

		String 	cpfSemDigito 	= preservaCaracter(cpf,'0','9').substring(0,9); 
		char 	car 			= cpfSemDigito.charAt(0);
				
		for(int i=0; i<cpfSemDigito.length();i++)
			if(car == cpfSemDigito.charAt(i) && cont < 9)	
				cont++;

		if(cont > 8)
			return false;
		
		int	digitosInformados	= Integer.parseInt((preservaCaracter(cpf,'0','9').substring(preservaCaracter(cpf,'0','9').length() - 2,preservaCaracter(cpf,'0','9').length())));

        if(!(calcDVCPF(cpfSemDigito) == digitosInformados))
        	return false;
        	
		return true;		
	}
	
	public static String formataCPF(String cpf){
		cpf=retiraCharAlfabeticos(cpf);
		return cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11);

	}
	
	/**************************************************************
	* Função para validar o CNPJ 
	* Recebe como parametro uma Cadeia de Caracteres(num)
	***************************************************************/
	public static boolean validaCNPJ(String cnpj){
	    cnpj=retiraCharAlfabeticos(cnpj);
	    
	    if(cnpj.length()!=14){
	          return false;
	    }
	
		int 	tamCadeia 	= cnpj.length();
		int 	cont		= 1;

		String 	cpfSemDigito 	= preservaCaracter(cnpj,'0','9').substring(0,12); 
		char 	car 			= cpfSemDigito.charAt(0);
				
		for(int i=0; i<cpfSemDigito.length();i++)
			if(car == cpfSemDigito.charAt(i) && cont < 9)	
				cont++;

		if(cont > 8)
			return false;
		
		int	digitosInformados	= Integer.parseInt((preservaCaracter(cnpj,'0','9').substring(preservaCaracter(cnpj,'0','9').length() - 2,preservaCaracter(cnpj,'0','9').length())));

        if(!(calcDVCNPJ(cpfSemDigito) == digitosInformados))
        	return false;
        	
		return true;		
	}

	/************************************************************
	* Função para calculo dos digitos verificadores do CNPJ 
	* Depende da função "calc_dv","preservaCaracter"
	* Retorna o digito verificador do Cpf
	*************************************************************/
	
	private static int calcDVCNPJ(String codigo){				
		int primeiroDigito = calcDV(codigo,9);
		
		return  Integer.parseInt(String.valueOf(primeiroDigito) + String.valueOf(calcDV(codigo + primeiroDigito,9)));
	}
	
	public static String formataCNPJ(String cnpj){
		cnpj=retiraCharAlfabeticos(cnpj);
		return cnpj.substring(0,2)+"."+cnpj.substring(2,5)+"."+cnpj.substring(5,8)+"/"+cnpj.substring(8,12)+"-"+cnpj.substring(12,14);

	}				
	
	
	/***********************************************************************
	 * Compara uma data com a outra para verificar se uma é menor que a outra
	 * Data1 a suposta menor
	 * Data2 a suposta maior
	 * retorna -1 se data1 menor que data2
	 * retorna 0 se data1 igual que data2
	 * retorna 1 se data1 maior que data2 
	 ***********************************************************************/
	
	public static int comparaDatas(String data1,String data2){
		
		int mes1 	= Integer.parseInt(data1.substring(3,5));
		int dia1 	= Integer.parseInt(data1.substring(0,2));
		int ano1 	= Integer.parseInt(data1.substring(6));
		int mes2 	= Integer.parseInt(data2.substring(3,5));
		int dia2 	= Integer.parseInt(data2.substring(0,2));			
		int ano2 	= Integer.parseInt(data2.substring(6));		
			
		if(ano1 > ano2)			
			return 1;			
		else
		if(ano1 == ano2){
			if(mes1 > mes2)
				return 1;
			else
			if(mes1 == mes2){
				if(dia1 > dia2)
					return 1;
				else
				if(dia1 == dia2)
					return 0;
			}
		}
	
		return -1;
				
	}

	/***********************************************************************
	 * Compara uma hora com a outra para verificar se uma é menor que a outra
	 * Hora1 a suposta menor
	 * Hora2 a suposta maior
	 * retorna -1 se hora1 menor que hora2
	 * retorna 0 se hora1 igual que hora2
	 * retorna 1 se hora1 maior que hora2 
	 ***********************************************************************/	

	public static int comparaHora(String hora1,String hora2){
		
		System.out.println("HORA1 " + hora1);
		System.out.println("HORA2 " + hora2);
		
		int h1 = Integer.parseInt(hora1.substring(0,2));
		int h2 = Integer.parseInt(hora2.substring(0,2));
		int m1 = Integer.parseInt(hora1.substring(3));
		int m2 = Integer.parseInt(hora2.substring(3));
		
		System.out.println("h1 => " + h1);
		System.out.println("m1 => " + m1);
		System.out.println("h2 => " + h2);
		System.out.println("m2 => " + m2);
		
		if(h1 > h2)
			return 1;
		else
			if(h1 == h2)
				if(m1 > m2)
					return 1;
				else
					if(m1 == m2)
						return 0;
						
		return -1;	
	}
}