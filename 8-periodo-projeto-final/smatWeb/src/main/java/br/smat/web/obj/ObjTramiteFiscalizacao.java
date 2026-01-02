package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.fiscalizacao.FiscalizacaoKey;
import br.smat.ejb.status.StatusKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacao;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoHome;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTramiteFiscalizacao {

	/**
	 * Constructor for ObjTramiteFiscalizacao.
	 */
	public ObjTramiteFiscalizacao() {
		super();
	}

	public static Collection findAllTramitesFiscalizacao(int fiscalizacao) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				TramiteFiscalizacaoHome home = (TramiteFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/tramitefiscalizacao/TramiteFiscalizacaoHome");
					try {
						col = (Collection)home.findAllTramitesFiscalizacao(fiscalizacao);
							
					} catch (RemoteException e) {
						throw new Exception(" ObjFonte findAllTramitesFiscalizacao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjFonte findAllTramitesFiscalizacao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjFonte findAllTramitesFiscalizacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjFonte findAllTramitesFiscalizacao NamingException=> " + e.getMessage());
			}
			return col;			 		
	}

	public static void atualizaStatus(int fiscalizacao,int tramite,int status)
	throws Exception{
			InitialContext ctx;

			try {
				ctx = new InitialContext();
				TramiteFiscalizacaoHome home = (TramiteFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/tramitefiscalizacao/TramiteFiscalizacaoHome");
				
				
					try {
						TramiteFiscalizacao tramiteFiscalizacao = home.findByPrimaryKey(new TramiteFiscalizacaoKey(tramite,new FiscalizacaoKey(fiscalizacao))); 
						
						tramiteFiscalizacao.setStatus(new StatusKey(status));
							
					} catch (RemoteException e) {
						throw new Exception(" ObjFonte findAllTramitesFiscalizacao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjFonte findAllTramitesFiscalizacao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjFonte findAllTramitesFiscalizacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjFonte findAllTramitesFiscalizacao NamingException=> " + e.getMessage());
			}

	}
	
}
