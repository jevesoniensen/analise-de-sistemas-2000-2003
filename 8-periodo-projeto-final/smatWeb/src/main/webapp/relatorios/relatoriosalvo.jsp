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
<SCRIPT>
		function refresh(){
			document.forms["RelatorioSalvo"].acao.value = "LISTAR";
			document.forms["RelatorioSalvo"].action     = "./RelatorioSalvo.do";			
			document.forms["RelatorioSalvo"].submit();
		}
		
		function seleciona(rel){
			document.forms["RelatorioSalvo"].acao.value = "LISTAR";
			document.forms["RelatorioSalvo"].relSelected.value = rel;
			document.forms["RelatorioSalvo"].action     = "./RelatorioSalvo.do";			
			document.forms["RelatorioSalvo"].submit();
		}

		function formGerar(){
			document.forms["RelatorioSalvo"].acao.value = "GERAR";
			document.forms["RelatorioSalvo"].action     = "./RelatorioSalvo.do";			
			document.forms["RelatorioSalvo"].submit();
		}

		function formExcluir(){
			document.forms["RelatorioSalvo"].acao.value = "EXCLUIR";
			document.forms["RelatorioSalvo"].action     = "./RelatorioSalvo.do";			
			document.forms["RelatorioSalvo"].submit();
		}		
</SCRIPT>
</HEAD>
<body  vlink="#666666" alink="#666666" link="#666666">
<html:form action="/relatorios/RelatorioSalvo">
<html:hidden property="acao" value="LISTAR"/>
<html:hidden property="relSelected"/>  
<TABLE  border="1" bordercolor="#666666" width="100%">
	<TR>
		<TH align="center" colspan="2">
			<H3>Relatórios salvos</H3>
		</TH>
	</TR>
	<logic:present name="colRelatorioSalvo">
		<logic:present name="relSalvo">
			<TR>
				<TD>
					<LABEL>Título</LABEL>
				</TD>
				<TD>
					<FONT><bean:write name="relSalvo" property="titulo"/></FONT>
				</TD>			
			</TR>
			<TR>
				<TD>
					<LABEL>Data de criação</LABEL>
				</TD>
				<TD>
					<FONT><bean:write name="relSalvo" property="dataCriacao"/></FONT>
				</TD>			
			</TR>
			<TR>
				<TD>
					<LABEL>Período</LABEL>
				</TD>
				<TD>
					<FONT><bean:write name="relSalvo" property="dataInicio" /> à 
					<bean:write name="relSalvo" property="dataFim"/></FONT>
				</TD>			
			</TR>
			<TR>
				<TD>
					<LABEL>Texto</LABEL>
				</TD>
				<TD>
					<FONT><html:textarea property="textarea" cols="45" rows="5" readonly="true" styleClass="TEXTAREADISABLE"></html:textarea></FONT>
				</TD>			
			</TR>
		<TR>
			<TD colspan="2" align="center">
				<html:button property="gravar"   onclick="formGerar()" styleClass="BOTAO" >GERAR&nbsp;&nbsp;</html:button>&nbsp;&nbsp;&nbsp;
				<html:button property="gravar"   onclick="formExcluir()" styleClass="BOTAO" >EXCLUIR</html:button>
			</TD>
		</TR>
		</logic:present>		
		<logic:notPresent name="relSalvo">
			<TR>
				<TD align="center" colspan="2">
					<h4>Selecione um relatório salvo na lista abaixo</h4>
				</TD>
			</TR>	
		</logic:notPresent>			
		<logic:present name="erroBanco">
			<TR>
				<TH colspan="2" align="center">
					<H4><bean:write  name="erroBanco" /></H4>
				</TH>
			</TR>	
		</logic:present>				
		<TR>
			<TD colspan="2" align="left">
				&nbsp;
			</TD>
		</TR>		
		<TR>
			<TD colspan="2">			
				<TABLE border="1" bordercolor="black" width="100%">
						<TR>
							<TH align="left" bgcolor="#C0C0C0">
								Relatório
							</TH>
							<TH align="left" bgcolor="#C0C0C0">
								Data de criação
							</TH>
						</TR>
					<logic:iterate id="relatorioSalvo" name="colRelatorioSalvo" >
						<TR>
							<TD>
								<a href="javascript:seleciona(<bean:write name="relatorioSalvo" property="relatorio" />);">
									<bean:write name="relatorioSalvo" property="titulo"/>
								</a>
							</TD>
							<TD align="left">
								<a href="javascript:seleciona(<bean:write name="relatorioSalvo" property="relatorio" />);">				
									Salvo em: <bean:write name="relatorioSalvo" property="dataCriacao"/>
								</a>					
							</TD>
						</TR>
					</logic:iterate>									
				</TABLE>
			</TD>
		</TR>
	</logic:present>
</TABLE>
</html:form>
</body>
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
</html:html>
