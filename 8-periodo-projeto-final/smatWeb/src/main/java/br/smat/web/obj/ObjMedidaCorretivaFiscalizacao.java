package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.medidacorretivafiscalizacao.MedidaCorretivaFiscalizacao;
import br.smat.ejb.medidacorretivafiscalizacao.MedidaCorretivaFiscalizacaoHome;
import br.smat.ejb.medidacorretivafiscalizacao.MedidaCorretivaFiscalizacaoKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjMedidaCorretivaFiscalizacao {

	private int 		tramiteFiscalizacao;
	private int		fiscalizacao;
	private int		tipoMedidaCorretiva;	
	private int		prazoDias;
	private String		observacao;

	/**
	 * Constructor for ObjMedidaCorretivaFiscalizacao.
	 */
	public ObjMedidaCorretivaFiscalizacao() {
		super();
	}

	public ObjMedidaCorretivaFiscalizacao(	int 		tramiteFiscalizacao,
											int		fiscalizacao,
											int		tipoMedidaCorretiva,
											int		prazoDias,
											String		observacao)
		throws Exception{
		
		this.tramiteFiscalizacao 	= tramiteFiscalizacao;
		this.fiscalizacao 			= fiscalizacao;
		this.tipoMedidaCorretiva	= tipoMedidaCorretiva;
		this.prazoDias				= prazoDias;
		this.observacao			= observacao;
	}


	public void save() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			MedidaCorretivaFiscalizacaoHome home = (MedidaCorretivaFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/medidacorretivafiscalizacao/MedidaCorretivaFiscalizacaoHome");
			MedidaCorretivaFiscalizacao	 	medidaCorretivaFiscalizacao 	= null;		

			medidaCorretivaFiscalizacao = home.create(tramiteFiscalizacao,fiscalizacao,tipoMedidaCorretiva,prazoDias,observacao);
		
			
		} catch (RemoteException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao RemoteException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (NamingException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao NamingException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (CreateException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao CreateException Erro ao inserir fiscalização " + e.getMessage());							
		} 	
	}
	
	public void remove() throws Exception{
					
		try {
			InitialContext ctx = new InitialContext();
	
			MedidaCorretivaFiscalizacao	 	medidaCorretivaFiscalizacao 	= null;		
					
			MedidaCorretivaFiscalizacaoHome home = (MedidaCorretivaFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/medidacorretivafiscalizacao/MedidaCorretivaFiscalizacaoHome");

			medidaCorretivaFiscalizacao = home.findByPrimaryKey(new MedidaCorretivaFiscalizacaoKey(tramiteFiscalizacao,fiscalizacao,tipoMedidaCorretiva));
			
			medidaCorretivaFiscalizacao.remove();
		
			
		}catch (RemoteException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao RemoteException Erro ao inserir fiscalização " + e.getMessage());							
		}catch (RemoveException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao CreateException Erro ao inserir fiscalização " + e.getMessage());							
		}catch (NamingException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao NamingException Erro ao inserir fiscalização " + e.getMessage());							
		} 
	}	
	
	public static MedidaCorretivaFiscalizacao findByPrimaryKey(int fiscalizacao,int tramite,int tipoMedidaCorretiva) throws Exception{
		
		MedidaCorretivaFiscalizacao	 	medidaCorretivaFiscalizacao 	= null;		
					
		try {
			InitialContext ctx = new InitialContext();
					
			MedidaCorretivaFiscalizacaoHome home = (MedidaCorretivaFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/medidacorretivafiscalizacao/MedidaCorretivaFiscalizacaoHome");

			medidaCorretivaFiscalizacao = home.findByPrimaryKey(new MedidaCorretivaFiscalizacaoKey(tramite,fiscalizacao,tipoMedidaCorretiva));
		
			
		} catch (RemoteException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao RemoteException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (NamingException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao NamingException Erro ao inserir fiscalização " + e.getMessage());							
		} 
		
		return medidaCorretivaFiscalizacao;
	}	
	
	public static Collection findAllMedidaCorretivaFiscalizacao(int fiscalizacao,int tramiteFiscalizacao)
	 throws Exception{

		Collection col = null;

		try {
			InitialContext ctx = new InitialContext();
					
			MedidaCorretivaFiscalizacaoHome home = (MedidaCorretivaFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/medidacorretivafiscalizacao/MedidaCorretivaFiscalizacaoHome");
			
			col = home.findAllMedidaCorretivaFiscalizacao(fiscalizacao,tramiteFiscalizacao);
			
		} catch (RemoteException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao RemoteException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (FinderException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao CreateException Erro ao inserir fiscalização " + e.getMessage());											
		} catch (NamingException e) {
				throw new  Exception("ObjMedidaCorretivaFiscalizacao NamingException Erro ao inserir fiscalização " + e.getMessage());							
		} 	
		
		return col;
	}

	/**
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getFiscalizacao() {
		return fiscalizacao;
	}

	/**
	 * Returns the observacao.
	 * @return String
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * Returns the prazoDias.
	 * @return int
	 */
	public int getPrazoDias() {
		return prazoDias;
	}

	/**
	 * Returns the tipoMedidaCorretiva.
	 * @return int
	 */
	public int getTipoMedidaCorretiva() {
		return tipoMedidaCorretiva;
	}

	/**
	 * Returns the tramiteFiscalizacao.
	 * @return int
	 */
	public int getTramiteFiscalizacao() {
		return tramiteFiscalizacao;
	}

	/**
	 * Sets the fiscalizacao.
	 * @param fiscalizacao The fiscalizacao to set
	 */
	public void setFiscalizacao(int fiscalizacao) {
		this.fiscalizacao = fiscalizacao;
	}

	/**
	 * Sets the observacao.
	 * @param observacao The observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * Sets the prazoDias.
	 * @param prazoDias The prazoDias to set
	 */
	public void setPrazoDias(int prazoDias) {
		this.prazoDias = prazoDias;
	}

	/**
	 * Sets the tipoMedidaCorretiva.
	 * @param tipoMedidaCorretiva The tipoMedidaCorretiva to set
	 */
	public void setTipoMedidaCorretiva(int tipoMedidaCorretiva) {
		this.tipoMedidaCorretiva = tipoMedidaCorretiva;
	}

	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(int tramiteFiscalizacao) {
		this.tramiteFiscalizacao = tramiteFiscalizacao;
	}

}
