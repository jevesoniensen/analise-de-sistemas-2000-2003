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
		<SCRIPT>
				function preencheForm(ramoAtividade){
					document.forms["RamoAtividadeForm"].acao.value = "PREENCHEFORM";
					document.forms["RamoAtividadeForm"].destino.value = "";
					document.forms["RamoAtividadeForm"].ramoAtividade.value = ramoAtividade;
					document.forms["RamoAtividadeForm"].action     = "/smatWeb/parametros/acidente/RamoAtividade.do";			
					document.forms["RamoAtividadeForm"].submit();
				}	
				
				function refresh(){
					document.forms["RamoAtividadeForm"].acao.value = "LISTAR";
					document.forms["RamoAtividadeForm"].destino.value = "";
					document.forms["RamoAtividadeForm"].action     = "/smatWeb/parametros/acidente/RamoAtividade.do";			
					document.forms["RamoAtividadeForm"].submit();
				}			
				
				function gravar(){
					document.forms["RamoAtividadeForm"].acao.value = "GRAVAR";
					document.forms["RamoAtividadeForm"].destino.value = "";
					document.forms["RamoAtividadeForm"].action     = "/smatWeb/parametros/acidente/RamoAtividade.do";			
					document.forms["RamoAtividadeForm"].submit();					
				}

				function excluir(){
					document.forms["RamoAtividadeForm"].acao.value = "EXCLUIR";
					document.forms["RamoAtividadeForm"].destino.value = "";
					document.forms["RamoAtividadeForm"].action     = "/smatWeb/parametros/acidente/RamoAtividade.do";			
					document.forms["RamoAtividadeForm"].submit();					
				}
								
				function limpar(){
					document.forms["RamoAtividadeForm"].ramoAtividade.value = 0;
					document.forms["RamoAtividadeForm"].ramoSuperior.value = 0;		
					document.forms["RamoAtividadeForm"].nome.value = "";			
					document.forms["RamoAtividadeForm"].ramoSuperiorFalso.value = 0;				
					document.forms["RamoAtividadeForm"].cnae.value = "";					
					refresh();
				}				
		</SCRIPT>
	<SCRIPT src="../../js/validacoes.js"></SCRIPT>
	</head>

<html:form action="/parametros/acidente/RamoAtividade">
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="ramoAtividade" />
	
<body  vlink="#666666" alink="#666666" link="#666666">
<html:errors/>
<table width="100%" align="center">	
<tr>
	<td>
	<TABLE width="100%" align="left">
		<TBODY>
		<TR>
			<TD colspan="2" align="center">
				<H3>Cadastro de Ramos de atividade</H3>
			</TD>
		</TR>
		<TR>
			<TD align="left">
				<LABEL>Nível</LABEL>
			</TD>
			<TD align="left">
				<logic:present name="ramoAtividadeTeste">
				<logic:notEqual name="ramoAtividadeTeste" value="0">
					<html:hidden property="ramoSuperior"/>
					<html:select property="ramoSuperiorFalso" onchange="refresh()" styleClass="TEXTDISABLE" disabled="true">			
						<html:option value="0"> -- Nível 1 -- </html:option>			
						<logic:present name="colRamoSuperior">				
						<html:options 
							collection="colRamoSuperior" 
							name="ramoAtividade"
							labelName="nome" 
							labelProperty="nome" 
							property="ramoAtividade" />	
						</logic:present>					
					</html:select>	
				</logic:notEqual>		
				<logic:equal name="ramoAtividadeTeste" value="0">
					<html:hidden property="ramoSuperiorFalso"/>
					<html:select property="ramoSuperior" onchange="refresh()" styleClass="SELECT">			
						<html:option value=""> -- Nível 1 -- </html:option>			
						<logic:present name="colRamoSuperior">				
						<html:options 
							collection="colRamoSuperior" 
							name="ramoAtividade"
							labelName="nome" 
							labelProperty="nome" 
							property="ramoAtividade" />	
						</logic:present>					
					</html:select>					
				</logic:equal>
				</logic:present>
				<logic:notPresent name="ramoAtividadeTeste">
					<html:hidden property="ramoSuperiorFalso"/>
					<html:select property="ramoSuperior" onchange="refresh()" styleClass="SELECT">			
						<html:option value=""> -- Nível 1 -- </html:option>			
						<logic:present name="colRamoSuperior">				
						<html:options 
							collection="colRamoSuperior" 
							name="ramoAtividade"
							labelName="nome" 
							labelProperty="nome" 
							property="ramoAtividade" />	
						</logic:present>
						</html:select>				
				</logic:notPresent>
			</TD>			
		</TR>		
		<TR>
			<TD align="left">
				<LABEL>Nome</LABEL>
			</TD>
			<TD align="left">
				<html:text property="nome" size="80" maxlength="100" styleClass="TEXT"/>
				<font color="red">*</font>
			</TD>			
		</TR>		
		<TR>
			<TD align="left">
				<LABEL>CNAE</LABEL>
			</TD>
			<TD align="left">
				<html:text property="cnae" size="5" maxlength="5" styleClass="TEXT"  onkeypress='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this);retiraZero(this)" onblur="retiraCaracteresAlfabeticos(this)"/>
			</TD>			
		</TR>	
		<logic:present name="mensagem">
			<tr>
				<td align="center" colspan="2">
					<h4><bean:write name="mensagem"/></h4>
				</td>
			</tr>			
		</logic:present>						
		<tr>
			<td colspan="2" align="left">					
				<html:button property="btGravar" 	value="GRAVAR"  onclick="gravar()" styleClass="BOTAO" />
				<html:button property="btLimpar" 	value="LIMPAR"  onclick="limpar()" styleClass="BOTAO"/>
				<html:button property="btExcluir" 	value="EXCLUIR" onclick="excluir()" styleClass="BOTAO"/>										
			</td>				
		</tr>			
	</table>	
	</td>
</tr>	
<logic:present name="auxRamoAtividades">
<tr>
	<td>
	<BR>	
	<TABLE border="1" width="100%"  bordercolor="#666666" align="center">
		<TR>
			<TH colspan="2" bgcolor="#C0C0C0">Ramos de atividade</TH>
		</TR>
		<TR>
			<TH bgcolor="#C0C0C0">Área de atuação</TD>
			<TH bgcolor="#C0C0C0">Ramo de atividade</TD>
		</TR>
		<logic:iterate id="colItem" name="auxRamoAtividades">
		<TR>
			<TD>
				<a href="javascript:preencheForm(<bean:write name="colItem" property="ramoAtividade"/>)">													
					<bean:write name="colItem" property="nome"/>
				</a>						
			</TD>
			<TD>
				<a href="javascript:preencheForm(<bean:write name="colItem" property="ramoAtividade"/>)">													
						<bean:write name="colItem" property="nomeRamoSuperior"/>					
				</a>&nbsp;
			</TD>
		</TR>				
		</logic:iterate>				
		</TBODY>
	</TABLE>
	</td>
</tr>
</table>
</body>
</logic:present>			
</html:form>
<script>
	
		document.forms["RamoAtividadeForm"].ramoSuperiorFalso.value = document.forms["RamoAtividadeForm"].ramoSuperior.value;
	
</script>
</html:html>