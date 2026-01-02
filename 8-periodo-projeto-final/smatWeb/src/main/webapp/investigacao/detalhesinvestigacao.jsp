
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

<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<TITLE></TITLE>
<SCRIPT>
		function formAtualizar(){
			document.forms["DetalhesInvestigacao"].acao.value = "ATUALIZAR";
			document.forms["DetalhesInvestigacao"].action     = "/smatWeb/investigacao/DetalhesInvestigacao.do";
			document.forms["DetalhesInvestigacao"].submit();
		}

		function mostraInvestigacao(inv){
			document.forms["DetalhesInvestigacao"].acao.value = "RETORNAR";
			document.forms["DetalhesInvestigacao"].numInvestigacao.value = inv;
			document.forms["DetalhesInvestigacao"].action     = "/smatWeb/investigacao/DetalhesInvestigacao.do";
			document.forms["DetalhesInvestigacao"].submit();
		}
		
		function formMedidasCorretivas(){
			document.forms["DetalhesInvestigacao"].acao.value = "MEDIDASCORRETIVAS";
			document.forms["DetalhesInvestigacao"].action     = "/smatWeb/investigacao/DetalhesInvestigacao.do";
			document.forms["DetalhesInvestigacao"].submit();
		}

		function formDepoimentos(){
			document.forms["DetalhesInvestigacao"].acao.value = "DEPOIMENTOS";
			document.forms["DetalhesInvestigacao"].action     = "/smatWeb/investigacao/DetalhesInvestigacao.do";
			document.forms["DetalhesInvestigacao"].submit();
		}
</SCRIPT>
</HEAD>
<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="investigacao/DetalhesInvestigacao">
<html:hidden property="acao" value="LISTAR"/>
<html:hidden property="numInvestigacao" />
<table>
<tr>
<td>
	<logic:present name="objInvestigacao">
	<TABLE width="100%" bordercolor="#666666" border="1">	
		<TR>
			<TH colspan="2" bgcolor="#C0C0C0">
				Investigação nº <bean:write name="objInvestigacao" property="investigacao"/>
			</TH>
		</TR>
		<TR>
			<TD width="110">
				<LABEL>Agente responsável</LABEL>
			</TD>
			<TD>
				<LABEL><bean:write name="objInvestigacao" property="nomeAgenteResponsavel"/></LABEL>
			</TD>
		</TR>
		<TR>
			<TD width="110">
				<LABEL>Acidente nº</LABEL>
			</TD>
			<TD>
				<LABEL><bean:write name="objInvestigacao" property="acidente"/></LABEL>
			</TD>
		</TR>
		<TR>
			<TD width="110">
				<LABEL>Data de abertura</LABEL>
			</TD>
			<TD>
				<LABEL><bean:write name="objInvestigacao" property="dataAbertura"/></LABEL>
			</TD>
		</TR>
		<TR>
			<TD width="110">
				<LABEL>Data de finalização</LABEL>
			</TD>
			<TD>
				<LABEL><bean:write name="objInvestigacao" property="dataFinalizacao"/></LABEL>&nbsp;
			</TD>
		</TR>
		<TR>
			<TD width="110">
				<LABEL>Motivo</LABEL>
			</TD>
			<TD>
				<LABEL><bean:write name="objInvestigacao" property="motivo"/></LABEL>
			</TD>
		</TR>
		<TR>
			<TD width="110">
				<LABEL>Observações gerais</LABEL>
			</TD>
			<TD>
				<textarea name="textarea" cols="70" rows="5" readonly="readonly" class="TEXTAREADISABLE"><bean:write name="objInvestigacao" property="obsGerais"/></textarea>
				
			</TD>
		</TR>
		<logic:present name="objInvestigacao" property="auxDepoimento">
			<TR>
				<TH colspan="2" bgcolor="#C0C0C0">
					Depoimentos
				</TH>
			</TR>
			<logic:iterate id="depoimento" name="objInvestigacao" property="auxDepoimento">
				<TR>
					<TD width="110">
						<LABEL>Tipo de testemunha</LABEL>
					</TD>
					<TD>
						<LABEL><bean:write name="depoimento" property="nomeTipoDepoimento"/></LABEL>
					</TD>
				</TR>
				<TR>
					<TD width="110">
						<LABEL>Nome</LABEL>
					</TD>
					<TD>
						<LABEL><bean:write name="depoimento" property="nomePessoa"/></LABEL>
					</TD>
				</TR>
				<TR>
					<TD width="110">
						<LABEL>Data</LABEL>
					</TD>
					<TD>
						<LABEL><bean:write name="depoimento" property="dataHora"/></LABEL>
					</TD>
				</TR>
				<TR>
					<TD width="110">
						<LABEL>Agente causador</LABEL>
					</TD>
					<TD>
						<LABEL><bean:write name="depoimento" property="nomeAgenteCausador"/></LABEL>
					</TD>
				</TR>
				<TR>
					<TD width="110">
						<LABEL>Descrição</LABEL>
					</TD>
					<TD>
						<textarea name="textarea" cols="70" rows="5" readonly="readonly" class="TEXTAREADISABLE"><bean:write name="depoimento" property="descricao"/></textarea>
					</TD>
				</TR>
			</logic:iterate>
		</logic:present>
		<logic:present name="objInvestigacao" property="auxMedidaCorretivaInvestigacao">
			<TR>
				<TH colspan ="2" bgcolor="#C0C0C0">
					Medidas Corretivas
				</TH>
			</TR>
			<logic:iterate id="medida" name="objInvestigacao" property="auxMedidaCorretivaInvestigacao">
				<TR>
					<TD width="110">
						<LABEL>Medida Corretiva</LABEL>
					</TD>
					<TD>
						<LABEL><bean:write name="medida" property="nomeMedidaCorretiva"/></LABEL>
					</TD>
				</TR>
				<TR>
					<TD width="110">
						<LABEL>Prazo (em dias)</LABEL>
					</TD>
					<TD>
						<LABEL><bean:write name="medida" property="prazoDias"/></LABEL>
					</TD>
				</TR>
				<TR>
					<TD width="110">
						<LABEL>Observações</LABEL>
					</TD>
					<TD>
						<LABEL><bean:write name="medida" property="observacao"/></LABEL>
					</TD>
				</TR>
			</logic:iterate>
		</logic:present>
		<TR>
			<TD colspan="2" align="center">
				<logic:notPresent name="objInvestigacao" property="dataFinalizacao">
					<html:button property="btAtualizar"   onclick="formAtualizar()" styleClass="BOTAO" >ATUALIZAR DADOS</html:button>&nbsp;&nbsp;&nbsp;
					<html:button property="btDepoimento"   onclick="formDepoimentos()" styleClass="BOTAO" >DEPOIMENTO</html:button>&nbsp;&nbsp;&nbsp;
					<html:button property="btMedidasCorretivas"   onclick="formMedidasCorretivas()" styleClass="BOTAO" >MEDIDAS CORRETIVAS</html:button>&nbsp;&nbsp;&nbsp;
				</logic:notPresent>&nbsp;
			</TD>
		</TR>
	</TABLE>
