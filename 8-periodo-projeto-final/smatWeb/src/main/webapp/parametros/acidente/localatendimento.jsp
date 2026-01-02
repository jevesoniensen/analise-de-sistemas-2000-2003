
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
<LINK href="../../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE></TITLE>
<SCRIPT>

		function refresh(){
			document.forms["LocalAtendimento"].acao.value = "LISTAR";
			document.forms["LocalAtendimento"].action     = "/smatWeb/parametros/acidente/LocalAtendimento.do";
			document.forms["LocalAtendimento"].submit();
		}
				
		function formGravar(){
			document.forms["LocalAtendimento"].acao.value = "GRAVAR";
			document.forms["LocalAtendimento"].action     = "/smatWeb/parametros/acidente/LocalAtendimento.do";
			document.forms["LocalAtendimento"].submit();
		}

		function formLimpar(){
			document.forms["LocalAtendimento"].acao.value = "LIMPAR";
			document.forms["LocalAtendimento"].action     = "/smatWeb/parametros/acidente/LocalAtendimento.do";
			document.forms["LocalAtendimento"].submit();
		}

		function formExcluir(){
			document.forms["LocalAtendimento"].acao.value = "EXCLUIR";
			document.forms["LocalAtendimento"].action     = "/smatWeb/parametros/acidente/LocalAtendimento.do";
			document.forms["LocalAtendimento"].submit();
		}

		function mostraLocalAtendimento(local){

			document.forms["LocalAtendimento"].acao.value = "MOSTRALOCAL";
			document.forms["LocalAtendimento"].localAtendimento.value = local;
			document.forms["LocalAtendimento"].action     = "/smatWeb/parametros/acidente/LocalAtendimento.do";
			document.forms["LocalAtendimento"].submit();		
		}

</SCRIPT>
<SCRIPT src="../../js/validacoes.js"></SCRIPT>

</HEAD>

<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="/parametros/acidente/LocalAtendimento">
<html:hidden property="acao" value="LISTAR"/>
<html:hidden property="localAtendimento"/>
<html:errors/>	
<TABLE width="100%" border="0">
	<TR>
		<TH colspan="2" align="CENTER">
			<H3>Cadastro de Locais de atendimento</H3>
		</TH>
	</TR>
	<TR>
		<TD width="140">
			<LABEL>Nome</LABEL>
		</TD>
		<TD>
			<html:text property="nome" size="80" maxlength="80" styleClass="TEXT"/><font color="red">*</font>
		</TD>		
	<TR>
	<TR>
		<TD width="140">
			<LABEL>Estado</LABEL>
		</TD>
		<TD>
			<html:select property="estado" onchange="refresh()" styleClass="SELECT">
				<html:option value=""> -- Estado -- </html:option>
				<logic:present name="colEstado">				
				<html:options 
					collection="colEstado" 
					name="estado"
					labelName="nome" 
					labelProperty="nome" 
					property="estado" />	
				</logic:present>					
			</html:select><font color="red">*</font>
		</TD>
	</TR>	
	<TR>		
		<TD  width="140">
			<LABEL>Município</LABEL>
		</TD>
		<TD>
			<html:select property="municipio" styleClass="SELECT">
			<html:option value=""> -- Municipio -- </html:option>
			<logic:present name="colMunicipio">			
				<html:options 
					collection="colMunicipio" 
					name="municipio"
					labelName="nome" 
					labelProperty="nome" 
					property="municipio" />	
			</logic:present>
			</html:select><font color="red">*</font>
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
		<Th colspan="2" align="center" bgcolor="#C0C0C0">
			Locais de atendimento
		</Th>
	</TR>
	<TR>
		<TH bgcolor="#C0C0C0">
			Local de atendimento
		</TH>
		<TH bgcolor="#C0C0C0">
			Município
		</TH>
	<TR>
	<logic:present name="auxLocalAtendimento">
	<logic:iterate id="local" name="auxLocalAtendimento">
		<TR>
			<TD>
				<A href="javascript:mostraLocalAtendimento(<bean:write name="local" property="localAtendimento"/>)">
					<bean:write name="local" property="nome"/>
				</A>&nbsp;
			</TD>
			<TD>
				<A href="javascript:mostraLocalAtendimento(<bean:write name="local" property="localAtendimento"/>)">
					<bean:write name="local" property="nomeMunicipio"/>
				</A>&nbsp;
			</TD>
		</TR>	
	</logic:iterate>
	</logic:present>
</TABLE>

</html:form>


</BODY>
</html:html>
