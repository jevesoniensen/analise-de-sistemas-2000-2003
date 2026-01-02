<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../../theme/Master.css" rel="stylesheet" type="text/css">

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<html:html>

	<head>
		<SCRIPT>
				function preencheForm(localLesao){
					document.forms["LocaisLesaoForm"].acao.value = "PREENCHEFORM";
					document.forms["LocaisLesaoForm"].destino.value = "";
					document.forms["LocaisLesaoForm"].localLesao.value = localLesao;
					document.forms["LocaisLesaoForm"].action     = "/smatWeb/parametros/acidente/LocaisLesao.do";			
					document.forms["LocaisLesaoForm"].submit();
				}	
				
				function refresh(){
					document.forms["LocaisLesaoForm"].acao.value = "LISTAR";
					document.forms["LocaisLesaoForm"].destino.value = "";
					document.forms["LocaisLesaoForm"].action     = "/smatWeb/parametros/acidente/LocaisLesao.do";			
					document.forms["LocaisLesaoForm"].submit();
				}			
				
				function gravar(){
					document.forms["LocaisLesaoForm"].acao.value = "GRAVAR";
					document.forms["LocaisLesaoForm"].destino.value = "";
					document.forms["LocaisLesaoForm"].action     = "/smatWeb/parametros/acidente/LocaisLesao.do";			
					document.forms["LocaisLesaoForm"].submit();					
				}

				function excluir(){
					document.forms["LocaisLesaoForm"].acao.value = "EXCLUIR";
					document.forms["LocaisLesaoForm"].destino.value = "";
					document.forms["LocaisLesaoForm"].action     = "/smatWeb/parametros/acidente/LocaisLesao.do";			
					document.forms["LocaisLesaoForm"].submit();					
				}
								
				function limpar(){
					document.forms["LocaisLesaoForm"].localLesao.value = 0;
					document.forms["LocaisLesaoForm"].localLesaoPai.value = 0;		
					document.forms["LocaisLesaoForm"].nome.value = "";			
					document.forms["LocaisLesaoForm"].localLesaoPaiFalso.value = 0;				
					refresh();
				}				
		</SCRIPT>
	</head>

<html:form action="parametros/acidente/LocaisLesao">
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="localLesao" />
	
<body  vlink="#666666" alink="#666666" link="#666666">
<html:errors/>
<table width="100%" align="center">	
<tr>
	<td>
	<TABLE width="100%">
		<TBODY>
		<TR>
			<TD colspan="2" align="center">
				<H3>Cadastro de locais de lesão</H3>
			</TD>
		</TR>
		<TR>
			<TD align="left">
				<LABEL>Nível</LABEL>
			</TD>
			<TD align="left">
				<logic:present name="localLesaoTeste">
				<logic:notEqual name="localLesaoTeste" value="0">
					<html:hidden property="localLesaoPai"/>
					<html:select property="localLesaoPaiFalso" onchange="refresh()" styleClass="TEXTDISABLE" disabled="true">			
						<html:option value="0"> -- Nível 1 -- </html:option>			
						<logic:present name="colLocalLesaoPai">				
						<html:options 
							collection="colLocalLesaoPai" 
							name="localLesao"
							labelName="nome" 
							labelProperty="nome" 
							property="localLesao" />	
						</logic:present>					
					</html:select>	
				</logic:notEqual>		
				<logic:equal name="localLesaoTeste" value="0">
					<html:hidden property="localLesaoPaiFalso"/>
					<html:select property="localLesaoPai" onchange="refresh()" styleClass="SELECT">			
						<html:option value=""> -- Nível 1 -- </html:option>			
						<logic:present name="colLocalLesaoPai">				
						<html:options 
							collection="colLocalLesaoPai" 
							name="localLesao"
							labelName="nome" 
							labelProperty="nome" 
							property="localLesao" />	
						</logic:present>					
					</html:select>					
				</logic:equal>
				</logic:present>
				<logic:notPresent name="localLesaoTeste">
					<html:hidden property="localLesaoPaiFalso"/>
					<html:select property="localLesaoPai" onchange="refresh()" styleClass="SELECT">			
						<html:option value=""> -- Nível 1 -- </html:option>			
						<logic:present name="colLocalLesaoPai">				
						<html:options 
							collection="colLocalLesaoPai" 
							name="localLesao"
							labelName="nome" 
							labelProperty="nome" 
							property="localLesao" />	
						</logic:present>
						</html:select>				
				</logic:notPresent>
			</TD>			
		</TR>		
		<TR>
			<TD align="left">
				<LABEL>Nome</LABEL>
			</TD>
			<TD align="left">
				<html:text property="nome" size="80" maxlength="100" styleClass="TEXT"/>
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
			<td colspan="2" align="left">					
				<html:button property="btGravar" 	value="GRAVAR"  onclick="gravar()" styleClass="BOTAO" />
				<html:button property="btLimpar" 	value="LIMPAR"  onclick="limpar()" styleClass="BOTAO"/>
				<html:button property="btExcluir" 	value="EXCLUIR" onclick="excluir()" styleClass="BOTAO"/>										
			</td>				
		</tr>			
	</table>	
	</td>
</tr>
<BR>	
<logic:present name="auxLocalLesao">
<tr>
	<td>	
	<TABLE border="1" width="100%"  bordercolor="#666666" align="center">
		<TR>
			<TH colspan="2" bgcolor="#C0C0C0">Locais de lesão</TH>
		</TR>
		<TR>
			<TH bgcolor="#C0C0C0">Local da lesão</TH>
			<TH bgcolor="#C0C0C0">Principal</TH>
		</TR>
		<logic:iterate id="colItem" name="auxLocalLesao">
		<TR>
			<TD>
				<a href="javascript:preencheForm(<bean:write name="colItem" property="localLesao"/>)">													
					<bean:write name="colItem" property="nomeLocalLesao"/>
				</a>						
			</TD>
			<TD>
				<a href="javascript:preencheForm(<bean:write name="colItem" property="localLesao"/>)">													
						<bean:write name="colItem" property="nomePai"/>					
				</a>&nbsp;
			</TD>
		</TR>				
		</logic:iterate>				
		</TBODY>
	</TABLE>
	</td>
</tr>
</table>
</body>
</logic:present>			
</html:form>
<script>
	
		document.forms["LocaisLesaoForm"].localLesaoPaiFalso.value = document.forms["LocaisLesaoForm"].localLesaoPai.value;
	
</script>
</html:html>