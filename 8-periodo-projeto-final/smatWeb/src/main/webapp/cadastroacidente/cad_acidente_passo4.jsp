
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
			document.forms["AcidentePassoQuatro"].acao.value = "LISTAR";
			document.forms["AcidentePassoQuatro"].destino.value = "";					
			document.forms["AcidentePassoQuatro"].action     = "./AcidentePassoQuatro.do";			
			document.forms["AcidentePassoQuatro"].submit();
		}
		function avancarForm(){
			document.forms["AcidentePassoQuatro"].acao.value    = "AVANCAR";			
			document.forms["AcidentePassoQuatro"].destino.value = "AVANCAR";		
			document.forms["AcidentePassoQuatro"].action        = "./AcidentePassoQuatro.do";			
			document.forms["AcidentePassoQuatro"].submit();		
		}
				
		function voltarForm(){
			document.forms["AcidentePassoQuatro"].acao.value    = "VOLTAR";					
			document.forms["AcidentePassoQuatro"].destino.value = "VOLTAR";		
			document.forms["AcidentePassoQuatro"].action     = "./AcidentePassoQuatro.do";			
			document.forms["AcidentePassoQuatro"].submit();		
		}		
</script>
<SCRIPT src="../js/validacoes.js"></SCRIPT>
</HEAD>

<html:form action="/cadastroacidente/AcidentePassoQuatro" method="POST">
<html:hidden property="acao" />
<html:hidden property="acidente" />
<html:hidden property="medico" />
<html:hidden property="destino" />
<html:errors/>
<table border="0">
<TR>
	<TH align="left" colspan="4" >
		Atestado médico
	</TH>
</TR>		
<tr>
	<TD>
		<LABEL>Data</LABEL> 
	</TD>
	<TD>		
		<html:text property="dataAtestado" size="12" maxlength="8"  styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaBarraData(this)"  />
	</TD>
	<TD>
		<LABEL>hora</LABEL>
	</TD>
	<TD>		
		<html:text property="horaAtestado" size="6" maxlength="4"  styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="coloca2PontoHora(this)" />
	</TD>
</tr>
<TR>
	<TD>
		<LABEL>Local atendimento</LABEL>
	</TD>
	<TD align="left" colspan="3">
		<html:select property="localAtendimento" styleClass="SELECT">
		<html:option value="">-- Local atendimento --</html:option>
		<logic:present name="colLocalAtendimento">			
			<html:options 
				collection="colLocalAtendimento" 
				name="localAtendimento"
				labelName="nome" 
				labelProperty="nome" 
				property="localAtendimento" />	
		</logic:present>					
		</html:select>
	</TD>	
</TR>
<tr>
	<TD>
		<LABEL>houve internação</LABEL>
	</TD>
	<td align="left" colspan="3">
		<html:select property="internacao" styleClass="SELECT">
			<html:option value="">-- Internação --</html:option>		
			<html:option value="S">Sim</html:option>
			<html:option value="N">Não</html:option>
			<html:option value="X">Não Informado</html:option>											
		</html:select><font color="red">*</font>
	</td>
</tr>
<tr>
	<TD>
		<LABEL>Houve afastamento do trabalho</LABEL>
	</TD>	
	<td align="left" colspan="3">
		<html:select property="afastamento" styleClass="SELECT">
			<html:option value="">-- afastamento --</html:option>				
			<html:option value="S">Sim</html:option>
			<html:option value="N">Não</html:option>
			<html:option value="X">Não Informado</html:option>											
		</html:select><font color="red">*</font>
	</td>
</tr>
<tr>
	<TD>
		<LABEL>Duração tratamento</LABEL>
	</TD>
	<td align="left" colspan="3" >
		<html:text property="duracaoTratamento" size="4" maxlength="4" styleClass="TEXT" />
	</td>
