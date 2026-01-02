
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
<HEAD>

<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE></TITLE>

<script>
		function refresh(){
			document.forms["AcidentePassoDois"].acao.value = "LISTAR";
			document.forms["AcidentePassoDois"].destino.value = "";
			document.forms["AcidentePassoDois"].action     = "/smatWeb/cadastroacidente/AcidentePassoDois.do";			
			document.forms["AcidentePassoDois"].submit();
		}
		
		function voltarForm(){
			document.forms["AcidentePassoDois"].acao.value = "VOLTAR";		
			document.forms["AcidentePassoDois"].destino.value = "VOLTAR";		
			document.forms["AcidentePassoDois"].action     = "/smatWeb/cadastroacidente/AcidentePassoDois.do";			
			document.forms["AcidentePassoDois"].submit();		
		}		
		
		function avancarForm(){
			document.forms["AcidentePassoDois"].acao.value = "AVANCAR";		
			document.forms["AcidentePassoDois"].destino.value = "AVANCAR";		
			document.forms["AcidentePassoDois"].action     = "/smatWeb/cadastroacidente/AcidentePassoDois.do";			
			document.forms["AcidentePassoDois"].submit();		
		}		
		
		function inserirLocalLesao(){
			document.forms["AcidentePassoDois"].acao.value = "INSERIRLOCALESAO";		
			document.forms["AcidentePassoDois"].destino.value = "";		
			document.forms["AcidentePassoDois"].action     = "/smatWeb/cadastroacidente/AcidentePassoDois.do";			
			document.forms["AcidentePassoDois"].submit();			
		}
		
		function removerLocalLesao(index){
			document.forms["AcidentePassoDois"].acao.value = "EXCLUIRLOCALLESAO";		
			document.forms["AcidentePassoDois"].index.value   = index;		
			document.forms["AcidentePassoDois"].destino.value = "";		
			document.forms["AcidentePassoDois"].action        = "/smatWeb/cadastroacidente/AcidentePassoDois.do";			
			document.forms["AcidentePassoDois"].submit();				
		}
		
		function pesquisarEmpresa(){
			document.forms["AcidentePassoDois"].acao.value = "PESQUISAR";		
			document.forms["AcidentePassoDois"].destino.value = "PESQUISAR";		
			document.forms["AcidentePassoDois"].action        = "/smatWeb/cadastroacidente/AcidentePassoDois.do";			
			document.forms["AcidentePassoDois"].submit();			
		}
				
</script>
<SCRIPT src="../js/validacoes.js"></SCRIPT>
</HEAD>
<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="/cadastroacidente/AcidentePassoDois" method="POST">

<!-- Caracteres de controle INICIO -->
<html:hidden property="acao" />
<html:hidden property="destino" />
<html:hidden property="paginaAtual" />
<!-- Caracteres de controle FIM -->

