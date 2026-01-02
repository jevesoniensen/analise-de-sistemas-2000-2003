package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.diagnostico.Diagnostico;
import br.smat.ejb.diagnostico.DiagnosticoHome;
import br.smat.ejb.diagnostico.DiagnosticoKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjDiagnostico {

	/**
	 * Constructor for ObjDiagnostico.
	 */
	public ObjDiagnostico() {
		super();
	}

	public static Diagnostico findByPrimaryKey(int diagnostico) throws Exception{		
			InitialContext ctx;
			Diagnostico col = null;
			try {
				ctx = new InitialContext();
				DiagnosticoHome home = (DiagnosticoHome)ctx.lookup("ejb/br/smat/ejb/diagnostico/DiagnosticoHome");
					try {
						col = (Diagnostico)home.findByPrimaryKey(new DiagnosticoKey(diagnostico));
					} catch (RemoteException e) {
						throw new Exception(" ObjDiagnostico findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjDiagnostico findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjDiagnostico findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjDiagnostico findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllDiagnosticos() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				DiagnosticoHome home = (DiagnosticoHome)ctx.lookup("ejb/br/smat/ejb/diagnostico/DiagnosticoHome");
					try {
						col = (Collection)home.findAllDiagnosticos();
					} catch (RemoteException e) {
						throw new Exception(" ObjDiagnostico findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjDiagnostico findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjDiagnostico findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjDiagnostico findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}		

}
