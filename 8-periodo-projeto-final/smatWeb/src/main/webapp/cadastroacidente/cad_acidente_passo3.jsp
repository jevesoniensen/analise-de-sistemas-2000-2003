
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>
<HEAD>

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE></TITLE>

<script>
		function refresh(){
			document.forms["AcidentePassoTres"].acao.value = "LISTAR";
			document.forms["AcidentePassoTres"].action     = "./AcidentePassoTres.do";			
			document.forms["AcidentePassoTres"].submit();
		}

		function voltarForm(){
			document.forms["AcidentePassoTres"].acao.value    = "LISTAR";			
			document.forms["AcidentePassoTres"].destino.value = "VOLTAR";		
			document.forms["AcidentePassoTres"].action        = "./AcidentePassoTres.do";			
			document.forms["AcidentePassoTres"].submit();		
		}		
		
		function avancarForm(){
			document.forms["AcidentePassoTres"].acao.value    = "LISTAR";			
			document.forms["AcidentePassoTres"].destino.value = "AVANCAR";		
			document.forms["AcidentePassoTres"].action        = "./AcidentePassoTres.do";			
			document.forms["AcidentePassoTres"].submit();		
		}
			
		function inserirTestemunha(){
			document.forms["AcidentePassoTres"].acao.value    = "INSERIRTESTEMUNHA";		
			document.forms["AcidentePassoTres"].destino.value = "";				
			document.forms["AcidentePassoTres"].action        = "./AcidentePassoTres.do";			
			document.forms["AcidentePassoTres"].submit();		
		}		

		function excluirTestemunha(index){
			document.forms["AcidentePassoTres"].index.value   = index;		
			document.forms["AcidentePassoTres"].acao.value    = "EXCLUIRTESTEMUNHA";		
			document.forms["AcidentePassoTres"].destino.value = "";						
			document.forms["AcidentePassoTres"].action        = "./AcidentePassoTres.do";			
			document.forms["AcidentePassoTres"].submit();		
		}		
		
		function limparTestemunha(){	
			document.forms["AcidentePassoTres"].acao.value    = "LIMPAR";		
			document.forms["AcidentePassoTres"].destino.value = "";						
			document.forms["AcidentePassoTres"].action        = "./AcidentePassoTres.do";			
			document.forms["AcidentePassoTres"].submit();		
		}						
</script>
<SCRIPT src="../js/validacoes.js"></SCRIPT>
</HEAD>
<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="/cadastroacidente/AcidentePassoTres" method="POST">
<!-- Caracteres de controle INICIO -->
<html:hidden property="acao" />
<html:hidden property="destino" />
<html:hidden property="paginaAtual" />
<!-- Caracteres de controle FIM -->

<html:hidden property="acidente" />
<html:hidden property="index" />
<html:errors/>
<table border="0">
<TR>
	<TH colspan="7" align="left">
		Testemunhas
	</TH>
</TR>		
<TR>
	<TD  align="left">
		<LABEL>Nome</LABEL>
	</TD>
	<TD colspan="6" align="left">
		<html:text property="nomeTestemunha" size="60" maxlength="60" styleClass="TEXT"/>
	</TD>
</TR>
<TR>
	<TH colspan="7" align="left">
		Endereço
	</TH>
</TR>
<tr>
	<td align="left"><LABEL>Estado</LABEL></td>
	<td colspan="6" align="left">
		<logic:present name="colEstado" >
		<html:select property="estadoTestemunha" onchange="refresh()" styleClass="SELECT">
			<html:option value=""> -- Estado -- </html:option>
			<html:options 
				collection="colEstado" 
				name="estado"
				labelName="nome" 
				labelProperty="nome" 
				property="estado" />	
		</html:select>
		</logic:present>
	</td>
</tr>
<tr>
	<td align="left"><LABEL>Município</LABEL></td>
	<td colspan="6" align="left">
		<html:select property="municipioTestemunha" styleClass="SELECT">
		<html:option value=""> -- Municipio -- </html:option>
		<logic:present name="colMunicipioTestemunha">			
			<html:options 
				collection="colMunicipioTestemunha" 
				name="municipio"
				labelName="nome" 
				labelProperty="nome" 
				property="municipio" />	
		</logic:present>					
		</html:select>
	</td>
</tr>	
<TR>
	<TD align="left">
		<LABEL>Rua</LABEL>
	</TD>
	<TD  colspan="6" align="left">
		<html:text property="ruaTestemunha" size="80" maxlength="80" styleClass="TEXT"/>
	</TD>
</TR>
<TR>
	<TD align="left">
		<LABEL>Bairro</LABEL>
	</TD>
	<TD colspan="6" align="left">
		<html:text property="bairroTestemunha" size="60" maxlength="60" styleClass="TEXT"/>
	</TD>
</TR>
<TR>
	<TD align="left">
		<LABEL>Número</LABEL>
	</TD>
	<TD align="left">
		<html:text property="numeroTestemunha" size="5" maxlength="5" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="retiraCaracteresAlfabeticos(this)"  />
	</TD>
	<TD align="left">
		<LABEL>Complemento</LABEL>
	</TD>
	<TD align="left">				
		<html:text property="complementoTestemunha" size="10" maxlength="10" styleClass="TEXT"/>
	</TD>
	<TD align="left">
		<LABEL>Cep</LABEL>	
	</TD>
	<TD align="left">		
		<html:text property="cepTestemunha"  size="12" maxlength="8" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaTracoCep(this)" />
	</TD>		
</TR>
<TR>
	<TD align="left">
		<LABEL>Telefone</LABEL>
	</TD>
	<TD colspan="6" align="left">
		<html:text property="dddTestemunha"  size="2" maxlength="2" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="retiraCaracteresAlfabeticos(this)" />
		<html:text property="telefoneTestemunha" size="11" maxlength="8" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaTracoTelefone(this)"  />
	</TD>
</TR>
<TR>
	<TD>
	</TD>
	<TD colspan="6" align="center">
		<html:button property="insereTestemuna" onclick="inserirTestemunha()" styleClass="BOTAO">INSERIR</html:button>		
		<html:button property="limpaTestemuna"  onclick="limparTestemunha()" styleClass="BOTAO">LIMPAR</html:button>				
	</TD>
</TR>
<logic:present name="vTestemunhas" >
<TR>
	<TD>
	</TD>
	<TD  colspan="6" align="left">
		<table border="1" bordercolor="#666666" width="100%">
		<tr>
			<TH colspan="2" bgcolor="#C0C0C0"> Testemunhas informadas</TH>
		</tr>
		<logic:iterate id="item" name="vTestemunhas"> 	
		<tr>
			<td>
				<LABEL><bean:write name="item" property="nomeTestemunha"/></LABEL>
			</td>
			<td>
				<a href='javascript:excluirTestemunha(<bean:write name="item" property="index"/>)'>					
					excluir
				</a>
			</td>				
		</tr>
		</logic:iterate>
		</table>
	</TD>
</TR>
</logic:present>											
</table>
<table align="center">
	<tr>
		<td align="left">
			<html:button property="voltar"  onclick="voltarForm()" styleClass="BOTAO" >VOLTAR</html:button>&nbsp;&nbsp;&nbsp;&nbsp;
			<html:button property="avancar" onclick="avancarForm()" styleClass="BOTAO">AVANÇAR</html:button>			
		</td>	
	</tr>
</table>
</html:form>
</body>
</html:html>
