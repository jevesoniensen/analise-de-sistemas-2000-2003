<%@ taglib uri="/WEB-INF/struts-html.tld" 	prefix="html" 	%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" 	prefix="bean" 	%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" 	prefix="logic" 	%>

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<html:html>
<HEAD>
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>Visualiza Relatório</TITLE>
</HEAD>
<BODY>
<logic:present name="objAcidente" >
<table border="1" bordercolor="black" width="100%">
<TR>
	<TH   bgcolor="#C0C0C0" colspan="8" >
		Acidente
	</TH>
</TR>
<TR>
	<TH   bgcolor="#C0C0C0" colspan="8">
		Informações gerais
	</TH>
</TR>
<TR>
	<TD>
		<LABEL>Emitente</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="nomeEmitente" /></FONT>
	</TD>	
</TR>	
<logic:present name="objAcidente" property="razaoSocial">
<logic:notEqual name="objAcidente" property="razaoSocial" value="">
<TR>
	<TD>
		<LABEL>Empregador</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="documento" /> - 
		<bean:write name="objAcidente" property="razaoSocial" /></FONT>
	</TD>	
</TR>
</logic:notEqual>
</logic:present>			
<TR>
	<TH colspan="8"  bgcolor="#C0C0C0">
		Trabalhador
	</TH>
</TR>	
<TR>
	<TD>
		<LABEL>Nome</LABEL>
	</TD>
	<TD colspan="8">
		<FONT><bean:write name="objAcidente" property="nome" /></FONT>
	</TD>	
	</TR>		
<TR>
	<TD>
		<LABEL>Data de nascimento</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="dataNascimento" /></FONT>
	</TD>	
</TR>
<logic:present  name="objAcidente" property="nomeSexo" >	
<TR>
	<TD>
		<LABEL>Sexo</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="nomeSexo" /></FONT>
	</TD>	
</TR>	
</logic:present>
<logic:present name="objAcidente" property="nomeEstadoCivil" >
<TR>
	<TD>
		<LABEL>Estado civil</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="nomeEstadoCivil" /></FONT>
	</TD>	
</TR>	
</logic:present>						
<TR>
	<TD>
		<LABEL>CTPS</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="ctps" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>Serie</LABEL>
	</TD>
	<TD>		
		<FONT><bean:write name="objAcidente" property="serie" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>Emissão</LABEL>				
	</TD>
	<TD>		
		<FONT><bean:write name="objAcidente" property="dataEmissaoCTPS" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>UF</LABEL>
	</TD>
	<TD>		
		<FONT><bean:write name="objAcidente" property="nomeUFCTPS" />&nbsp;</FONT>
	</TD>	
</TR>			
<TR>
	<TD  nowrap="nowrap">
		<LABEL>Remuneração mensal</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="remuneracaoMensal" />&nbsp;</FONT>
	</TD>	
</TR>		
<TR>
	<TD>
		<LABEL>RG</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="rg" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>Emissão</LABEL>
	</TD>
	<TD>		
		<FONT><bean:write name="objAcidente" property="dataEmissaoRG" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>UF</LABEL>
	</TD>
	<TD colspan="5">		
		<FONT><bean:write name="objAcidente" property="nomeUFRG" />&nbsp;</FONT>
	</TD>	
</TR>			
<TR>
	<TD>
		<LABEL>CPF</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="cpf" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>PIS/PASEP/NIT</LABEL>
	</TD>
	<TD colspan="6">				
		<FONT><bean:write name="objAcidente" property="pisPasepNit" />&nbsp;</FONT>
	</TD>	
</TR>				
<TR>
	<TH colspan="8"  bgcolor="#C0C0C0"  >
		Endereço do acidentado
	</TH>
