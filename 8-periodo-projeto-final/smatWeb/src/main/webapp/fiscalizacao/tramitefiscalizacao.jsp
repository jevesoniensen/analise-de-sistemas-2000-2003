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
	<SCRIPT>
			function retornar(){
				document.forms["TramiteFiscalizacao"].acao.value    = "RETORNAR";		
				document.forms["TramiteFiscalizacao"].destino.value = "RETORNAR";		
				document.forms["TramiteFiscalizacao"].action        = "/smatWeb/fiscalizacao/Tramite.do";			
				document.forms["TramiteFiscalizacao"].submit();			
			}
			
			function gravar(){
				document.forms["TramiteFiscalizacao"].acao.value    = "GRAVAR";		
				document.forms["TramiteFiscalizacao"].destino.value = "GRAVAR";		
				document.forms["TramiteFiscalizacao"].action        = "/smatWeb/fiscalizacao/Tramite.do";			
				document.forms["TramiteFiscalizacao"].submit();						
			}
			
			function cadastrarRoteiro(){
				document.forms["TramiteFiscalizacao"].acao.value    = "CADASTRARROTEIRO";		
				document.forms["TramiteFiscalizacao"].destino.value = "CADASTRARROTEIRO";		
				document.forms["TramiteFiscalizacao"].action        = "/smatWeb/fiscalizacao/Tramite.do";			
				document.forms["TramiteFiscalizacao"].submit();			
			}			
			
			function visualizar(tramite,status){
				document.forms["TramiteFiscalizacao"].acao.value    			= "VISUALIZAR";		
				document.forms["TramiteFiscalizacao"].destino.value 			= "";		
				document.forms["TramiteFiscalizacao"].status.value				= status;		
				document.forms["TramiteFiscalizacao"].tramiteFiscalizacao.value = tramite;										
				document.forms["TramiteFiscalizacao"].action        			= "/smatWeb/fiscalizacao/Tramite.do";			
				document.forms["TramiteFiscalizacao"].submit();						
			}
						
			function medidasCorretivas(){
				document.forms["TramiteFiscalizacao"].acao.value    = "MEDIDASCORRETIVAS";
				document.forms["TramiteFiscalizacao"].destino.value = "MEDIDASCORRETIVAS";		
				document.forms["TramiteFiscalizacao"].action        = "/smatWeb/fiscalizacao/Tramite.do";			
				document.forms["TramiteFiscalizacao"].submit();									
			}

			function alterarStatus(){
				document.forms["TramiteFiscalizacao"].acao.value    = "ALTERARSTATUS";
				document.forms["TramiteFiscalizacao"].destino.value = "";		
				document.forms["TramiteFiscalizacao"].action        = "/smatWeb/fiscalizacao/Tramite.do";			
				document.forms["TramiteFiscalizacao"].submit();												
			}
					
	</SCRIPT>
</head>

<html:form action="/fiscalizacao/Tramite" >
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="fiscalizacao" />	
	<html:hidden property="tramiteFiscalizacao" />	
	<html:hidden property="statusFiscalizacao" />
	<html:hidden property="data" />
	<html:hidden property="item" />	
	<html:hidden property="grauConformidade" />

	<body  vlink="#666666" alink="#666666" link="#666666">
	<html:errors/>
	<table  align="center">
		<TBODY>
			<tr>
				<td align="center">
					<h3>Trâmite da fiscalização</h3>
				</td>
			</tr>
		</TBODY>	
	</table>
	<logic:present name="arItensRoteiro">
	<table border="1" width="100%"  bordercolor="#666666">
		<tbody>		
			<tr>
				<Th colspan="2"  bgcolor="#C0C0C0" align="center">
					Detalhes do trâmite
				</th>
			</tr>
			<logic:iterate id="itensRoteiro" name="arItensRoteiro">						
			<tr>
				<td>
						<LABEL><bean:write name="itensRoteiro" property="nome" /></LABEL>
						<INPUT type="hidden" name="item" value="<bean:write name="itensRoteiro" property="itemFiscalizacao" />">
				</td>
				<logic:present name="status">
				<logic:equal name="status" value="1">
				<td>							
						<logic:present name="itensRoteiro" property="nomeGrauConformidade">
							<LABEL><bean:write name="itensRoteiro" property="nomeGrauConformidade" /></LABEL>					 
						</logic:present>
						<logic:notPresent name="itensRoteiro" property="nomeGrauConformidade">
							<LABEL>Não avaliado</LABEL>
						</logic:notPresent>
						<INPUT type="hidden" name="grauConformidade" value="">						
				</td>		
				</logic:equal>
				<logic:notEqual name="status" value="1">
				<td>							
						<bean:write  name="itensRoteiro" property="checked" filter="false"/>
				</td>				
				</logic:notEqual>				
				</logic:present>
				<logic:notPresent  name="status">
						<INPUT type="hidden" name="grauConformidade" value="">
				</logic:notPresent>	
			</tr>
			</logic:iterate>
		</tbody>
	</table>
	</logic:present>
	<logic:notPresent name="arItensRoteiro">
	</logic:notPresent>
	<logic:present name="mensagem">
	<TABLE border="0" width="100%" align="center">
		<tr>
			<td align="center">
				<h4><bean:write name="mensagem"/></h4>
			</td>
		</tr>			
	</table>
	</logic:present>	
	<TABLE border="0" width="100%" align="center">
		<TR>
			<TD align="center">
				<logic:present name="statusFiscalizacao">
					<logic:equal name="statusFiscalizacao" value="ABERTO">
						<html:button property="btCadastrarRoteiro" value="ROTEIRO" onclick="cadastrarRoteiro()" styleClass="BOTAO"/>
					</logic:equal>
				</logic:present>

				<logic:present name="arItensRoteiro">
					<logic:notEqual name="status" value="1">
						<html:button property="btGravar" 				value="GRAVAR" 				onclick="gravar()" 				styleClass="BOTAO"/>
					</logic:notEqual>
					<html:button property="btMedidasCorretivas" 	value="MEDIDAS CORRETIVAS" 	onclick="medidasCorretivas()"	styleClass="BOTAO"/>														
				</logic:present>
				
			</TD>
		</TR>
	</TABLE>		