<html:hidden property="acidente" />
<html:hidden property="empresaTerceira" />
<html:hidden property="index" />
<html:errors/>
<table border="0">
	<TR>
		<TH align="left" nowrap="nowrap" colspan="6">
			Acidente ou Doença
		</TH>
	</TR>
	<TR>
		<TD align="left" nowrap="nowrap">		
			<LABEL>Horas Trabalhadas</LABEL>
		</TD>		
		<TD align="left" nowrap="nowrap" colspan="5">
			<html:text property="horasTrabalhadas" size="4" maxlength="4" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="retiraCaracteresAlfabeticos(this)" />		
		</TD>	
	</tr>
	<tr>
		<TD align="left" nowrap="nowrap">
			<LABEL>Data do acidente</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap">
			<html:text property="dataAcidente" size="12" maxlength="8" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaBarraData(this)" /><font color="red">*</font>
		</TD>	
		<TD align="left" nowrap="nowrap">
			<LABEL>Hora</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap">			
			<html:text property="hora" size="5" maxlength="4" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="coloca2PontoHora(this)" /><font color="red">*</font>
		</TD>			
	</TR>
	<TR>
		<TD align="left" nowrap="nowrap">
			<LABEL>Tipo de acidente</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap"  colspan="5">			
			<html:select property="tipoAcidente" styleClass="SELECT" >
				<html:option value="">-- Tipo acidente --</html:option>
				<logic:present name="colTipoAcidente">
				<html:options 
					collection="colTipoAcidente" 
					name="tipoAcidente"
					labelName="nome" 
					labelProperty="nome" 
					property="tipoAcidente" />			
				</logic:present>
			</html:select><font color="red">*</font>
		</TD>
	</TR>	
	<TR>
		<TD align="left" nowrap="nowrap">
			<LABEL>Local do acidente</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap"   colspan="5" >			
			<html:select property="tipoLocalAcidente" styleClass="SELECT">
				<html:option value="">-- Tipo de local --</html:option>
				<logic:present name="colTipoLocalAcidente">
				<html:options 
					collection="colTipoLocalAcidente" 
					name="tipoLocalAcidente"
					labelName="nome" 
					labelProperty="nome" 
					property="tipoLocalAcidente" />			
				</logic:present>
			</html:select><font color="red">*</font>
		</TD>		
	</TR>		
	<TR>
		<TD align="left" nowrap="nowrap">
			<LABEL>Ultimo dia Trabalhado</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap">
			<html:text property="dataUltimodiaTrab" size="12" maxlength="8" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaBarraData(this)" />
		</TD>	
		<TD align="left" nowrap="nowrap">
			<LABEL>Distrito de saúde</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap"  colspan="3">
			<html:text property="distritoSaude" size="10" maxlength="10" styleClass="TEXT" />
		</TD>	
	</TR>
	<TR>				
		<TD align="left" nowrap="nowrap">
			<LABEL>Descrição do local</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap"   colspan="5" >
			<html:textarea property="descricaoLocal" cols="80" rows="3" styleClass="TEXTAREA">
			</html:textarea>
		</TD>		
	</TR>	
	<tr>
		<TD align="left" nowrap="nowrap">
			<LABEL>Empresa terceira</LABEL>
		</td>
		<td align="left" nowrap="nowrap"   colspan="5"  >
			<html:text property="documentoEmpresaTerceira" readonly="true" size="22" maxlength="25" styleClass="TEXTDISABLE" />			
			<html:text property="razaoSocialEmpresaterceira" readonly="true" size="38" maxlength="80" styleClass="TEXTDISABLE" />
			<html:button property="pesquisar" onclick="pesquisarEmpresa()" styleClass="BOTAO">PESQUISAR</html:button>						
		</td>
	</tr>	
	<tr>
		<td  align="left" nowrap="nowrap" >
			<LABEL>Estado</LABEL>
		</td>
		<td  align="left" nowrap="nowrap"   colspan="5"  >
			<html:select property="estadoAcidente" onchange="refresh()" styleClass="SELECT">
				<html:option value=""> -- Estado -- </html:option>
				<logic:present name="colEstado">				
				<html:options 
					collection="colEstado" 
					name="estado"
					labelName="nome" 
					labelProperty="nome" 
					property="estado" />	
				</logic:present>					
			</html:select><font color="red">*</font>
		</TD>
	</tr>	
	<tr>		
		<TD align="left" nowrap="nowrap">
			<LABEL>Município</LABEL>
		</td>
		<td  align="left" nowrap="nowrap"   colspan="5" >			
			<html:select property="municipioAcidente" styleClass="SELECT">
			<html:option value=""> -- Municipio -- </html:option>
			<logic:present name="colMunicipioAcidente">			
				<html:options 
					collection="colMunicipioAcidente" 
					name="municipio"
					labelName="nome" 
					labelProperty="nome" 
					property="municipio" />	
			</logic:present>
			</html:select><font color="red">*</font>					
		</td>
	</tr>		
	<tr>
		<td align="left" nowrap="nowrap">
			<LABEL>Local da lesão</LABEL>
		</td>
		<td  align="left" nowrap="nowrap"   colspan="5" >
			<html:select property="localLesaoPai" onchange="refresh()" styleClass="SELECT">			
				<html:option value=""> -- Local da Lesão -- </html:option>			
				<logic:present name="colLocalLesaoPai">				
				<html:options 
					collection="colLocalLesaoPai" 
					name="localLesao"
					labelName="nome" 
					labelProperty="nome" 
					property="localLesao" />	
				</logic:present>					
			</html:select><font color="red">*</font>
		</td>
	</tr>
	<tr>
		<td align="left" nowrap="nowrap">
			<LABEL>Parte do corpo</LABEL>
		</td>
		<td  align="left" nowrap="nowrap">			
			<html:select property="localLesao" styleClass="SELECT">
				<html:option value=""> -- Parte do Corpo-- </html:option>						
				<logic:present name="colLocalLesao">				
				<html:options 
					collection="colLocalLesao" 
					name="localLesao"
					labelName="nome" 
					labelProperty="nome" 
					property="localLesao" />	
				</logic:present>					
			</html:select><font color="red">*</font>
		</td>		
		<td  align="left" nowrap="nowrap"    colspan="4" >				
			<html:button property="inserir" onclick="inserirLocalLesao()" styleClass="BOTAO" >INSERIR</html:button>
		</td>
	</tr>	
	<logic:present name="vLocalLesaoAcidente" >	
	<tr>
		<TD></TD>
		<td align="left" nowrap="nowrap" colspan="5">
			<table border="1" bordercolor="#666666" width="100%">
			<tr>
				<th colspan="2"  bgcolor="#C0C0C0">Locais da lesão selecionados</th>
			</tr>
			<logic:iterate id="item" name="vLocalLesaoAcidente"> 	
			<tr>
				<td>
					<LABEL><bean:write name="item" property="nomeLocalLesao"/></LABEL>
				</td>
				<td>
					<a href='javascript:removerLocalLesao(<bean:write name="item" property="index"/>)'>					
						excluir
					</a>
				</td>				
			</tr>
			</logic:iterate>									
			</table>
		</td>
	</tr>
	</logic:present>				
	<tr>
		<td align="left" nowrap="nowrap">
			<LABEL>Causa do acidente</LABEL>
		</td>
		<td align="left"   colspan="5"  >
			<html:select property="agenteCausadorVo" onchange="refresh()" styleClass="SELECT">		
				<html:option value=""> -- Tipo causa-- </html:option>										
				<logic:present name="colAgenteCausadorVo">			
				<html:options 
					collection="colAgenteCausadorVo" 
					name="agenteCausador"
					labelName="nome" 
					labelProperty="nome" 
					property="agenteCausador" />	
				</logic:present>								
			</html:select><font color="red">*</font>
		</td>
	</tr>
	<tr>
		<TD  align="left" nowrap="nowrap">
			<LABEL>Tipo de agente causador</LABEL>
		</TD>
		<td  align="left" nowrap="nowrap"   colspan="5"  >
			<html:select property="agenteCausadorPai" onchange="refresh()" styleClass="SELECT">
			<html:option value=""> -- Tipo de agente Causador-- </html:option>			
			<logic:present name="colAgenteCausadorPai">												
				<html:options 
					collection="colAgenteCausadorPai" 
					name="agenteCausador"
					labelName="nome" 
					labelProperty="nome" 
					property="agenteCausador" />	
			</logic:present>								
			</html:select><font color="red">*</font>
		</td>
	</tr>	
	<tr>
		<TD align="left" nowrap="nowrap">
			<LABEL>Agente causador</LABEL>
		</TD>	
		<td align="left" nowrap="nowrap"   colspan="5"  >
			<html:select property="agenteCausador" styleClass="SELECT">
				<html:option value=""> -- Agente Causador-- </html:option>															
				<logic:present name="colAgenteCausador">						
				<html:options 
					collection="colAgenteCausador" 
					name="agenteCausador"
					labelName="nome" 
					labelProperty="nome" 
					property="agenteCausador" />	
				</logic:present>								
			</html:select><font color="red">*</font>
		</td>
	</tr>		
	<TR>
		<TD align="left" nowrap="nowrap">
			<LABEL>Descrição da<br>situação<br>geradora</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap"   colspan="5"  >
			<html:textarea property="descricaoSituacaoGeradora" cols="80" rows="3" styleClass="TEXTAREA">
			</html:textarea>
		</TD>		
	</TR>		
	<tr>
		<td align="left" nowrap="nowrap">
			<LABEL>Registro policial</LABEL>
		</td>
		<td align="left" nowrap="nowrap" colspan="5" >
			<html:select property="registroPolicial" styleClass="SELECT">
				<html:option value="">-- Registro policial --</html:option>
				<html:option value="S">Sim</html:option>
				<html:option value="N">Não</html:option>
				<html:option value="X">Não Informado</html:option>							
			</html:select><font color="red">*</font>
		</TD>	
