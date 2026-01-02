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
			
				function changeRamoSuperior(){
					document.forms["CadastroRoteiro"].ramoAtividade.value=0;
					changeRamoAtividade();
				}
				
				function changeRamoAtividade(){
					document.forms["CadastroRoteiro"].pontoFiscalizacao.value=0;					
					refresh();
				}				
			
				function refresh(){
					document.forms["CadastroRoteiro"].acao.value = "LISTAR";
					document.forms["CadastroRoteiro"].destino.value = "";
					document.forms["CadastroRoteiro"].action        = "/smatWeb/fiscalizacao/CadastroRoteiro.do";
					document.forms["CadastroRoteiro"].submit();
				}		
				
				function adicionar(){
					document.forms["CadastroRoteiro"].acao.value = "ADICIONAR";
					document.forms["CadastroRoteiro"].destino.value = "";
					document.forms["CadastroRoteiro"].action        = "/smatWeb/fiscalizacao/CadastroRoteiro.do";
					document.forms["CadastroRoteiro"].submit();
				}						
				
				function remover(item,tramiteFiscalizacao){
					document.forms["CadastroRoteiro"].acao.value = "REMOVER";
					document.forms["CadastroRoteiro"].destino.value = "";
					document.forms["CadastroRoteiro"].tramiteFiscalizacao.value = tramiteFiscalizacao;
					document.forms["CadastroRoteiro"].removeItem.value = item;
					document.forms["CadastroRoteiro"].action        = "/smatWeb/fiscalizacao/CadastroRoteiro.do";
					document.forms["CadastroRoteiro"].submit();
				}
				
				function retornar(){
					document.forms["CadastroRoteiro"].acao.value    = "RETORNAR";		
					document.forms["CadastroRoteiro"].destino.value = "RETORNAR";		
					document.forms["CadastroRoteiro"].action        = "/smatWeb/fiscalizacao/CadastroRoteiro.do";			
					document.forms["CadastroRoteiro"].submit();			
				}				
			</script>			
	</head>

	<body  vlink="#666666" alink="#666666" link="#666666">
	<html:form action="/fiscalizacao/CadastroRoteiro">
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="fiscalizacao" />	
	<html:hidden property="tramiteFiscalizacao" />			
	<html:hidden property="removeItem" />	
	<html:hidden property="status" />
	
	<table  align="center">
		<TBODY>
			<tr>
				<td align="center">
					<h3>Cadastro do roteiro de fiscalização</h3>
				</td>
			</tr>
		</TBODY>	
	</table>
	<logic:present name="arItensRoteiro">
	<table border="1" width="100%"  bordercolor="#666666">
		<tbody>		
			<tr>
				<TH colspan="2"  bgcolor="#C0C0C0" align="center">
					Roteiro do trâmite atual
				</tH>
			</tr>
			<logic:iterate id="itensRoteiro" name="arItensRoteiro">						
			<tr>
				<td>
						<LABEL><bean:write name="itensRoteiro" property="nome" /></LABEL>
				</td>
				<td>							
					 <a href='javascript:remover(<bean:write name="itensRoteiro" property="itemFiscalizacao"/>,<bean:write name="itensRoteiro" property="tramiteFiscalizacao"/>)'>remover</a>
				</td>				
			</tr>
			</logic:iterate>
		</tbody>
	</table>	
	</logic:present>
	<table border="0" width="100%">
		<tbody>
			<tr>
				<td colspan="2"></td></tr>
			<tr>
				<td width="154">
					<label>Ramo de atividade</label>
				</td>
				<td width="845">
					<html:select property="ramoSuperior" onchange="changeRamoSuperior()" styleClass="SELECT">
						<html:option value="0">- nenhum --</html:option>
						<logic:present name="objRamoSuperior">
							<html:options 	collection="objRamoSuperior" 
											labelName="nome"
											labelProperty="nome"
											property="ramoAtividade"
											name="ramoAtividade"
											styleClass="OPTION"/>
						</logic:present>						
					</html:select>					
				</td>
			</tr>
			<tr>
				<td width="154">
					<label>Área de atuação</label>
				</td>
				<td width="845">
					<html:select property="ramoAtividade" onchange="changeRamoAtividade()" styleClass="SELECT">
						<html:option value="0">- nenhum --</html:option>
						<logic:present name="objRamoAtividade">
							<html:options 	collection="objRamoAtividade" 
											labelName="nome"
											labelProperty="nome"
											property="ramoAtividade"
											name="ramoAtividade"
											styleClass="OPTION"/>							
						</logic:present>
					</html:select>					
				</td>
			</tr>
			<tr>
				<td width="154">
					<label>Ponto de fiscalização</label>
				</td>
				<td width="845">
					<html:select property="pontoFiscalizacao" onchange="refresh()" styleClass="SELECT">
						<html:option value="0">- nenhum --</html:option>
						<logic:present name="objPontoFiscalizacao">
							<html:options 	collection="objPontoFiscalizacao" 
											labelName="nome"
											labelProperty="nome"
											property="pontoFiscalizacao"
											name="pontoFiscalizacao"
											styleClass="OPTION"/>							
						</logic:present>						
					</html:select>					
				</td>
			</tr>						
			<logic:present name="auxItemPontoFiscalizacao">
			<tr>
				<td align="center" colspan="2">
					<h3>Itens de Fiscalização</h3>
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2">
				<table border="1" width="100%"  bordercolor="#666666">
					<tbody>
						<tr>
							<th   bgcolor="#C0C0C0" colspan=2>Item de Fiscalização</th>
						</tr>						
						<logic:iterate id="ipf" name="auxItemPontoFiscalizacao">						
						<tr>
							<td width="55" height="28">							
								<input type="checkbox" name="item" value="<bean:write name="ipf" property="itemFiscalizacao"/>" <bean:write name="ipf" property="checked" /> class="RADIO" > 
								
							</td>
							<td width="934" height="28">
								<LABEL><bean:write name="ipf" property="nome" /></LABEL>
							</td>
						</tr>
						</logic:iterate>
					</tbody>
				</table>
				</td>
			</tr>	
			<logic:present name="mensagem">
				<tr>
					<td align="center" colspan="2">
						<h4><bean:write name="mensagem"/></h4>
					</td>
				</tr>			
			</logic:present>			
			<tr>
				<td colspan="2" align="center">					
					<html:button property="btGravar" 	value="ADICIONAR" onclick="adicionar()" styleClass="BOTAO"/>									
				</td>				
			</tr>								
			</logic:present>
		</tbody>
	</table>
	<TABLE align="left">
		<TBODY>
			<TR>
				<TD><html:button property="btRetornar" value="RETORNAR" onclick="retornar()" styleClass="BOTAO" /></TD>
			</TR>
		</TBODY>
	</TABLE>	
	</html:form>
	</body>
</html:html>
