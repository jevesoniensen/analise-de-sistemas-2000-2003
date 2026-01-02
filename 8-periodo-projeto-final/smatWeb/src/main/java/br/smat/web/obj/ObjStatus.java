package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.status.Status;
import br.smat.ejb.status.StatusHome;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjStatus {

	/**
	 * Constructor for ObjStatus.
	 */
	public ObjStatus() {
		super();
	}


	public static Collection findAllStatus() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				StatusHome home = (StatusHome)ctx.lookup("ejb/br/smat/ejb/status/StatusHome");
				col = (Collection)home.findAllStatus();
			}catch (NamingException e) {
				throw new Exception("ObjStatus findAllStatus NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjStatus findAllStatus RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjStatus findAllStatus FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjStatus findAllStatus Exception=> " + e.getMessage());
			}
			return col;			 		
	}

}
