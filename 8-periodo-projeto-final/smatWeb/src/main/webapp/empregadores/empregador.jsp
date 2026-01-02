<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>


<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<SCRIPT src="../js/validacoes.js"></SCRIPT>
<script>
		function addTelefone(empregador){
			var t, l, page, altura;
			var w = screen.availWidth;
			var h = screen.availHeight;
			var largura = 450;
			l = (w - 450) / 2;
			

			page = "/smatWeb/empregadores/TelefoneEmpregador.do?empregador="+empregador;
			altura = 350;
			t = (h - altura ) / 2;

			open(page, "secondwindow", "scrollbars=yes, top=" + t + ", left=" + l + ", width=" + largura + ", height=" + altura);
		}

		function formGravar(){
			document.forms["EmpregadorForm"].acao.value = "GRAVAR";
			document.forms["EmpregadorForm"].action     = "/smatWeb/empregadores/Empregador.do";
			document.forms["EmpregadorForm"].submit();		
		}	
		
		function formExcluir(){
			document.forms["EmpregadorForm"].acao.value = "EXCLUIR";
			document.forms["EmpregadorForm"].action     = "/smatWeb/empregadores/Empregador.do";
			document.forms["EmpregadorForm"].submit();		
		}			

		function refresh(){
			document.forms["EmpregadorForm"].acao.value = "LISTAR";
			document.forms["EmpregadorForm"].action     = "/smatWeb/empregadores/Empregador.do";			
			document.forms["EmpregadorForm"].submit();
		}
	
		function preencheForm(empregador){

			document.forms["EmpregadorForm"].acao.value = "PREENCHEFORM";		
			document.forms["EmpregadorForm"].elements["empregador"        ].value = empregador;				
			document.forms["EmpregadorForm"].action="/smatWeb/empregadores/Empregador.do";
			document.forms["EmpregadorForm"].submit();												
		}	
	
		
		function resetForm(){
			document.forms["EmpregadorForm"].elements["empregador"        ].value = "";				
			document.forms["EmpregadorForm"].elements["tipoEmpregador"    ].value = "";		
			document.forms["EmpregadorForm"].elements["documento"         ].value = "";				
			document.forms["EmpregadorForm"].elements["razaoSocial"       ].value = "";	
			document.forms["EmpregadorForm"].elements["ramoAtividade"     ].value = "";						
			document.forms["EmpregadorForm"].elements["ramoSuperior"      ].value = "";				
			document.forms["EmpregadorForm"].elements["estado"            ].value = "";				
			document.forms["EmpregadorForm"].elements["municipio"         ].value = "";				
			document.forms["EmpregadorForm"].elements["rua"               ].value = "";				
			document.forms["EmpregadorForm"].elements["numero"            ].value = "";				
			document.forms["EmpregadorForm"].elements["bairro"            ].value = "";				
			document.forms["EmpregadorForm"].elements["complemento"       ].value = "";									
			document.forms["EmpregadorForm"].elements["cep"               ].value = "";										
			document.forms["EmpregadorForm"].acao.value = "LISTAR";
			document.forms["EmpregadorForm"].action     = "./Empregador.do";			
			document.forms["EmpregadorForm"].submit();
		}
		
		function retornarEmpregador(){
			document.forms["EmpregadorForm"].acao.value 	= "RETORNARORIGEM";		
			document.forms["EmpregadorForm"].action        = "/smatWeb/empregadores/PesquisaEmpregador.do?empregador="+document.forms["EmpregadorForm"].elements["empregador"].value;
			document.forms["EmpregadorForm"].submit();			
		}
				
</script>
<html:html>
<body  vlink="#666666" alink="#666666" link="#666666">
<html:form method="post" action="/empregadores/Empregador.do">
<html:hidden property="empregador"/> 
<html:hidden property="acao"/> 
<html:hidden property="destino"/> 
<table>
<tr>
	<td>
		<html:errors/>
	</td>
</tr>
<tr>
	<td>
<table align="left" border="0">
<tr>
		<TH align="center" colspan="6"><H3>Cadastro de Empregadores</H3></TH>
