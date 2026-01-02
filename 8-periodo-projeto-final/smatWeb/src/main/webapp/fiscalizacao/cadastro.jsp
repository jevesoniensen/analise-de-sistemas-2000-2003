<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<html:html>

	<head>

		<script>
			function pesquisarEmpresa(){
				document.forms["CadastroFiscalizacao"].acao.value    = "PESQUISAR";		
				document.forms["CadastroFiscalizacao"].destino.value = "PESQUISAR";		
				document.forms["CadastroFiscalizacao"].action        = "/smatWeb/fiscalizacao/Cadastro.do";			
				document.forms["CadastroFiscalizacao"].submit();			
			}
			
			function detalhesFiscalizacao(){
				document.forms["CadastroFiscalizacao"].acao.value    = "DETALHES";		
				document.forms["CadastroFiscalizacao"].destino.value = "DETALHES";		
				document.forms["CadastroFiscalizacao"].action        = "/smatWeb/fiscalizacao/Cadastro.do";			
				document.forms["CadastroFiscalizacao"].submit();			
			}			
			
			function gravar(){
				document.forms["CadastroFiscalizacao"].acao.value    = "GRAVAR";		
				document.forms["CadastroFiscalizacao"].destino.value = "";		
				document.forms["CadastroFiscalizacao"].action        = "/smatWeb/fiscalizacao/Cadastro.do";			
				document.forms["CadastroFiscalizacao"].submit();			
			}			

			function excluir(){
				document.forms["CadastroFiscalizacao"].acao.value    = "EXCLUIR";		
				document.forms["CadastroFiscalizacao"].destino.value = "";		
				document.forms["CadastroFiscalizacao"].action        = "/smatWeb/fiscalizacao/Cadastro.do";			
				document.forms["CadastroFiscalizacao"].submit();			
			}		
			
			function nova(){
				document.forms["CadastroFiscalizacao"].acao.value    		= "LISTAR";		
				document.forms["CadastroFiscalizacao"].destino.value 		= "";		
				document.forms["CadastroFiscalizacao"].action        		= "/smatWeb/fiscalizacao/Cadastro.do";			
				document.forms["CadastroFiscalizacao"].fiscalizacao.value 	= "";		
				document.forms["CadastroFiscalizacao"].agenteSaude.value 	= "";		
				document.forms["CadastroFiscalizacao"].empregador.value 	= "";		
				document.forms["CadastroFiscalizacao"].docEmpregador.value 	= "";						
				document.forms["CadastroFiscalizacao"].razaoSocial.value 	= "";
				document.forms["CadastroFiscalizacao"].dataAbertura.value 	= "";						
				document.forms["CadastroFiscalizacao"].titulo.value 		= "";							
				document.forms["CadastroFiscalizacao"].obsGerais.value 		= "";						
				document.forms["CadastroFiscalizacao"].submit();						
			}
			
		</script>
		<SCRIPT src="../js/validacoes.js"></SCRIPT>
	</head>
	
	<body  vlink="#666666" alink="#666666" link="#666666">
	<html:errors />
	<html:form action="/fiscalizacao/Cadastro.do">
	
	
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="empregador" />
	<html:hidden property="fiscalizacao" />
		

	<table border="0" width="100%">
		<tbody>
			<tr>
				<td align="center" colspan="2">
				<h3>Cadastro de Fiscalização de Acidentes</h3>
				</td>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td><label>Agente de saude</label></td>
				<td>
					<html:select property="agenteSaude" styleClass="SELECT">
						<html:option value="0">- Agente de Saude --</html:option>
						<logic:present name="colAgenteSaude">
							<html:options 	collection="colAgenteSaude" 
											labelName="nome" 
											property="agenteSaude"
											name="agenteSaude"
											labelProperty="nome" styleClass="OPTION"/>
						</logic:present>
					</html:select>
				</td>
			</tr>			
			<tr>
				<td>
				<label>Empregador</label>
				</td>
				<td><html:text   property="docEmpregador" 	 size="20" maxlength="25" readonly="true" styleClass="TEXTDISABLE" /> 
					<html:text   property="razaoSocial" 	 size="40" maxlength="80" readonly="true" styleClass="TEXTDISABLE" />
					<font color="red">*</font> 
					<html:button property="pesquisar" onclick="pesquisarEmpresa()" styleClass="BOTAO">PESQUISAR</html:button>
				</td>
			</tr>
			<tr>
				<td><LABEL>Data de abertura</LABEL></td>
				<td><html:text 	property="dataAbertura" 
								size="12" 
								maxlength="8" 
								onkeypress='return validaCaracter(event)'
								onfocus="retiraCaracteresAlfabeticos(this)"
								onblur="colocaBarraData(this)" styleClass="TEXT"/>
					<font color="red">*</font>
				</td>
			</tr>
			<tr>
				<td><LABEL>Titulo</LABEL></td>
				<td>
					<html:text property="titulo" size="80" maxlength="100" styleClass="TEXT"/>
					<font color="red">*</font>
				</td>
			</tr>
			<tr>
				<td><LABEL>Observações</LABEL></td>
				<td>
					<html:textarea rows="7" cols="79" property="obsGerais" styleClass="TEXT">
					</html:textarea><font color="red">*</font>
				</td>
			</tr>
			<logic:present name="mensagem">
			<tr>
				<td align="center" colspan="2">
					<h4><bean:write name="mensagem"/></h4>
				</td>
			</tr>			
			</logic:present>
			<tr>
				<td colspan="2" align="center">					
					<html:button property="btGravar" 	value="GRAVAR" 	 onclick="gravar()" styleClass="BOTAO"/>
					<html:button property="btDetalhes" 	value="DETALHES" onclick="detalhesFiscalizacao()" styleClass="BOTAO"/>											
					<html:button property="btLimpar" 		value="LIMPAR" 	 onclick="nova()" styleClass="BOTAO"/>					
					<logic:present name="fiscalizacao">
						<logic:notEqual name="fiscalizacao" value="0">
							<html:button property="btExcluir" 	value="EXCLUIR"  onclick="excluir()" styleClass="BOTAO"/>										
						</logic:notEqual>
					</logic:present>
				</td>
			</tr>
		</tbody>
	</table>
	</html:form>
	
	</body>
</html:html>
