<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<html:html>
<head>
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
	<script>			
		function voltarForm(){
			document.forms["AcidenteGravar"].acao.value = "";				
			document.forms["AcidenteGravar"].destino.value = "VOLTAR";		
			document.forms["AcidenteGravar"].action     = "./AcidenteGravar.do";			
			document.forms["AcidenteGravar"].submit();		
		}	
		
		function gravaAcidente(){
			document.forms["AcidenteGravar"].acao.value = "GRAVAR";						
			document.forms["AcidenteGravar"].destino.value = "";		
			document.forms["AcidenteGravar"].action     = "./AcidenteGravar.do";			
			document.forms["AcidenteGravar"].submit();				
		}
		
		function novoAcidente(){
			document.forms["AcidenteGravar"].acao.value = "NOVO";						
			document.forms["AcidenteGravar"].destino.value = "NOVO";		
			document.forms["AcidenteGravar"].action     = "./AcidenteGravar.do";			
			document.forms["AcidenteGravar"].submit();				
		}		
		
		function visualizaForm(){
		
			var t, l, page, altura;
			var w = screen.availWidth;
			var h = screen.availHeight;
			var largura = 720;
			l = (w - largura) / 2;
			
			altura = 300;
			t = (h - altura ) / 2;		
		
			open("VisualizaAcidente.do", "secondwindow", "scrollbars=yes, top=" + t + ", left=" + l + ", width=" + largura + ", height=" + altura);
		}
			
</script>
</head>
<html:form action="/cadastroacidente/AcidenteGravar">
<!-- Caracteres de controle INICIO -->
<html:hidden property="acao" />
<html:hidden property="destino" />
<html:hidden property="paginaAtual" />
<!-- Caracteres de controle FIM -->
<BODY>
<CENTER>
<br><br><br><br>
<html:errors/>	
<table>
	<logic:present name="erroBanco">
	<TR>
		<TH>
			<H4><bean:write  name="erroBanco" /></H4>
		</TH>
	</TR>	
	</logic:present>
</table>
<table>
<logic:present name="objAcidente">
	<table>
		<tr>
			<th>ATENÇÃO !!!</th>
		</tr>
		<tr>
			<td align="center">
				<p>
					<h4>Após clicar no botão "GRAVAR" <BR>não será mais possível alterar o acidente.</h4>
				</p>
			</td>
		</tr>
	</table>
		
	<html:button property="voltar" onclick="voltarForm()" styleClass="BOTAO">VOLTAR</html:button>
	<html:button property="visualizar" onclick="visualizaForm()" styleClass="BOTAO">VISUALIZAR ACIDENTE</html:button>
	<html:button property="gravar" onclick="gravaAcidente()" styleClass="BOTAO">GRAVAR</html:button>
	</logic:present>
	<logic:notPresent name="objAcidente">
		<html:button property="novo" onclick="novoAcidente()" styleClass="BOTAO">CADASTRAR NOVO ACIDENTE</html:button>
	</logic:notPresent>
</table>
</CENTER>
</BODY>
</html:form>
</html:html>

