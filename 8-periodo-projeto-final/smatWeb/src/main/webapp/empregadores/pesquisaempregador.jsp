
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
		function paramRetorno(empregador){
			document.forms["PesquisaEmpregador"].elements["empregador"].value  = empregador;			
			retornar();							
		}		
		
		function retornar(){
			document.forms["PesquisaEmpregador"].elements["acao"].value        = "RETORNAR";
			document.forms["PesquisaEmpregador"].submit();		
		}
		
		function cadastraEmpregador(){
			document.forms["PesquisaEmpregador"].acao.value 	= "NOVOEMPREGADOR";		
			document.forms["PesquisaEmpregador"].destino.value = "EMPREGADORES";		
			document.forms["PesquisaEmpregador"].action        = "/smatWeb/empregadores/Empregador.do?destino=BOTAORETORNAR";			
			document.forms["PesquisaEmpregador"].submit();			
		}
		
		function pesquisarEmpregador(){
			document.forms["PesquisaEmpregador"].empregador.value = "";
			document.forms["PesquisaEmpregador"].documento.value ="";		
			document.forms["PesquisaEmpregador"].elements["acao"].value = "LISTAR";			
			document.forms["PesquisaEmpregador"].action        = "/smatWeb/empregadores/PesquisaEmpregador.do";			
			document.forms["PesquisaEmpregador"].submit();		
		}
		
		function limpar(){
			document.forms["PesquisaEmpregador"].empregador.value = "";
			document.forms["PesquisaEmpregador"].documento.value ="";
			document.forms["PesquisaEmpregador"].razaoSocial.value="";
			document.forms["PesquisaEmpregador"].elements["acao"].value        = "";				
			document.forms["PesquisaEmpregador"].submit();					
		}
		
	</script>
</head>
<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="/empregadores/PesquisaEmpregador" >
<html:hidden property="empregador" />
<html:hidden property="documento" /> 
<html:hidden property="destino" /> 
<html:hidden property="acao" /> 
<html:hidden property="origem" />
<table align="center">
<tr>
	<TH colspan="2">
		<H3>Consulta de empregadores</H3>
	<TH/>
</tr>	
<tr>
	
	<td>
		<LABEL>Razão Social</LABEL>
	</td>
	<td>
		<html:text property="razaoSocial" styleClass="TEXT" /> 
	</td>	
</tr>
<tr>
	<td colspan="2">
		<html:button property="pesquisar" onclick="pesquisarEmpregador()" styleClass="BOTAO">PESQUISAR</html:button>
		<html:button property="nova" onclick="limpar()" styleClass="BOTAO">LIMPAR</html:button>								
		<html:button property="nova" onclick="cadastraEmpregador()" styleClass="BOTAO">CADASTRAR</html:button>		
	</td>
</tr>
</table>
<BR>
<table border="1" bordercolor="#666666" width="100%">
<tr>
	<th   bgcolor="#C0C0C0" align="center" colspan="4">Empregadores</th>
</tr>
<tr>
	<TH  bgcolor="#C0C0C0">Nº</TH>
	<TH  bgcolor="#C0C0C0">Razão Social</TH>
	<TH  bgcolor="#C0C0C0">Ramo Superior</TH>	
	<TH  bgcolor="#C0C0C0">Ramo de atividade</TH>
</tr>	
<logic:present name="auxEmpregadors">
<logic:iterate id="item" name="auxEmpregadors">
<tr>
	<td>
		<a href='javascript:paramRetorno(<bean:write name="item" property="empregador"/>)'>	
			<bean:write name="item" property="empregador" />
		</a>
	</td>
	<td>
		<a href='javascript:paramRetorno(<bean:write name="item" property="empregador"/>)'>		
			<bean:write name="item" property="razaoSocial" />
		</a>
	</td>
	<td>
		<a href='javascript:paramRetorno(<bean:write name="item" property="empregador"/>)'>		
			<bean:write name="item" property="nomeRamoSuperior" />
		</a>
	</td>
	<td>
		<a href='javascript:paramRetorno(<bean:write name="item" property="empregador"/>)'>		
			<bean:write name="item" property="nomeRamoAtividade" />
		</a>
	</td>	
</tr>
</logic:iterate>
</logic:present>
</table>
<logic:present name="destinoSession">
<table align="left">
<tr>
	<td>
		<html:button property="btRetornar" onclick="retornar()" styleClass="BOTAO">RETORNAR</html:button>
	</td>
</tr>
</table>
</logic:present> 
</html:form>
</body>
</html:html>
