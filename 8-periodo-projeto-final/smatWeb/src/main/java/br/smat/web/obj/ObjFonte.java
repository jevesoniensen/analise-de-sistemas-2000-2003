package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.fonte.Fonte;
import br.smat.ejb.fonte.FonteHome;
import br.smat.ejb.fonte.FonteKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjFonte {

	/**
	 * Constructor for ObjFonte.
	 */
	public ObjFonte() {
		super();
	}

	public static Fonte findByPrimaryKey(int fonte) throws Exception{		
			InitialContext ctx;
			Fonte col = null;
			try {
				ctx = new InitialContext();
				FonteHome home = (FonteHome)ctx.lookup("ejb/br/smat/ejb/fonte/FonteHome");
					try {
						col = (Fonte)home.findByPrimaryKey(new FonteKey(fonte));
					} catch (RemoteException e) {
						throw new Exception(" ObjFonte findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjFonte findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjFonte findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjFonte findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllFontes() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				FonteHome home = (FonteHome)ctx.lookup("ejb/br/smat/ejb/fonte/FonteHome");
					try {
						col = (Collection)home.findAllFontes();
					} catch (RemoteException e) {
						throw new Exception(" ObjFonte findAllFontes RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjFonte findAllFontes FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjFonte findAllFontes Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjFonte findAllFontes NamingException=> " + e.getMessage());
			}
			return col;			 		
	}		

}
