<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
<HEAD>

<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE></TITLE><SCRIPT>

		function refresh(){
			document.forms["AgenteCausador"].acao.value = "LISTAR";
			document.forms["AgenteCausador"].action     = "/smatWeb/parametros/acidente/AgenteCausador.do";
			document.forms["AgenteCausador"].submit();
		}
				
		function formGravar(){
			document.forms["AgenteCausador"].acao.value = "GRAVAR";
			document.forms["AgenteCausador"].action     = "/smatWeb/parametros/acidente/AgenteCausador.do";
			document.forms["AgenteCausador"].submit();
		}

		function formLimpar(){
			document.forms["AgenteCausador"].acao.value = "LIMPAR";
			document.forms["AgenteCausador"].action     = "/smatWeb/parametros/acidente/AgenteCausador.do";
			document.forms["AgenteCausador"].submit();
		}

		function formExcluir(){
			document.forms["AgenteCausador"].acao.value = "EXCLUIR";
			document.forms["AgenteCausador"].action     = "/smatWeb/parametros/acidente/AgenteCausador.do";
			document.forms["AgenteCausador"].submit();
		}

		function mostraAgenteCausador(agente){

			document.forms["AgenteCausador"].acao.value = "MOSTRAAGENTE";
			document.forms["AgenteCausador"].agenteCausador.value = agente;
			document.forms["AgenteCausador"].action     = "/smatWeb/parametros/acidente/AgenteCausador.do";
			document.forms["AgenteCausador"].submit();		
		}
		
		function zeraAgente(){
			document.forms["AgenteCausador"].agenteCausador.value = "";
			document.forms["AgenteCausador"].agenteCausadorPai.value = "";
		}

</SCRIPT>
<SCRIPT src="../../js/validacoes.js"></SCRIPT>
</HEAD>

