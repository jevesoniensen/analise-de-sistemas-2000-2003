package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.vinculoempregaticio.VinculoEmpregaticio;
import br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioHome;
import br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjVinculoEmpregaticio {

	/**
	 * Constructor for ObjVinculoEmpregaticio.
	 */
	public ObjVinculoEmpregaticio() {
		super();
	}
	
	public static VinculoEmpregaticio findByPrimaryKey(int vinculoEmpregaticio) throws Exception{		
			InitialContext ctx;
			VinculoEmpregaticio col = null;
			try {
				ctx = new InitialContext();
				VinculoEmpregaticioHome home = (VinculoEmpregaticioHome)ctx.lookup("ejb/br/smat/ejb/vinculoempregaticio/VinculoEmpregaticioHome");
					try {
						col = (VinculoEmpregaticio)home.findByPrimaryKey(new VinculoEmpregaticioKey(vinculoEmpregaticio));
					} catch (RemoteException e) {
						throw new Exception(" ObjVinculoEmpregaticio findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjVinculoEmpregaticio findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjVinculoEmpregaticio findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjVinculoEmpregaticio findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}		
	
	public static Collection findAllVinculosEmpregaticios() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				VinculoEmpregaticioHome home = (VinculoEmpregaticioHome)ctx.lookup("ejb/br/smat/ejb/vinculoempregaticio/VinculoEmpregaticioHome");
					try {
						col = (Collection)home.findAllVinculosEmpregaticios();
					} catch (RemoteException e) {
						throw new Exception(" ObjVinculoEmpregaticio findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjVinculoEmpregaticio findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjVinculoEmpregaticio findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjVinculoEmpregaticio findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}		

}
