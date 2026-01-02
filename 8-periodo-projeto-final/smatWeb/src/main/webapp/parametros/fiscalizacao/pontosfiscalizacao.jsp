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
				document.forms["PontosFiscalizacao"].acao.value = "LISTAR";
				document.forms["PontosFiscalizacao"].destino.value = "";
				document.forms["PontosFiscalizacao"].action     = "./PontosFiscalizacao.do";			
				document.forms["PontosFiscalizacao"].submit();
			}		
			
			function limpar(){
				document.forms["PontosFiscalizacao"].nome.value              = "";				
				document.forms["PontosFiscalizacao"].descricao.value         = "";
				document.forms["PontosFiscalizacao"].ramoSuperior.value      = 0;
				document.forms["PontosFiscalizacao"].ramoAtividade.value     = 0;
				document.forms["PontosFiscalizacao"].pontoFiscalizacao.value = 0;			
				refresh();				
			}
			
			function excluir(){
				document.forms["PontosFiscalizacao"].acao.value = "EXCLUIR";
				document.forms["PontosFiscalizacao"].destino.value = "";
				document.forms["PontosFiscalizacao"].action     = "./PontosFiscalizacao.do";			
				document.forms["PontosFiscalizacao"].submit();			
			}
			
			function preencheForm(	pontoFiscalizacao,
									nome,
									descricao,
									ramoAtividade,
									ramoSuperior){

				document.forms["PontosFiscalizacao"].nome.value              = nome;				
				document.forms["PontosFiscalizacao"].descricao.value         = descricao;
				document.forms["PontosFiscalizacao"].ramoSuperior.value      = ramoSuperior;
				document.forms["PontosFiscalizacao"].ramoAtividade.value     = ramoAtividade;
				document.forms["PontosFiscalizacao"].pontoFiscalizacao.value = pontoFiscalizacao;												
				
				refresh();
									
			}
			
			function gravar(){
				document.forms["PontosFiscalizacao"].acao.value = "GRAVAR";
				document.forms["PontosFiscalizacao"].destino.value = "";
				document.forms["PontosFiscalizacao"].action     = "./PontosFiscalizacao.do";			
				document.forms["PontosFiscalizacao"].submit();				
			}
			
		</script>		
	</head>
	<body  vlink="#666666" alink="#666666" link="#666666">
	<html:form action="/parametros/fiscalizacao/PontosFiscalizacao" focus="nome" method="POST" >	
	
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="pontoFiscalizacao" />
	
	<html:errors />	
	<table border="0" width="100%">
		<tbody>
			<tr>
				<td colspan="2" align="center">
					<h3>Cadastro de Pontos de Fiscalização</h3>
				</td>
			</tr>
			<tr>
				<td colspan="2"></td></tr>
			<tr>
				<td nowrap="nowrap"><label>Nome</label></td>
				<td>	
					<html:text property="nome" size="30" maxlength="30" styleClass="TEXT"/><font color="red">*</font>
				</td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Descrição</label></td>
				<td>
					<html:textarea rows="3" cols="68" property="descricao" styleClass="TEXTAREA">
					</html:textarea><font color="red">*</font>
				</td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Ramo de atividade</label></td>
				<td>
					<html:select property="ramoSuperior" onchange="refresh()" styleClass="SELECT">
						<html:option value="0" styleClass="OPTION">--- Nenhum ---</html:option>
						<logic:present name="objRamoSuperior">
							<html:options 	collection="objRamoSuperior" 
											labelName="nome"
											labelProperty="nome"
											property="ramoAtividade"
											name="ramoAtividade"
											styleClass="OPTION"/>
						</logic:present>
					</html:select>		
					<font color="red">*</font>		
				</td>
			</tr>
			<logic:present name="objRamoAtividade">			
			<tr>
				<td nowrap="nowrap" ><label>Área de atuação</label></td>
				<td>
					<html:select property="ramoAtividade" styleClass="SELECT">
							<html:options 	collection="objRamoAtividade" 
											labelName="nome"
											labelProperty="nome"
											property="ramoAtividade"
											name="ramoAtividade"
											styleClass="OPTION"/>							
					</html:select>				
					<font color="red">*</font>
				</td>
			</tr>
			</logic:present>
			<logic:notPresent name="objRamoAtividade">
				<html:hidden property="ramoAtividade" />
			</logic:notPresent>			
			<logic:present name="mensagem">
				<tr>
					<td align="center" colspan="2">
						<h4><bean:write name="mensagem"/></H4>
					</td>
				</tr>			
			</logic:present>				
			<tr>
				<td colspan="2" align="center">					
					<html:button property="btGravar" 	value="GRAVAR"  onclick="gravar()" styleClass="BOTAO"/>
					<html:button property="btLimpar" 	value="LIMPAR"  onclick="limpar()" styleClass="BOTAO"/>
					<html:button property="btExcluir" 	value="EXCLUIR" onclick="excluir()" styleClass="BOTAO"/>										
				</td>				
			</tr>
			<tr>
				<td nowrap="nowrap">
				<label>Listar pontos vinculados a:</label>
				</td>
				<td>
					<html:select property="filtroPontosFiscalizacao" onchange="refresh()" styleClass="SELECT">
						<html:option value="0" styleClass="OPTION">--- Nenhum ---</html:option>
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
				<td colspan="2" align="center">
				<table border="1" bordercolor="#666666" width="100%">
					<tbody>	
					<logic:present name="auxTabela">
							<bean:write name="auxTabela" filter="false"/>
					</logic:present>						
					</tbody>
				</table>								
				</td>
			</tr>
		</tbody>
	</table>
	</html:form>
	</body>
	</html:html>
