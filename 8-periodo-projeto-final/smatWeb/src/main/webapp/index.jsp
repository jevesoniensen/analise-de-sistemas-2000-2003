<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>


<logic:notPresent name="usuario">
	<logic:forward name="LoginIndex"/>
</logic:notPresent>

<html>
<head>
<title>:: SMAT :: Sistema de Monitoramento de Acidentes de Trabalho</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body bgcolor="#FFFFFF" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<script type='text/javascript'>function Go(){return}</script>
<script type='text/javascript' src='js/menu/RelativePositioned_var_azul.js'></script>
<script type='text/javascript' src='js/menu/menu_azul.js'></script>

<script>
	function mudaFrame(pagina){
		
		if(pagina == "/smatWeb/LogOff.do"){
			document.forms[0].action = pagina;
			document.forms[0].submit();
		
		}
		else{	
			document.frames("tela").document.forms[0].action = pagina;
			document.frames("tela").document.forms[0].submit();
		}
	}
</script>
<script>
/* MenuX=new Array("ItemText",
                   "Link",
                   "background image",
                   number of sub elements,
                   height,width,
                   "bgcolor",
                   "bghighcolor",
				   "fontcolor",
				   "fonthighcolor",
				   "bordercolor",
				   "fontfamily",
				   fontsize,
				   fontbold,
				   fontitalic,
				   "textalign",
				   "statustext");
*/
  /*  var largura = 100;
    var fontSize = 7;
    var fontFamily = "verdana";

    Menu1=new Array("Menu","","",3,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSize,-1,-1,"Left","");
    
    
    
	Menu1_1=new Array("Acidente >>","","",1,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSize,-1,-1,"left","");
	
	Menu1_1_1=new 

Array("Cadastro","javascript:mudaFrame('/smatWeb/AcidentePassoUm.do')","",0,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSize,

-1,-1,"left","");		
	
	Menu1_2=new Array("Relatórios >>","","",2,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSize,-1,-1,"left","");
	
	Menu1_2_1=new 

Array("Gerador","javascript:mudaFrame('/smatWeb/ParametrosRelatorio.do?acao=NOVO')","",0,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFam

ily,fontSize,-1,-1,"left","");		
	
	Menu1_2_2=new 

Array("Salvos","javascript:mudaFrame('/smatWeb/RelatorioSalvo.do')","",1,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSize,-1,

-1,"left","");					
	
	Menu1_2_2_1=new 

Array("Salvos","javascript:mudaFrame('/smatWeb/RelatorioSalvo.do')","",1,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSize,-1,

-1,"left","");					
	
	Menu1_2_2_1_1=new 

Array("Salvos","javascript:mudaFrame('/smatWeb/RelatorioSalvo.do')","",0,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSize,-1,

-1,"left","");									
	
	Menu1_3=new Array("Empregadores >>","","",2,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSize,-1,-1,"left","");
	
	Menu1_3_1=new 

Array("Cadastro","javascript:mudaFrame('/smatWeb/Empregador.do')","",0,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSize,-1,-1

,"left","");		
	
	Menu1_3_2=new 

Array("Pesquisa","javascript:mudaFrame('/smatWeb/PesquisaEmpregador').do","",0,20,largura,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3",fontFamily,fontSi

ze,-1,-1,"left","");
*/

	var backgroundImage = "";			
//	var height = 23;//-----------------------------------
//	var width = 130;//-----------------------------------
//	var bgColor = "#61809F";//-----------------------------------
//	var bgHighColor = "#A2B3C7";
	var borderColor = "#FFFFFF";
	var fontFamily = "Verdana";
	var fontSize = "8";
	var fontBold = -1;
	var fontItalic = -1;
	var textAlign = "LEFT";
	var statusText = "";
			
	<logic:present name="menu">
		<logic:iterate id="menu" name="menu">
			Menu1<bean:write name='menu' property='posicaoMenu'/>=new Array("<bean:write name='menu' property='nome'/>","<logic:present 

name="menu" property="nomePaginaDefault">javascript:mudaFrame('/smatWeb/<bean:write name='menu' 

property='nomePaginaDefault'/>')</logic:present>",backgroundImage,<bean:write name='menu' 

property='filhos'/>,<bean:write name='menu' property='height' filter="false"/>,<bean:write name='menu' property='width' filter="false"/>,<bean:write name='menu' property='bgColor' filter="false"/>,<bean:write name='menu' property='bgHighColor' filter="false"/>,<bean:write name='menu' property='fontColor' filter="false"/>,<bean:write name='menu' property='fontHighColor' filter="false"/>,borderColor,fontFamily,fontSize,fontBold,fontItalic,textAlign,statusText);
		</logic:iterate>
	</logic:present>

</script>
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="95%">
  <tr> 
    <td height="93" align="left" valign="top" background="theme/images/index/backgrd_top.gif"><img src="theme/images/index/img_header.jpg" width="774" height="93"></td>
  </tr>
  <tr> 
    <td bgcolor="#516B86" align="left" valign="top" height="2"><img src="theme/images/spacer.gif" width="2" height="2"></td>
  </tr>
  <tr> 
    <td align="left" valign="top">
      <table width="774" border="0" cellspacing="0" cellpadding="0" height="100%">
        <tr align="left" valign="top"> 
          <td width="150" align="left" background="theme/images/index/backgrd_menu.gif">
            <table width="150" border="0" cellspacing="0" cellpadding="0" height="100%">
              <tr>
                <td align="left" valign="top" width="9">
                  <table width="9" border="0" cellspacing="0" cellpadding="0" height="100%">
                    <tr>
                      <td align="left" valign="top" height="1"><img src="theme/images/spacer.gif" width="1" height="1"></td>
                    </tr>
                    <tr>
                      <td align="left" valign="top" bgcolor="#516B86">&nbsp;</td>
                    </tr>
                    <tr>
                      <td align="left" valign="top" height="1">&nbsp;</td>
                    </tr>
                  </table>
                </td>
                <td width="141" align="left" valign="top">&nbsp;</td>
              </tr>
            </table>
          </td>
          <td width="624">
		<IFRAME src="boasvindas.jsp" width=100% frameborder="0" id="tela" height=100% >
		</IFRAME>
	</td>
        </tr>
      </table>
    </td>
  </tr>
</table>
<form name = "formIndex">
</form>
</body>
</html>
