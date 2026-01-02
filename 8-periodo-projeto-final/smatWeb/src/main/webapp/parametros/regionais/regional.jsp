
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
			document.forms["Regional"].acao.value = "LISTAR";
			document.forms["Regional"].action     = "/smatWeb/parametros/regionais/Regional.do";
			document.forms["Regional"].submit();
		}
				
		function formGravar(){
			document.forms["Regional"].acao.value = "GRAVAR";
			document.forms["Regional"].action     = "/smatWeb/parametros/regionais/Regional.do";
			document.forms["Regional"].submit();
		}

		function formLimpar(){
			document.forms["Regional"].acao.value = "LIMPAR";
			document.forms["Regional"].action     = "/smatWeb/parametros/regionais/Regional.do";
			document.forms["Regional"].submit();
		}

		function formExcluir(){
			document.forms["Regional"].acao.value = "EXCLUIR";
			document.forms["Regional"].action     = "/smatWeb/parametros/regionais/Regional.do";
			document.forms["Regional"].submit();
		}

		function mostraRegional(regional){

			document.forms["Regional"].acao.value = "MOSTRAREGIONAL";
			document.forms["Regional"].regional.value = regional;
			document.forms["Regional"].action     = "/smatWeb/parametros/regionais/Regional.do";
			document.forms["Regional"].submit();		
		}

</SCRIPT>
<SCRIPT src="../../js/validacoes.js"></SCRIPT>

</HEAD>

<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="/parametros/regionais/Regional">
<html:hidden property="acao" value="LISTAR"/>
<html:hidden property="regional"/>
<html:errors/>	
<TABLE width="100%" border="0">
	<TR>
		<TH colspan="2" align="CENTER">
			<H3>Cadastro de Regionais de Saúde</H3>
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
		<TD>
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
		<TD>
			<LABEL>Rua</LABEL>
		</TD>
		<TD><html:text property="rua" size="60"
				maxlength="60" styleClass="TEXT" /><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Número</LABEL>
		</TD>
		<TD>
			<html:text property="numero" size="7" maxlength="5"
			styleClass="TEXT" onkeypress='return validaCaracter(event)'
			onfocus="retiraCaracteresAlfabeticos(this)"
			onblur="retiraCaracteresAlfabeticos(this)" /><font color="red">*</font>&nbsp;&nbsp;&nbsp;
			<LABEL>Complemento</LABEL>&nbsp;&nbsp;<html:text property="complemento" size="10" maxlength="10" styleClass="TEXT" />
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Bairro</LABEL>
		</TD>
		<TD>
			<html:text property="bairro" size="40" maxlength="60" styleClass="TEXT" /><font color="red">*</font>&nbsp;&nbsp;&nbsp;
			<LABEL>CEP</LABEL>&nbsp;&nbsp;
			<html:text property="cep" size="12"
				maxlength="8" styleClass="TEXT"
				onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="colocaTracoCep(this)" /><font color="red">*</font>
		</TD>
	<TR>
	<TR>
		<TD>
			<LABEL>Município sede</LABEL>
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
			</html:select>
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
		<TH colspan="2" align="center"  bgcolor="#C0C0C0">
			Regionais de saúde
		</TH>
	</TR>
	<TR>
		<TH  bgcolor="#C0C0C0">
			Regional de saúde
		</TH>
		<TH bgcolor="#C0C0C0">
			Estado
		</TH>
	<TR>
	<logic:present name="auxRegional">
	<logic:iterate id="regional" name="auxRegional">
		<TR>
			<TD>
				<A href="javascript:mostraRegional(<bean:write name="regional" property="regional"/>)">
					<bean:write name="regional" property="nome"/>
				</A>&nbsp;
			</TD>
			<TD>
				<A href="javascript:mostraRegional(<bean:write name="regional" property="regional"/>)">
					<bean:write name="regional" property="nomeEstado"/>
				</A>&nbsp;
			</TD>
		</TR>	
	</logic:iterate>
	</logic:present>
</TABLE>
</html:form>
</BODY>
</html:html>
