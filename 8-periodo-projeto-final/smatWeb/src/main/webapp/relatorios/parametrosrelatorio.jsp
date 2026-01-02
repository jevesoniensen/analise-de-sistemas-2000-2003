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
<SCRIPT>

		function formGravar(){
			document.forms["ParametrosRelatorio"].acao.value = "GRAVAR";
			document.forms["ParametrosRelatorio"].action     = "./ParametrosRelatorio.do";
			document.forms["ParametrosRelatorio"].submit();		
		}

		function refresh(){
			document.forms["ParametrosRelatorio"].acao.value = "LISTAR";
			document.forms["ParametrosRelatorio"].action     = "./ParametrosRelatorio.do";			
			document.forms["ParametrosRelatorio"].submit();
		}

		function formSalvar(){
			document.forms["ParametrosRelatorio"].acao.value = "SALVAR";
			document.forms["ParametrosRelatorio"].action     = "./ParametrosRelatorio.do";			
			document.forms["ParametrosRelatorio"].submit();
		}

		function formNovo(){
			document.forms["ParametrosRelatorio"].acao.value = "NOVO";
						
			//document.forms["ParametrosRelatorio"].elements["datainicial"	].value = "";		
			//document.forms["ParametrosRelatorio"].elements["datafinal"      ].value = "";
			document.forms["ParametrosRelatorio"].elements["agrupamento"    ].value = "";
			document.forms["ParametrosRelatorio"].elements["estado"         ].value = "0";				
			//document.forms["ParametrosRelatorio"].elements["regional"     ].value = "";				
			//document.forms["ParametrosRelatorio"].elements["municipio"    ].value = "";
			document.forms["ParametrosRelatorio"].elements["campo1"         ].value = "0";
			document.forms["ParametrosRelatorio"].elements["campo2"         ].value = "0";
			//document.forms["ParametrosRelatorio"].elements["dadoscampo1"  ].value = "";
			//document.forms["ParametrosRelatorio"].elements["dadoscampo2"  ].value = "";

			document.forms["ParametrosRelatorio"].elements["periodicidade"  ].value = "";	
			document.forms["ParametrosRelatorio"].elements["titulo"         ].value = "";
			document.forms["ParametrosRelatorio"].elements["texto"          ].value = "";
//			document.forms["ParametrosRelatorio"].elements["anoInicial"     ].value = "";
//			document.forms["ParametrosRelatorio"].elements["anoFinal"       ].value = "";
//			document.forms["ParametrosRelatorio"].elements["mesAnoInicial"  ].value = "";
//			document.forms["ParametrosRelatorio"].elements["mesAnoFinal"    ].value = "";			
			document.forms["ParametrosRelatorio"].action     = "./ParametrosRelatorio.do";			
			document.forms["ParametrosRelatorio"].submit();
		}				

		function resetForm(){
			
			//document.forms["ParametrosRelatorio"].elements["datainicial"	].value = "";		
			//document.forms["ParametrosRelatorio"].elements["datafinal"      ].value = "";
			document.forms["ParametrosRelatorio"].elements["agrupamento"    ].value = "";
			document.forms["ParametrosRelatorio"].elements["estado"         ].value = "0";				
			//document.forms["ParametrosRelatorio"].elements["regional"     ].value = "";				
			//document.forms["ParametrosRelatorio"].elements["municipio"    ].value = "";
			document.forms["ParametrosRelatorio"].elements["campo1"         ].value = "0";
			document.forms["ParametrosRelatorio"].elements["campo2"         ].value = "0";
			//document.forms["ParametrosRelatorio"].elements["dadoscampo1"  ].value = "";
			//document.forms["ParametrosRelatorio"].elements["dadoscampo2"  ].value = "";
			document.forms["ParametrosRelatorio"].elements["titulo"         ].value = "";
			document.forms["ParametrosRelatorio"].elements["texto"          ].value = "";
		
	
			document.forms["ParametrosRelatorio"].elements["periodicidade"  ].value = "";				
			document.forms["ParametrosRelatorio"].acao.value = "LIMPAR";
			document.forms["ParametrosRelatorio"].action     = "./ParametrosRelatorio.do";			
			document.forms["ParametrosRelatorio"].submit();
		}
		
		function add(param){

			document.forms["ParametrosRelatorio"].acao.value = param;
			document.forms["ParametrosRelatorio"].action     = "./ParametrosRelatorio.do";			
			document.forms["ParametrosRelatorio"].submit();			
		}

		function del(param){

			document.forms["ParametrosRelatorio"].acao.value = param;
			document.forms["ParametrosRelatorio"].action     = "./ParametrosRelatorio.do";			
			document.forms["ParametrosRelatorio"].submit();			
		}				
		
