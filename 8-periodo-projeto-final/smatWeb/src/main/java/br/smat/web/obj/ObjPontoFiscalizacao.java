package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.pontofiscalizacao.PontoFiscalizacao;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoHome;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjPontoFiscalizacao {
	
	int	pontoFiscalizacao;
	String 	nome;
	String 	descricao;
	int 	ramoAtividade;

	/**
	 * Constructor for ObjPontoFiscalizacao.
	 */
	public ObjPontoFiscalizacao(int pontoFiscalizacao,String nome, String descricao,int ramoAtividade) {
		super();
		this.pontoFiscalizacao	= pontoFiscalizacao;
		this.nome				= nome;
		this.descricao			= descricao;
		this.ramoAtividade		= ramoAtividade;
	}
	
	public void save() throws Exception{
		
		try {
			InitialContext ctx = new InitialContext();
					
			PontoFiscalizacaoHome home = (PontoFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/pontofiscalizacao/PontoFiscalizacaoHome");
			
			PontoFiscalizacao pontoFiscalizacaoH = null;		
			
			if(pontoFiscalizacao == 0){
				pontoFiscalizacaoH = home.create(nome,descricao,ramoAtividade);	
				
				this.pontoFiscalizacao = pontoFiscalizacaoH.getPontoFiscalizacao();
			}
			else{
				pontoFiscalizacaoH = home.findByPrimaryKey(new PontoFiscalizacaoKey(this.pontoFiscalizacao));
				
				pontoFiscalizacaoH.setDescricao(descricao);
				pontoFiscalizacaoH.setNome(nome);
				
			}
			
			
		} catch (RemoteException e) {
			throw new Exception("ObjPontoFiscalizacao save RemoteException=> " + e.getMessage());						
		} catch (NamingException e) {
			throw new Exception("ObjPontoFiscalizacao save NamingException=> " + e.getMessage());						
		} catch (CreateException e) {
			throw new Exception("ObjPontoFiscalizacao save CreateException=> " + e.getMessage());						
		} catch (FinderException e) {
			throw new Exception("ObjPontoFiscalizacao save FinderException=> " + e.getMessage());						
		}	

	}
	
	public static void remove(int pf) throws Exception{
		
		try {
			InitialContext ctx = new InitialContext();
					
			PontoFiscalizacaoHome home = (PontoFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/pontofiscalizacao/PontoFiscalizacaoHome");
			
			PontoFiscalizacao pontoFiscalizacao = home.findByPrimaryKey(new PontoFiscalizacaoKey(pf));
	
			pontoFiscalizacao.remove();		
			
			System.out.println("Erro ao excluir ponto fiscalização ");
		} catch (RemoteException e) {
			throw new Exception("ObjPontoFiscalizacao remove RemoteException=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjPontoFiscalizacao remove NamingException=> " + e.getMessage());			
		} catch (FinderException e) {
			throw new Exception("ObjPontoFiscalizacao remove FinderException=> " + e.getMessage());			
		} catch (RemoveException e) {
			throw new Exception("ObjPontoFiscalizacao remove RemoteException=> " + e.getMessage());			
		} catch (Exception e) {			
			throw new Exception("ObjPontoFiscalizacao remove Exception=> " + e.getMessage());			
		} 			
	}
	
	public static Collection findAllPontoFiscalizacao(int ramoAtividade) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				PontoFiscalizacaoHome home = (PontoFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/pontofiscalizacao/PontoFiscalizacaoHome");
					try {
						col = (Collection)home.findAllPontoFiscalizacao(ramoAtividade);
					} catch (RemoteException e) {
						throw new Exception(" ObjPontoFiscalizacao findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjPontoFiscalizacao findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjPontoFiscalizacao findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjPontoFiscalizacao findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}		

	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the pontoFiscalizacao.
	 * @return int
	 */
	public int getPontoFiscalizacao() {
		return pontoFiscalizacao;
	}

	/**
	 * Returns the ramoAtividade.
	 * @return int
	 */
	public int getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(int pontoFiscalizacao) {
		this.pontoFiscalizacao = pontoFiscalizacao;
	}

	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(int ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

}
