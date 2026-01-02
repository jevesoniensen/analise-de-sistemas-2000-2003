package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.tipolocalacidente.TipoLocalAcidente;
import br.smat.ejb.tipolocalacidente.TipoLocalAcidenteHome;
import br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTipoLocalAcidente {

	/**
	 * Constructor for ObjTipoLocalAcidente.
	 */
	public ObjTipoLocalAcidente() {
		super();
	}

	public static TipoLocalAcidente findByPrimaryKey(int tipoLocalAcidente) throws Exception{		
			InitialContext ctx;
			TipoLocalAcidente col = null;
			try {
				ctx = new InitialContext();
				TipoLocalAcidenteHome home = (TipoLocalAcidenteHome)ctx.lookup("ejb/br/smat/ejb/tipolocalacidente/TipoLocalAcidenteHome");
				col = (TipoLocalAcidente)home.findByPrimaryKey(new TipoLocalAcidenteKey(tipoLocalAcidente));
			}catch (NamingException e) {
				throw new Exception("ObjTipoLocalAcidente findByPrimaryKey NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjTipoLocalAcidente findByPrimaryKey RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjTipoLocalAcidente findByPrimaryKey FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjTipoLocalAcidente findByPrimaryKey Exception=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllTiposLocalAcidente() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				TipoLocalAcidenteHome home = (TipoLocalAcidenteHome)ctx.lookup("ejb/br/smat/ejb/tipolocalacidente/TipoLocalAcidenteHome");
				col = (Collection)home.findAllTiposLocalAcidente();
			}catch (NamingException e) {
				throw new Exception("ObjTipoLocalAcidente findAllTiposLocalAcidente NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjTipoLocalAcidente findAllTiposLocalAcidente RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjTipoLocalAcidente findAllTiposLocalAcidente FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjTipoLocalAcidente findAllTiposLocalAcidente Exception=> " + e.getMessage());
			}
			return col;			 		
	}		

}