</TR>		
<logic:present name="objAcidente" property="nomeMunicipio">
<TR>
	<TD>
		<LABEL>Estado</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="nomeEstado" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>Municipio</LABEL>
	</TD>
	<TD colspan="6" nowrap="nowrap">		
		<FONT><bean:write name="objAcidente" property="nomeMunicipio" />&nbsp;</FONT>
	</TD>						
</tr>
</logic:present>
<TR>
	<TD>
		<LABEL>Rua</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="rua" />&nbsp;</FONT>
	</TD>	
</TR>		
<TR>
	<TD>
		<LABEL>Bairro</LABEL>
	</TD>
	<TD  colspan="7">
		<FONT><bean:write name="objAcidente" property="bairro" />&nbsp;</FONT>
	</TD>	
</TR>	
<tr>
	<TD>
		<LABEL>Numero</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="numero" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>Complemento</LABEL>
	</TD>
	<TD>		
		<FONT><bean:write name="objAcidente" property="complemento" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>CEP</LABEL>	
	</TD>
	<TD colspan="3" nowrap="nowrap">										
		<FONT><bean:write name="objAcidente" property="cep" />&nbsp;</FONT>
	</TD>						
</tr>		
<tr>
	<TD>
		<LABEL>Telefone</LABEL>
	</TD>
	<TD colspan="7">	
		<FONT><bean:write name="objAcidente" property="ddd" /> - 
		<bean:write name="objAcidente" property="telefone" />&nbsp;</FONT>
	</TD>						
</tr>													
<tr>
	<td><LABEL>Ocupação</LABEL></td>					
	<td>
		<FONT><bean:write name="objAcidente" property="nomeOcupacao"/></FONT>
	</TD>
	<TD>
		<LABEL>Área</LABEL>	
	</TD>
	<TD colspan="6">		
		<FONT><bean:write name="objAcidente" property="nomeArea"/></FONT>
	</td>			
</tr>					
<tr>
	<td><LABEL>Vinculo empregaticio</LABEL></td>					
	<td>
		<FONT><bean:write name="objAcidente" property="nomeVinculoEmpregaticio"/></FONT>
	</TD>
	<TD>
		<LABEL>Aposentado</LABEL>
	</TD>
	<TD colspan="6">		
		<FONT><bean:write name="objAcidente" property="nomeAposentado"/></FONT>
	</td>			
</tr>	
<logic:present name="vTestemunhas" >		
<TR>
	<TH   colspan="8" bgcolor="#C0C0C0">
		Testemunhas
	</TH>
</TR>
<logic:iterate id="item" name="vTestemunhas"> 				
	<tr>
		<th colspan="8" bgcolor="#C0C0C0">
				Testemunha nº <bean:write name="item" property="index"/>
		</th>
	</tr>
	<tr>
		<td>
			<LABEL>Nome</LABEL></td>					
		<td colspan="7">
			<FONT><bean:write name="item" property="nomeTestemunha"/></FONT>
		</td>			
	</tr>
	<tr>
		<TH  colspan="8" bgcolor="#C0C0C0">
			Endereço da Testemunha Nº <bean:write name="item" property="index"/>
		</TH>				
	</tr>
	<logic:present name="item" property="nomeMunicipio">
	<tr>
		<td><LABEL>Estado</LABEL></td>
		<td>
			<FONT><bean:write name="item" property="nomeEstado"/>&nbsp;</FONT>
		</td>
		<td >
			<LABEL>Municipio</LABEL>
		</td>
		<td colspan="6">
			<FONT><bean:write name="item" property="nomeMunicipio"/>&nbsp;</FONT>
		</td>			
	</tr>
	</logic:present>		
	<logic:present name="item" property="ruaTestemunha">
	<tr>
		<td><LABEL>Rua</LABEL></td>					
		<td colspan="7">
			<FONT><bean:write name="item" property="ruaTestemunha"/>&nbsp;</FONT>
		</td>			
	</tr>		
	</logic:present>
	<logic:present name="item" property="bairroTestemunha">
	<tr>
		<td><LABEL>Bairro</LABEL></td>					
		<td colspan="7">
			<FONT><bean:write name="item" property="bairroTestemunha"/>&nbsp;</FONT>
		</td>			
	</tr>	
	</logic:present>		
	<tr>
		<td><LABEL>Numero</LABEL></td>					
		<td colspan="7">
			<FONT><bean:write name="item" property="numeroTestemunha"/>&nbsp;</FONT>
		</td>			
	</tr>	
	<tr>
		<td><LABEL>Complemento</LABEL></td>
		<td>
			<FONT><bean:write name="item" property="complementoTestemunha"/>&nbsp;</FONT>
		</td>
		<td><LABEL>CEP</LABEL></td>
		<td  colspan="5">
			<FONT><bean:write name="item" property="cepTestemunha"/>&nbsp;</FONT>
		</td>			
	</tr>						
	<tr>
		<td><LABEL>Telefone</LABEL></td>
		<td  colspan="7">
			<FONT><bean:write name="item" property="dddTestemunha"/> - 
			<bean:write name="item" property="telefoneTestemunha"/></FONT>
		</td>
	</tr>					