</tr>
<tr>		
		<TD align="left" nowrap="nowrap">
			<LABEL>Houve óbito</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap" colspan="5"  >			
			<html:select property="obito" styleClass="SELECT">
				<html:option value="">-- Óbito --</html:option>						
				<html:option value="S">Sim</html:option>
				<html:option value="N">Não</html:option>
				<html:option value="X">Não Informado</html:option>											
			</html:select><font color="red">*</font>
		</td>		
</tr>
<tr>
		<TD align="left" nowrap="nowrap">
			<LABEL>houve amputação</LABEL>
		</TD>	
		<TD align="left" nowrap="nowrap" colspan="5" >			
			<html:select property="amputacao" styleClass="SELECT">
				<html:option value="">-- Amputação --</html:option>			
				<html:option value="S">Sim</html:option>
				<html:option value="N">Não</html:option>
				<html:option value="X">Não Informado</html:option>											
			</html:select><font color="red">*</font>
		</TD>
	</tr>			
</table>
<table align="center">
	<tr>
		<td>
			<html:button property="avancar" onclick="voltarForm()" styleClass="BOTAO">VOLTAR</html:button>&nbsp;&nbsp;&nbsp;&nbsp;
			<html:button property="avancar" onclick="avancarForm()" styleClass="BOTAO">AVANÇAR</html:button>			
		</td>	
	</tr>
</table>
</html:form>
</body>
</html:html>
