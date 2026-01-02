
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
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE></TITLE>

<SCRIPT>

		function formRetornar(){
			document.forms["CadastroRepresentante"].acao.value = "RETORNAR";
			document.forms["CadastroRepresentante"].action     = "/smatWeb/pessoas/CadastroRepresentante.do";			
			document.forms["CadastroRepresentante"].submit();
		}
		
		function formLimpar(){
			document.forms["CadastroRepresentante"].acao.value = "LIMPAR";
			document.forms["CadastroRepresentante"].action     = "/smatWeb/pessoas/CadastroRepresentante.do";			
			document.forms["CadastroRepresentante"].submit();
		}

		function formGravar(){
			document.forms["CadastroRepresentante"].acao.value = "GRAVAR";
			document.forms["CadastroRepresentante"].action     = "/smatWeb/pessoas/CadastroRepresentante.do";			
			document.forms["CadastroRepresentante"].submit();
		}

		function formExcluir(){
			document.forms["CadastroRepresentante"].acao.value = "EXCLUIR";
			document.forms["CadastroRepresentante"].action     = "/smatWeb/pessoas/CadastroRepresentante.do";			
			document.forms["CadastroRepresentante"].submit();
		}
		
		function listarRepresentante(rep){
			document.forms["CadastroRepresentante"].acao.value = "LISTARREPRESENTANTE";
			document.forms["CadastroRepresentante"].representante.value = rep;
			document.forms["CadastroRepresentante"].action     = "/smatWeb/pessoas/CadastroRepresentante.do";			
			document.forms["CadastroRepresentante"].submit();
		}

</SCRIPT>
</HEAD>

<BODY alink="#66666" vlink="#66666" link="#66666">
<html:form action="/pessoas/CadastroRepresentante" method="POST">
<html:hidden property="acao" />
<html:hidden property="acidente" />
<html:hidden property="numInvestigacao" />
<html:hidden property="dadoInvestigacao" />
<html:hidden property="representante" />
<html:hidden property="tipoDepoimento" />
<html:hidden property="empregador"/>


<html:errors/>
<table width="100%" border="0">
	<TR>
		<TH colspan="2">
			<H3>Representantes da Empresa</H3>
		</TH>
	</TR>
	<TR>
		<TD width="120">
			<LABEL>Empregador</LABEL>
		</TD>
		<TD>
			<LABEL>
				<logic:present name="nomeEmpregador">
					<bean:write name="nomeEmpregador"/>
				</logic:present>&nbsp;
			</LABEL>
		</TD>		
	</TR>
	<TR>
		<TD width="120">
			<LABEL>Nome do representante</LABEL>
		</TD>
		<TD>
			<html:text property="nome" size="60" maxlength="60" styleClass="TEXT"/><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD colspan="2">
			<html:button property="btRetornar"  onclick="formRetornar()" styleClass="BOTAO">RETORNAR</html:button>
			<html:button property="btGravar" onclick="formGravar()" styleClass="BOTAO">GRAVAR</html:button>
			<html:button property="btLimpar"  onclick="formLimpar()" styleClass="BOTAO">LIMPAR</html:button>
			<html:button property="btExcluir"  onclick="formExcluir()" styleClass="BOTAO">EXCLUIR</html:button>
		</TD>
	</TR>
	<logic:present name="erroBanco">
		<TR>
			<TH colspan="2">
				<H4><bean:write  name="erroBanco" /></H4>
			</TH>
		</TR>
	</logic:present>
</table>
<BR>
<TABLE border="1" bordercolor="#666666" width="100%">
	<TR>
		<TH colspan="2" align="center" bgcolor="#C0C0C0">
			Representantes da empresa
		</TH>
	</TR>
<logic:present name="colRepresentanteEmpresa">
<logic:iterate id="item" name="colRepresentanteEmpresa">
	<TR>
		<TD>
			<a href='javascript:listarRepresentante(<bean:write name="item" property="representanteEmpresa"/>)'>
				<bean:write name="item" property="representanteEmpresa"/>
			</a>			
		</TD>
		<TD>
			<a href='javascript:listarRepresentante(<bean:write name="item" property="representanteEmpresa"/>)'>
				<bean:write name="item" property="nome"/>
			</a>
		</TD>
	</TR>
</logic:iterate>
</logic:present>											
</table>
</html:form>
</BODY>
</html:html>
