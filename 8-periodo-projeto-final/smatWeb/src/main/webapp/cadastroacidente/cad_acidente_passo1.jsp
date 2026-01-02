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
<script>
		function refresh(){
			document.forms["AcidentePassoUm"].acao.value = "LISTAR";
			document.forms["AcidentePassoUm"].destino.value = "";
			document.forms["AcidentePassoUm"].action     = "/smatWeb/cadastroacidente/AcidentePassoUm.do";			
			document.forms["AcidentePassoUm"].submit();
		}
		
		function avancarForm(){
			document.forms["AcidentePassoUm"].acao.value = "AVANCAR";		
			document.forms["AcidentePassoUm"].destino.value = "AVANCAR";		
			document.forms["AcidentePassoUm"].action     = "/smatWeb/cadastroacidente/AcidentePassoUm.do";			
			document.forms["AcidentePassoUm"].submit();		
		}

		function pesquisarEmpresa(){
			document.forms["AcidentePassoUm"].acao.value = "PESQUISAR";		
			document.forms["AcidentePassoUm"].destino.value = "PESQUISAR";		
			document.forms["AcidentePassoUm"].action        = "/smatWeb/cadastroacidente/AcidentePassoUm.do";			
			document.forms["AcidentePassoUm"].submit();			
		}
	
</script>
<SCRIPT src="../js/validacoes.js"></SCRIPT>


</head>

