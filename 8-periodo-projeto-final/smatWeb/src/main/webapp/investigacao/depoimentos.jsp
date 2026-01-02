
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
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE></TITLE>

<SCRIPT>
		function refreshTipoDepoimento(){
			document.forms["Depoimentos"].acao.value = "LISTARTIPODEPOIMENTO";
			document.forms["Depoimentos"].action     = "/smatWeb/investigacao/Depoimentos.do";			
			document.forms["Depoimentos"].submit();
		}

		function refresh(){
			document.forms["Depoimentos"].acao.value = "LISTAR";
			document.forms["Depoimentos"].action     = "/smatWeb/investigacao/Depoimentos.do";			
			document.forms["Depoimentos"].submit();
		}
				
		function formRetornar(){
			document.forms["Depoimentos"].acao.value = "RETORNAR";
			document.forms["Depoimentos"].action     = "/smatWeb/investigacao/Depoimentos.do";			
			document.forms["Depoimentos"].submit();
		}

		function formGravar(){
			document.forms["Depoimentos"].acao.value = "GRAVAR";
			document.forms["Depoimentos"].action     = "/smatWeb/investigacao/Depoimentos.do";			
			document.forms["Depoimentos"].submit();
		}

		function formLimpar(){
			document.forms["Depoimentos"].acao.value = "LIMPAR";
			document.forms["Depoimentos"].action     = "/smatWeb/investigacao/Depoimentos.do";			
			document.forms["Depoimentos"].submit();
		}

		function formExcluir(){
			document.forms["Depoimentos"].acao.value = "EXCLUIR";
			document.forms["Depoimentos"].action     = "/smatWeb/investigacao/Depoimentos.do";			
			document.forms["Depoimentos"].submit();
		}

		function mostraDepoimento(depoimento){

			document.forms["Depoimentos"].acao.value = "MOSTRADEPOIMENTO";
			document.forms["Depoimentos"].dadoInvestigacao.value = depoimento;
			document.forms["Depoimentos"].action     = "/smatWeb/investigacao/Depoimentos.do";			
			document.forms["Depoimentos"].submit();		
		}
		
		function zeraAgente(){
			document.forms["Depoimentos"].agenteCausador.value = "";
			document.forms["Depoimentos"].agenteCausadorPai.value = "";
		}

		function formPesquisar(){
			document.forms["Depoimentos"].acao.value = "PESQUISAR";
			document.forms["Depoimentos"].action     = "/smatWeb/investigacao/Depoimentos.do";			
			document.forms["Depoimentos"].submit();
		}

</SCRIPT>
<SCRIPT src="../js/validacoes.js"></SCRIPT>
</HEAD>

