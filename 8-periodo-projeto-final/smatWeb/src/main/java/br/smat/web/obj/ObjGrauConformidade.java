package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.grauconformidade.GrauConformidade;
import br.smat.ejb.grauconformidade.GrauConformidadeHome;
import br.smat.ejb.grauconformidade.GrauConformidadeKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjGrauConformidade {

	private int 	grauConformidade;
	private String nome;
	private String descricao;

	/**
	 * Constructor for ObjGrauConformidade.
	 */
	public ObjGrauConformidade() {
		super();
	}

	public ObjGrauConformidade(int grauConformidade,String nome,String descricao) {
		this.grauConformidade = grauConformidade;
		this.nome = nome;
		this.descricao = descricao;			
	}

	public static Collection findAllGrauConformidade() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				GrauConformidadeHome home = (GrauConformidadeHome)ctx.lookup("ejb/br/smat/ejb/grauconformidade/GrauConformidadeHome");
					try {
						col = (Collection)home.findAllTipoAcidente();
					} catch (RemoteException e) {
						throw new Exception(" ObjFonte findAllGrauConformidade RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjFonte findAllGrauConformidade FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjFonte findAllGrauConformidade Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjFonte findAllGrauConformidade NamingException=> " + e.getMessage());
			}
			return col;			 		
	}		
	
	public void save() throws Exception{
			InitialContext ctx;
			try {
					ctx = new InitialContext();
					GrauConformidadeHome home = (GrauConformidadeHome)ctx.lookup("ejb/br/smat/ejb/grauconformidade/GrauConformidadeHome");
					
					
					if(this.grauConformidade == 0)
						home.create(this.nome,this.descricao);
					else{
						GrauConformidade grauConformidade = home.findByPrimaryKey(new GrauConformidadeKey(this.grauConformidade));		
						grauConformidade.setDescricao(this.descricao);
						grauConformidade.setNome(this.nome);
					}						
			} catch (CreateException e) {
				throw new Exception("ObjFonte findAllGrauConformidade CreateException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjFonte findAllGrauConformidade FinderException=> " + e.getMessage());
			} catch (NamingException e) {
				throw new Exception("ObjFonte findAllGrauConformidade Exception=> " + e.getMessage());
			} catch (Exception e) {
				throw new Exception("ObjFonte findAllGrauConformidade NamingException=> " + e.getMessage());
			}
	}

	public void remove(){
	}

	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Returns the grauConformidade.
	 * @return int
	 */
	public int getGrauConformidade() {
		return grauConformidade;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Sets the grauConformidade.
	 * @param grauConformidade The grauConformidade to set
	 */
	public void setGrauConformidade(int grauConformidade) {
		this.grauConformidade = grauConformidade;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