<logic:present name="arItensRoteiro">
	<TABLE border="0" width="100%" align="center">
		<TR>
			<TD align="center">
				
				<logic:notEqual name="status" value="1">
					<html:select property="status" styleClass="SELECT">
						<logic:present name="colObjStatus">
							<html:option value=""> -- Status do trâmite</html:option>
							<html:options 	collection="colObjStatus" 
											labelName="nome"
											labelProperty="nome"
											name="status"
											property="status"/>
						</logic:present>						
					</html:select>
					<html:button property="btAlterarStatus" value="ALTERAR STATUS" styleClass="BOTAO" onclick="alterarStatus()"/>
				</logic:notEqual>
				<logic:equal name="status" value="1">
						<html:hidden property="status" />
				</logic:equal>
			</TD>
		</TR>
	</TABLE>
</logic:present>	

<logic:notPresent name="arItensRoteiro">
	<html:hidden property="status" />
</logic:notPresent>	
	<table border="1" width="100%"  bordercolor="#666666">
	<tbody>
		<tr>
			<th   bgcolor="#C0C0C0" colspan=3>Trâmites da Fiscalização</th>
		</tr>						
		<logic:present name="colTramites">		
		<tr>
			<td>											
				<LABEL>Nº</LABEL>			
			</td>
			<td>											
				<LABEL>Data</LABEL>			
			</td>
			<td>											
				<LABEL>Status</LABEL>			
			</td>					</tr>		
		<logic:iterate id="ipf" name="colTramites">						
		<tr>
			<td>											
				<a href='javascript:visualizar(<bean:write name="ipf" property="tramiteFiscalizacao" />,<bean:write name="ipf" property="status" />)'>
					<bean:write name="ipf" property="tramiteFiscalizacao" />			
				</a>
			</td>
			<td>
				<a href='javascript:visualizar(<bean:write name="ipf" property="tramiteFiscalizacao" />,<bean:write name="ipf" property="status" />)'>			
					<bean:write name="ipf" property="data" />
				</a>	
			</td>
			<td>
				<a href='javascript:visualizar(<bean:write name="ipf" property="tramiteFiscalizacao" />,<bean:write name="ipf" property="status" />)'>			
					<bean:write name="ipf" property="nomeStatus" />						
				</a>	
			</td>			
		</tr>
		</logic:iterate>
		</logic:present>
		<logic:notPresent name="colTramites">
		<tr>
			<td>
				<LABEL>Não há nenhum trâmite cadastrado!</LABEL>
			</td>
		</tr>			
		</logic:notPresent>
	</tbody>
	</table>
	<TABLE align="left">
		<TBODY>
			<TR>
				<TD><html:button property="btRetornar" value="RETORNAR" onclick="retornar()" styleClass="BOTAO" /></TD>
			</TR>
		</TBODY>
	</TABLE>
	</body>
</html:form>	
</html:html>