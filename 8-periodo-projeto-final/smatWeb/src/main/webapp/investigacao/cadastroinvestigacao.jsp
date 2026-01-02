
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>
<HEAD>

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<SCRIPT>


		function formRetornar(){
			document.forms["CadastroInvestigacao"].acao.value = "RETORNAR";
			document.forms["CadastroInvestigacao"].action     = "/smatWeb/investigacao/CadastroInvestigacao.do";
			document.forms["CadastroInvestigacao"].submit();
		}

		function formGravar(){
			document.forms["CadastroInvestigacao"].acao.value = "GRAVAR";
			document.forms["CadastroInvestigacao"].action     = "/smatWeb/investigacao/CadastroInvestigacao.do";			
			document.forms["CadastroInvestigacao"].submit();
		}

		function formDetalhes(){
			document.forms["CadastroInvestigacao"].acao.value = "DETALHES";
			document.forms["CadastroInvestigacao"].action     = "/smatWeb/investigacao/CadastroInvestigacao.do";			
			document.forms["CadastroInvestigacao"].submit();
		}

		function formVisualizarAcidente(){

			var t, l, page, altura;
			var w = screen.availWidth;
			var h = screen.availHeight;
			var largura = 720;
			l = (w - largura) / 2;
			
			altura = 300;
			t = (h - altura ) / 2;		
		
			open("/smatWeb/cadastroacidente/VisualizaAcidente.do", "secondwindow", "scrollbars=yes, top=" + t + ", left=" + l + ", width=" + largura + ", height=" + altura);
		}


		function formExcluir(){
			document.forms["CadastroInvestigacao"].acao.value = "EXCLUIR";
			document.forms["CadastroInvestigacao"].action     = "/smatWeb/investigacao/CadastroInvestigacao.do";			
			document.forms["CadastroInvestigacao"].submit();
		}

		function formFinalizar(){
			document.forms["CadastroInvestigacao"].acao.value = "FINALIZAR";
			document.forms["CadastroInvestigacao"].action     = "/smatWeb/investigacao/CadastroInvestigacao.do";			
			document.forms["CadastroInvestigacao"].submit();
		}
</SCRIPT>
<TITLE></TITLE>
</HEAD>

<BODY>
<html:form action="/investigacao/CadastroInvestigacao">
<html:hidden property="acao" value="LISTAR"/>
<html:hidden property="numInvestigacao" />
<html:hidden property="dataAbertura" />
<html:hidden property="dataFinalizacao"/>
<html:hidden property="destino"/>
<html:errors/>
<TABLE border=0>
		<tr>
			<TH colspan="3" align="center">
				<H3>Cadastro de Investigação</H3>
			<TH/>
		</tr>	
	<logic:present name="numInvestigacao">
		<TR>
			<TD width="110">
				<LABEL>Investigação nº</LABEL>
			</TD>
			<TD colspan="2">
				<LABEL><bean:write name="numInvestigacao"/></LABEL>
			</TD>
		</TR>
		<logic:present name="dataAbertura">
			<TR>
				<TD width="110">
					<LABEL>Data de abertura</LABEL>
				</TD>
				<TD>
					<LABEL>
							<bean:write name="dataAbertura"/>
					</LABEL>
				</TD>
				<TD>				
					<logic:present name="dataFinalizacao">				
						<LABEL>Data de finalização&nbsp;&nbsp;&nbsp;
							<bean:write name="dataFinalizacao"/>
						</LABEL>
					</logic:present>
					&nbsp;
				</TD>
			</TR>
		</logic:present>
	</logic:present>
	<TR>
		<TD width="110">
			<LABEL>Acidente nº</LABEL>
		</TD>
		<TD>
			<LABEL><bean:write name="objAcidente" property="acidente"/></LABEL>
		</TD>
		<TD>
			<LABEL>Data&nbsp;&nbsp;&nbsp;<bean:write name="objAcidente" property="dataAcidente"/>&nbsp;<bean:write name="objAcidente" property="hora"/></LABEL>
		</TD>		
	</TR>
	<logic:present name="objAcidente" property="razaoSocial">
		<TR>
			<TD width="110">
				<LABEL>Empregador</LABEL>
			</TD>
			<TD colspan="2">
				<LABEL><bean:write name="objAcidente" property="razaoSocial"/></LABEL>
			</TD>
		</TR>
	</logic:present>
	<TR>
		<TD width="110">
			<LABEL>Acidentado</LABEL>
		</TD>
		<TD colspan="2">
			<LABEL><bean:write name="objAcidente" property="nome"/></LABEL>
		</TD>
	</TR>
	<TR>
		<TD width="110">
			<LABEL>Agente responsável</LABEL>
		</TD>
		<TD colspan="2">
			<html:select property="agenteSaude" styleClass="SELECT">
				<html:option value="">  - Agente de saúde - </html:option>
				<logic:present name="colAgenteSaude">
				<html:options 
					collection="colAgenteSaude" 
					name="agenteSaude"
					labelName="nome" 
					labelProperty="nome" 
					property="agenteSaude" />			
				</logic:present>
			</html:select><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD  width="110">
			<LABEL>Motivo</LABEL>
		</TD>
		<TD colspan="2">
			<html:text property="motivo" size="80" maxlength="100" styleClass="TEXT"/><font color="red">*</font>
		</TD>
	</TR>
	<TR>
		<TD width="110">
			<LABEL>Observações gerais</LABEL>
		</TD>
		<TD colspan="2">
				<html:textarea cols="82" rows="5" property="obsGerais" styleClass="TEXTAREA">
				</html:textarea>
		</TD>
	</TR>
	<logic:present name="erroBanco">
		<TR>
			<TH colspan="3">
				<H4><bean:write  name="erroBanco" /></H4>
			</TH>
		</TR>
	</logic:present>	
	<TR>
		<TD colspan="3" align="center">
			<logic:present name="destino">
				<html:button property="btRetornar"  onclick="formRetornar()" styleClass="BOTAO" >RETORNAR</html:button>&nbsp;&nbsp;&nbsp;		
			</logic:present>
			<html:button property="btVisualizarAcidente"   onclick="formVisualizarAcidente()" styleClass="BOTAO" >ACIDENTE</html:button>&nbsp;&nbsp;&nbsp;	
			<logic:notPresent name="dataFinalizacao">			
				<html:button property="btGravar"   onclick="formGravar()" styleClass="BOTAO" >GRAVAR</html:button>&nbsp;&nbsp;&nbsp;
			</logic:notPresent>	
		</td>	
	</tr>
	<tr>	
		<td colspan="3" align="center">
			<logic:present name="numInvestigacao">
				<html:button property="btDetalhes"   onclick="formDetalhes()" styleClass="BOTAO" >DETALHES</html:button>&nbsp;&nbsp;&nbsp;
			</logic:present>								
			<logic:present name="numInvestigacao">
				<logic:notPresent name="dataFinalizacao">
					<html:button property="btCancelar"   onclick="formExcluir()" styleClass="BOTAO" >EXCLUIR</html:button>&nbsp;&nbsp;&nbsp;
					<html:button property="btFinalizar"   onclick="formFinalizar()" styleClass="BOTAO" >FINALIZAR</html:button>
				</logic:notPresent>
			</logic:present>	
		</TD>		
	</TR>
</TABLE>
</html:form>
</BODY>
</html:html>