</td>
</tr>
<tr>
<td>
	</logic:present>
<BR>
	<TABLE width="100%" bordercolor="#666666" border="1">
		<TR>
			<TH colspan="7" bgcolor="#C0C0C0">
				Investigações
			</TH>
		</TR>
		<TR>
			<TH bgcolor="#C0C0C0">Investigação</TH>
			<TH bgcolor="#C0C0C0">Agente Responsável</TH>
			<TH bgcolor="#C0C0C0">Motivo</TH>
			<TH bgcolor="#C0C0C0">Trabalhador</TH>
			<TH bgcolor="#C0C0C0">Data do acidente</TH>
			<TH bgcolor="#C0C0C0">Data de abertura</TH>
			<TH bgcolor="#C0C0C0">Data de finalização</TH>
		</TR>
	<logic:present name="auxListInvestigacao">
		<logic:iterate id="investigacao" name="auxListInvestigacao">
		<TR>
			<TD>
				<A href="javascript:mostraInvestigacao(<bean:write name="investigacao" property="investigacao"/>)">
					<bean:write name="investigacao" property="investigacao"/>
				</A>
			</TD>
			<TD>
				<A href="javascript:mostraInvestigacao(<bean:write name="investigacao" property="investigacao"/>)">
					<bean:write name="investigacao" property="nomeAgenteSaude"/>
				</A>	
			</TD>
			<TD>
				<A href="javascript:mostraInvestigacao(<bean:write name="investigacao" property="investigacao"/>)">
					<bean:write name="investigacao" property="motivo"/>		
				</A>
			</TD>
			<TD>
				<A href="javascript:mostraInvestigacao(<bean:write name="investigacao" property="investigacao"/>)">
					<bean:write name="investigacao" property="nomeTrabalhador"/>		
				</A>
			</TD>
			<TD>
				<A href="javascript:mostraInvestigacao(<bean:write name="investigacao" property="investigacao"/>)">
					<bean:write name="investigacao" property="dataAcidente"/>
				</A>
			</TD>
			<TD>
				<A href="javascript:mostraInvestigacao(<bean:write name="investigacao" property="investigacao"/>)">
					<bean:write name="investigacao" property="dataAbertura"/>
				</A>
			</TD>
			<TD>
				<A href="javascript:mostraInvestigacao(<bean:write name="investigacao" property="investigacao"/>)">
					<bean:write name="investigacao" property="dataFinalizacao"/>
				</A>&nbsp;
			</TD>
		</TR>
		</logic:iterate>
	</TABLE>
	</logic:present>
</td>
</tr>
</table>	
</html:form>
</BODY>
</html:html>