</tr>
<tr>
<tr>
	<td><LABEL>Tipo Empregador</LABEL></td>
	<td  align="left" colspan="5">
		<html:select property="tipoEmpregador" onchange="refresh()" styleClass="SELECT">
			<html:option value="">-- Tipo Empregador --</html:option>
			<logic:present name="colTipoEmpregadores">																		
			<html:options 
				    collection="colTipoEmpregadores" 
					name="tipoEmpregador"
					labelName="nome" 
					labelProperty="nome" 
					property="tipoEmpregador" />				
			</logic:present>						
		</html:select>
		<font color="red">*</font>				
	</td>
</tr>
<tr>
	<td><LABEL>Ramo Superior</LABEL></td>
	<td  align="left"  colspan="5">
		<html:select property="ramoSuperior" onchange="refresh()" styleClass="SELECT">
			<html:option value="0">-- Ramo Superior --</html:option>				
			<logic:present name="colRamosSuperiores">					
					<html:options 
					    collection="colRamosSuperiores" 
						name="ramoAtividade"
						labelName="nome" 
						labelProperty="nome" 
						property="ramoAtividade" />		
			</logic:present>						
		</html:select>
		<font color="red">*</font>								
	</td>
</tr>
<tr>
	<td><LABEL>Ramo de atividade</LABEL></td>
	<td  align="left"  colspan="5">
		<html:select property="ramoAtividade" styleClass="SELECT">
		<html:option value="0">-- Ramo de atividade --</html:option>				
			<logic:present name="colRamosAtividade">							
			<html:options 
					    collection="colRamosAtividade" 
						name="ramoAtividade"
						labelName="nome" 
						labelProperty="nome" 
						property="ramoAtividade" />		
				</logic:present>						
				</html:select>
				<font color="red">*</font>												
	</td>
</tr>		
<tr>
	<td><LABEL>Estado</LABEL></td>
	<td  align="left"  colspan="5" >
		<html:select property="estado" onchange="refresh()" styleClass="SELECT">
		<html:option value="">-- Estado --</html:option>				
			<logic:present name="colEstado">				
			<html:options 
			    collection="colEstado" 
				name="estado"
				labelName="nome" 
				labelProperty="nome" 
				property="estado" />	
			</logic:present>						
		</html:select>
		<font color="red">*</font>												
	</td>
</tr>
<tr>
	<td><LABEL>Município</LABEL></td>
	<td  align="left"  colspan="5">
		<html:select property="municipio" styleClass="SELECT">
			<html:option value="">-- Municipio --</html:option>
			<logic:present name="colMunicipio">				
				<html:options 
						collection="colMunicipio" 
						name="municipio"
						labelName="nome" 
						labelProperty="nome" 
						property="municipio" />	
			</logic:present>						
		</html:select>
		<font color="red">*</font>																
	</td>
</tr>		
<tr>
<logic:present name="TIPODOCEMP">
	<logic:equal name="TIPODOCEMP" value="CPF">
			<td><LABEL>CPF</LABEL></td>
			<td  align="left">
			<html:text property="documento" size="18" maxlength="11" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onblur="colacaCaracEspeciaisCPF(this)" onfocus="retiraCaracteresAlfabeticos(this)" />
	</logic:equal>
	<logic:equal name="TIPODOCEMP" value="CNPJ">
		<td><LABEL>CNPJ</LABEL></td>
		<td  align="left">	
		<html:text property="documento" size="18" maxlength="14" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onblur="colacaCaracEspeciaisCNPJ(this)" onfocus="retiraCaracteresAlfabeticos(this)" />
	</logic:equal>	
	<logic:equal name="TIPODOCEMP" value="">
			<td><LABEL>Documento</LABEL></td>
			<td  align="left">		
			<html:text property="documento" size="25" maxlength="25" styleClass="TEXT" />					
	</logic:equal>		
</logic:present>			
<logic:notPresent name="TIPODOCEMP">
		<td><LABEL>Documento</LABEL></td>
		<td  align="left">	
		<html:text property="documento" size="25" maxlength="25" styleClass="TEXT" />
	</td>		