</logic:iterate>										
</logic:present>
<TR>
	<TH  colspan="8"  bgcolor="#C0C0C0">
		Acidente ou Doença
	</TH>
</TR>
<TR>
	<TD>
		<LABEL>Data do acidente</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="dataAcidente" /></FONT>
	</TD>
	<TD>
		<LABEL>Hora</LABEL>
	</TD>
	<TD colspan="6" >		
		<FONT><bean:write name="objAcidente" property="hora" /></FONT>		
	</TD>		
</TR>											
<TR>
	<TD>
		<LABEL>Horas trabalhadas</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="horasTrabalhadas" />&nbsp;</FONT>
	</TD>	
</TR>			
<TR>
	<TD>
		<LABEL>Tipo de acidente</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="nomeTipoAcidente" />&nbsp;</FONT>
	</TD>	
</TR>		
<TR>
	<TD>
		<LABEL>Data do ultimo dia trabalhado</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="dataUltimodiaTrab" />&nbsp;</FONT>
	</TD>	
</TR>
<TR>
	<TD>
		<LABEL>Tipo de local</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="nomeTipoLocalAcidente" />&nbsp;</FONT>
	</TD>	
</TR>			
<TR>
	<TD>
		<LABEL>Descrição do local</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="descricaoLocal" />&nbsp;</FONT>
	</TD>	
</TR>	
<TR>
	<TD>
		<LABEL>Empresa terceira</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="documentoEmpresaTerceira" /> - 
		<bean:write name="objAcidente" property="razaoSocialEmpresaterceira" />&nbsp;</FONT>
	</TD>	
</TR>	
<TR>
	<TD>
		<LABEL>Estado do acidente</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="nomeEstadoAcidente" />&nbsp;</FONT>
	</TD>	
</TR>	
<TR>
	<TD>
		<LABEL>Municipio do acidente</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="nomeMunicipioAcidente" />&nbsp;</FONT>
	</TD>	
</TR>	
<logic:present name="vLocalLesaoAcidente" >		
<logic:iterate id="item1" name="vLocalLesaoAcidente"> 				
<TR>
	<TD>
		<LABEL>Local lesão <bean:write name="item1" property="index"/>&nbsp;</LABEL>
	</TD>
	<TD colspan="7"  >
		<FONT><bean:write name="item1" property="nomeLocalLesao"/>&nbsp;</FONT>
	</TD>	
</TR>
</logic:iterate>		
</logic:present>
<TR>
	<TD>
		<LABEL>Agente causador</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="nomeAgenteCausador" /></FONT>
	</TD>	
</TR>	
<TR>
	<TD nowrap="nowrap">
		<LABEL>Descrição situação geradora</LABEL>
	</TD>
	<TD colspan="7" >
		<FONT><bean:write name="objAcidente" property="descricaoSituacaoGeradora" />&nbsp;</FONT>
	</TD>	
