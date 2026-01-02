package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.ocupacao.Ocupacao;
import br.smat.ejb.ocupacao.OcupacaoHome;
import br.smat.ejb.ocupacao.OcupacaoKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjOcupacao {

	/**
	 * Constructor for ObjOcupacao.
	 */
	public ObjOcupacao() {
		super();
	}

	public static Ocupacao findByPrimaryKey(int ocupacao) throws Exception{		
			InitialContext ctx;
			Ocupacao col = null;
			try {
				ctx = new InitialContext();
				OcupacaoHome home = (OcupacaoHome)ctx.lookup("ejb/br/smat/ejb/ocupacao/OcupacaoHome");
					try {
						col = (Ocupacao)home.findByPrimaryKey(new OcupacaoKey(ocupacao));
					} catch (RemoteException e) {
						throw new Exception(" ObjOcupacao findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjOcupacao findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjOcupacao findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjOcupacao findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllOcupacoes() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				OcupacaoHome home = (OcupacaoHome)ctx.lookup("ejb/br/smat/ejb/ocupacao/OcupacaoHome");
					try {
						col = (Collection)home.findAllOcupacoes();
					} catch (RemoteException e) {
						throw new Exception(" ObjOcupacao findAllOcupacoes RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjOcupacao findAllOcupacoes FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjOcupacao findAllOcupacoes Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjOcupacao findAllOcupacoes NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	

}
