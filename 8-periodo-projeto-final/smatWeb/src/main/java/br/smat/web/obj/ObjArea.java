package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.area.Area;
import br.smat.ejb.area.AreaHome;
import br.smat.ejb.area.AreaKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjArea {

	/**
	 * Constructor for ObjArea.
	 */
	public ObjArea() {
		super();
	}
	
	public static Area findByPrimaryKey(int area) throws Exception{		
			InitialContext ctx;
			Area col = null;
			try {
				ctx = new InitialContext();
				AreaHome home = (AreaHome)ctx.lookup("ejb/br/smat/ejb/area/AreaHome");
					try {
						col = (Area)home.findByPrimaryKey(new AreaKey(area));
					}  catch (RemoteException e) {
						throw new Exception(" ObjArea findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjArea findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjArea findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjArea findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}		
	
	public static Collection findAllAreas() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				AreaHome home = (AreaHome)ctx.lookup("ejb/br/smat/ejb/area/AreaHome");
					try {
						col = (Collection)home.findAllAreas();
					} catch (RemoteException e) {
						throw new Exception(" ObjArea findAllAreas RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjArea findAllAreas FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjArea findAllAreas Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjArea findAllAreas NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
	

}