<html:form action="/cadastroacidente/AcidentePassoUm" focus="dataNascimento">

	<!-- Caracteres de controle INICIO -->
	<html:hidden property="acao" />
	<html:hidden property="destino" />
	<html:hidden property="paginaAtual" />
	<html:hidden property="flagRetorno" />
	<!-- Caracteres de controle FIM -->

	<html:hidden property="acidente" />
	<html:hidden property="empresa" />
	<html:hidden property="trabalhador" />
	<html:errors />
	<table border="0">
		<tr>
			<th colspan="6" align="left">Informações Gerais</th>
		</tr>
		<tr>
			<td align="left"><LABEL>Emitente</LABEL></td>
			<td align="left" colspan="5">
			 	<html:select property="emitente" styleClass="SELECT">
				<html:option value="0" styleClass="OPTION">-- Emitente --</html:option>
				<logic:present name="colEmitente">
					<html:options collection="colEmitente" name="emitente"
						labelName="nome" labelProperty="nome" property="emitente"
						styleClass="OPTION" />
				</logic:present>
				</html:select>
				<font color="red">*</font>
			</td>
		</tr>
		<tr>
			<td align="left">
				<LABEL>Empregador</LABEL>
			</td>
			<td align="left" nowrap="nowrap" colspan="5">
				<html:text property="documento" readonly="true" size="25" maxlength="22" styleClass="TEXTDISABLE" /> 
				<html:text property="razaoSocial"
				readonly="true" size="38" maxlength="80" styleClass="TEXTDISABLE" />
				<html:button property="pesquisar" onclick="pesquisarEmpresa()"
				styleClass="BOTAO">PESQUISAR</html:button>
			</td>
		</tr>
		<tr>
			<th colspan="6" align="left">Acidentado</th>
		</tr>
		<tr>
			<td align="left"><LABEL>Nome</LABEL></td>
			<td align="left" colspan="5"><html:text property="nome" size="60"
				maxlength="60" styleClass="TEXT" />
				<font color="red">*</font>
			</td>
		</tr>
		<tr>
			<td align="left" nowrap="nowrap"><LABEL>Nome do responsável</LABEL></td>
			<td align="left" colspan="5"><html:text property="nomeResponsavel"
				size="60" maxlength="60" styleClass="TEXT" /></td>
		</tr>
		<tr>
			<td align="left"><LABEL>Data de nascimento</LABEL></td>
			<td align="left"><html:text property="dataNascimento" size="12"
				maxlength="8" styleClass="TEXT"
				onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="colocaBarraData(this)" /><font color="red">*</font>
			</td>
			<td align="left"><LABEL>Estado civil</LABEL></td>
			<td align="left" colspan="3"><html:select property="estadoCivil"
				styleClass="SELECT">
				<html:option value="0" styleClass="OPTION">-- Estado Civil --</html:option>
				<logic:present name="colEstadoCivil">
					<html:options collection="colEstadoCivil" name="estadoCivil"
						labelName="nome" labelProperty="nome" property="estadoCivil"
						styleClass="OPTION" />
				</logic:present>
				</html:select>
			</td>
		</tr>
		<tr>
			<td align="left"><LABEL>Carteira de trabalho</LABEL></td>
			<td align="left"><html:text property="ctps" size="5" maxlength="5"
				styleClass="TEXT" onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="retiraCaracteresAlfabeticos(this)" /></td>
			<td align="left"><LABEL>Série</LABEL></td>
			<td align="left" colspan="3">
				<html:text property="serie" size="5" maxlength="5"
				styleClass="TEXT" onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="retiraCaracteresAlfabeticos(this)" />
			</td>
		</tr>
		<tr>			
			<td align="left" nowrap="nowrap">
				<LABEL>Data de emissão</LABEL>
			</td>
			<td align="left"><html:text property="dataEmissaoCTPS" size="12"
				maxlength="8" styleClass="TEXT"
				onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="colocaBarraData(this)" />
			</td>
			<td align="left"><LABEL>UF</LABEL></td>
			<td align="left" colspan="3"><html:select property="ufCTPS"
				styleClass="SELECT">
				<html:option value="0" styleClass="OPTION">UF</html:option>
				<logic:present name="colEstado">
					<html:options collection="colEstado" name="estado"
						labelName="sigla" labelProperty="sigla" property="estado"
						styleClass="OPTION" />
				</logic:present>
			</html:select></td>
		</tr>
		<tr>
			<td align="left" nowrap="nowrap"><LABEL>Remuneração mensal</LABEL></td>
			<td align="left"><html:text property="remuneracaoMensal" size="8"
				maxlength="8" styleClass="TEXT"
				onkeypress='return validaCaracterValor(event)' /></td>

			<td align="left"><LABEL>PIS/PASEP/NIT</LABEL></td>
			<td align="left" colspan="3"><html:text property="pisPasepNit"
				styleClass="TEXT" size="20" maxlength="20" /></td>
		</tr>
		<tr>
			<td align="left"><LABEL>Registro Geral</LABEL></td>
			<td align="left"><html:text property="rg" size="5" size="20"
				maxlength="20" styleClass="TEXT" /></td>
			<td align="left" nowrap="nowrap">
				<LABEL>Data de emissão</LABEL>
			</td>
			<td align="left" colspan="3"><html:text property="dataEmissaoRG" size="12"
				maxlength="8" styleClass="TEXT"
				onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="colocaBarraData(this)" />
			</td>
		</tr>
		<tr>			
			<td align="left" nowrap="nowrap"><LABEL>Orgão expedidor</LABEL></td>
			<td align="left"><html:text property="orgaoExpedidorRG" size="10"
				maxlength="30" styleClass="TEXT" /></td>
			<td align="left"><LABEL>UF</LABEL></td>
			<td align="left" colspan="3"><html:select property="ufRG"
				styleClass="SELECT">
				<html:option value="0" styleClass="OPTION">UF</html:option>
				<logic:present name="colEstado">
					<html:options collection="colEstado" name="estado"
						labelName="sigla" labelProperty="sigla" property="estado"
						styleClass="OPTION" />
				</logic:present>
			</html:select></td>
		</tr>
		<tr>
			<td align="left"><LABEL>CPF</LABEL></td>
			<td align="left"><html:text property="cpf" size="11" maxlength="11"
				styleClass="TEXT" onkeypress='return validaCaracter(event)'
				onblur="colacaCaracEspeciaisCPF(this)"
				onfocus="retiraCaracteresAlfabeticos(this)" /></td>
			<td align="left"><LABEL>Sexo</LABEL></td>
			<td align="left" colspan="3" nowrap="nowrap"><LABEL>Masculino</LABEL><html:radio
				property="sexo" value="M" styleClass="RADIO" />&nbsp;&nbsp;&nbsp; <LABEL>Feminino</LABEL><html:radio
				property="sexo" value="F" styleClass="RADIO" />&nbsp;&nbsp;&nbsp; <font
				color="red">*</font></td>
		</tr>
		<tr>
			<td align="left"><LABEL>Ocupação</LABEL></td>
			<td align="left" colspan="5"><html:select property="ocupacao"
				styleClass="SELECT">
				<html:option value="0" styleClass="OPTION">-- Ocupação --</html:option>
				<logic:present name="colOcupacao">
					<html:options collection="colOcupacao" name="ocupacao"
						labelName="nome" labelProperty="nome" property="ocupacao"
						styleClass="OPTION" />
				</logic:present>
			</html:select> <font color="red">*</font></td>
		</tr>
		<tr>
			<td align="left"><LABEL>Aposentado</LABEL></td>
			<td align="left" nowrap="nowrap"><html:select property="aposentado"
				styleClass="SELECT">
				<html:option value="" styleClass="OPTION">-- Aposentado -- </html:option>
				<html:option value="S" styleClass="OPTION">Sim</html:option>
				<html:option value="N" styleClass="OPTION">Não</html:option>
				<html:option value="X" styleClass="OPTION">Não Informado</html:option>
			</html:select> <font color="red">*</font></td>
			<td align="left"><LABEL>Área</LABEL></td>
			<td align="left" colspan="3"><html:select property="area"
				styleClass="SELECT">
				<html:option value="0" styleClass="OPTION">-- Área --</html:option>
				<logic:present name="colArea">
					<html:options collection="colArea" name="area" labelName="nome"
						labelProperty="nome" property="area" styleClass="OPTION" />
				</logic:present>
			</html:select> <font color="red">*</font></td>
		</tr>
		<tr>
			<td align="left" nowrap="nowrap"><LABEL>Vínculo Empregatício</LABEL>
			</td>
			<td align="left" nowrap="nowrap" colspan="5"><html:select
				property="vinculoEmpregaticio" styleClass="SELECT">
				<html:option value="0" styleClass="OPTION">-- Vínculo Empregatício --</html:option>
				<logic:present name="colVinculoEmpregaticio">
					<html:options collection="colVinculoEmpregaticio"
						name="vinculoEmpregaticio" labelName="nome" labelProperty="nome"
						property="vinculoEmpregaticio" styleClass="OPTION" />
				</logic:present>
			</html:select> <font color="red">*</font></td>
		</tr>
		<tr>
			<th colspan="6" align="left">Endereço do acidentado</th>
		</tr>
		<tr>
			<td><LABEL>Estado</LABEL></td>
			<td align="left" colspan="5"><html:select property="estado"
				onchange="refresh()" styleClass="SELECT">
				<html:option value="0" styleClass="OPTION">-- Estado --</html:option>
				<logic:present name="colEstado">
					<html:options collection="colEstado" name="estado" labelName="nome"
						labelProperty="nome" property="estado" styleClass="OPTION" />
				</logic:present>
			</html:select></td>
		</tr>
		<tr>
			<td align="left"><LABEL>Município</LABEL></td>
			<td align="left" colspan="5"><html:select property="municipio"
				styleClass="SELECT">
				<html:option value="0" styleClass="OPTION">-- Municipio --</html:option>
				<logic:present name="colMunicipio">
					<html:options collection="colMunicipio" name="municipio"
						labelName="nome" labelProperty="nome" property="municipio"
						styleClass="OPTION" />
				</logic:present>
			</html:select></td>
		</tr>
		<tr>
			<td align="left"><LABEL>Rua</LABEL></td>
			<td colspan="5" align="left"><html:text property="rua" size="60"
				maxlength="60" styleClass="TEXT" /></td>
		</tr>
		<tr>
			<td align="left"><LABEL>Bairro</LABEL></td>
			<td align="left" colspan="5"><html:text property="bairro" size="40"
				maxlength="60" styleClass="TEXT" /></td>
		</tr>
		<tr>
			<td align="left"><LABEL>Número</LABEL></td>
			<td align="left"><html:text property="numero" size="5" maxlength="5"
				styleClass="TEXT" onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="retiraCaracteresAlfabeticos(this)" /></td>

			<td align="left"><LABEL>Complemento</LABEL></td>
			<td align="left" colspan="4"><html:text property="complemento" size="10"
				maxlength="10" styleClass="TEXT" /></td>
		</tr>
		<tr>				
			<td align="left"><LABEL>CEP</LABEL></td>
			<td align="left"><html:text property="cep" size="11"
				maxlength="8" styleClass="TEXT"
				onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="colocaTracoCep(this)" /></td>
			<td align="left"><LABEL>Telefone</LABEL></td>
			<td align="left" colspan="4"><html:text property="ddd" size="2"
				maxlength="2" styleClass="TEXT"
				onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="retiraCaracteresAlfabeticos(this)" /> <html:text
				property="telefone" size="10" maxlength="8" styleClass="TEXT"
				onkeypress='return validaCaracter(event)'
				onfocus="retiraCaracteresAlfabeticos(this)"
				onblur="colocaTracoTelefone(this)" /></td>
		</tr>
	</table>
	<table align="center">
		<tr>
			<td><html:button property="avancar" onclick="avancarForm()"
				styleClass="BOTAO">AVANÇAR</html:button></td>
		</tr>
	</table>
</html:form>
</html:html>