<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="/investigacao/Depoimentos">
<html:hidden property="acao" value="LISTAR"/>
<html:hidden property="numInvestigacao" />
<html:hidden property="dadoInvestigacao" />
<html:hidden property="acidente" />
<html:hidden property="pessoa" />
<html:hidden property="empregador" />
<html:hidden property="dataAbertura" />
<html:errors/>	
<TABLE width="100%" border="0">
			<TR>
				<TH colspan="2" align="CENTER">
					<H3>Cadastro de depoimentos</H3>
				</TH>
			</TR>
	<TR>
		<TD width="140">
			<LABEL>Data</LABEL>
		</TD>
		<TD>
			<html:text property="data" size="12"
				maxlength="8" styleClass="TEXT"
				onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="colocaBarraData(this)" /><font color="red">*</font>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<LABEL>Hora</LABEL>&nbsp;
				<html:text property="hora" size="6" maxlength="4" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="coloca2PontoHora(this)" /><font color="red">*</font>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</TD>
	</TR>
	<tr>
		<TD colspan="2">				
			<logic:present name="dataAbertura">
				<LABEL>Data de abertura da investigação:&nbsp;<bean:write name="dataAbertura"/></LABEL>
			</logic:present>
		</TD>
	</tr>
	<TR>
		<TD width="140">
			<LABEL>Tipo de testemunha</LABEL>
		</TD>
		<TD>
			<html:select property="tipoDepoimento" styleClass="SELECT" onchange="refreshTipoDepoimento()" >
				<html:option value="" styleClass="OPTION">-- Tipo de testemunha --</html:option>
				<logic:present name="colTipoDepoimento">
					<html:options collection="colTipoDepoimento" name="tipoDepoimento"
						labelName="nome" labelProperty="nome" property="tipoDepoimento"
						styleClass="OPTION" />
				</logic:present>
			</html:select><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD width="140">
			<LABEL>Nome</LABEL>
		</TD>
		<TD>
			<html:text 	property="nomePessoa" readonly="true" size="50" maxlength="60" styleClass="TEXTDISABLE" /><font color="red">*</font>&nbsp;&nbsp;
			<logic:present name="mostraPesquisar">
				<html:button property="btPesquisar"  onclick="formPesquisar()" styleClass="BOTAO" >PESQUISAR</html:button>
			</logic:present>
		</TD>
	</TR>
	<TR>
		<TD width="140">
			<LABEL>Depoimento</LABEL>
		</TD>
		<TD>
			<html:textarea cols="52" rows="5" property="descricao" styleClass="TEXTAREA">
			</html:textarea>
		</TD>
	</TR>
	<TR>
		<TD width="140">
			<LABEL>Causa do acidente</LABEL>
		</TD>
		<TD>
			<html:select property="agenteCausadorVo" onchange="zeraAgente();refresh()" styleClass="SELECT">		
				<html:option value=""> -- Tipo causa-- </html:option>										
				<logic:present name="colAgenteCausadorVo">			
				<html:options 
					collection="colAgenteCausadorVo" 
					name="agenteCausador"
					labelName="nome" 
					labelProperty="nome" 
					property="agenteCausador" />	
				</logic:present>								
			</html:select><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD width="140">
			<LABEL>Tipo de agente causador</LABEL>
		</TD>
		<TD>
			<html:select property="agenteCausadorPai" onchange="refresh()" styleClass="SELECT">
			<html:option value=""> -- Tipo de agente Causador-- </html:option>			
			<logic:present name="colAgenteCausadorPai">												
				<html:options 
					collection="colAgenteCausadorPai" 
					name="agenteCausador"
					labelName="nome" 
					labelProperty="nome" 
					property="agenteCausador" />	
			</logic:present>								
			</html:select><font color="red">*</font>
		</TD>
	</TR>	
	<TR>
		<TD width="140">
			<LABEL>Agente causador</LABEL>
		</TD>	
		<TD>
			<html:select property="agenteCausador" styleClass="SELECT">
				<html:option value=""> -- Agente Causador-- </html:option>															
				<logic:present name="colAgenteCausador">						
				<html:options 
					collection="colAgenteCausador" 
					name="agenteCausador"
					labelName="nome" 
					labelProperty="nome" 
					property="agenteCausador" />	
				</logic:present>								
			</html:select><font color="red">*</font>
		</TD>
	</TR>
	<logic:present name="erroBanco">
	<TR>
		<TH colspan="6">
			<H4><bean:write  name="erroBanco" /></H4>
		</TH>
	</TR>	
	</logic:present>
	<TR>
		<TD colspan="2">
			<html:button property="btRetornar"   onclick="formRetornar()" styleClass="BOTAO" >RETORNAR</html:button>&nbsp;&nbsp;&nbsp;
			<html:button property="btGravar"   onclick="formGravar()" styleClass="BOTAO" >GRAVAR</html:button>&nbsp;&nbsp;&nbsp;
			<html:button property="btLimpar"   onclick="formLimpar()" styleClass="BOTAO" >LIMPAR</html:button>&nbsp;&nbsp;&nbsp;
			<html:button property="btExcluir"   onclick="formExcluir()" styleClass="BOTAO" >EXCLUIR</html:button>&nbsp;&nbsp;&nbsp;
		</TD>
	</TR>		
</TABLE>
<TABLE width="100%" border="1" bordercolor="#666666">
	<TR>
		<TH colspan="3"  bgcolor="#C0C0C0">Depoimentos<TH>
	</TR>
	<TR>
		<TH bgcolor="#C0C0C0">
			Data
		</TH>
		<TH bgcolor="#C0C0C0">
			Tipo de testemunha
		</TH>
		<TH bgcolor="#C0C0C0">
			Nome
		</TH>
	</TR>
	<logic:present name="auxDepoimento">
	<logic:iterate id="depoimento" name="auxDepoimento">
		<TR>
			<TD>
				<A href="javascript:mostraDepoimento(<bean:write name="depoimento" property="dadoInvestigacao"/>)">
					<bean:write name="depoimento" property="dataHora"/>
				</A>
			</TD>
			<TD>
				<A href="javascript:mostraDepoimento(<bean:write name="depoimento" property="dadoInvestigacao"/>)">
					<bean:write name="depoimento" property="nomeTipoDepoimento"/>
				</A>
			</TD>
			<TD>
				<A href="javascript:mostraDepoimento(<bean:write name="depoimento" property="dadoInvestigacao"/>)">
					<bean:write name="depoimento" property="nomePessoa"/>
				</A>
			</TD>
		</TR>	
	</logic:iterate>
	</logic:present>
</TABLE>
</html:form>
</BODY>
</html:html>
