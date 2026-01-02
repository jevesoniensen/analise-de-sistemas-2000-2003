package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.medico.Medico;
import br.smat.ejb.medico.MedicoHome;
import br.smat.ejb.medico.MedicoKey;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjMedico {


	public static Medico findByPrimaryKey(int medico) throws Exception{	
			InitialContext ctx;

			Medico m = null;

			if(medico > 0){	
				try {
					ctx = new InitialContext();
					MedicoHome home = (MedicoHome)ctx.lookup("ejb/br/smat/ejb/medico/MedicoHome");
						try {
							m = (Medico)home.findByPrimaryKey(new MedicoKey(medico));
						} catch (RemoteException e) {
							throw new Exception(" ObjMedico findByPrimaryKey RemoteException=> " + e.getMessage());
						} catch (FinderException e) {
							throw new Exception("ObjMedico findByPrimaryKey FinderException=> " + e.getMessage());
						} catch (Exception e) {
							throw new Exception("ObjMedico findByPrimaryKey Exception=> " + e.getMessage());
						}								
				} catch (NamingException e) {
					throw new Exception("ObjMedico findByPrimaryKey NamingException=> " + e.getMessage());
				}
			}
			return m;			 		
	}
}
