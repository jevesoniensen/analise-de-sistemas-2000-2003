package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.trabalhador.Trabalhador;
import br.smat.ejb.trabalhador.TrabalhadorHome;
import br.smat.ejb.trabalhador.TrabalhadorKey;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTrabalhador {
	

	public static Trabalhador findByPrimaryKey(int trabalhador) throws Exception{		

			InitialContext ctx;
			Trabalhador t  =null;
			try {
				ctx = new InitialContext();
				TrabalhadorHome home = (TrabalhadorHome)ctx.lookup("ejb/br/smat/ejb/trabalhador/TrabalhadorHome");
				t = (Trabalhador)home.findByPrimaryKey(new TrabalhadorKey(trabalhador));
			}catch (NamingException e) {
				throw new Exception("objTrabalhador findByPrimaryKey NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" objTrabalhador findByPrimaryKey RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("objTrabalhador findByPrimaryKey FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("objTrabalhador findByPrimaryKey Exception=> " + e.getMessage());
			}

			return t;			 		
	}


	public static Trabalhador findByAcidente(int acidente) throws Exception{		

			InitialContext ctx;
			Trabalhador t  =null;
			try {
				ctx = new InitialContext();
				TrabalhadorHome home = (TrabalhadorHome)ctx.lookup("ejb/br/smat/ejb/trabalhador/TrabalhadorHome");
				t = (Trabalhador)home.findByAcidente(acidente);
			}catch (NamingException e) {
				throw new Exception("objTrabalhador findByAcidente NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" objTrabalhador findByAcidente RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("objTrabalhador findByAcidente FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("objTrabalhador findByAcidente Exception=> " + e.getMessage());
			}

			return t;			 		
	}
}
