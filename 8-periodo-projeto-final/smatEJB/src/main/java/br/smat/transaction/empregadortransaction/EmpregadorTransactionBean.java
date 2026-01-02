package br.smat.transaction.empregadortransaction;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.empregador.Empregador;
import br.smat.ejb.empregador.EmpregadorHome;
import br.smat.ejb.empregador.EmpregadorKey;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
import br.smat.ejb.tipoempregador.TipoEmpregadorKey;

/**
 * Bean implementation class for Enterprise Bean: EmpregadorTransaction
 */
public class EmpregadorTransactionBean implements javax.ejb.SessionBean {
	
	private int empregador;
	
	private javax.ejb.SessionContext mySessionCtx;
	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}
	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}
	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}
	
	public String armazena(int empregador,
							int ramoAtividade,
							int municipio,
							int tipoEmpregador,
							String razaoSocial,
							String documento,
							int numero,
							String rua,
							String bairro,
							String cep,
							String complemento){
			InitialContext 	ctx;
			String			resultado = "";
			try {
				ctx = new InitialContext();
				EmpregadorHome home = (EmpregadorHome)ctx.lookup("ejb/br/smat/ejb/empregador/EmpregadorHome");
				
				try {
						if(empregador > 0){
							Empregador e = home.findByPrimaryKey(new EmpregadorKey(empregador));
							e.setRamoAtividade(new RamoAtividadeKey(ramoAtividade));
							e.setMunicipio(new MunicipioKey(municipio));
							e.setTipoEmpregador(new TipoEmpregadorKey(tipoEmpregador));
							e.setRazaoSocial(razaoSocial);
							e.setDocumento(documento);
							e.setNumero(numero);
							e.setRua(rua);
							e.setBairro(bairro);
							e.setCep(cep);
							e.setComplemento(complemento);
							
							setEmpregador(empregador);
							
							resultado = "Empregador alterado com sucesso!";
						}
						else{		
							Empregador e;
							int aux = 0;
							
							e = (Empregador)home.create(	ramoAtividade,
															municipio,
															tipoEmpregador,
															razaoSocial,
															documento,
															numero,
															rua,
															bairro,
															cep,
															complemento);
							if(e != null)								
								aux = e.getEmpregador();						
							
							setEmpregador(aux);
							resultado = "Empregador inserido com sucesso!";
						}
				} 
				catch (CreateException e) {
					e.printStackTrace();
					resultado = "CreateException";
				} 
				catch (RemoteException e) {
					e.printStackTrace();
					resultado = "RemoteException";
				} 
				catch (FinderException e) {
					e.printStackTrace();
					resultado = "FinderException";
				}								
			} 
			catch (NamingException e) {
				e.printStackTrace();
				resultado = "NamingException";
			}	
			finally{
				return resultado;			
			}
	}

	/**
	 * Method setEmpregador.
	 * @param empregador
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
	}

	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

}
