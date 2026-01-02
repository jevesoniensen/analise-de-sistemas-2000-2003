package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaHome;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTipoMedidaCorretiva {

	/**
	 * Constructor for ObjTipoMedidaCorretiva.
	 */
	public ObjTipoMedidaCorretiva() {
		super();
	}

	public static Collection findAllTipoMedidaCorretiva() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				TipoMedidaCorretivaHome home = (TipoMedidaCorretivaHome)ctx.lookup("ejb/br/smat/ejb/tipomedidacorretiva/TipoMedidaCorretivaHome");
				col = (Collection)home.findAllTipoMedidaCorretiva();
			}catch (NamingException e) {
				throw new Exception("ObjTipoLocalAcidente findAllTipoMedidaCorretiva NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjTipoLocalAcidente findAllTipoMedidaCorretiva RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjTipoLocalAcidente findAllTipoMedidaCorretiva FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjTipoLocalAcidente findAllTipoMedidaCorretiva Exception=> " + e.getMessage());
			}
			return col;			 		
	}	

}
