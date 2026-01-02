package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.localatendimento.LocalAtendimento;
import br.smat.ejb.localatendimento.LocalAtendimentoHome;
import br.smat.ejb.localatendimento.LocalAtendimentoKey;
import br.smat.ejb.municipio.MunicipioKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjLocalAtendimento {

		private int 	localAtendimento;
		private String 	nome;
		private int 	municipio;
								
	/**
	 * Constructor for ObjLocalAtendimento.
	 */
	public ObjLocalAtendimento(int localAtendimento,
								String nome,
								int municipio) {
		
		setLocalAtendimento(localAtendimento);
		setNome(nome);
		setMunicipio(municipio);

	}
	
	public void save() throws Exception{

		InitialContext ctx;
		LocalAtendimento local = null;
		try {
			ctx = new InitialContext();
			LocalAtendimentoHome home = (LocalAtendimentoHome)ctx.lookup("ejb/br/smat/ejb/localatendimento/LocalAtendimentoHome");
				try {
					
					if(localAtendimento == 0){
						local = home.create(nome,municipio);
						localAtendimento = local.getLocalAtendimento();
						
					}else{
						local = (LocalAtendimento)home.findByPrimaryKey(new LocalAtendimentoKey(localAtendimento));
						local.setMunicipio(new MunicipioKey(municipio));
						local.setNome(nome);
					}
				} catch (RemoteException e) {
					throw new Exception(" ObjLocalAtendimento findByPrimaryKey RemoteException=> " + e.getMessage());
				} catch (FinderException e) {
					throw new Exception("ObjLocalAtendimento findByPrimaryKey FinderException=> " + e.getMessage());
				} catch (Exception e) {
					throw new Exception("ObjLocalAtendimento findByPrimaryKey Exception=> " + e.getMessage());
				}								
		} catch (NamingException e) {
			throw new Exception("ObjLocalAtendimento findByPrimaryKey NamingException=> " + e.getMessage());
		}
	}

	public static LocalAtendimento findByPrimaryKey(int localAtendimento) throws Exception{		
			InitialContext ctx;
			LocalAtendimento col = null;
			try {
				ctx = new InitialContext();
				LocalAtendimentoHome home = (LocalAtendimentoHome)ctx.lookup("ejb/br/smat/ejb/localatendimento/LocalAtendimentoHome");
					try {
						col = (LocalAtendimento)home.findByPrimaryKey(new LocalAtendimentoKey(localAtendimento));
					} catch (RemoteException e) {
						throw new Exception(" ObjLocalAtendimento findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjLocalAtendimento findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjLocalAtendimento findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjLocalAtendimento findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllLocaisAtendimento() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				LocalAtendimentoHome home = (LocalAtendimentoHome)ctx.lookup("ejb/br/smat/ejb/localatendimento/LocalAtendimentoHome");
					try {
						col = (Collection)home.findAllLocaisAtendimento();
					} catch (RemoteException e) {
						throw new Exception(" ObjLocalAtendimento findAllLocaisAtendimento RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjLocalAtendimento findAllLocaisAtendimento FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjLocalAtendimento findAllLocaisAtendimento Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjLocalAtendimento findAllLocaisAtendimento NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
		/**
		 * Returns the localAtendimento.
		 * @return int
		 */
		public int getLocalAtendimento() {
			return localAtendimento;
		}

		/**
		 * Returns the municipio.
		 * @return int
		 */
		public int getMunicipio() {
			return municipio;
		}

		/**
		 * Returns the nome.
		 * @return String
		 */
		public String getNome() {
			return nome;
		}

		/**
		 * Sets the localAtendimento.
		 * @param localAtendimento The localAtendimento to set
		 */
		public void setLocalAtendimento(int localAtendimento) {
			this.localAtendimento = localAtendimento;
		}

		/**
		 * Sets the municipio.
		 * @param municipio The municipio to set
		 */
		public void setMunicipio(int municipio) {
			this.municipio = municipio;
		}

		/**
		 * Sets the nome.
		 * @param nome The nome to set
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}

}
