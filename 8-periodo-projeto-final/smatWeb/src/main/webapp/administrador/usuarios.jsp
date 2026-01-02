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
	
		<SCRIPT>
	
			function refresh(){
				document.forms["CadastroUsuarioForm"].acao.value = "LISTAR";
				document.forms["CadastroUsuarioForm"].destino.value = "";
				document.forms["CadastroUsuarioForm"].action     = "/smatWeb/administrador/Usuarios.do";			
				document.forms["CadastroUsuarioForm"].submit();
			}			
			
			function gravar(){
				document.forms["CadastroUsuarioForm"].acao.value = "GRAVAR";
				document.forms["CadastroUsuarioForm"].destino.value = "";
				document.forms["CadastroUsuarioForm"].action     = "/smatWeb/administrador/Usuarios.do";			
				document.forms["CadastroUsuarioForm"].submit();					
			}
			
			function limpar(){
				document.forms["CadastroUsuarioForm"].usuario.value 		= 0;			
				document.forms["CadastroUsuarioForm"].nome.value        	= "";				
				document.forms["CadastroUsuarioForm"].agenteSaude.value 	= 0;			
				document.forms["CadastroUsuarioForm"].senha.value 			= "";
				document.forms["CadastroUsuarioForm"].senhaConfere.value 	= "";
				refresh();
			}
			
			function excluir(){
				document.forms["CadastroUsuarioForm"].acao.value = "EXCLUIR";
				document.forms["CadastroUsuarioForm"].destino.value = "";
				document.forms["CadastroUsuarioForm"].action     = "/smatWeb/administrador/Usuarios.do";			
				document.forms["CadastroUsuarioForm"].submit();			
			}				
			
			function preencheForm(usuario){
				document.forms["CadastroUsuarioForm"].acao.value = "PREENCHEFORM";
				document.forms["CadastroUsuarioForm"].destino.value = "";
				document.forms["CadastroUsuarioForm"].usuario.value = usuario;
				document.forms["CadastroUsuarioForm"].action     = "/smatWeb/administrador/Usuarios.do";			
				document.forms["CadastroUsuarioForm"].submit();			
			}
		
		</SCRIPT>
	</head>
	
	<html:form action="/administrador/Usuarios.do">
	<BODY alink="#66666" vlink="#66666" link="#66666">
	<html:hidden property="acao" />
	<html:hidden property="destino" />			
	<html:hidden property="usuario" />	
		
	<html:errors/>	
	<TABLE border="0" width="100%">
		<TBODY>
			<TR>
				<TH colspan="2" align="CENTER">
					<H3>Cadastro de usuários</H3>
				</TH>
			</TR>
			<TR>
				<TD width="100"><LABEL>Login</LABEL></TD>
				<TD>
					<html:text property="nome" styleClass="TEXT"/>
					<font color="red">*</font>				
				</TD>
			</TR>
			<TR>
				<TD width="100"><LABEL>Senha</LABEL></TD>
				<TD>
					<html:password property="senha" styleClass="TEXT"/>
					<font color="red">*</font>
				</TD>
			</TR>		
			<TR>
				<TD width="100"><LABEL>Redigite a senha</LABEL></TD>
				<TD>
					<html:password property="senhaConfere" styleClass="TEXT"/>
					<font color="red">*</font>
				</TD>
			</TR>													
			<TR>
				<TD width="100"><LABEL>Agente de saúde</LABEL></TD>
				<TD>
					<html:select property="agenteSaude" styleClass="SELECT">
						<html:option value="0">- Agente de Saude --</html:option>
						<logic:present name="colAgenteSaude">
							<html:options 	collection="colAgenteSaude" 
											labelName="nome" 
											property="agenteSaude"
											name="agenteSaude"
											labelProperty="nome"/>
						</logic:present>
					</html:select>
				</TD>
			</TR>	
			<logic:present name="mensagem">
				<tr>
					<td align="center" colspan="2">
						<h4><bean:write name="mensagem"/></h4>
					</td>
				</tr>			
			</logic:present>																
			<tr>
				<td colspan="2" align="center">					
					<html:button property="btGravar" 	value="GRAVAR"  onclick="gravar()"  styleClass="BOTAO" />
					<html:button property="btLimpar" 	value="LIMPAR"  onclick="limpar()"  styleClass="BOTAO" />
					<html:button property="btExcluir" 	value="EXCLUIR" onclick="excluir()" styleClass="BOTAO" />										
				</td>				
			</tr>						
		</TBODY>
	</TABLE>
	<BR>
	<logic:present name="colUsuario" >
	<TABLE border="1" width="100%" bordercolor="#666666">
		<TBODY>
			<TR>
				<TH colspan="2"   bgcolor="#C0C0C0">
					Usuários
				</TH>
			</TR>
			<TR>
				<TH  bgcolor="#C0C0C0">
					Nº
				</TH>
				<TH  bgcolor="#C0C0C0">
					Nome
				</TH>
			</TR>
			<logic:iterate name="colUsuario" id="auxAS">
			<TR>
				<TD>
					<a href="javascript:preencheForm('<bean:write name="auxAS" property="usuario"/>')">
						<bean:write name="auxAS" property="usuario"/>
					</a>	
				</TD>
				<TD>
					<a href="javascript:preencheForm('<bean:write name="auxAS" property="usuario"/>')">				
						<bean:write name="auxAS" property="nome"/>				
					</a>	
				</TD>			
			</TR>			
			</logic:iterate>
		</TBODY>
	</TABLE>
	</logic:present>	
	</BODY>
	</html:form>
	
</html:html>
