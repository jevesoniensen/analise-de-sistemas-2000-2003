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

	<head>
		<META http-equiv="Content-Style-Type" content="text/css" />
		<LINK href="../../theme/Master.css" rel="stylesheet" type="text/css" />	
			<script>
				function refresh(){
					document.forms["VinculoItemPontoFiscalizacao"].acao.value = "LISTAR";
					document.forms["VinculoItemPontoFiscalizacao"].destino.value = "";
					document.forms["VinculoItemPontoFiscalizacao"].action     = "./VinculoItemPontoFiscalizacao.do";			
					document.forms["VinculoItemPontoFiscalizacao"].submit();
				}		
				
				function gravar(){
					document.forms["VinculoItemPontoFiscalizacao"].acao.value = "GRAVAR";
					document.forms["VinculoItemPontoFiscalizacao"].destino.value = "";
					document.forms["VinculoItemPontoFiscalizacao"].action     = "./VinculoItemPontoFiscalizacao.do";			
					document.forms["VinculoItemPontoFiscalizacao"].submit();
				}						
			</script>			
	</head>

	<body  vlink="#666666" alink="#666666" link="#666666">
	<html:form action="parametros/fiscalizacao/VinculoItemPontoFiscalizacao.do">
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	
	<table border="0" width="100%">
		<tbody>
			<tr>
				<td colspan="2" align="center">
					<h3>Cadastro de vínculos entre Pontos e Ítens de fiscalização</h3>
				</td>
			</tr>
			<tr>
				<td colspan="2"></td></tr>
			<tr>
				<td width="154">
					<label>Ramo de atividade</label>
				</td>
				<td width="845">
					<html:select property="ramoSuperior" onchange="refresh()" styleClass="SELECT">
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
					<html:select property="ramoAtividade" onchange="refresh()" styleClass="SELECT">
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
			<logic:present name="mensagem">
				<tr>
					<td align="center" colspan="2">
						<h4><bean:write name="mensagem"/></h4>
					</td>
				</tr>			
			</logic:present>							
			<tr>
				<td align="center" colspan="2">
				<BR>
				<table border="1" bordercolor="#666666" width="100%">
					<tbody>
						<tr>
							<th align="center" colspan="2"  bgcolor="#C0C0C0">
								Itens de Fiscalização
							</th>
						</tr>					
						<logic:present name="auxItemPontoFiscalizacao">
						<logic:iterate id="ipf" name="auxItemPontoFiscalizacao">						
						<tr>
							<td width="55" height="28">							
								<input type="checkbox" name="item" value="<bean:write name="ipf" property="itemFiscalizacao"/>" <bean:write name="ipf" property="checked" /> > 								
							</td>
							<td width="934" height="28">
								<label><bean:write name="ipf" property="nome" /></label>
							</td>
						</tr>
						</logic:iterate>
						</logic:present>
					</tbody>
				</table>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">					
					<html:button property="btGravar" 	value="GRAVAR" onclick="gravar()" styleClass="BOTAO"/>									
				</td>				
			</tr>			
		</tbody>
	</table>
	</html:form>
	</body>
</html:html>
