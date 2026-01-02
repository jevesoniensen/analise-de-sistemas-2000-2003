package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.controleacesso.ejb.pagina.Pagina;
import br.smat.controleacesso.ejb.pagina.PaginaHome;
import br.smat.controleacesso.ejb.usuario.Usuario;



/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjPagina {
	
	public static Pagina validaPermissaoPagina(Usuario usuario,int idPagina) throws Exception{
		
		System.out.println("Usuario => " + usuario.getUsuario());
		
		InitialContext ctx;
		Pagina pagina = null;
		try {
			ctx = new InitialContext();
			PaginaHome home = (PaginaHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/pagina/PaginaHome");
				try {
					pagina = (Pagina)home.findPermisaoPagina(usuario.getUsuario(),idPagina);
				} catch (RemoteException e) {
					throw new Exception(" ObjPagina validaPermissaoPagina RemoteException=> " + e.getMessage());
				} catch (FinderException e) {
					throw new Exception("ObjPagina validaPermissaoPagina FinderException=> " + e.getMessage());
				} catch (Exception e) {
					throw new Exception("ObjPagina validaPermissaoPagina Exception=> " + e.getMessage());
				}								
		} catch (NamingException e) {
			throw new Exception("ObjPagina validaPermissaoPagina NamingException=> " + e.getMessage());
		}
		
		return pagina;
	}

}
