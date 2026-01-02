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
				document.forms["AgenteSaudeForm"].acao.value = "LISTAR";
				document.forms["AgenteSaudeForm"].destino.value = "";
				document.forms["AgenteSaudeForm"].action     = "/smatWeb/pessoas/AgenteSaude.do";			
				document.forms["AgenteSaudeForm"].submit();
			}			
			
			function gravar(){
				document.forms["AgenteSaudeForm"].acao.value = "GRAVAR";
				document.forms["AgenteSaudeForm"].destino.value = "";
				document.forms["AgenteSaudeForm"].action     = "/smatWeb/pessoas/AgenteSaude.do";			
				document.forms["AgenteSaudeForm"].submit();					
			}
			
			function limpar(){
				document.forms["AgenteSaudeForm"].agenteSaude.value = 0;			
				document.forms["AgenteSaudeForm"].nome.value        = "";				
				document.forms["AgenteSaudeForm"].regional.value 	= 0;			
				document.forms["AgenteSaudeForm"].estado.value 		= 0;				
				document.forms["AgenteSaudeForm"].email.value 		= "";
				refresh();
			}
			
			function excluir(){
				document.forms["AgenteSaudeForm"].acao.value = "EXCLUIR";
				document.forms["AgenteSaudeForm"].destino.value = "";
				document.forms["AgenteSaudeForm"].action     = "/smatWeb/pessoas/AgenteSaude.do";			
				document.forms["AgenteSaudeForm"].submit();			
			}				
			
			function preencheForm(agenteSaude){
				document.forms["AgenteSaudeForm"].acao.value = "PREENCHEFORM";
				document.forms["AgenteSaudeForm"].destino.value = "";
				document.forms["AgenteSaudeForm"].agenteSaude.value = agenteSaude;
				document.forms["AgenteSaudeForm"].action     = "/smatWeb/pessoas/AgenteSaude.do";			
				document.forms["AgenteSaudeForm"].submit();			
			}
		
		</SCRIPT>
	</head>

<html:form action="/pessoas/AgenteSaude">

	<BODY  alink="#66666" vlink="#66666" link="#66666">
	<html:hidden property="acao" />
	<html:hidden property="destino" />			
	<html:hidden property="agenteSaude" />					

	<html:errors/>	
	<TABLE border="0" width="100%">
	<TBODY>
			<TR>
				<TH colspan="2" align="center">
					<H3>Cadastro de agentes de saúde</H3>
				</TH>
			</TR>
			<TR>
				<TD><label>Nome</label></TD>
				<TD>	
					<html:text property="nome" size="60" maxlength="60" styleClass="TEXT"/>
					<font color="red">*</font>
				</TD>
			</TR>
			<TR>
				<TD><label>e-mail</label></TD>
				<TD>
					<html:text property="email" size="40" maxlength="40" styleClass="TEXT"/>
					<font color="red">*</font>
				</TD>
			</TR>
			<TR>
				<TD><label>Estado</label></TD>
				<TD>
					<html:select property="estado" onchange="refresh()" styleClass="SELECT">
						<html:option value="0"> -- Estados --</html:option>							
						<logic:present name="colEstado">
							<html:options collection="colEstado" name="estado"
								labelName="sigla" labelProperty="sigla" property="estado"
								styleClass="OPTION" />
						</logic:present>						
					</html:select><font color="red">*</font>
				</TD>
			</TR>	
			<TR>
				<TD><label>Regional</label></TD>
				<TD>
					<html:select property="regional" styleClass="SELECT">
						<html:option value="0"> -- Regionais --</html:option>							
						<logic:present name="colRegional">
							<html:options collection="colRegional" 
								name="regional"
								labelName="nome" 
								labelProperty="nome" 
								property="regional"
								styleClass="OPTION" />
						</logic:present>												
					</html:select>
					<font color="red">*</font>
				</TD>
			</TR>			
			<logic:present name="mensagem">
				<tr>
					<td align="center" colspan="2">
						<H4>
						<bean:write name="mensagem"/>
						</H4>
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
	<logic:present name="colAgenteSaude" >
	<BR>
	<TABLE border="1" width="100%" bordercolor="#666666">
		<TBODY>
			<TR>
				<TH colspan="3" bgcolor="#C0C0C0">Agentes de saúde</TH>
			</TR>
			<TR>
				<TH bgcolor="#C0C0C0">
					Nº
				</TH>
				<TH bgcolor="#C0C0C0">
					Nome
				</TH>
				<TH bgcolor="#C0C0C0">
					E-mail
				</TH>				
			</TR>
			<logic:iterate name="colAgenteSaude" id="auxAS">
			<TR>
				<TD>
					<a href="javascript:preencheForm('<bean:write name="auxAS" property="agenteSaude"/>')">
						<bean:write name="auxAS" property="agenteSaude"/>
					</a>	
				</TD>
				<TD>
					<a href="javascript:preencheForm('<bean:write name="auxAS" property="agenteSaude"/>')">				
						<bean:write name="auxAS" property="nome"/>				
					</a>	
				</TD>
				<TD>
					<a href="javascript:preencheForm('<bean:write name="auxAS" property="agenteSaude"/>')">				
						<bean:write name="auxAS" property="email"/>				
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