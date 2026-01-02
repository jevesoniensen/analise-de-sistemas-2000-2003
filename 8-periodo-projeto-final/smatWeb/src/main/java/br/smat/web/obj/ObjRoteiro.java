package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.fiscalizacao.FiscalizacaoKey;
import br.smat.ejb.grauconformidade.GrauConformidadeKey;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
import br.smat.ejb.roteiros.Roteiros;
import br.smat.ejb.roteiros.RoteirosHome;
import br.smat.ejb.roteiros.RoteirosKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjRoteiro {
	
	private 	int 	tramiteFiscalizacao	= 0;
	private	int 	fiscalizacao		= 0;
	private 	int 	itemFiscalizacao	= 0;
	private	int	GrauConformidade	= 0;
	private	String	nome				= "";		

	/**
	 * Constructor for ObjRoteiro.
	 */
	public ObjRoteiro(){
		super();
	}
	
	public ObjRoteiro(	int 	tramiteFiscalizacao,
						int 	fiscalizacao,
						int 	itemFiscalizacao) {
		setTramiteFiscalizacao(tramiteFiscalizacao);
		setFiscalizacao(fiscalizacao);
		setItemFiscalizacao(itemFiscalizacao);
	}	
	
	public ObjRoteiro(	int 	tramiteFiscalizacao,
						int 	fiscalizacao,
						int 	itemFiscalizacao,
						int	grauConformidade) {
		setTramiteFiscalizacao(tramiteFiscalizacao);
		setFiscalizacao(fiscalizacao);
		setItemFiscalizacao(itemFiscalizacao);
		setGrauConformidade(grauConformidade);
	}		
	
	public ObjRoteiro(	int 	tramiteFiscalizacao,
						int 	fiscalizacao,
						int 	itemFiscalizacao,
						int	GrauConformidade,
						String	nome) {
		setTramiteFiscalizacao(tramiteFiscalizacao);
		setFiscalizacao(fiscalizacao);
		setItemFiscalizacao(itemFiscalizacao);
		setGrauConformidade(GrauConformidade);
		setNome(nome);
	}


	public static Collection findAllItemLastTramite(int fiscalizacao) 
	throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				RoteirosHome home = (RoteirosHome)ctx.lookup("ejb/br/smat/ejb/roteiros/RoteirosHome");
					try {
						col = (Collection)home.findAllItemLastTramite(fiscalizacao);
					} catch (RemoteException e) {
						throw new Exception(" findAllItemLastTramite findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("findAllItemLastTramite findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("findAllItemLastTramite findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("findAllItemLastTramite findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	

	public void atualiza() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			RoteirosHome home 		= (RoteirosHome)ctx.lookup("ejb/br/smat/ejb/roteiros/RoteirosHome");
			Roteiros 	 roteiros 	= null;		
			
			TramiteFiscalizacaoKey tfk = new TramiteFiscalizacaoKey(tramiteFiscalizacao,new FiscalizacaoKey(fiscalizacao));
			
			roteiros = home.findByPrimaryKey(new RoteirosKey(tfk,new ItemFiscalizacaoKey(itemFiscalizacao)));
			
			roteiros.setGrauConformidade(new GrauConformidadeKey(this.GrauConformidade));					
			
		} catch (RemoteException e) {
				throw new  Exception("ObjFiscalizacao RemoteException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (NamingException e) {
				throw new  Exception("ObjFiscalizacao NamingException Erro ao inserir fiscalização " + e.getMessage());							
		} 	
	}


	public void save() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			RoteirosHome home 		= (RoteirosHome)ctx.lookup("ejb/br/smat/ejb/roteiros/RoteirosHome");
			Roteiros 	 roteiros 	= null;		

			roteiros = home.create(tramiteFiscalizacao,fiscalizacao,itemFiscalizacao,GrauConformidade,nome);
			
			setTramiteFiscalizacao(roteiros.getTramiteFiscalizacao().tramiteFiscalizacao);					
			
		} catch (RemoteException e) {
				throw new  Exception("ObjFiscalizacao RemoteException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (NamingException e) {
				throw new  Exception("ObjFiscalizacao NamingException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (CreateException e) {
				throw new  Exception("ObjFiscalizacao CreateException Erro ao inserir fiscalização " + e.getMessage());							
		} 	
	}

	public void remove() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			RoteirosHome home 		= (RoteirosHome)ctx.lookup("ejb/br/smat/ejb/roteiros/RoteirosHome");
			Roteiros 	 roteiros 	= null;		
			
			TramiteFiscalizacaoKey tfk = new TramiteFiscalizacaoKey(tramiteFiscalizacao,new FiscalizacaoKey(fiscalizacao));
			
			roteiros = home.findByPrimaryKey(new RoteirosKey(tfk,new ItemFiscalizacaoKey(itemFiscalizacao)));
			
			roteiros.remove();
			
		} catch (RemoteException e) {
				throw new  Exception("ObjFiscalizacao RemoteException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (NamingException e) {
				throw new  Exception("ObjFiscalizacao NamingException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (RemoveException e) {
				throw new  Exception("ObjFiscalizacao CreateException Erro ao inserir fiscalização " + e.getMessage());							
		} 	
	}
	
	/**
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getFiscalizacao() {
		return fiscalizacao;
	}

	/**
	 * Returns the grauConformidade.
	 * @return int
	 */
	public int getGrauConformidade() {
		return GrauConformidade;
	}

	/**
	 * Returns the itemFiscalizacao.
	 * @return int
	 */
	public int getItemFiscalizacao() {
		return itemFiscalizacao;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
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
	 * Sets the grauConformidade.
	 * @param grauConformidade The grauConformidade to set
	 */
	public void setGrauConformidade(int grauConformidade) {
		GrauConformidade = grauConformidade;
	}

	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(int itemFiscalizacao) {
		this.itemFiscalizacao = itemFiscalizacao;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(int tramiteFiscalizacao) {
		this.tramiteFiscalizacao = tramiteFiscalizacao;
	}

}
