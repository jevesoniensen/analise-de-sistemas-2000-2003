package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.estado.Estado;
import br.smat.ejb.estado.EstadoHome;
import br.smat.ejb.estado.EstadoKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjEstado {
	public ObjEstado(){
	}
	
	public static Collection findAllEstados() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				EstadoHome home = (EstadoHome)ctx.lookup("ejb/br/smat/ejb/estado/EstadoHome");
					try {
						col = (Collection)home.findAllEstados();
					} catch (RemoteException e) {
						throw new Exception(" ObjEstado findAllEstados RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjEstado findAllEstados FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjEstado findAllEstados Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjEstado findAllEstados NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Estado findByPrimaryKey(int estado) throws Exception{		
			InitialContext ctx;
			Estado col = null;
			if(estado > 0){
				try {
					ctx = new InitialContext();
					EstadoHome home = (EstadoHome)ctx.lookup("ejb/br/smat/ejb/estado/EstadoHome");
						try {
							col = (Estado)home.findByPrimaryKey(new EstadoKey(estado));
						} catch (RemoteException e) {
						throw new Exception(" ObjEstado findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjEstado findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjEstado findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjEstado findByPrimaryKey NamingException=> " + e.getMessage());
			}
			}
			return col;			 		
	}		
}
