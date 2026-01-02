package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.tipoacidente.TipoAcidente;
import br.smat.ejb.tipoacidente.TipoAcidenteHome;
import br.smat.ejb.tipoacidente.TipoAcidenteKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTipoAcidente {

	/**
	 * Constructor for ObjTipoAcidente.
	 */
	public ObjTipoAcidente() {
		super();
	}

	public static TipoAcidente findByPrimaryKey(int tipoAcidente) throws Exception{		
			InitialContext ctx;
			TipoAcidente col = null;
			try {
				ctx = new InitialContext();
				TipoAcidenteHome home = (TipoAcidenteHome)ctx.lookup("ejb/br/smat/ejb/tipoacidente/TipoAcidenteHome");
				col = (TipoAcidente)home.findByPrimaryKey(new TipoAcidenteKey(tipoAcidente));
			}catch (NamingException e) {
				throw new Exception("ObjTipoAcidente findByPrimaryKey NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjTipoAcidente findByPrimaryKey RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjTipoAcidente findByPrimaryKey FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjTipoAcidente findByPrimaryKey Exception=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllTiposAcidente() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				TipoAcidenteHome home = (TipoAcidenteHome)ctx.lookup("ejb/br/smat/ejb/tipoacidente/TipoAcidenteHome");
				col = (Collection)home.findAllTiposAcidente();
			}catch (NamingException e) {
				throw new Exception("ObjTipoAcidente findAllTiposAcidente NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjTipoAcidente findAllTiposAcidente RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjTipoAcidente findAllTiposAcidente FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjTipoAcidente findAllTiposAcidente Exception=> " + e.getMessage());
			}
			return col;			 		
	}		

}
