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
		<script>
		
			function retornar(){
				document.forms["MedidasCorretivasFiscalizacao"].acao.value    = "RETORNAR";		
				document.forms["MedidasCorretivasFiscalizacao"].destino.value = "RETORNAR";		
				document.forms["MedidasCorretivasFiscalizacao"].action        = "/smatWeb/fiscalizacao/MedidasCorretivas.do";			
				document.forms["MedidasCorretivasFiscalizacao"].submit();					
			}
			
			function gravar(){
				document.forms["MedidasCorretivasFiscalizacao"].acao.value    = "GRAVAR";		
				document.forms["MedidasCorretivasFiscalizacao"].destino.value = "";		
				document.forms["MedidasCorretivasFiscalizacao"].action        = "/smatWeb/fiscalizacao/MedidasCorretivas.do";			
				document.forms["MedidasCorretivasFiscalizacao"].submit();						
			}			
			
			function remover(){
				document.forms["MedidasCorretivasFiscalizacao"].acao.value    = "REMOVER";		
				document.forms["MedidasCorretivasFiscalizacao"].destino.value = "";		
				document.forms["MedidasCorretivasFiscalizacao"].action        = "/smatWeb/fiscalizacao/MedidasCorretivas.do";			
				document.forms["MedidasCorretivasFiscalizacao"].submit();						
			}				
			
			function limpar(){
				document.forms["MedidasCorretivasFiscalizacao"].acao.value    				= "";		
				document.forms["MedidasCorretivasFiscalizacao"].destino.value 				= "";		
				document.forms["MedidasCorretivasFiscalizacao"].tipoMedidaCorretiva.value	= "";
				document.forms["MedidasCorretivasFiscalizacao"].prazoDias.value				= "";
				document.forms["MedidasCorretivasFiscalizacao"].observacao.value			= "";														
			}							
			
			function preencheForm(tipoMedidaCorretiva){
				document.forms["MedidasCorretivasFiscalizacao"].acao.value    = "PREENCHEFORM";		
				document.forms["MedidasCorretivasFiscalizacao"].destino.value = "";		
				document.forms["MedidasCorretivasFiscalizacao"].tipoMedidaCorretiva.value = tipoMedidaCorretiva;						 				
				document.forms["MedidasCorretivasFiscalizacao"].action        = "/smatWeb/fiscalizacao/MedidasCorretivas.do";			
				document.forms["MedidasCorretivasFiscalizacao"].submit();															
			}					
		
		</script>
		<SCRIPT src="../js/validacoes.js"></SCRIPT>			
	</head>

	<html:form action="/fiscalizacao/MedidasCorretivas"> 
	
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="fiscalizacao" />	
	<html:hidden property="tramiteFiscalizacao" />		
	<html:hidden property="status" />	
	<html:hidden property="statusFiscalizacao" />
	
	<body  vlink="#666666" alink="#666666" link="#666666">
	<html:errors />
	<TABLE border="0" width="100%">
		<TBODY>
			<tr>
				<td align="center" colspan="2">
				<h3>Cadastro de medidas corretivas</h3>
				</td>
			</tr>		
			<TR>
				<TD>
					<label>Tipo medida corretiva</label>
				</TD>
				<TD>
					<logic:notEqual name="status" value="1">
						<html:hidden property="tipoMedidaCorretivaFalsa" />
						<html:select property="tipoMedidaCorretiva" styleClass="SELECT">
							<html:option value="0">-- Tipo de medida corretiva --</html:option>
							<html:options 	collection="colMedidaCorretiva" 
											labelName="nome"
											labelProperty="nome"
											name="tipoMedidaCorretiva"
											property="tipoMedidaCorretiva" styleClass="OPTION"/>
						</html:select>	
					</logic:notEqual>									
					<logic:equal name="status" value="1">
						<html:hidden property="tipoMedidaCorretiva" />
						<html:select property="tipoMedidaCorretivaFalsa" disabled="true" styleClass="TEXTDISABLE">
							<html:option value="0" styleClass="TEXTDISABLE">-- Tipo de medida corretiva --</html:option>
							<html:options 	collection="colMedidaCorretiva" 
											labelName="nome"
											labelProperty="nome"
											name="tipoMedidaCorretiva"
											property="tipoMedidaCorretiva"  styleClass="TEXTDISABLE"/>
						</html:select>
					</logic:equal>				
					<font color="red">*</font>
				</TD>
			</TR>
			<TR>
				<TD><LABEL>Prazo(dias)</label></TD>
				<TD>
					<logic:notEqual name="status" value="1">
						<html:text 	size="4" maxlength="4"
									property	="prazoDias" 
									onkeypress	='return validaCaracter(event)'
									onfocus		="retiraCaracteresAlfabeticos(this)"
									onblur		="retiraCaracteresAlfabeticos(this)" styleClass="TEXT"/>
					</logic:notEqual>									
					<logic:equal name="status" value="1">
						<html:text property	="prazoDias" readonly="true" styleClass="TEXTDISABLE"/>					
					</logic:equal>
					<font color="red">*</font>
				</TD>
			</TR>
			<TR>
				<TD><label>Observações</label></TD>
				<TD>
					<logic:notEqual name="status" value="1">
							<html:textarea property="observacao" cols="80" rows="3" styleClass="TEXT">
							</html:textarea>					</logic:notEqual>									
					<logic:equal name="status" value="1">
							<html:textarea property="observacao" cols="80" rows="3" styleClass="TEXTDISABLE" readonly="true">
							</html:textarea>					
					</logic:equal>
					<font color="red">*</font>				
				</TD>
			</TR>
			<logic:present name="mensagem">
				<tr>
					<td align="center" colspan="2">
						<h4><bean:write name="mensagem"/></h4>
					</td>
				</tr>			
			</logic:present>	
			<logic:present name="status">						
			<logic:notEqual name="status" value="1">					
			<TR>
				<TD colspan="2" align="center">
					<html:button property="btGravar" 	value="GRAVAR" 	onclick="gravar()" 	styleClass="BOTAO" />
					<html:button property="btLimpar" 	value="LIMPAR"	onclick="limpar()" 	styleClass="BOTAO"  />
					<html:button property="btExcluir" 	value="EXCLUIR"	onclick="remover()" styleClass="BOTAO"  />										
				</TD>
			</TR>
			</logic:notEqual>
			</logic:present>
		</TBODY>
	</TABLE>
	<logic:present name="colMedidasCorretivasFiscal">
	<table border="1" width="100%"  bordercolor="#666666">
		<tbody>
			<tr>
				<th   bgcolor="#C0C0C0" colspan=2>Medidas Corretivas</th>
			</tr>						
			<tr>
				<td>							
					<LABEL>Tipo medida corretiva</LABEL>
				</td>
				<td>
					<LABEL>Prazo</LABEL>
				</td>
			</tr>			
			<logic:iterate id="ipf" name="colMedidasCorretivasFiscal">						
			<tr>
				<td>
					<a href='javascript:preencheForm(<bean:write name="ipf" property="tipoMedidaCorretiva" />)'>							
						<bean:write name="ipf" property="nomeMedidaCorretiva" />
					</a>
				</td>    
				<td>
					<a href='javascript:preencheForm(<bean:write name="ipf" property="tipoMedidaCorretiva" />)'>											
						<bean:write name="ipf" property="prazoDias" />
					</a>
				</td> 
			</tr>
			</logic:iterate>
		</tbody>
	</table>	
	</logic:present>
	<TABLE align="left">
		<TBODY>
			<TR>
				<TD><html:button property="btRetornar" value="RETORNAR" onclick="retornar()" styleClass="BOTAO" /></TD>
			</TR>
		</TBODY>
	</TABLE>	
	</BODY>		
	</html:form>
<script>
		document.forms["MedidasCorretivasFiscalizacao"].tipoMedidaCorretivaFalsa.value = document.forms["MedidasCorretivasFiscalizacao"].tipoMedidaCorretiva.value;				
</script>	
</html:html>