<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../../theme/Master.css" rel="stylesheet" type="text/css">

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<html:html>

<head>
	<script>	
		function preencheForm(regional,telefoneRegional){
			document.forms["TelefoneRegionalForm"].elements["regional"        ].value   = regional;		
			document.forms["TelefoneRegionalForm"].elements["telefoneRegional"].value   = telefoneRegional;								
			document.forms["TelefoneRegionalForm"].acao.value = "PREENCHEFORM";			
			document.forms["TelefoneRegionalForm"].submit();
		}
		
		function refresh(){
			document.forms["TelefoneRegionalForm"].elements["descricao"         ].value = "";	
			document.forms["TelefoneRegionalForm"].elements["ddd"               ].value = "";
			document.forms["TelefoneRegionalForm"].elements["telefoneRegional"].value   = 0;											
			document.forms["TelefoneRegionalForm"].elements["numero"            ].value = "";			
			document.forms["TelefoneRegionalForm"].acao.value = "LISTAR";
			document.forms["TelefoneRegionalForm"].submit();								
		}		
		
		function formReset(){	
			document.forms["TelefoneRegionalForm"].elements["telefoneRegional"  ].value = 0;								
			document.forms["TelefoneRegionalForm"].elements["descricao"         ].value = "";
			document.forms["TelefoneRegionalForm"].elements["ddd"               ].value = "";
			document.forms["TelefoneRegionalForm"].elements["numero"            ].value = "";					
			document.forms["TelefoneRegionalForm"].elements["acao"              ].value = "LISTAR";			
		}
	
		function gravarTelefone(){
			document.forms["TelefoneRegionalForm"].acao.value = "GRAVAR";
			document.forms["TelefoneRegionalForm"].submit();			
		}
	
		function excluirTelefone(){
			document.forms["TelefoneRegionalForm"].acao.value = "EXCLUIR";
			document.forms["TelefoneRegionalForm"].submit();
		}
	</script>	
	<SCRIPT src="../../js/validacoes.js"></SCRIPT>
</head>
<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="parametros/regionais/TelefoneRegional" method="post" focus="regional">
<html:hidden property="telefoneRegional"  />
<html:hidden property="acao" />
<html:errors/>
<table width="100%">
	<TR>
		<TH colspan="2" align="CENTER">
			<H3>Cadastro de telefones das regionais</H3>
		</TH>
	</TR>
	<TR>
		<TD><label>Estado</label></TD>
		<TD>
			<html:select property="estado" onchange="refresh()" styleClass="SELECT">
			<html:option value="0"> -- Estados --</html:option>							
			<logic:present name="colEstado">
				<html:options collection="colEstado" name="estado"
						labelName="nome" labelProperty="nome" property="estado"
						styleClass="OPTION" />
			</logic:present>						
			</html:select><font color="red">*</font>
		</TD>
	</TR>	
	<TR>
		<TD><label>Regional</label></TD>
		<TD>
				<html:select property="regional" onchange="refresh()" styleClass="SELECT">
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
	<tr>
		<td>
			<LABEL>Telefone</LABEL>
		</td>
		<td>
			<html:text property="ddd" size="2" maxlength="2" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="retiraCaracteresAlfabeticos(this)" /><font color="red">*</font>
			<html:text property="numero" size="8" maxlength="8" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaTracoTelefone(this)"/><font color="red">*</font>
		</td>
	</tr>
	<tr>		
		<td>
			<LABEL>Descrição</LABEL>
		</td>
		<td> 
			<html:text property="descricao" size="100" maxlength="255" styleClass="TEXT" /><font color="red">*</font>
		</td>
	</tr>	
	<tr>
		<td colspan="2" align="center">
			<logic:present name="erroBanco">
				<h4><bean:write name="erroBanco"/></h4>
			</logic:present>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<html:button property="gravar" value="GRAVAR" onclick="gravarTelefone()" styleClass="BOTAO"/>&nbsp;&nbsp;&nbsp;				
			<html:button property="limpar"  value="LIMPAR"  onclick="formReset()" styleClass="BOTAO"/>&nbsp;&nbsp;&nbsp;
			<html:button property="excluir" value="EXCLUIR" onclick="excluirTelefone()" styleClass="BOTAO"/>			
		</td>
	</tr>	
</table>
<BR>
			<table border="1" width="100%" bordercolor="#666666">
				<tr>
					<th  bgcolor="#C0C0C0">Descrição</th>
					<th  bgcolor="#C0C0C0">DDD</th>
					<th  bgcolor="#C0C0C0">Número</th>									
				</tr>
				<logic:present name="colTelefoneRegional" >

				<logic:iterate id="item" name="colTelefoneRegional"> 	
				<tr>
					<td>
						<a href='javascript:preencheForm(<bean:write name="item" property="regionalKey"/>,
														 <bean:write name="item" property="telefoneRegional"/>)'>
							<bean:write name="item" property="descricao"/>
						</a>
					</td>
					<td>
						<a href='javascript:preencheForm(<bean:write name="item" property="regionalKey"/>,
														 <bean:write name="item" property="telefoneRegional"/>)'>
							<bean:write name="item" property="ddd"/>
						</a>
					</td>
					<td>
						<a href='javascript:preencheForm(<bean:write name="item" property="regionalKey"/>,
														 <bean:write name="item" property="telefoneRegional"/>)'>
							<bean:write name="item" property="numero"/>
						</a>
					</td>
				</tr>
				</logic:iterate>
				</logic:present>											
				</table>
</html:form>
</body>
</html:html>