</SCRIPT>
<SCRIPT src="../js/validacoes.js"></SCRIPT>
<html:html>
<html:form action="/relatorios/ParametrosRelatorio">
<html:hidden property="acao" value="LISTAR"/> 
<html:errors/>
<table border="0">
		<tr>
			<TH colspan="2">
				<H3>Gerador de relatórios</H3>
			<TH/>
		</tr>
		<tr>
			<td><LABEL>Periodicidade</LABEL></td>
			<td ><html:select property="periodicidade" onchange="refresh()" styleClass="SELECT" >
					<html:option value=""></html:option>
					<html:option value="1">Mensal</html:option>
					<html:option value="2">Anual</html:option>
				</html:select>
		</tr>
		<logic:present name="tipoperiodo">
			<TR>
			<logic:equal name="tipoperiodo" value="1">
				<TD><LABEL>Mês/Ano inicial</LABEL></td>
				<TD align="left">
					<html:text size="9" maxlength="7" property="mesAnoInicial" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaBarraMesAno(this)"/>
					<LABEL>(mmaaaa)&nbsp;&nbsp;&nbsp;&nbsp;</LABEL>
					<LABEL>Mês/Ano final</LABEL>
					<html:text size="9" maxlength="7" property="mesAnoFinal" styleClass="TEXT" onkeypress ='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this)" onblur="colocaBarraMesAno(this)"/>
					<LABEL>(mmaaaa)</LABEL>
				</td>
			</logic:equal>
			<logic:equal name="tipoperiodo" value="2">
					<td><LABEL>Ano inicial</LABEL>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td align="left">
						<html:text size="6" maxlength="4" property="anoInicial" styleClass="TEXT" onkeypress='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this);retiraZero(this)" onblur="retiraCaracteresAlfabeticos(this)'"/>
						<LABEL>(aaaa)</LABEL>&nbsp;&nbsp;&nbsp;&nbsp;
						<LABEL>Ano final</LABEL>
						<html:text size="6" maxlength="4" property="anoFinal" styleClass="TEXT" onkeypress='return validaCaracter(event)' onfocus="retiraCaracteresAlfabeticos(this);retiraZero(this)" onblur="retiraCaracteresAlfabeticos(this)"/>
						<LABEL>(aaaa)</LABEL>
					</td>
			</logic:equal>
			</TR>			
		</logic:present>
		<tr>
			<td><LABEL>Agrupamento</LABEL></td>
			<td >
				<html:radio property="agrupamento" value="1" onclick="refresh()" styleClass="RADIO" ><LABEL>Estadual</LABEL></html:radio>
				<html:radio property="agrupamento" value="2" onclick="refresh()" styleClass="RADIO"><LABEL>Regional</LABEL></html:radio>
				<html:radio property="agrupamento" value="3" onclick="refresh()" styleClass="RADIO"><LABEL>Municipal</LABEL></html:radio>
			</td>
		</tr>
		<TR>		
			<TD><LABEL>Estado</LABEL></TD>
			<TD>
				<html:select property="estado" onchange="refresh()"  styleClass="SELECT">
					<html:option value="0"> -- Selecione o Estado -- </html:option>
					<logic:present name="colEstado" >
						<html:options 
							collection="colEstado" 
							name="estado"
							labelName="sigla" 
							labelProperty="sigla" 
							property="estado" />
					</logic:present>
				</html:select>	
			</TD>
		</TR>
		<logic:present name="colRegional">
		<TR>
			<TD><LABEL>Regional</LABEL></TD>
			<TD>
				<TABLE>
					<TR>
					 	<TD>
							<html:select property="regional" multiple="5"  styleClass="SELECT">
							<html:options 
								collection="colRegional" 
								name="regional"
								labelName="nome" 
								labelProperty="nome" 
								property="regional" />
							</html:select>
						</TD>
						<TD>
							<TABLE border="1">
								<TR>
									<TD>
										<html:button property="addRegional" onclick="add('ADDREGIONAL')" value=">>" styleClass="BOTAO" />
									</TD>
								</TR>
								<TR>
									<TD>
										<html:button property="delRegional" onclick="del('DELREGIONAL')" styleClass="BOTAO"> << </html:button>
									</TD>
								</TR>
							</TABLE>
						</TD>
						<TD>
							<html:select property="regionalSelected" multiple="5"  styleClass="SELECT">
								<logic:present name="colRegionalSelected">
									<html:options 
										collection="colRegionalSelected" 
										name="regional"
										labelName="nome" 
										labelProperty="nome" 
										property="regional" />
								</logic:present>
							</html:select>									
						</TD>
					</TR>
				</TABLE>
			</TD>
		</TR>
		</logic:present>
		<logic:present name="colMunicipio">
		<TR>
			<TD><LABEL>Município</LABEL></TD>
			<TD>
				<TABLE>
					<TR>
					 	<TD>
							<html:select property="municipio" multiple="5"  styleClass="SELECT">
							<html:options 
								collection="colMunicipio" 
								name="municipio"
								labelName="nome" 
								labelProperty="nome" 
								property="municipio" />
							</html:select>
						</TD>
						<TD>
							<TABLE border="1">
								<TR>
									<TD>
										<html:button property="addMunicipio" onclick="add('ADDMUNICIPIO')" value=">>" styleClass="BOTAO" />
									</TD>
								</TR>
								<TR>
									<TD>
										<html:button property="delMunicipio" onclick="del('DELMUNICIPIO')" styleClass="BOTAO"> << </html:button>
									</TD>
								</TR>
							</TABLE>
						</TD>
						<TD>
							<html:select property="municipioSelected" multiple="5"  styleClass="SELECT">
								<logic:present name="colMunicipioSelected">
									<html:options 
										collection="colMunicipioSelected" 
										name="municipio"
										labelName="nome" 
										labelProperty="nome" 
										property="municipio" />
								</logic:present>
							</html:select>									
						</TD>
					</TR>
				</TABLE>
			</TD>
		</TR>
		</logic:present>		
		<TR>
			<TD><LABEL>Informação 1</LABEL></TD>
			<TD>
				<html:select property="campo1" onchange="refresh()"  styleClass="SELECT">
					<html:option value="0">-- Selecione a Informação 1 --</html:option>
					<logic:present name="colCampo1">
						<html:options 
							collection="colCampo1" 
							name="campo"
							labelName="label" 
							labelProperty="label" 
							property="campo" />
					</logic:present>				
				</html:select>
			</TD>
		</TR>
		<TR>
			<TD></TD>
			<TD>
				<TABLE>
					<TR>
					 	<TD>
							<html:select property="dadoscampo1" multiple="5"  styleClass="SELECT" >
								<logic:present name="aRegCampo1">
									<html:options 
										collection="aRegCampo1" 
										name="registro"
										labelName="nomeRegistro" 
										labelProperty="nomeRegistro" 
										property="registro" />
								</logic:present>									
							</html:select>
						</TD>
						<TD>
							<TABLE border="1">
								<TR>
									<TD>
										<html:button property="addCampo1" onclick="add('ADDCAMPO1')" value=">>" styleClass="BOTAO"/>
									</TD>
								</TR>
								<TR>
									<TD>
										<html:button property="delCampo1" onclick="del('DELCAMPO1')" styleClass="BOTAO"> << </html:button>
									</TD>
								</TR>
							</TABLE>
						</TD>
						<TD>
							<html:select property="dadosCampo1Selected" multiple="5"  styleClass="SELECT">
								<logic:present name="aRegCampo1Selected">
									<html:options 
										collection="aRegCampo1Selected" 
										name="registro"
										labelName="nomeRegistro" 
										labelProperty="nomeRegistro" 
										property="registro" />
								</logic:present>
							</html:select>									
						</TD>
					</TR>
				</TABLE>	
			</TD>
		</TR>
		<TR>
			<TD><LABEL>Informação 2</LABEL></TD>
			<TD>
				<html:select property="campo2" onchange="refresh()"  styleClass="SELECT">
					<html:option value="0">-- Selecione a Informação 2 --</html:option>
					<logic:present name="colCampo2">
						<html:options 
							collection="colCampo2" 
							name="campo"
							labelName="label" 
							labelProperty="label" 
							property="campo" />
					</logic:present>				
				</html:select>
			</TD>
		</TR>		
		<TR>
			<TD></TD>
			<TD>
				<TABLE>
					<TR>
					 	<TD>
							<html:select property="dadoscampo2" multiple="5"  styleClass="SELECT" >
								<logic:present name="aRegCampo2">
									<html:options 
										collection="aRegCampo2" 
										name="registro"
										labelName="nomeRegistro" 
										labelProperty="nomeRegistro" 
										property="registro" />
								</logic:present>									
							</html:select>
						</TD>
						<TD>
							<TABLE border="1">
								<TR>
									<TD>
										<html:button property="addCampo2" onclick="add('ADDCAMPO2')" value=">>" styleClass="BOTAO" />
									</TD>
								</TR>
								<TR>
									<TD>
										<html:button property="delCampo2" onclick="del('DELCAMPO2')" styleClass="BOTAO" > << </html:button>
									</TD>
								</TR>
							</TABLE>
						</TD>
						<TD>
							<html:select property="dadosCampo2Selected" multiple="5"  styleClass="SELECT">
								<logic:present name="aRegCampo2Selected">
									<html:options 
										collection="aRegCampo2Selected" 
										name="registro"
										labelName="nomeRegistro" 
										labelProperty="nomeRegistro" 
										property="registro" />
								</logic:present>
							</html:select>									
						</TD>
					</TR>
				</TABLE>
			</TD>
		</TR>
		<TR>
			<TD><LABEL>Título</LABEL></TD>
			<TD>
				<html:text size="80" maxlength="255" property="titulo" styleClass="TEXT"/>
			</TD>
		</TR>
		<TR>
			<TD>
				<LABEL>Texto</LABEL>
			</TD>
			<TD>
				<html:textarea cols="60" rows="5" property="texto" styleClass="TEXTAREA">
				</html:textarea>
			</TD>
		</TR>
		<logic:present name="erroBanco">
		<TR>
			<TH colspan="6">
				<H4><bean:write  name="erroBanco" /></H4>
			</TH>
		</TR>	
		</logic:present>		
		<TR>
			<TD colspan="2" align="center">
				<html:button property="gravar"   onclick="formGravar()" styleClass="BOTAO" >GERAR RELATÓRIO</html:button>&nbsp;
				<html:button property="salvar"   onclick="formSalvar()" styleClass="BOTAO" >SALVAR RELATÓRIO</html:button>&nbsp;
				<html:button property="novo"     onclick="formNovo()"   styleClass="BOTAO" >NOVO RELATÓRIO</html:button>&nbsp;
				<html:button property="limpar"   onclick="resetForm()" styleClass="BOTAO"  >LIMPAR</html:button>
			</TD>
		</TR>
</table>
<logic:present name="visualizaRelatorio">

<SCRIPT>
	var t, l, page, altura;
	var w = screen.availWidth;
	var h = screen.availHeight;
	var largura = 680;
	l = (w - largura) / 2;

	altura = 480;
	t = (h - altura ) / 2;		
		
	open("relatorio.jsp", "blank", "scrollbars=yes, top=" + t + ", left=" + l + ", width=" + largura + ", height=" + altura);
</SCRIPT>

</logic:present>
</html:form>
</html:html>


