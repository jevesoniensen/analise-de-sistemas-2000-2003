package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.emitente.Emitente;
import br.smat.ejb.emitente.EmitenteHome;
import br.smat.ejb.emitente.EmitenteKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjEmitente {

	/**
	 * Constructor for ObjEmitente.
	 */
	public ObjEmitente() {
		super();
	}
	
	public static Emitente findByPrimaryKey(int emitente) throws Exception{		
			InitialContext ctx;
			Emitente col = null;
			try {
				ctx = new InitialContext();
				EmitenteHome home = (EmitenteHome)ctx.lookup("ejb/br/smat/ejb/emitente/EmitenteHome");
					try {
						col = (Emitente)home.findByPrimaryKey(new EmitenteKey(emitente));
					} catch (RemoteException e) {
						throw new Exception(" ObjEmitente findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjEmitente findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjEmitente findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjEmitente findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}		
	
	public static Collection findAllEmitentes() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				EmitenteHome home = (EmitenteHome)ctx.lookup("ejb/br/smat/ejb/emitente/EmitenteHome");
					try {
						col = (Collection)home.findAllEmitentes();
					} catch (RemoteException e) {
						throw new Exception(" ObjEmitente findAllEmitentes RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjEmitente findAllEmitentes FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjEmitente findAllEmitentes Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjEmitente findAllEmitentes NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	

}
