<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
					document.forms["UsuarioGrupoForm"].acao.value = "LISTAR";
					document.forms["UsuarioGrupoForm"].destino.value = "";
					document.forms["UsuarioGrupoForm"].action     = "/smatWeb/administrador/UsuarioGrupo.do";			
					document.forms["UsuarioGrupoForm"].submit();
				}			
				
				function gravar(){
					document.forms["UsuarioGrupoForm"].acao.value = "GRAVAR";
					document.forms["UsuarioGrupoForm"].destino.value = "";
					document.forms["UsuarioGrupoForm"].action     = "/smatWeb/administrador/UsuarioGrupo.do";			
					document.forms["UsuarioGrupoForm"].submit();					
				}
				
				function limpar(){
					document.forms["UsuarioGrupoForm"].usuario.value = 0;
					document.forms["UsuarioGrupoForm"].grupo.value = 0;									}
				
				function excluir(){
					document.forms["UsuarioGrupoForm"].acao.value = "EXCLUIR";
					document.forms["UsuarioGrupoForm"].destino.value = "";
					document.forms["UsuarioGrupoForm"].action     = "/smatWeb/administrador/UsuarioGrupo.do";			
					document.forms["UsuarioGrupoForm"].submit();			
				}				
				
				function preencheForm(usuario,grupo){
					document.forms["UsuarioGrupoForm"].acao.value = "PREENCHEFORM";
					document.forms["UsuarioGrupoForm"].destino.value = "";
					document.forms["UsuarioGrupoForm"].usuario.value = usuario;
					document.forms["UsuarioGrupoForm"].grupo.value = grupo;					
					document.forms["UsuarioGrupoForm"].action     = "/smatWeb/administrador/UsuarioGrupo.do";			
				}	
		</script>	
	</head>
<BODY alink="#66666" vlink="#66666" link="#66666">
	<html:form action="/administrador/UsuarioGrupo">
	<html:hidden property="acao" />
	<html:hidden property="destino" />	
	<html:errors/>	
	<TABLE width="100%">
	<TBODY>
		<tr>
			<TH colspan="2">
				<H3>Usuários e Grupos</H3>
			<TH/>
		</tr>	
			<TR>
				<TD width="30"><LABEL>Usuário</LABEL></TD>
				<TD>
					<html:select property="usuario" styleClass="SELECT">
						<html:option value="0">- Usuário --</html:option>
						<logic:present name="colUsuario">
							<html:options 	collection="colUsuario" 
											labelName="nome" 
											property="usuario"
											name="usuario"
											labelProperty="nome"/>
						</logic:present>
					</html:select>
				</TD>
			</TR>	
			<TR>
				<TD width="30"><LABEL>Grupo</LABEL></TD>
				<TD>
					<html:select property="grupo" styleClass="SELECT">
						<html:option value="0">- Grupo --</html:option>
						<logic:present name="colGrupo">
							<html:options 	collection="colGrupo" 
											labelName="nome" 
											property="grupo"
											name="grupo"
											labelProperty="nome"/>
						</logic:present>
					</html:select>
				</TD>
			</TR>				
			<logic:present name="mensagem">
				<tr>
					<td align="center" colspan="2">
						<h4>
							<bean:write name="mensagem"/>
						</h4>
					</td>
				</tr>			
			</logic:present>																
			<tr>
				<td width="30">
					&nbsp;
				</td>
				<td>					
					<html:button property="btGravar" 	value="GRAVAR"  onclick="gravar()"  styleClass="BOTAO" />
					<html:button property="btLimpar" 	value="LIMPAR"  onclick="limpar()"  styleClass="BOTAO" />
					<html:button property="btExcluir" 	value="EXCLUIR" onclick="excluir()" styleClass="BOTAO" />										
				</td>				
			</tr>						
		</TBODY>
	</TABLE>
	<BR>		
	<logic:present name="colUsuarioGrupo" >
	<TABLE border="1" width="100%" bordercolor="#666666" >
		<TBODY>
			<TR>
				<Th colspan="2"  bgcolor="#C0C0C0">
					Usuários/Grupos
				</TH>
			</TR>
			<TR>
				<TH  bgcolor="#C0C0C0">
					Usuário
				</TH>
				<TH  bgcolor="#C0C0C0">
					Grupo
				</TH>
			</TR>
			<logic:iterate name="colUsuarioGrupo" id="auxAS">
			<TR>
				<TD>
					<a href="javascript:preencheForm(<bean:write name="auxAS" property="usuarioKey"/>,
														<bean:write name="auxAS" property="grupoKey"/>)">
						<bean:write name="auxAS" property="nomeUsuario"/>
					</a>	
				</TD>
				<TD>
					<a href="javascript:preencheForm(<bean:write name="auxAS" property="usuarioKey"/>,
														<bean:write name="auxAS" property="grupoKey"/>)">
						<bean:write name="auxAS" property="nomeGrupo"/>				
					</a>	
				</TD>			
			</TR>			
			</logic:iterate>
		</TBODY>
	</TABLE>
	</logic:present>		
	</html:form>
</BODY>
</html:html>