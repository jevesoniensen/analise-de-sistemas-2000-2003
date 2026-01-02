package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.tipodepoimento.TipoDepoimentoHome;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTipoDepoimento {

	public static Collection findAllTiposDepoimentos() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				TipoDepoimentoHome home = (TipoDepoimentoHome)ctx.lookup("ejb/br/smat/ejb/tipodepoimento/TipoDepoimentoHome");
					try {
						col = (Collection)home.findAllTiposDepoimento();
					} catch (RemoteException e) {
						throw new Exception(" ObjTipoDepoimento findAllTiposDepoimentos RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjTipoDepoimento findAllTiposDepoimentos FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjTipoDepoimento findAllTiposDepoimentos Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjTipoDepoimento findAllTiposDepoimentos NamingException=> " + e.getMessage());
			}
			return col;			 		
	}
}
