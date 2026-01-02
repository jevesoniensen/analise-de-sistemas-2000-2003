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
			function visualizar(fiscalizacao){
				document.forms["Fiscalizacoes"].acao.value    		= "VISUALIZAR";		
				document.forms["Fiscalizacoes"].destino.value 		= "";		
				document.forms["Fiscalizacoes"].fiscalizacao.value 	= fiscalizacao;						
				document.forms["Fiscalizacoes"].action        		= "/smatWeb/fiscalizacao/Fiscalizacoes.do";			
				document.forms["Fiscalizacoes"].submit();					
			}
			
			function atualizarDados(){
				document.forms["Fiscalizacoes"].acao.value    = "CADASTRO";		
				document.forms["Fiscalizacoes"].destino.value = "CADASTRO";		
				document.forms["Fiscalizacoes"].action        = "/smatWeb/fiscalizacao/Fiscalizacoes.do";			
				document.forms["Fiscalizacoes"].submit();			
			}		
			
			function tramite(){
				document.forms["Fiscalizacoes"].acao.value    = "TRAMITE";		
				document.forms["Fiscalizacoes"].destino.value = "TRAMITE";		
				document.forms["Fiscalizacoes"].action        = "/smatWeb/fiscalizacao/Fiscalizacoes.do";			
				document.forms["Fiscalizacoes"].submit();			
			}					
			
			function finalizar(){
				document.forms["Fiscalizacoes"].acao.value    = "FINALIZAR";		
				document.forms["Fiscalizacoes"].destino.value = "";		
				document.forms["Fiscalizacoes"].action        = "/smatWeb/fiscalizacao/Fiscalizacoes.do";			
				document.forms["Fiscalizacoes"].submit();						
			}
						
		</SCRIPT>
	</head>

	<body  vlink="#666666" alink="#666666" link="#666666">
	
	<html:form action="/fiscalizacao/Fiscalizacoes">
	
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="fiscalizacao" />	
	
	<table border="0" width="100%">
		<tbody>
			<tr>
				<th align="center">
					<h3>Fiscalizações Cadastradas</h3>
				</th>
			</tr>
			<logic:present name="auxFiscalEmpregador">
			<tr>
				<td>
					<table border="1" width="100%"  bordercolor="#666666">
						<tbody>
							<tr>
								<TH colspan="2"  bgcolor="#C0C0C0">
									Trâmite da fiscalização
								</TH>
							</tr>
							<tr>
								<td width="100">
									<LABEL>
										Fiscalização Nº
									</LABEL>
								</td>
								<td>
									<LABEL><bean:write name="auxFiscalEmpregador" property="fiscalizacao" /></LABEL>
								</td>
							</tr>
							<tr>
								<td  width="100">
									<LABEL>
										Agente de saúde
									</LABEL>
								</td>
								<td width="100">
									<LABEL><bean:write name="auxFiscalEmpregador" property="nomeAgente" /></LABEL>
								</td>
							</tr>
							<tr>
								<td width="100">
									<LABEL>
										Empregador
									</LABEL>
								</td>
								<td>
									<LABEL><bean:write name="auxFiscalEmpregador" property="razaoSocial" /></LABEL>									
								</td>
							</tr>
							<tr>
								<td width="100">
									<LABEL>
										Data da abertura
									</LABEL>
								</td>
								<td>
									<LABEL><bean:write name="auxFiscalEmpregador" property="dataAbertura" /></LABEL>
								</td>
							</tr>	
							<logic:present name="auxFiscalEmpregador" property="dataFinalizacao">
							<tr>
								<td width="100">
									<LABEL>
										Data da finalização
									</LABEL>
								</td>
								<td>
									<LABEL><bean:write name="auxFiscalEmpregador" property="dataFinalizacao" /></LABEL>
								</td>
							</tr>								
							</logic:present>																				
							<tr>
								<td width="100">
									<LABEL>
										Titulo
									</LABEL>
								</td>
								<td>
									<LABEL><bean:write name="auxFiscalEmpregador" property="titulo" /></LABEL>
								</td>
							</tr>															
							<tr>
								<td width="100">
									<LABEL>
										Observações Gerais
									</LABEL>
								</td>
								<td>
									<LABEL><bean:write name="auxFiscalEmpregador" property="obsGerais" /></LABEL>
								</td>
							</tr>																						
						</tbody>
					</table>
				</td>
			</tr>
			<logic:present name="mensagem">
				<tr>
					<td align="center">
						<h4><bean:write name="mensagem"/></h4>
					</td>
				</tr>			
			</logic:present>			
			<tr>
				<td align="center">
					<logic:present name="statusFiscalizacao">
						<logic:equal name="statusFiscalizacao" value="ABERTO">				
							<html:button property="btAtualizarDados" 		value="ATUALIZAR DADOS"    styleClass="BOTAO"  onclick="atualizarDados()"/>
						</logic:equal>
					</logic:present>
					<html:button property="btTramite" 				value="TRÂMITE(S)"         styleClass="BOTAO"  onclick="tramite()" />
					<logic:present name="statusFiscalizacao">
						<logic:equal name="statusFiscalizacao" value="ABERTO">									
							<html:button property="btFinalizar"				value="FINALIZAR"          styleClass="BOTAO"  onclick="finalizar()"/>					
						</logic:equal>
					</logic:present>		
				</td>
			</tr>
			</logic:present>			
			<tr>
				<td align="center">
				<table border="1" width="100%" bordercolor="#666666">
					<tbody>
						<tr>
							<TH bgcolor="#C0C0C0" width="10">
								Nº
							</TH>
							<TH bgcolor="#C0C0C0">
								Titulo
							</TH>
							<TH bgcolor="#C0C0C0">
								Empregador
							</TH>
							<TH bgcolor="#C0C0C0" >
								Data abertura
							</TH>
						</tr>
						<logic:present name="auxFiscalizacaoEmpregador">
						<logic:iterate id="afe" name="auxFiscalizacaoEmpregador">
						<tr>
							<td>
								<a href='javascript:visualizar(<bean:write name="afe" property="fiscalizacao"/>)'>	
									<bean:write name="afe" property="fiscalizacao" />
								</a>	
							</td>
							<td>
								<a href='javascript:visualizar(<bean:write name="afe" property="fiscalizacao"/>)'>	
									<bean:write name="afe" property="titulo" />
								</a>										
							</td>
							<td>
								<a href='javascript:visualizar(<bean:write name="afe" property="fiscalizacao"/>)'>	
									<bean:write name="afe" property="razaoSocial" />							
								</a>										
							</td>
							<td>
								<a href='javascript:visualizar(<bean:write name="afe" property="fiscalizacao"/>)'>	
									<bean:write name="afe" property="dataAbertura" />							
								</a>										
							</td>
						</tr>
						</logic:iterate>
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