</TR>	
<TR>
	<TD>
		<LABEL>Houve amputação</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="nomeAmputacao" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>Houve óbito</LABEL>
	</TD>
	<TD>		
		<FONT><bean:write name="objAcidente" property="nomeObito"     />&nbsp;</FONT>
	</TD>
	<TD nowrap="nowrap">
		<LABEL>Registro policial</LABEL>
	</TD>
	<TD colspan="5">		
		<FONT><bean:write name="objAcidente" property="nomeRegistroPolicial" />&nbsp;</FONT>				
	</TD>	
</TR>	
<TR>
	<TD>
		<LABEL>Local atendimento</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="nomeLocalAtendimento" />&nbsp;</FONT>
	</TD>	
</TR>
<TR>
	<TD>
		<LABEL>Data atestado</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="dataAtestado" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>hora</LABEL>
	</TD>
	<TD colspan="5">		
		<FONT><bean:write name="objAcidente" property="horaAtestado"     />&nbsp;</FONT>
	</TD>
</TR>	
<TR>
	<TD>
		<LABEL>Houve afastamento</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="nomeAfastamento" />&nbsp;</FONT>
	</TD>
	<TD>
		<LABEL>Internação</LABEL>
	</TD>
	<TD colspan="5">		
		<FONT><bean:write name="objAcidente" property="nomeInternacao"     />&nbsp;</FONT>
	</TD>
</TR>	
<TR>
	<TD>
		<LABEL>Duração tratamento</LABEL>
	</TD>
	<TD  colspan="7">
		<FONT><bean:write name="objAcidente" property="duracaoTratamento" />&nbsp;</FONT>
	</TD>	
</TR>
<TR>
	<TD>
		<LABEL>Descrição natureza lesão</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="descNaturezaLesao" />&nbsp;</FONT>
	</TD>	
</TR>
<TR>
	<TD>
		<LABEL>Diagnostico</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="nomeDiagnostico" />&nbsp;</FONT>
	</TD>	
</TR>
<TR>
	<TD>
		<LABEL>Observações</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="observacoes" />&nbsp;</FONT>
	</TD>	
</TR>
<logic:present  name="objAcidente" property="medicoNome" >
<logic:notEqual  name="objAcidente" property="medicoNome" value="" >
<TR>
	<TD>
		<LABEL>Médico</LABEL>
	</TD>
	<TD colspan="7">
		<FONT><bean:write name="objAcidente" property="medicoNome" />&nbsp;</FONT>				
	</TD>
</TR>
<TR>
	<TD>
		<LABEL>CRM</LABEL>
	</TD>
	<TD>
		<FONT><bean:write name="objAcidente" property="crm" />&nbsp;</FONT>
	</TD>
	<TD>		
		<LABEL>UF</LABEL>
	</TD>
	<TD colspan="6">		
		<FONT><bean:write name="objAcidente" property="nomeUFCRM" />&nbsp;</FONT>				
	</TD>	
</TR>
</logic:notEqual>
</logic:present>
<TR>
	<TD>
		<LABEL>Font</LABEL>
	</TD>
	<TD  colspan="7">
		<FONT><bean:write name="objAcidente" property="nomeFonte" />&nbsp;</FONT>
	</TD>	
</TR>
<TR>
	<TD>
		<LABEL>Numero do documento da fonte</LABEL>
	</TD>
	<TD  colspan="7">
		<FONT><bean:write name="objAcidente" property="numDocFonte" />&nbsp;</FONT>
	</TD>	
</TR>
<TR>
	<TD>
		<LABEL>Data emissão</LABEL>
	</TD>
	<TD  colspan="7">
		<FONT><bean:write name="objAcidente" property="dataEmissaoFonte" />&nbsp;</FONT>
	</TD>	
</TR>
</table>		
</logic:present>
</BODY>
</html:html>
