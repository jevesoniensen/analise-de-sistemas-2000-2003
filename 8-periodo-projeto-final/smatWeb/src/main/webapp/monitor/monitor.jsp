<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>
<html:html>
	
	<head>
		<SCRIPT src="../js/validacoes.js"></SCRIPT>
		<SCRIPT>
			function refresh(){
				document.forms["MonitorForm"].acao.value = "LISTAR";
				document.forms["MonitorForm"].destino.value = "";
				document.forms["MonitorForm"].action     = "/smatWeb/monitor/Monitor.do";			
				document.forms["MonitorForm"].submit();
			}	
					
			function preencheForm(monitor){
				document.forms["MonitorForm"].acao.value = "PREENCHEFORM";
				document.forms["MonitorForm"].destino.value = "";
				document.forms["MonitorForm"].monitor.value = monitor;				
				document.forms["MonitorForm"].action     = "/smatWeb/monitor/Monitor.do";			
				document.forms["MonitorForm"].submit();						
			}
			
			function gravar(){
				document.forms["MonitorForm"].acao.value = "GRAVAR";
				document.forms["MonitorForm"].destino.value = "";
				document.forms["MonitorForm"].action     = "/smatWeb/monitor/Monitor.do";			
				document.forms["MonitorForm"].submit();					
			}
			
			function limpar(){
				document.forms["MonitorForm"].monitor.value = "";								
				document.forms["MonitorForm"].periodicidade.value = "";								
				document.forms["MonitorForm"].campo.value = "";								
				document.forms["MonitorForm"].queryCampo.value = "";								
				document.forms["MonitorForm"].maxAcidente.value = "";																								
				document.forms["MonitorForm"].ultimaExecucao.value = "";																												
				refresh();			
			}
			
			function excluir(){
				document.forms["MonitorForm"].acao.value = "EXCLUIR";
				document.forms["MonitorForm"].destino.value = "";
				document.forms["MonitorForm"].action     = "/smatWeb/monitor/Monitor.do";			
				document.forms["MonitorForm"].submit();			
			}			
		</SCRIPT>		
	</head>
<BODY  alink="#66666" vlink="#66666" link="#66666">	
	<html:form action="/monitor/Monitor">
		<html:hidden property="acao" />
		<html:hidden property="destino" />

		<html:errors/>
		<table width="100%" align="center" border="0">
		<TBODY>
			<TR>
				<TH colspan="2">
					<H3>
						Cadastro de monitores
					</H3>
				</TH>
			</TR>
			<TR>
				<TD width="150">	
					<LABEL>Monitor</LABEL>
				</TD>
				<TD>
					<html:text property="monitor" readonly="true" size="3" maxlength="3" styleClass="TEXTDISABLE"/>	
				</TD>
			</TR>
			<TR>
				<TD width="150">	
					<LABEL>Periodicidade</LABEL>
				</TD>
				<TD>
					<html:select property="periodicidade" styleClass="SELECT">
						<html:option value="0" styleClass="OPTION"> -- Periodicidade -- </html:option>					
						<html:option value="1" styleClass="OPTION">Mensal</html:option>
						<html:option value="2" styleClass="OPTION">Anual</html:option>						
					</html:select>				
					<font color="red">*</font>
				</TD>
			</TR>			
			<TR>
				<TD width="150">	
					<LABEL>Informação</LABEL>
				</TD>
				<TD>
					<html:select property="campo" styleClass="SELECT" onchange="refresh()">
						<html:option value="0" styleClass="OPTION"> -- Informação -- </html:option>
						<logic:present name="arCampo">
							<html:options 	collection="arCampo"
											labelName="label"
											labelProperty="label"
											name="campo"
											property="campo"
											styleClass="OPTION"/>
						</logic:present>
					</html:select>
					<font color="red">*</font>					
				</TD>
			</TR>			
			<TR>
				<TD width="150">	
					<LABEL>Registro</LABEL>
				</TD>
				<TD>
					<html:select property="queryCampo" styleClass="SELECT">
						<html:option value="0" styleClass="OPTION"> -- Registro -- </html:option>		
						<logic:present name="auxCampo">
							<html:options 	collection="auxCampo"
											labelName="nomeRegistro"
											labelProperty="nomeRegistro"
											name="registro"
											property="registro"
											styleClass="OPTION"/>				
						</logic:present>
					</html:select>
					<font color="red">*</font>					
				</TD>
			</TR>			
			<TR>
				<TD width="150">	
					<LABEL>Numero máximo de acidentes</LABEL>
				</TD>
				<TD>
					<html:text property="maxAcidente" size="5" maxlength="3" styleClass="TEXT"  onkeypress='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this);retiraZero(this)" onblur="retiraCaracteresAlfabeticos(this)"></html:text>
					<font color="red">*</font>
				</TD>
			</TR>						
			<TR>
				<TD width="150">	
					<LABEL>Última execução</LABEL>
				</TD>
				<TD>
					<html:text property="ultimaExecucao" size="16" maxlength="16" styleClass="TEXTDISABLE"></html:text>
				</TD>
			</TR>		
			<logic:present name="mensagem">
				<tr>
					<td align="center" colspan="2">
						<H4>
							<bean:write name="mensagem"/>
						</H4>
					</td>
				</tr>			
			</logic:present>				
			<tr>
				<td colspan="2" align="center">					
					<html:button property="btGravar" 	value="GRAVAR"  onclick="gravar()"  styleClass="BOTAO"/>
					<html:button property="btLimpar" 	value="LIMPAR"  onclick="limpar()" styleClass="BOTAO"/>
					<html:button property="btExcluir" 	value="EXCLUIR" onclick="excluir()" styleClass="BOTAO"/>										
				</td>				
			</tr>										
		</TBODY>
		</table>
		<BR>
		<table border="1" width="100%" bordercolor="black">
			<tbody>
				<tr>
					<TH bgcolor="#C0C0C0">
						Monitor
					</TH>
					<TH bgcolor="#C0C0C0">
						Informação
					</TH>
					<TH bgcolor="#C0C0C0">
						Registro
					</TH>
					<TH bgcolor="#C0C0C0">
						Ultima execução
					</TH>
				</tr>
				<logic:present name="arMonitor">
				<logic:iterate id="afe" name="arMonitor">
				<tr>
					<td>
						<a href='javascript:preencheForm(<bean:write name="afe" property="monitor"/>)'>	
							<bean:write name="afe" property="monitor" />
						</a>	
					</td>
					<td>
						<a href='javascript:preencheForm(<bean:write name="afe" property="monitor"/>)'>	
							<bean:write name="afe" property="nomeCampo" />
						</a>										
					</td>
					<td>
						<a href='javascript:preencheForm(<bean:write name="afe" property="monitor"/>)'>	
							<bean:write name="afe" property="nomeRegistro" />							
						</a>										
					</td>
					<td>
						<a href='javascript:preencheForm(<bean:write name="afe" property="monitor"/>)'>	
							<bean:write name="afe" property="ultimaDataExecucao" />							
						</a>&nbsp;										
					</td>
				</tr>
				</logic:iterate>
				</logic:present>
			</tbody>
		</table>		
	</html:form>
</BODY>
</html:html>