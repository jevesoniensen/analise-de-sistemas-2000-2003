<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">

<HEAD>
<script>
	
		function consulta(){

			//alert('teste');
			document.forms["PesquisaAcidente"].acao.value = "CONSULTAR";
			document.forms["PesquisaAcidente"].action     = "./PesquisaAcidente.do";			
			document.forms["PesquisaAcidente"].submit();
		}
		


		function limpa(){
			document.forms["PesquisaAcidente"].acao.value = "LIMPAR";
			document.forms["PesquisaAcidente"].action     = "./PesquisaAcidente.do";			
			document.forms["PesquisaAcidente"].submit();
			
		}

		function refresh(){
			document.forms["PesquisaAcidente"].acao.value = "LISTAR";
			document.forms["PesquisaAcidente"].action     = "./PesquisaAcidente.do";
			document.forms["PesquisaAcidente"].submit();		
		}		
				
</script>
<SCRIPT src="../js/validacoes.js"></SCRIPT>
</HEAD>


<BODY>

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<logic:notPresent name="permissaoPagina">
	<logic:forward name="AccessDenied"/>
</logic:notPresent>

<html:errors/>
<html:form action="/cadastroacidente/PesquisaAcidente" focus="estado">
<html:hidden property="acao" />
<TABLE>
	<TR>
		<TD>
			<LABEL>Estado:</LABEL>
		</TD>
		<TD>
			<html:select property="estado" styleClass="SELECT" onchange="refresh()">
				<html:option value="">-- Todos --</html:option>
				<logic:present name="colEstado">
				<html:options 
					collection="colEstado" 
					name="estado"
					labelName="nome" 
					labelProperty="nome" 
					property="estado" />			
				</logic:present>
			</html:select>				
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Regional:</LABEL>
		</TD>
		<TD>
			<html:select property="regional" styleClass="SELECT" onchange="refresh()">
				<html:option value="">-- Todos --</html:option>
				<logic:present name="colRegional">
				<html:options 
					collection="colRegional" 
					name="regional"
					labelName="nome" 
					labelProperty="nome" 
					property="regional" />			
				</logic:present>
			</html:select>		
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Município:</LABEL>
		</TD>
		<TD>
			<html:select property="municipio" styleClass="SELECT">
				<html:option value="">-- Todos --</html:option>
				<logic:present name="colMunicipio">
				<html:options 
					collection="colMunicipio" 
					name="municipio"
					labelName="nome" 
					labelProperty="nome" 
					property="municipio" />			
				</logic:present>
			</html:select>		
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Data de acidente:</LABEL>
		</TD>
		<TD>
			<html:text property="dataInicial" size="12" maxlength="10" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaBarraData(this)" />
				<LABEL>até</LABEL>
			<html:text property="dataFinal" size="12" maxlength="10" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaBarraData(this)"/>		
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Houve amputação:</LABEL>
		</TD>
		<TD>
			<html:select property="amputacao" styleClass="SELECT">
				<html:option value="" styleClass="OPTION">-- Todos -- </html:option>
				<html:option value="S" styleClass="OPTION">Sim</html:option>
				<html:option value="N" styleClass="OPTION">Não</html:option>
				<html:option value="X" styleClass="OPTION">Não Informado</html:option>
			</html:select>		
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Houve óbito:</LABEL>
		</TD>
		<TD>
			<html:select property="obito" styleClass="SELECT">
				<html:option value="" styleClass="OPTION">-- Todos -- </html:option>
				<html:option value="S" styleClass="OPTION">Sim</html:option>
				<html:option value="N" styleClass="OPTION">Não</html:option>
				<html:option value="X" styleClass="OPTION">Não Informado</html:option>
			</html:select>		
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Houve registro policial:</LABEL>
		</TD>
		<TD>
			<html:select property="registroPolicial" styleClass="SELECT">
				<html:option value="" styleClass="OPTION">-- Todos -- </html:option>
				<html:option value="S" styleClass="OPTION">Sim</html:option>
				<html:option value="N" styleClass="OPTION">Não</html:option>
				<html:option value="X" styleClass="OPTION">Não Informado</html:option>
			</html:select>	
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Internação:</LABEL>
		</TD>
		<TD>
			<html:select property="internacao" styleClass="SELECT">
				<html:option value="" styleClass="OPTION">-- Todos -- </html:option>
				<html:option value="S" styleClass="OPTION">Sim</html:option>
				<html:option value="N" styleClass="OPTION">Não</html:option>
				<html:option value="X" styleClass="OPTION">Não Informado</html:option>
			</html:select>			
		</TD>
	</TR>
	<TR>
		<TD align="left" nowrap="nowrap">
			<LABEL>Tipo de acidente</LABEL>
		</TD>
		<TD align="left" nowrap="nowrap">
			<html:select property="tipoAcidente" styleClass="SELECT" >
				<html:option value=""> -- Todos -- </html:option>
				<logic:present name="colTipoAcidente">
				<html:options 
					collection="colTipoAcidente" 
					name="tipoAcidente"
					labelName="nome" 
					labelProperty="nome" 
					property="tipoAcidente" />			
				</logic:present>
			</html:select>		
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Diagnóstico:</LABEL>
		</TD>
		<TD>
			<html:select property="diagnostico" styleClass="SELECT">
			<html:option value=""> -- Todos -- </html:option>
			<logic:present name="colDiagnostico">			
				<html:options 
					collection="colDiagnostico" 
					name="diagnostico"
					labelName="nome" 
					labelProperty="nome" 
					property="diagnostico" />	
			</logic:present>					
			</html:select>
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Fonte:</LABEL>
		</TD>
		<TD>
			<html:select property="fonte" styleClass="SELECT">
			<html:option value=""> -- Todos -- </html:option>
			<logic:present name="colFonte">			
				<html:options 
					collection="colFonte" 
					name="fonte"
					labelName="nome" 
					labelProperty="nome" 
					property="fonte" />	
			</logic:present>					
			</html:select>
		</TD>
	</TR>
	<TR>
		<TD>
			<LABEL>Área:</LABEL>
		</TD>
		<TD>
			<html:select property="area" styleClass="SELECT">
			<html:option value=""> -- Todos -- </html:option>
			<logic:present name="colArea">			
				<html:options 
					collection="colArea" 
					name="area"
					labelName="nome" 
					labelProperty="nome" 
					property="area" />	
			</logic:present>					
			</html:select>
		</TD>
	</TR>
	<tr>
		<td colspan="2" align="center">
			<html:button property="consultar" onclick="consulta()" styleClass="BOTAO">CONSULTAR</html:button>&nbsp;&nbsp;&nbsp;&nbsp;
			<html:button property="limpar" onclick="limpa()" styleClass="BOTAO">LIMPAR</html:button>		
		</td>
	</tr>				
</TABLE>
</html:form>
</BODY>
</html:html>