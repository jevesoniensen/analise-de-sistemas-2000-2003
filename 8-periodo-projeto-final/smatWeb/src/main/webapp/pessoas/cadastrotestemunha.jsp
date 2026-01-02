
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
			document.forms["CadastroTestemunha"].acao.value = "RETORNAR";
			document.forms["CadastroTestemunha"].action     = "/smatWeb/pessoas/CadastroTestemunha.do";			
			document.forms["CadastroTestemunha"].submit();
		}
		
		function refresh(){
			document.forms["CadastroTestemunha"].acao.value = "LISTAR";
			document.forms["CadastroTestemunha"].action     = "/smatWeb/pessoas/CadastroTestemunha.do";			
			document.forms["CadastroTestemunha"].submit();
		}

		function formLimpar(){
			document.forms["CadastroTestemunha"].acao.value = "LIMPAR";
			document.forms["CadastroTestemunha"].action     = "/smatWeb/pessoas/CadastroTestemunha.do";			
			document.forms["CadastroTestemunha"].submit();
		}

		function formGravar(){
			document.forms["CadastroTestemunha"].acao.value = "GRAVAR";
			document.forms["CadastroTestemunha"].action     = "/smatWeb/pessoas/CadastroTestemunha.do";			
			document.forms["CadastroTestemunha"].submit();
		}

		function formExcluir(){
			document.forms["CadastroTestemunha"].acao.value = "EXCLUIR";
			document.forms["CadastroTestemunha"].action     = "/smatWeb/pessoas/CadastroTestemunha.do";			
			document.forms["CadastroTestemunha"].submit();
		}
		
		function listarTestemunha(testemunha){
			document.forms["CadastroTestemunha"].acao.value = "LISTARTESTEMUNHA";
			document.forms["CadastroTestemunha"].testemunha.value = testemunha;
			document.forms["CadastroTestemunha"].action     = "/smatWeb/pessoas/CadastroTestemunha.do";			
			document.forms["CadastroTestemunha"].submit();
		}

</SCRIPT>

<SCRIPT src="../js/validacoes.js"></SCRIPT>

</HEAD>

<body  vlink="#666666" alink="#666666" link="#666666">

<html:form action="/pessoas/CadastroTestemunha" method="POST">
<html:hidden property="acao" />
<html:hidden property="acidente" />
<html:hidden property="numInvestigacao" />
<html:hidden property="dadoInvestigacao" />
<html:hidden property="testemunha" />
<html:hidden property="tipoDepoimento" />
<html:hidden property="empregador" />


<html:errors/>
<table width="100%" border="0">
		<tr>
			<TH colspan="2">
				<H3>Cadastro de testemunhas</H3>
			<TH/>
		</tr>	
	<TR>
		<TD>
			<LABEL>Nome</LABEL>
		</TD>
		<TD>
			<html:text property="nome" size="60" maxlength="60" styleClass="TEXT"/><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD><LABEL>Estado</LABEL></td>
		<TD>
			<html:select property="estado" onchange="refresh()" styleClass="SELECT">
				<html:option value=""> -- Estado -- </html:option>
				<logic:present name="colEstado" >
					<html:options 
						collection="colEstado" 
						name="estado"
						labelName="nome" 
						labelProperty="nome" 
						property="estado" />
				</logic:present>
			</html:select>
		</TD>
	</TR>
	<TR>
		<TD><LABEL>Município</LABEL></td>
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
	<TR>
		<TD>
			<LABEL>Rua</LABEL>
		</TD>
		<TD>
			<html:text property="rua" size="80" maxlength="80" styleClass="TEXT"/>
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Bairro</LABEL>
		</TD>
		<TD>
			<html:text property="bairro" size="60" maxlength="60" styleClass="TEXT"/>
		</TD>
	</TR>
	<TR>
		<TD align="left">
			<LABEL>Número</LABEL>
		</TD>
		<TD>
			<html:text property="numero" size="5" maxlength="5" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="retiraCaracteresAlfabeticos(this)"  />
			&nbsp;&nbsp;&nbsp;&nbsp;
			<LABEL>Complemento</LABEL>
			&nbsp;&nbsp;
			<html:text property="complemento" size="10" maxlength="10" styleClass="TEXT"/>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<LABEL>Cep</LABEL>	
			<html:text property="cep"  size="12" maxlength="8" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaTracoCep(this)" />
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Telefone</LABEL>
		</TD>
		<TD>
			<html:text property="ddd"  size="2" maxlength="2" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="retiraCaracteresAlfabeticos(this)" />
			<html:text property="telefone" size="12" maxlength="8" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaTracoTelefone(this)"  />
		</TD>
	</TR>
	<TR>
		<TD colspan="2" align="center">
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
</TABLE>
<BR>
<TABLE border="1" bordercolor="black" width="100%">
	<TR>
		<Th colspan="2" align="center" bgcolor="#C0C0C0">
			Testemunhas
		</Th>
	</TR>
<logic:present name="auxTestemunha">
<logic:iterate id="item" name="auxTestemunha">
	<TR>
		<TD>
			<a href='javascript:listarTestemunha(<bean:write name="item" property="testemunha"/>)'>
				<bean:write name="item" property="testemunha"/>
			</a>			
		</TD>
		<TD>
			<a href='javascript:listarTestemunha(<bean:write name="item" property="testemunha"/>)'>
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