<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="/parametros/acidente/AgenteCausador">
<html:hidden property="acao" value="LISTAR"/>
<html:hidden property="agenteCausador"/>
<html:errors/>	
<TABLE width="100%" border="0">
		<TR>
			<TD colspan="2" align="center">
				<H3>Cadastro de Agentes Causadores</H3>
			</TD>
		</TR>
	<TR>
		<TD width="140">
			<LABEL>Nível 1</LABEL>
		</TD>
		<TD>
			<logic:present name="agenteCausador">
				<html:select property="agenteCausadorVoFalso" onchange="refresh()" styleClass="TEXTDISABLE" disabled="true">		
					<html:option value="0"> -- Nível 1 -- </html:option>										
					<logic:present name="colAgenteCausadorVo">			
					<html:options 
						collection="colAgenteCausadorVo" 
						name="agenteCausador"
						labelName="nome" 
						labelProperty="nome" 
						property="agenteCausador" />	
					</logic:present>								
				</html:select>
				<html:hidden property="agenteCausadorVo"/>
			</logic:present>
			<logic:notPresent name="agenteCausador">
				<html:select property="agenteCausadorVo" onchange="refresh()" styleClass="SELECT">		
					<html:option value="0"> -- Nível 1 -- </html:option>										
					<logic:present name="colAgenteCausadorVo">			
					<html:options 
						collection="colAgenteCausadorVo" 
						name="agenteCausador"
						labelName="nome" 
						labelProperty="nome" 
						property="agenteCausador" />	
					</logic:present>								
				</html:select>
				<html:hidden property="agenteCausadorVoFalso"/>
			</logic:notPresent>	
		</TD>
	</TR>
	<TR>
		<TD width="140">
			<LABEL>Nível 2</LABEL>
		</TD>
		<TD>
			<logic:present name="agenteCausador">
				<html:select property="agenteCausadorPaiFalso" styleClass="TEXTDISABLE" disabled="true">
				<html:option value="0"> -- Nível 2 -- </html:option>			
				<logic:present name="colAgenteCausadorPai">												
					<html:options 
						collection="colAgenteCausadorPai" 
						name="agenteCausador"
						labelName="nome" 
						labelProperty="nome" 
						property="agenteCausador" />	
				</logic:present>								
				</html:select>
				<html:hidden property="agenteCausadorPai"/>
			</logic:present>
			<logic:notPresent name="agenteCausador">
				<html:select property="agenteCausadorPai" styleClass="SELECT">
				<html:option value=""> -- Nível 2 -- </html:option>			
				<logic:present name="colAgenteCausadorPai">												
					<html:options 
						collection="colAgenteCausadorPai" 
						name="agenteCausador"
						labelName="nome" 
						labelProperty="nome" 
						property="agenteCausador" />	
				</logic:present>								
				</html:select>
				<html:hidden property="agenteCausadorPaiFalso"/>
			</logic:notPresent>
		</TD>
	</TR>	
	<TR>
		<TD width="140">
			<LABEL>Agente causador</LABEL>
		</TD>	
		<TD>
				<html:text property="nome" size="80" maxlength="100" styleClass="TEXT"/><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD width="140">
			<LABEL>Descrição</LABEL>
		</TD>
		<TD>
			<html:textarea cols="52" rows="5" property="descricao" styleClass="TEXTAREA">
			</html:textarea>
		</TD>
	</TR>
	<logic:present name="erroBanco">
	<TR>
		<TH colspan="2">
			<H4><bean:write  name="erroBanco" /></H4>
		</TH>
	</TR>	
	</logic:present>
	<TR>
		<TD>
			&nbsp;
		</TD>
		<TD>
			<html:button property="btGravar"   onclick="formGravar()" styleClass="BOTAO" >GRAVAR</html:button>&nbsp;&nbsp;&nbsp;
			<html:button property="btLimpar"   onclick="formLimpar()" styleClass="BOTAO" >LIMPAR</html:button>&nbsp;&nbsp;&nbsp;
			<html:button property="btExcluir"   onclick="formExcluir()" styleClass="BOTAO" >EXCLUIR</html:button>&nbsp;&nbsp;&nbsp;
		</TD>
	</TR>

</TABLE>
<BR>
<TABLE width="100%" border="1" bordercolor="#666666">
	<TR>
		<Th colspan="3" align="center" bgcolor="#C0C0C0">
			Agentes causadores
		</Th>
	</TR>
	<TR>
		<TH bgcolor="#C0C0C0">
			Agente causador
		</TH>
		<TH bgcolor="#C0C0C0">
			Tipo de agente causador
		</TH>
		<TH bgcolor="#C0C0C0">
			Causa do acidente
		</TH>
	<TR>
	<logic:present name="auxAgenteCausador">
	<logic:iterate id="agente" name="auxAgenteCausador">
		<TR>
			<TD>
				<A href="javascript:mostraAgenteCausador(<bean:write name="agente" property="agenteCausador"/>)">
					<bean:write name="agente" property="nomeAgenteCausador"/>
				</A>&nbsp;
			</TD>
			<TD>
				<A href="javascript:mostraAgenteCausador(<bean:write name="agente" property="agenteCausador"/>)">
					<bean:write name="agente" property="nomeAgenteCausadorPai"/>
				</A>&nbsp;
			</TD>
			<TD>
				<A href="javascript:mostraAgenteCausador(<bean:write name="agente" property="agenteCausador"/>)">
					<bean:write name="agente" property="nomeAgenteCausadorVo"/>
				</A>&nbsp;
			</TD>
		</TR>	
	</logic:iterate>
	</logic:present>
</TABLE>
</html:form>
<script>
		document.forms["AgenteCausador"].agenteCausadorVoFalso.value = document.forms["AgenteCausador"].agenteCausadorVo.value;
		document.forms["AgenteCausador"].agenteCausadorPaiFalso.value = document.forms["AgenteCausador"].agenteCausadorPai.value;
</script>
</html:html>
