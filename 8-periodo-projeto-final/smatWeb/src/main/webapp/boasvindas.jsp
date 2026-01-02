
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet" type="text/css">

<logic:notPresent name="usuario">
	<logic:forward name="LoginInit"/>
</logic:notPresent>
<html:html>
<HEAD>


<TITLE></TITLE>
</HEAD>

<BODY>
<form name="inicial">
<TABLE width="100%" align="center">
	<TR>
		<TD align="center"><h3>Bem vindo ao SMAT!</h3></TD>
	</TR>
</TABLE>
</form>
</BODY>
</html:html>
