package br.smat.util;

import br.smat.web.obj.ObjGenerico;



/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class FuncoesComuns {
	
	public static boolean isNumeric(String s) {

		String inteiros = "0123456789";		
		
		for(int i=0; i<s.length();i++){ 
			if(inteiros.indexOf(s.charAt(i)) == -1){
				System.out.println(s.charAt(i));		
				return false;
			}
		}		
		return true;
	}
	
	public static String validateData(String s,String campo){
			
		if(s.length() != 10){
			return "error." + campo + ".incompleta";
		}
		else
		if(!(isNumeric(s.substring(0,2)) &&
 		   	 s.substring(2,3).equalsIgnoreCase("/") && 
		   	 isNumeric(s.substring(3,5)) &&
		     s.substring(5,6).equalsIgnoreCase("/") &&
		     isNumeric(s.substring(6))))
		     return "error." + campo + ".formatoinvalido";
		else
		if(Integer.parseInt(s.substring(6)) < 1880)
			return "error." + campo + ".anoinvalido";
		else
		if(Integer.parseInt(s.substring(3,5)) < 1 || Integer.parseInt(s.substring(3,5)) > 12)
			return "error." + campo + ".mesinvalido";			
		else{
			int mes,dia,ano,mesAtual,diaAtual,anoAtual;
			
			mes 	 = Integer.parseInt(s.substring(3,5));
			dia 	 = Integer.parseInt(s.substring(0,2));
			ano 	 = Integer.parseInt(s.substring(6));
			
			switch(mes){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia < 1 || dia > 31)
						return "error." + campo + ".diainvalido";									
					break;
				case 4:
				case 6:
				case 9:
				case 11:					
					if(dia < 1 || dia > 30)
						return "error." + campo + ".diainvalido";									
					break;				
				case 2:					
			    	if ((Integer.parseInt(s.substring(6)) % 4) == 0){// Bissexto 
 			        	if(dia < 1 || dia > 29)
							return "error." + campo + ".diainvalido";									
			    	}		
				    else
       				if (dia < 1 || dia > 28) // Não Bissexto 
						return "error." + campo + ".diainvalido";
			}
			
			/*if(ano == anoAtual){
				if(mes > mesAtual)
					return "error."+campo+".datainfmaiorqueatual";
				else
				if(mes == mesAtual)
					if(dia > diaAtual)
						return "error."+campo+".datainfmaiorqueatual";			
			}*/
		}
	
		return null;
				
	}

	public static String validateHora(String hora,String campo){
		
		if(hora.length() != 5)
			return "error." + campo + ".incompleta";
		else
		if(!(isNumeric(hora.substring(0,2)) && hora.substring(2,3).equalsIgnoreCase(":") && isNumeric(hora.substring(3,5))))
		   	return "error." + campo + ".formatoinvalido";
		else
		if(Integer.parseInt(hora.substring(0,2)) < 0 || (Integer.parseInt(hora.substring(0,2)) > 23))
			return "error." + campo + ".horainvalida";
		else
		if(Integer.parseInt(hora.substring(3,5)) < 0 || (Integer.parseInt(hora.substring(3,5)) > 59))
			return "error." + campo + ".horainvalida";		   	
			
		return null;
	}
	
	public static String validateCEP(String cep,String campo){
		cep = ValidacoesFormulario.retiraCharAlfabeticos(cep);
		
		if(cep.length() != 8)
			return "error."+campo+".required";
			
		return null;					
	}	

	public static String validateTelefone(String telefone,String campo){
		telefone = ValidacoesFormulario.retiraCharAlfabeticos(telefone);
		
		if(telefone.length() < 7 || telefone.length() > 8)
			return "error." + campo + ".invalido"; 
		
		return null;		
	}
	
	public static String validaValores(String valor,String campo){
		int posVirgula = 0;
		
		
		posVirgula = valor.indexOf(','); 
		
		if(posVirgula != valor.lastIndexOf(','))
			return "error."+campo+".quantidadevigulaserrado";
			
		if(posVirgula == 0)
			return "error."+campo+".valorinformadoinvalido";


		if(posVirgula >=0 && (posVirgula < valor.length()-3 || posVirgula == (valor.length()-1)))			
			return "error."+campo+".valorinformadoinvalido";
			

		if(posVirgula >= 0 && (!isNumeric(valor.substring(0,posVirgula)) || !isNumeric(valor.substring(posVirgula+1))))
			return "error."+campo+".valorinformadoinvalido";	
			
		if(posVirgula != -1){
			String antes = valor.substring(0,valor.indexOf(','));
			
			if(antes.length() > 6)
				return "error."+campo+".valorinformadoinvalido";
		}
		else
			if(valor.length() > 6)
				return "error."+campo+".valorinformadoinvalido";									
		
		return null;		
	}

	public static String adicionaUltimoDiaNaData(String mesAno){
		
		int mes = Integer. parseInt(mesAno.substring(0,2));
		int ano = Integer. parseInt(mesAno.substring(3,7));
		
		switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return "31/" + mesAno;
			
			case 4:
			case 6:
			case 9:
			case 11:
				return "30/" + mesAno;

			case 2:
				if((ano % 4) == 0)
					return "29/" + mesAno;
				else
					return "28/" + mesAno;
		}

		return null;		
	}
	
	public static String setNullSeVazio(String param){
		
		if(param == null || param.trim().length() == 0){
			param = null;
		}
		
		return param;
	}
	
	public static String validaEmail(String email,String campo){

		int 	countArroba 		= 0;
		int	posUltimoPonto		= 0;
		int	countPontoPosArroba	= 0;

	
		/*************************************************************
		 * Valida se o primeiro ou o ultimo caracter é diferente de 
		 * '.' e '@' (Ponto e Arroba)
		*************************************************************/
		if( email.length() > 0 
			&& (email.charAt(0) == '.' 
			|| email.charAt(0) == '@' 
			|| email.charAt(email.length()-1) == '.' 
			|| email.charAt(email.length()-1) == '@'))
			return "error." + campo +".caracterinvalido";		
			
		for(int i=0; i<email.length(); i++){	
			
			//System.out.println("charAt => " + ((int)email.charAt(i)) + " = " + email.charAt(i));
			/***************************************************************
			 * Valida se o primeiro ou o caracter atual é valido para email
			***************************************************************/			
			if(!(	(email.charAt(i) >= 65 && email.charAt(i) <= 122) && (email.charAt(i) <= 90 || email.charAt(i) >= 97) ||
					(email.charAt(i) == '@') || 
					(email.charAt(i) >= 48 && email.charAt(i) <= 57) ||
				 	(email.charAt(i) == '.') || 
				 	(email.charAt(i) == '_'))){
				return "error." + campo+".caracterinvalido";
			}
			else{
				
				/*************************************************************
				*conta o numero de arrobas
				*************************************************************/				
				if(email.charAt(i) == '@')
					countArroba++;					

				/*************************************************************
				*conta o numero de pontos depois do arroba
				*************************************************************/								
				if(countArroba > 0 && (email.charAt(i) == '.'))
					countPontoPosArroba++;
				
				if(countArroba > 1) // Se o email tiver mais que 1 Arroba da erro
					return "error." + campo+".caracterinvalido";
				else				
				if(email.charAt(i) == '.' && email.charAt(i-1) == '.') // Se o email tiver um ponto depois do outro da erro
					return "error." + campo+".caracterinvalido";
				else
				if(email.charAt(i) == '.' && email.charAt(i-1) == '@') // Se o email tiver um depois do ponto da erro
					return "error." + campo+".caracterinvalido";
				else				
				if(email.charAt(i) == '@' && email.charAt(i-1) == '.')// Se o email tiver um ponto antes do arroba da erro
					return "error." + campo+".caracterinvalido";				
			}
		}

		if(countArroba == 0)// Se não tem arroba da erro
			return "error." + campo+".caracterinvalido";
		else
		if(countPontoPosArroba == 0)// Se não tem ponto depois do arroba da erro
			return "error." + campo+".caracterinvalido";
			
		return null;
	}
}
