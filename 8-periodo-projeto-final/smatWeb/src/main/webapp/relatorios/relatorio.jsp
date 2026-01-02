<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>


<html:html>
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<logic:present name="relatorio">
<CENTER>
	<H3>
		<bean:write name="relatorio" property="titulo"/>
	</H3>
</CENTER>
<BR>
<BR>
<TABLE >
	<TR>
		<TH align="left" >
				Tipo do Relatório:
		</TH>
		<TD align="left">
			<LABEL><bean:write name="relatorio" property="campo1"/>
			<logic:present name="relatorio" property="campo2"> 
				X <bean:write name="relatorio" property="campo2"/>
			</logic:present></LABEL>		
		</TD>
	</TR>
	<TR>
		<TH align="left">
				Período:
		</TH>
		<TD>
			<LABEL><bean:write name="relatorio" property="dataInicial"/> à <bean:write name="relatorio" property="dataFinal"/></LABEL>
		</TD>
	</TR>
	<TR>
		<TH align="left">
				Periodicidade:
		</TH>
		<TD>
			<LABEL><bean:write name="relatorio" property="nomePeriodicidade"/></LABEL>
		</TD>
	</TR>
</TABLE>
<BR>
<BR>
	<logic:iterate id="mesAno" property="mesAno" name="relatorio">
		<table border="1" bordercolor="black" width="100%">
			<TR>
				<TH align="left" colspan="<bean:write name="relatorio" property="colSpanPeriodo"/>">	
						<bean:write name="mesAno"/>
				</TH>
			</TR>
				<TR>
					<TD><LABEL>&nbsp;</LABEL>
					</TD>
					<logic:iterate id="campo1" property="nomeRegistrosCampo1" name="relatorio">
						<TH align="center" colspan="<bean:write name="relatorio" property="lengthCampo2"/>">
								<bean:write name="campo1"/>
						</TH>
					</logic:iterate>					
				</TR>
				<logic:present name="relatorio" property="campo2">
					<TR>
						<TH align="center"><bean:write name="relatorio" property="labelLocal"/></TH>
							<logic:iterate id="campo1" property="nomeRegistrosCampo1" name="relatorio">
								<logic:iterate id="campo2" property="nomeRegistrosCampo2" name="relatorio">
									<TH align="center">
											<bean:write name="campo2"/>
									</TH>
								</logic:iterate>
							</logic:iterate>
					</TR>
				</logic:present>
				<logic:iterate id="local" property="nomeLocal" name="relatorio">
				<TR>
					<TH>
						<bean:write name="local"/>
					</TH>
					<logic:iterate id="quantidade" property="quantidade" name="relatorio">
						<TD align="right">
							<logic:present name="quantidade">
								<LABEL><bean:write name="quantidade"/></LABEL>
							</logic:present>
							<logic:notPresent name="quantidade">
								<LABEL>0</LABEL>
							</logic:notPresent>							
						</TD>
					</logic:iterate>
				</TR>
				</logic:iterate>
		</table>
		<BR>
		<BR>
	</logic:iterate>
	<logic:present name="relatorio" property="texto">
		<CENTER>
		
			<TABLE border="1" bordercolor="black" width="100%">
				<TR>
					<Td>
						<LABEL><bean:write name="relatorio" property="texto"/></LABEL>
					</Td>
				</TR>
			</TABLE>
		</CENTER>
	</logic:present><BR><BR><BR><BR><BR>
	<CENTER>
		<html:button property="imprimir" onclick="print()">IMPRIMIR</html:button>
	</CENTER>
</logic:present>
<logic:notPresent name="relatorio">
	<BR>
	<BR>
	<BR>
	<BR>
	<BR>
	<CENTER>
		<H4>
			Não há um relatório para ser gerado!
		</H4>
	</CENTER>
</logic:notPresent>
</html:html>