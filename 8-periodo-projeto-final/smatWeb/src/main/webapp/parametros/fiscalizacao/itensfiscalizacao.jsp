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
		<SCRIPT>
		
			function preencheForm(itemFiscalizacao,nome){
				document.forms["ItemFiscalizacao"].nome.value             = nome;				
				document.forms["ItemFiscalizacao"].itemFiscalizacao.value = itemFiscalizacao;				
			}
			
			function gravar(){
				document.forms["ItemFiscalizacao"].acao.value = "GRAVAR";
				document.forms["ItemFiscalizacao"].destino.value = "";
				document.forms["ItemFiscalizacao"].action     = "./ItemFiscalizacao.do";			
				document.forms["ItemFiscalizacao"].submit();					
			}
			
			function limpar(){
				document.forms["ItemFiscalizacao"].nome.value             = "";				
				document.forms["ItemFiscalizacao"].itemFiscalizacao.value = 0;			
			}
			
			function excluir(){
				document.forms["ItemFiscalizacao"].acao.value = "EXCLUIR";
				document.forms["ItemFiscalizacao"].destino.value = "";
				document.forms["ItemFiscalizacao"].action     = "./ItemFiscalizacao.do";			
				document.forms["ItemFiscalizacao"].submit();			
			}			
		</SCRIPT>
	</head>

	<html:form action="parametros/fiscalizacao/ItemFiscalizacao" focus="nome">
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="itemFiscalizacao" />
	
	<html:errors />	
		
	<body  vlink="#666666" alink="#666666" link="#666666">
	<TABLE border="0" width="100%">
		<TBODY>
			<TR>
				<TD colspan="2" align="center">
					<H3>Cadastro de Ítens de fiscalização</H3>
				</TD>
			</TR>
			<TR>
				<TD width="178" colspan="2">&nbsp; </TD></TR>
			<TR>
				<TD width="178"><LABEL>Nome</LABEL></TD>
				<TD width="821">
					<html:text property="nome" size="20" maxlength="20" styleClass="TEXT" /><font color="red">*</font>
				</TD>
			</TR>
			<logic:present name="mensagem">
				<tr>
					<td align="center" colspan="2">
						<h4><bean:write name="mensagem"/></h4>
					</td>
				</tr>			
			</logic:present>			
			<tr>
				<td colspan="2" align="center">					
					<html:button property="btGravar" 	value="GRAVAR"  onclick="gravar()" styleClass="BOTAO" />
					<html:button property="btLimpar" 	value="LIMPAR"  onclick="limpar()" styleClass="BOTAO"/>
					<html:button property="btExcluir" 	value="EXCLUIR" onclick="excluir()" styleClass="BOTAO"/>										
				</td>				
			</tr>			
		</TBODY>
	</TABLE>
	<BR>
	<logic:present name="colItemFiscalizacao">
	<TABLE border="1" width="100%"  bordercolor="#666666">
			<TBODY>
				<TR>
					<TH colspan="2" bgcolor="#C0C0C0">Itens cadastrados</TH>
				</TR>
				<TR>
					<TH width="10" bgcolor="#C0C0C0">Nº</TD>
					<TH bgcolor="#C0C0C0">Nome</TH>
				</TR>
				<logic:iterate id="colItem" name="colItemFiscalizacao">
				<TR>
					<TD width="10">
						<a href="javascript:preencheForm('	<bean:write name="colItem" property="itemFiscalizacao"/>,
															<bean:write name="colItem" property="nome"/>')">								
							<bean:write name="colItem" property="itemFiscalizacao"/>
						</a>						
					</TD>
					<TD>
						<a href="javascript:preencheForm(	<bean:write name="colItem" property="itemFiscalizacao"/>,
															'<bean:write name="colItem" property="nome"/>')">													
							<bean:write name="colItem" property="nome"/>					
						</a>
					</TD>
				</TR>				
				</logic:iterate>				
			</TBODY>
	</TABLE>
	</logic:present>	
	</BODY>
	</html:form>
</html:html>