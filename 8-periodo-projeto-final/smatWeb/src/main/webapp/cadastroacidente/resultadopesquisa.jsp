
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<HEAD>

<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE></TITLE>

<SCRIPT>
		function visualizaAcidente(){
			document.forms["ResultadoPesquisaAcidente"].acao.value = "VISUALIZAACIDENTE";
			document.forms["ResultadoPesquisaAcidente"].action     = "/smatWeb/cadastroacidente/ResultadoPesquisaAcidente.do";
			document.forms["ResultadoPesquisaAcidente"].submit();
		}
		
		function retorna(){
			document.forms["ResultadoPesquisaAcidente"].acao.value = "RETORNAR";
			document.forms["ResultadoPesquisaAcidente"].action     = "/smatWeb/cadastroacidente/ResultadoPesquisaAcidente.do";
			document.forms["ResultadoPesquisaAcidente"].submit();			
		}

		function geraInvestigacao(){
			document.forms["ResultadoPesquisaAcidente"].acao.value = "GERARINVESTIGACAO";
			document.forms["ResultadoPesquisaAcidente"].action     = "/smatWeb/cadastroacidente/ResultadoPesquisaAcidente.do";
			document.forms["ResultadoPesquisaAcidente"].submit();			
		}
				
</SCRIPT>		
</HEAD>

<BODY>
<html:errors/>
<html:form action="/cadastroacidente/ResultadoPesquisaAcidente">
<html:hidden property="acao" value="LISTAR"/> 
<TABLE border="1" width="100%" bordercolor="black">

	<logic:present name="linha">
				<logic:iterate id="linha" name="linha">
					<TR>
						<bean:write name="linha" filter="false"/>
					</TR>				
				</logic:iterate>
				<TR>
					<TD colspan="9" align="center">
						<html:button property="retornar" onclick="retorna()"	styleClass="BOTAO">RETORNAR</html:button>&nbsp;&nbsp;&nbsp;&nbsp;
						<html:button property="visualizarAcidente" onclick="visualizaAcidente()"	styleClass="BOTAO">VISUALIZAR ACIDENTE</html:button>&nbsp;&nbsp;&nbsp;&nbsp;
						<html:button property="gerarInvestigacao" onclick="geraInvestigacao()"	styleClass="BOTAO">GERAR INVESTIGAÇÃO</html:button>
					</TD>
				</TR>
	</logic:present>
	<logic:notPresent name="linha">
		<TR><TD align="center"><H3>Nenhum acidente encontrado!</H3></TD><TR>
		<TR><TD align="center"><html:button property="retornar" onclick="retorna()"	styleClass="BOTAO">RETORNAR</html:button></TD><TR>		
	</logic:notPresent>
</TABLE>
	<logic:present name="acidenteChecked">
		<SCRIPT>
     		for(i=0;i<document.forms[0].length;i++){
     		
     		
   				if(document.forms[0].elements[i].type == "radio")
     			if(document.forms[0].elements[i].value == <bean:write name="acidenteChecked"/>){
     				document.forms[0].elements[i].checked = true;
     				break;
     			}

			}
		</SCRIPT>
	</logic:present>
</html:form>
<logic:present name="objAcidente">
	<SCRIPT>
		var t, l, page, altura;
		var w = screen.availWidth;
		var h = screen.availHeight;
		var largura = 680;
		l = (w - largura) / 2;

		altura = 480;
		t = (h - altura ) / 2;		
		
		open("VisualizaAcidente.do", "blank", "scrollbars=yes, top=" + t + ", left=" + l + ", width=" + largura + ", height=" + altura);
	</SCRIPT>
</logic:present>

</BODY>
</html:html>
