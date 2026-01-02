// validacoes.js

function restCampo(campo){
	campo.value = "";
}


/********************************************************************************************************
   Autor: Jeveson Iensen                                                      
   data : 08/05/2002                                                          
	function  validaCaracter(teclapres)												   
	Parametros:                                                               
	    teclapres -> evento ocorrido no campo
	Resultado:                                                                 
		funçao que verifica se a tecla digitada é um numero se não for impede a digitação

********************************************************************************************************/

function validaCaracter(teclapres){
	if(navigator.appName=="Netscape")
        	caracter = String.fromCharCode(teclapres.which);
	else
        	caracter = String.fromCharCode(teclapres.keyCode);
	
	if(caracter >= 0 || caracter <= 9)
       		return true;
	else
       		return false;
}

function validaCaracterValor(teclapres){
	if(navigator.appName=="Netscape")
        	caracter = String.fromCharCode(teclapres.which);
	else
        	caracter = String.fromCharCode(teclapres.keyCode);
	
	if(caracter >= 0 || caracter <= 9 || caracter == ',')
       		return true;
	else
       		return false;
}

function retiraCaracteresAlfabeticos(campo){

   	str 	= campo.value;
  	
	tamStr 	= str.length;
	
   	aux = "";
   	
    for(i=0;i<tamStr;i++){
		if(!isNaN(str.charAt(i))){
	 		aux = aux + str.charAt(i);
	 	}
	}
	   
   campo.value = aux;
   
   if(campo.value.charAt(0) == 0 && campo.value.length == 1)
    	campo.value = "";
}

function colacaCaracEspeciaisCPF(campo){
	str = campo.value;
	if(str != "")
		if(str.charAt(0) != ' ')
			campo.value = str.substring(0,3)+'.'+str.substring(3,6)+'.'+str.substring(6,9)+'-'+str.substring(9,11);		
		else
			campo.value = "";			
}

function colacaCaracEspeciaisCNPJ(campo){
	str = campo.value;
	if(str != "")
		if(str.charAt(0) != ' ')
			campo.value = str.substring(0,2)+'.'+str.substring(2,5)+'.'+str.substring(5,8)+'/'+str.substring(8,12)+'-'+str.substring(12,14);		
		else
			campo.value = "";			
}

function colocaBarraData(campo){
	retiraCaracteresAlfabeticos(campo);
	str = campo.value;
	if(str != "")
		if(str.charAt(0) != ' ')
			campo.value = str.substring(0,2)+'/'+str.substring(2,4)+'/'+str.substring(4,8);
		else
			campo.value = "";
}

function coloca2PontoHora(campo){
	retiraCaracteresAlfabeticos(campo);
	str = campo.value;
	if(str != "")
		if(str.charAt(0) != ' ')
			campo.value = str.substring(0,2)+':'+str.substring(2,4);
		else
			campo.value = "";			
}

function colocaTracoCep(campo){
	retiraCaracteresAlfabeticos(campo);
	str = campo.value;
	if(str != "")
		if(str.charAt(0) != ' ')
			campo.value = str.substring(0,5)+'-'+str.substring(5);
		else
			campo.value = "";			
}

function colocaTracoTelefone(campo){
	retiraCaracteresAlfabeticos(campo);
	str = campo.value;
	if(str != "")
		if(str.charAt(0) != ' '){
			if(str.length == 8)
				campo.value = str.substring(0,4)+'-'+str.substring(4);
			else
			if(str.length == 7)
				campo.value = str.substring(0,3)+'-'+str.substring(3,7);				
		}
		else
			campo.value = "";			
}

function colocaBarraMesAno(campo){
	retiraCaracteresAlfabeticos(campo);
	str = campo.value;
	if(str != "")
		if(str.charAt(0) != ' ')
			campo.value = str.substring(0,2)+'/'+str.substring(2,6);
		else
			campo.value = "";
}

function retiraZero(campo){

   	if(campo.value.charAt(0) == 0 && campo.value.length == 1)
    	campo.value = "";
}