</tr>
<tr>
	<TD>
		<LABEL>Natureza da lesão</LABEL>
	</TD>
	<td  align="left" colspan="3"  >
		<html:textarea property="descNaturezaLesao" cols="80" rows="3" styleClass="TEXTAREA">
		</html:textarea>
	</td>
</tr>
<tr>
	<td><LABEL>Diagnóstico</LABEL></td>
	<td  align="left" colspan="3" >
		<html:select property="diagnostico" styleClass="SELECT">
		<html:option value=""> -- Diagnóstico -- </html:option>
		<logic:present name="colDiagnostico">			
			<html:options 
				collection="colDiagnostico" 
				name="diagnostico"
				labelName="nome" 
				labelProperty="nome" 
				property="diagnostico" />	
		</logic:present>					
		</html:select><font color="red">*</font>
	</td>
</tr>
<tr>
	<TD>
		<LABEL>Descrição diagnostico</LABEL>
	</TD>
	<td  align="left" colspan="3"  >
		<html:textarea property="descricaoDiagnostico" cols="80" rows="3" styleClass="TEXTAREA">
		</html:textarea>
	</td>
</tr>
<tr>
	<TD>
		<LABEL>Observações</LABEL>
	</TD>
	<td  align="left" colspan="3"  >
		<html:textarea property="observacoes" cols="80" rows="3" styleClass="TEXTAREA">
		</html:textarea>
	</td>
</tr>
<tr>
	<TD>
		<LABEL>CRM</LABEL>
	</TD>
	<td  align="left">
		<html:text property="crm" size="5" maxlength="5" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="retiraCaracteresAlfabeticos(this)" />
	</TD>
	<TD>
		<LABEL>UF</LABEL>
	</TD>
	<TD align="left">		
		<html:select property="ufCRM" styleClass="SELECT">
		<html:option value="">-- UF --</html:option>				
		<logic:present name="colEstado">			
			<html:options 
				collection="colEstado" 
				name="estado"
				labelName="sigla" 
				labelProperty="sigla" 
				property="estado" />	
		</logic:present>					
		</html:select>
	</td>	
</tr>
<tr>
	<TD>
		<LABEL>Médico</LABEL>
	</TD>
	<td  align="left" colspan="3" >
		<html:text property="medicoNome" size="60" maxlength="60" styleClass="TEXT" />
	</td>
</tr>
<TR>
	<TH  align="left" colspan="4" >
		Fonte dos dados do acidente
	</TH>
</TR>		
<TR>
	<TD>
		<LABEL>Fonte</LABEL>
	</TD>
	<TD  align="left" colspan="3">
		<html:select property="fonte" styleClass="SELECT" >
		<html:option value="">-- Fonte --</html:option>				
		<logic:present name="colFonte">			
			<html:options 
				collection="colFonte" 
				name="fonte"
				labelName="nome" 
				labelProperty="nome" 
				property="fonte" />	
		</logic:present>			
		</html:select><font color="red">*</font>
	</TD>	
</TR>	
<TR>
	<TD>
		<LABEL>Numero do documento</LABEL>
	</TD>
	<TD>
		<html:text property="numDocFonte" size="25" maxlength="25" styleClass="TEXT"/><font color="red">*</font>
	</TD>
	<TD>
		<LABEL>Data emissão</LABEL>
	</TD>
	<TD align="left" >		
		<html:text property="dataEmissaoFonte" size="12" maxlength="8" styleClass="TEXT"  onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaBarraData(this)" /><font color="red">*</font>
	</TD>	
</TR>
</table>
<table align="center">
	<tr>
		<td>
			<html:button property="voltar"  onclick="voltarForm()" styleClass="BOTAO">VOLTAR</html:button>&nbsp;&nbsp;&nbsp;&nbsp;		
			<html:button property="avancar" onclick="avancarForm()" styleClass="BOTAO">AVANCAR</html:button>			
		</td>	
	</tr>
</table>
</html:form>
</html:html>
