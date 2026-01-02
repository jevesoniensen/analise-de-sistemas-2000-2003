
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

		function formRetornar(){
			document.forms["MedidasCorretivasInvestigacao"].acao.value = "RETORNAR";
			document.forms["MedidasCorretivasInvestigacao"].action     = "/smatWeb/investigacao/MedidasCorretivasInvestigacao.do";
			document.forms["MedidasCorretivasInvestigacao"].submit();
		}

		function formGravar(){
			document.forms["MedidasCorretivasInvestigacao"].acao.value = "GRAVAR";
			document.forms["MedidasCorretivasInvestigacao"].action     = "/smatWeb/investigacao/MedidasCorretivasInvestigacao.do";
			document.forms["MedidasCorretivasInvestigacao"].submit();
		}

		function formExcluir(){
			document.forms["MedidasCorretivasInvestigacao"].acao.value = "EXCLUIR";
			document.forms["MedidasCorretivasInvestigacao"].action     = "/smatWeb/investigacao/MedidasCorretivasInvestigacao.do";
			document.forms["MedidasCorretivasInvestigacao"].submit();
		}

		function formLimpar(){
			document.forms["MedidasCorretivasInvestigacao"].tipoMedidaCorretiva.value = 0;
			document.forms["MedidasCorretivasInvestigacao"].prazoDias.value = "";
			document.forms["MedidasCorretivasInvestigacao"].observacoes.value = "";
		}
		
		function mostraMedidaCorretiva(medida){
			document.forms["MedidasCorretivasInvestigacao"].acao.value = "MOSTRARMEDIDACORRETIVA";
			document.forms["MedidasCorretivasInvestigacao"].tipoMedidaCorretiva.value = medida;
			document.forms["MedidasCorretivasInvestigacao"].action     = "/smatWeb/investigacao/MedidasCorretivasInvestigacao.do";
			document.forms["MedidasCorretivasInvestigacao"].submit();
		}
</SCRIPT>
<SCRIPT src="../js/validacoes.js"></SCRIPT>
</HEAD>

<BODY   alink="#66666" vlink="#66666" link="#66666">

<html:form action="investigacao/MedidasCorretivasInvestigacao">

<html:hidden property="acao" value="LISTAR"/>
<html:hidden property="numInvestigacao" />
<html:errors/>
<TABLE width="100%" border="0">
	<TR>
		<TH colspan="2">
			<H3>Medidas corretivas</H3>
		</TH>
	</TR>
	<TR>
		<TD width="130">
			<LABEL>Medida corretiva</LABEL>
		</TD>
		<TD>
			<html:select property="tipoMedidaCorretiva" styleClass="SELECT">
				<html:option value="0">-- Tipo de medida corretiva --</html:option>
				<html:options 	collection="colMedidaCorretiva" 
								labelName="nome"
								labelProperty="nome"
								name="tipoMedidaCorretiva"
								property="tipoMedidaCorretiva"/>
			</html:select>	<font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD width="130">
			<LABEL>Prazo para cumprimento</LABEL>
		</TD>
		<TD>
			<html:text property="prazoDias" size="6" maxlength="6" styleClass="TEXT" onkeypress='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this);retiraZero(this)" onblur="retiraCaracteresAlfabeticos(this)"/><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD width="130">
			<LABEL>Observações</LABEL>
		</TD>
		<TD>
			<html:textarea cols="60" rows="5" property="observacoes" styleClass="TEXTAREA"></html:textarea><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD colspan="2" align="center">
			<html:button property="btRetornar"   onclick="formRetornar()" styleClass="BOTAO" >RETORNAR</html:button>&nbsp;&nbsp;&nbsp;
			<html:button property="btGravar"   onclick="formGravar()" styleClass="BOTAO" >GRAVAR</html:button>&nbsp;&nbsp;&nbsp;
			<html:button property="btLimpar"   onclick="formLimpar()" styleClass="BOTAO" >LIMPAR</html:button>&nbsp;&nbsp;&nbsp;
			<html:button property="btExcluir"   onclick="formExcluir()" styleClass="BOTAO" >EXCLUIR</html:button>&nbsp;&nbsp;&nbsp;
		</TD>
	</TR>
	<logic:present name="erroBanco">
		<TR>
			<TH colspan="2">
				<H4><bean:write  name="erroBanco" /></H4>
			</TH>
		</TR>
	</logic:present>
</TABLE>
<TABLE width="100%" bordercolor="#666666" border="1">
	<TR>
		<TH colspan="2" bgcolor="#C0C0C0">Medidas corretivas</TH>
	</TR>
	<TR>
		<TH bgcolor="#C0C0C0">Medida corretiva</TH>
		<TH bgcolor="#C0C0C0">Prazo para cumprimento</TH>		
	</TR>
	<logic:present name="auxMedidaCorretiva">
		<logic:iterate id="medidaCorretivaInvestigacao" name="auxMedidaCorretiva">
			<TR>
				<TD>
					<A href="javascript:mostraMedidaCorretiva(<bean:write name="medidaCorretivaInvestigacao" property="tipoMedidaCorretiva"/>)">
					<bean:write name="medidaCorretivaInvestigacao" property="nomeMedidaCorretiva"/>
					</A>
				</TD>
				<TD>
					<A href="javascript:mostraMedidaCorretiva(<bean:write name="medidaCorretivaInvestigacao" property="tipoMedidaCorretiva"/>)">
					<bean:write name="medidaCorretivaInvestigacao" property="prazoDias"/>
					</A>
				</TD>
			</TR>				
		</logic:iterate>
	</logic:present>
</TABLE>
</html:form>

</BODY>
</html:html>
