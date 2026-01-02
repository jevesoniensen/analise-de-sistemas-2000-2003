package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.estadocivil.EstadoCivil;
import br.smat.ejb.estadocivil.EstadoCivilHome;
import br.smat.ejb.estadocivil.EstadoCivilKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjEstadoCivil {

	/**
	 * Constructor for ObjEstadoCivil.
	 */
	public ObjEstadoCivil() {
		super();
	}

	public static EstadoCivil findByPrimaryKey(int estadoCivil) throws Exception{		
			InitialContext ctx;
			EstadoCivil col = null;
			try {
				ctx = new InitialContext();
				EstadoCivilHome home = (EstadoCivilHome)ctx.lookup("ejb/br/smat/ejb/estadocivil/EstadoCivilHome");
					try {
						col = (EstadoCivil)home.findByPrimaryKey(new EstadoCivilKey(estadoCivil));
					} catch (RemoteException e) {
						throw new Exception(" ObjEstadoCivil findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjEstadoCivil findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjEstadoCivil findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjEstadoCivil findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}

	public static Collection findAllEstadosCivis() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				EstadoCivilHome home = (EstadoCivilHome)ctx.lookup("ejb/br/smat/ejb/estadocivil/EstadoCivilHome");
					try {
						col = (Collection)home.findAllEstadosCivis();
					} catch (RemoteException e) {
						throw new Exception(" ObjEstadoCivil findAllEstadosCivis RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjEstadoCivil findAllEstadosCivis FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjEstadoCivil findAllEstadosCivis Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjEstadoCivil findAllEstadosCivis NamingException=> " + e.getMessage());
			}
			return col;			 		
	}

}
