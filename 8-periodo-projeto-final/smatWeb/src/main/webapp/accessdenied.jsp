
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
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<CENTER><h4>Você não tem acesso a esta página.<BR>Contate um Administrador do Sistema.</h4></CENTER>
</BODY>
<form name="inicial">
</form>
</html:html>
