package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.controleacesso.ejb.grupo.Grupo;
import br.smat.controleacesso.ejb.grupo.GrupoHome;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjGrupo {

	/**
	 * Constructor for ObjGrupo.
	 */
	public ObjGrupo() {
		super();
	}
	
	
	public static Grupo[] findAll() throws Exception{
			InitialContext ctx;
			Grupo[] grupo = null;
			try {
				ctx = new InitialContext();
				GrupoHome home = (GrupoHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/grupo/GrupoHome");
					try {
						grupo = (Grupo[])home.findAll().toArray(new Grupo[0]);
					} catch (RemoteException e) {
						throw new Exception(" ObjGrupo findAll RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGrupo findAll FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGrupo findAll Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGrupo findAll NamingException=> " + e.getMessage());
			}
			return grupo;			
	}

}