</logic:notPresent>
	<td><LABEL>Razão social/Nome</LABEL></td>
	<td  align="left"  colspan="4">
		<html:text property="razaoSocial" size="40" maxlength="80" styleClass="TEXT"/>
		<font color="red">*</font>																
	</td>
</tr>
<tr>
	<TH align="left"  colspan="6">Endereço</TH>
</tr>
<tr>
	<td><LABEL>Rua</LABEL></td>
	<td  align="left"  colspan="5" >
		<html:text property="rua" size="40" maxlength="80" styleClass="TEXT"/>
		<font color="red">*</font>																			
	</td>
</tr>
<tr>
	<td><LABEL>Bairro</LABEL></td>
	<td  align="left"  colspan="5">
		<html:text property="bairro" size="40" maxlength="60" styleClass="TEXT"/>
	<font color="red">*</font>																										
	</td>
</tr>
<tr>
	<td><LABEL>Numero</LABEL></td>
	<td>
		<html:text property="numero" size="5" maxlength="5" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="retiraCaracteresAlfabeticos(this)" />
		<font color="red">*</font>																										
	</td>
	<td><LABEL>Complemento</LABEL></td>
	<td>
		<html:text property="complemento" size="10" maxlength="10" styleClass="TEXT"/>																							
	</td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;<LABEL>CEP</LABEL></td>
	<td>
		<html:text property="cep" size="12" maxlength="8" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaTracoCep(this)" />
		<font color="red">*</font>																									
	</td>
</tr>	
<tr>
	<td align="center"  colspan="6">
		<html:button property="gravar"   onclick="formGravar()" styleClass="BOTAO" >GRAVAR</html:button>&nbsp;&nbsp;&nbsp; 
		<html:button property="limpar"   onclick="resetForm()"  styleClass="BOTAO" >LIMPAR</html:button>&nbsp;&nbsp;&nbsp;
		<html:button property="excluir"  onclick="formExcluir()" styleClass="BOTAO" >EXCLUIR</html:button>								
	</td>
</tr>
<logic:present name="destinoSession">	
<tr>
	<td align="left">
		<html:button property="btRetornar" onclick="retornarEmpregador()" styleClass="BOTAO" >RETORNAR</html:button>
	</td>
</tr>
</logic:present> 			
<tr>
	<td colspan="6"  align="center">
		<logic:present name="erroBanco">
			<H4><bean:write name="erroBanco"/></H4>
		</logic:present>
	</td>
</tr>		
</table>
	</td>
</TR>
<TR>
	<td>
<table  border="1" bordercolor="#66666" width="100%">
	<tr>
		<th align="center" colspan="4" bgcolor="#C0C0C0">Empregadores</th>
	</tr>
	<tr>
		<th bgcolor="#C0C0C0">Nº</th>
		<th bgcolor="#C0C0C0">Razão Social</th>
		<th bgcolor="#C0C0C0">Ramo de atividade</th>
		<th bgcolor="#C0C0C0">Telefone</th>				
	</tr>	
		<logic:present name="auxEmpregadors">
		<logic:iterate id="item" name="auxEmpregadors">
			<tr>
				<td>
					<a href='javascript:preencheForm( <bean:write name="item" property="empregador" />)'>	
							<bean:write name="item" property="empregador" />
					</a>
				</td>
				<td>
					<a href='javascript:preencheForm( <bean:write name="item" property="empregador" />)'>	
							<bean:write name="item" property="razaoSocial" />
					</a>	
				</td>
				<td>
					<a href='javascript:preencheForm( <bean:write name="item" property="empregador" />)'>	
							<bean:write name="item" property="nomeRamoAtividade" />
			  		 </a>
				</td>
				<td>
					<a href='javascript:addTelefone(<bean:write name="item" property="empregador" />)'>
				   Incluir Telefone
				</a>						
				<td>
			</tr>
		</logic:iterate>
		</logic:present>
</table>
	</td>
</tr>
</table>
</html:form>
</body>
</html:html>
