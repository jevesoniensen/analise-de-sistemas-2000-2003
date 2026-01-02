
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
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
	<script>	
		function preencheForm(telefoneEmpregador,empregador,descricao,ddd,numero){
			document.forms["TelefoneEmpregadorForm"].elements["empregador"        ].value = empregador;		
			document.forms["TelefoneEmpregadorForm"].elements["telefoneEmpregador"].value = telefoneEmpregador;								
			document.forms["TelefoneEmpregadorForm"].elements["descricao"         ].value = descricao;
			document.forms["TelefoneEmpregadorForm"].elements["ddd"               ].value = ddd;
			document.forms["TelefoneEmpregadorForm"].elements["numero"            ].value = numero;					
			document.forms["TelefoneEmpregadorForm"].elements["acao"              ].value = "LISTAR";			
		}
		
		function formReset(){	
			document.forms["TelefoneEmpregadorForm"].elements["telefoneEmpregador"].value = 0;								
			document.forms["TelefoneEmpregadorForm"].elements["descricao"         ].value = "";
			document.forms["TelefoneEmpregadorForm"].elements["ddd"               ].value = "";
			document.forms["TelefoneEmpregadorForm"].elements["numero"            ].value = "";					
			document.forms["TelefoneEmpregadorForm"].elements["acao"              ].value = "LISTAR";			
		}
	
		function gravarTelefone(){
			document.forms["TelefoneEmpregadorForm"].acao.value = "GRAVAR";
			document.forms["TelefoneEmpregadorForm"].submit();			
		}
	
		function excluirTelefone(){
			document.forms["TelefoneEmpregadorForm"].acao.value = "EXCLUIR";
			document.forms["TelefoneEmpregadorForm"].submit();
		}
	</script>	
	<SCRIPT src="../js/validacoes.js"></SCRIPT>
</head>
<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="/empregadores/TelefoneEmpregador" method="post" focus="descricao">
<html:hidden property="telefoneEmpregador"  />
<html:hidden property="empregador"          />
<html:hidden property="acao" value="LISTAR" />
<table>
	<tr>
		<th colspan="2" align="center">
			<H3><bean:write name="empregadorBean" property="razaoSocial"/></H3>
		</th>
	</tr>
	<tr>
		<td>
			<LABEL>Telefone</LABEL>
		</td>
		<td>
			<html:text property="ddd" size="2" maxlength="2" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="retiraCaracteresAlfabeticos(this)" /><font color="red">*</font>
			<html:text property="numero" size="12" maxlength="8" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaTracoTelefone(this)"/><font color="red">*</font>
		</td>
	</tr>
	<tr>		
		<td>
			<LABEL>Descrição</LABEL>
		</td>
		<td> 
			<html:text property="descricao" size="30" maxlength="255" styleClass="TEXT" /><font color="red">*</font>
		</td>
	</tr>	
	<tr>
		<td colspan="2" align="center">
			<html:button property="gravar" value="GRAVAR" onclick="gravarTelefone()" styleClass="BOTAO"/>&nbsp;&nbsp;&nbsp;				
			<html:button property="limpar"  value="LIMPAR"  onclick="formReset()" styleClass="BOTAO"/>&nbsp;&nbsp;&nbsp;
			<html:button property="excluir" value="EXCLUIR" onclick="excluirTelefone()" styleClass="BOTAO"/>			
		</td>
	</tr>	
</table>
<BR>
				<logic:present name="colTelefoneEmpregador" >
				<table border="1" bordercolor="#666666" width="100%">
				<tr>
					<th  bgcolor="#C0C0C0">Descrição</th>
					<th bgcolor="#C0C0C0">DDD</th>
					<th bgcolor="#C0C0C0">Número</th>									
				</tr>
				<logic:iterate id="item" name="colTelefoneEmpregador"> 	
				<tr>
					<td>
						<a href='javascript:preencheForm(<bean:write name="item" property="telefoneEmpregador"/>,
														 <bean:write name="item" property="keyEmpregador"/>,														 
						                                "<bean:write name="item" property="descricao"/>",
						                                "<bean:write name="item" property="ddd"/>",						                                
						                                "<bean:write name="item" property="numero"/>")'>
							<bean:write name="item" property="descricao"/>
						</a>
					</td>
					<td>
						<a href='javascript:preencheForm(<bean:write name="item" property="telefoneEmpregador"/>,
														 <bean:write name="item" property="keyEmpregador"/>,														 
						                                "<bean:write name="item" property="descricao"/>",
						                                "<bean:write name="item" property="ddd"/>",						                                
						                                "<bean:write name="item" property="numero"/>")'>
					
							<bean:write name="item" property="ddd"/>
						</a>
					</td>
					<td>
						<a href='javascript:preencheForm(<bean:write name="item" property="telefoneEmpregador"/>,
														 <bean:write name="item" property="keyEmpregador"/>,														 
						                                "<bean:write name="item" property="descricao"/>",
						                                "<bean:write name="item" property="ddd"/>",						                                
						                                "<bean:write name="item" property="numero"/>")'>
					
							<bean:write name="item" property="numero"/>
						</a>
					</td>
				</tr>
				</logic:iterate>
				</logic:present>											
				</table>
				<table>
					<tr>
						<td>
							<logic:present name="erroBanco">
								<H4><bean:write name="erroBanco"/></H4>
							</logic:present>
						</td>
						<td>
							<html:errors/>
						</td>
					</tr>
				</table>
</html:form>
</body>
</html:html>

