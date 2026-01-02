
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>
<HEAD>
<LINK href="theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>Login - SMAT</TITLE>
<SCRIPT>

		function formGravar(){
			document.forms["Login"].acao.value = "GRAVAR";
			document.forms["Login"].action     = "./Login.do";
			document.forms["Login"].submit();		
		}
</SCRIPT>

</HEAD>
<%

//	out.print("session id " + request.getRequestedSessionId());

	//request.getSession(true).invalidate();

%>
<body bgcolor="#FFFFFF" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<html:form action="/Login" target="_top">
<html:hidden property="acao" value="LISTAR"/> 
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr> 
    <td height="93" align="left" valign="top" background="theme/images/login/backgrd_top-login.gif"><img src="theme/images/login/img_login.jpg" width="774" height="93"></td>
  </tr>
  <tr> 
    <td bgcolor="#516B86" align="left" valign="top" height="2">  
    <img src="theme/images/spacer.gif" width="2" height="2"></td>
  </tr>
  <tr valign="top"> 
    <td align="left" valign="top">
      <table width="774" border="0" cellspacing="0" cellpadding="0" height="100%">
        <tr align="left" valign="middle"> 
          <td width="150" align="left" background="theme/images/login/backgrd_menu.gif">&nbsp; </td>
          <td width="624" valign="top"><br><br><br>
	    	<TABLE align="center">
	    	<TR valign="top">
	    		<TD>
				<LABEL>Usuário</LABEL>
				</TD>
				<TD>
					<html:text property="nomeUsuario" size="10" maxlength="20" value="" styleClass="TEXT"/>
				<TD>
			</TR>
			<TR valign="top">
				<TD>
					<LABEL>Senha</LABEL>
				</TD>
				<TD>
					<html:password property="senha" size="10" maxlength="20" value="" styleClass="TEXT"/>
				<TD>
			</TR>	
			<TR valign="top">
				<TD colspan="2" align="center">
					<html:button property="gravar"   onclick="formGravar()" styleClass="BOTAO" >ENTRAR</html:button>&nbsp;&nbsp;&nbsp;
				<TD>
			</TR>
			<logic:present name="erroBanco">
				<TR>
					<TH colspan="2">
						<H4><bean:write  name="erroBanco" /></H4>
					</TH>
				</TR>
			</logic:present>				
		</TABLE>              
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
<html:errors/>
</html:form>
</body>
</html:html>