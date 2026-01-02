<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<html>
<head>
	<script>
		function preencheForm(tipoEmpregador,nome,docIdentificador){
			document.forms["TipoEmpregadorForm"].elements["tipoEmpregador"  ].value = tipoEmpregador;		
			document.forms["TipoEmpregadorForm"].elements["nome"            ].value = nome;
			document.forms["TipoEmpregadorForm"].elements["docIdentificador"].value = docIdentificador;
			document.forms["TipoEmpregadorForm"].elements["acao"            ].value = "GRAVAR";					
		}
		
		function formReset(){
			document.forms["TipoEmpregadorForm"].elements["tipoEmpregador"  ].value = 0;
			document.forms["TipoEmpregadorForm"].elements["nome"            ].value = "";
			document.forms["TipoEmpregadorForm"].elements["docIdentificador"].value = "";		
			document.forms["TipoEmpregadorForm"].elements["acao"            ].value = "GRAVAR";			
			
		}
		
		function excluirForm(){
			//alert('teste');
			document.forms["TipoEmpregadorForm"].elements["acao"].value = "EXCLUIR";		
		}
		
		function gravarForm(){
			document.forms["TipoEmpregadorForm"].elements["acao"].value = "GRAVAR";		
		}
		
	</script>
</head>
<html:form method="post" action="/empregadores/TipoEmpregador.do" focus="nome">
<html:hidden property="acao"/> 
<html:hidden property="tipoEmpregador"/> 	
<center>
<table border=0>
	<tr>
		<td>Nome:</td>
		<td><html:text property="nome"/></td>	
	</tr>	
	<tr>
		<td>Documento Identificador:</td>
		<td><html:text property="docIdentificador"/></td>				
	</tr>
	<tr>
		<td colspan="2" align="center"> 
			<html:submit value="GRAVAR" onmousedown="gravarForm()" />&nbsp;&nbsp;&nbsp;
			<html:button property="limpar"  onclick="formReset()">LIMPAR</html:button>&nbsp;&nbsp;&nbsp;
			<html:submit value="EXCLUIR" onmousedown="excluirForm()" />
		</td>
	</tr> 	
	<tr>
		<td colspan="2"><br></td>
	</tr>
	<tr>	
		<td colspan="2" align="center">		
			<table border=1>
			<tr>
				<td align="center" colspan="3">Tipos de Empregadores</td>
			</tr>
			<tr>
				<td>Nº</td>
				<td>Nome</td>
				<td>Documento Identificador</td>		
			</tr>
			<logic:present name="colTiposEmpregadores">											
			<logic:iterate id="item" name="colTiposEmpregadores"> 
			<tr>
				<td>
					<a href='javascript:preencheForm(<bean:write name="item" property="tipoEmpregador"/>,"<bean:write name="item" property="nome"/>","<bean:write name="item" property="docIdentificador"/>")'>
						<bean:write name="item" property="tipoEmpregador"/>
					</a>
				</td>  
			    <td>
			    	<a href='javascript:preencheForm(<bean:write name="item" property="tipoEmpregador"/>,"<bean:write name="item" property="nome"/>","<bean:write name="item" property="docIdentificador"/>")'>
				    	<bean:write name="item" property="nome"/>
				    </a>
				</td>				    	
		    	<td>
		    		<a href='javascript:preencheForm(<bean:write name="item" property="tipoEmpregador"/>,"<bean:write name="item" property="nome"/>","<bean:write name="item" property="docIdentificador"/>")'>
			    		<bean:write name="item" property="docIdentificador"/>&nbsp;
			    	</a>
		    	</td>
			</tr>
			</logic:iterate> 
			</logic:present> 
			</table>
		</td>
	</tr>
	<tr>
		<td colspan="2"><br></td>
	</tr>	
	<tr>
		<td align="center" colspan="2"><%=request.getSession().getAttribute("erroBanco")%><td>
	</tr>
	<tr>
		<td align="center" colspan="2"><html:errors/><td>
	</tr>
</table>
</center>
</html:form>
</html>	