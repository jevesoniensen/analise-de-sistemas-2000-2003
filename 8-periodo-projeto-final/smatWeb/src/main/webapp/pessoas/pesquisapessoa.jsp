
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
		function formPesquisarPessoa(){
			document.forms["PesquisaPessoa"].acao.value = "LISTAR";
			document.forms["PesquisaPessoa"].action     = "/smatWeb/pessoas/PesquisaPessoa.do";			
			document.forms["PesquisaPessoa"].submit();
		}

		function refresh(){
			document.forms["PesquisaPessoa"].acao.value = "LISTAR";
			document.forms["PesquisaPessoa"].action     = "/smatWeb/pessoas/PesquisaPessoa.do";			
			document.forms["PesquisaPessoa"].submit();
		}

		function formRetornar(){
			document.forms["PesquisaPessoa"].pessoa.value = 0;
			document.forms["PesquisaPessoa"].nomePessoa.value = "";		
			document.forms["PesquisaPessoa"].acao.value = "RETORNAR";
			document.forms["PesquisaPessoa"].action     = "/smatWeb/pessoas/PesquisaPessoa.do";			
			document.forms["PesquisaPessoa"].submit();
		}

		function selecionaPessoa(pessoa,nomePessoa){
			document.forms["PesquisaPessoa"].acao.value = "RETORNAR";
			document.forms["PesquisaPessoa"].pessoa.value = pessoa;
			document.forms["PesquisaPessoa"].nomePessoa.value = nomePessoa;
			document.forms["PesquisaPessoa"].action     = "/smatWeb/pessoas/PesquisaPessoa.do";			
			document.forms["PesquisaPessoa"].submit();
		}

		function formCadastrarPessoa(){
			document.forms["PesquisaPessoa"].acao.value = "CADASTRAR";
			document.forms["PesquisaPessoa"].action     = "/smatWeb/pessoas/PesquisaPessoa.do";			
			document.forms["PesquisaPessoa"].submit();
		}


</SCRIPT>
</HEAD>

<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="pessoas/PesquisaPessoa">
<html:hidden property="acao" />
<html:hidden property="numInvestigacao" />
<html:hidden property="dadoInvestigacao" />
<html:hidden property="acidente" />
<html:hidden property="pessoa" />
<html:hidden property="empregador" />
<TABLE width="100%">
	<TR>
		<TH colspan="2" align="CENTER">
			<H3>Pesquisa de pessoas</H3>
		</TH>
	</TR>
	<TR>
		<TD>
			<LABEL>Tipo de depoimento</LABEL>
		</TD>
		<TD>
			<html:select property="tipoDepoimento" styleClass="SELECT" onchange="refresh()" >
				<logic:present name="colTipoDepoimento">
					<html:options collection="colTipoDepoimento" name="tipoDepoimento"
						labelName="nome" labelProperty="nome" property="tipoDepoimento"
						styleClass="OPTION" />
				</logic:present>
			</html:select>
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Nome</LABEL>
		</TD>
		<TD>
			<html:text property="nomePessoa" size="40" maxlength="60" styleClass="TEXT" />&nbsp;&nbsp;&nbsp;
			<html:button property="btPesquisar"   onclick="formPesquisarPessoa()" styleClass="BOTAO" >PESQUISAR</html:button>
			<logic:present name="mostrarCadastro">
				<html:button property="btCadastrar"   onclick="formCadastrarPessoa()" styleClass="BOTAO" >CADASTRAR</html:button>
			</logic:present>
		</TD>
	</TR>
</TABLE>
<TABLE border="1" bordercolor="#666666" width="100%">
<TR>	
	<Th colspan="2" align="center" bgcolor="#C0C0C0">
		Resultado
	</Th>
</TR>
<logic:present name="auxPessoa">
	<logic:iterate id="item" name="auxPessoa">
		<TR>
			<TD colspan="2">
				<A href="javascript:selecionaPessoa(<bean:write name="item" property="pessoa"/>,'<bean:write name="item" property="nomePessoa"/>')">
					<bean:write name="item" property="nomePessoa"/>
				</A>
			</TD>
		</TR>
	</logic:iterate>
</logic:present>
<TR>
	<TD>
		<html:button property="btRetornar"   onclick="formRetornar()" styleClass="BOTAO" >RETORNAR</html:button>
	</TD>
</TR>
</TABLE>
</logic:present>
</html:form>
</BODY>
</html:html>
