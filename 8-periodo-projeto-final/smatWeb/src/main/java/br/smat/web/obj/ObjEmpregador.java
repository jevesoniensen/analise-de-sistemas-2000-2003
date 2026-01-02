package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.emitente.EmitenteKey;
import br.smat.ejb.empregador.Empregador;
import br.smat.ejb.empregador.EmpregadorHome;
import br.smat.ejb.empregador.EmpregadorKey;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
import br.smat.ejb.tipoacidente.TipoAcidenteKey;
import br.smat.ejb.tipoempregador.TipoEmpregadorKey;
import br.smat.transaction.empregadortransaction.EmpregadorTransaction;
import br.smat.transaction.empregadortransaction.EmpregadorTransactionHome;
import br.smat.util.FuncoesComuns;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjEmpregador {
	
	private int empregador;
	
	public ObjEmpregador(){
	}

	public static Empregador findByPrimaryKey(int key) throws Exception{		
			InitialContext ctx;
			Empregador empregador = null;
			try {
				ctx = new InitialContext();
				EmpregadorHome home = (EmpregadorHome)ctx.lookup("ejb/br/smat/ejb/empregador/EmpregadorHome");
					try {
						empregador = home.findByPrimaryKey(new EmpregadorKey(key));
					} catch (RemoteException e) {
						throw new Exception(" ObjEmpregador findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjEmpregador findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjEmpregador findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjEmpregador getHoraAtual findByPrimaryKey=> " + e.getMessage());
			}
			return empregador;			 		
	}	
		
	public static Collection findAllEmpredadores() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				EmpregadorHome home = (EmpregadorHome)ctx.lookup("ejb/br/smat/ejb/empregador/EmpregadorHome");
					try {
						col = (Collection)home.findAllEmpregadores();
					} catch (RemoteException e) {
						throw new Exception(" ObjEmpregador findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjEmpregador findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjEmpregador findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjEmpregador getHoraAtual findByPrimaryKey=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public void armazena(int empregador,
							int ramoAtividade,
							int municipio,
							int tipoEmpregador,
							String razaoSocial,
							String documento,
							int numero,
							String rua,
							String bairro,
							String cep,
							String complemento) throws Exception{
								
			InitialContext 	ctx;
			try {
				ctx = new InitialContext();
				EmpregadorHome home = (EmpregadorHome)ctx.lookup("ejb/br/smat/ejb/empregador/EmpregadorHome");
				
				try {
						if(empregador > 0){
							Empregador e = home.findByPrimaryKey(new EmpregadorKey(empregador));
							e.setRamoAtividade(new RamoAtividadeKey(ramoAtividade));
							e.setMunicipio(new MunicipioKey(municipio));
							e.setTipoEmpregador(new TipoEmpregadorKey(tipoEmpregador));
							e.setRazaoSocial(FuncoesComuns.setNullSeVazio(razaoSocial));
							e.setDocumento(FuncoesComuns.setNullSeVazio(documento));
							e.setNumero(numero);
							e.setRua(FuncoesComuns.setNullSeVazio(rua));
							e.setBairro(FuncoesComuns.setNullSeVazio(bairro));
							e.setCep(FuncoesComuns.setNullSeVazio(cep));
							e.setComplemento(FuncoesComuns.setNullSeVazio(complemento));
							
							setEmpregador(empregador);

						}
						else{		
							Empregador e;
							int aux = 0;
							
							e = (Empregador)home.create(	ramoAtividade,
															municipio,
															tipoEmpregador,
															FuncoesComuns.setNullSeVazio(razaoSocial),
															FuncoesComuns.setNullSeVazio(documento),
															numero,
															FuncoesComuns.setNullSeVazio(rua),
															FuncoesComuns.setNullSeVazio(bairro),
															FuncoesComuns.setNullSeVazio(cep),
															FuncoesComuns.setNullSeVazio(complemento));
							if(e != null)								
								aux = e.getEmpregador();						
							
							setEmpregador(aux);

						}
				}catch (CreateException e) {
					e.printStackTrace();
					throw new Exception("ObJEmpregador armazena CreateException => " + e.getMessage());
				}catch (RemoteException e) {
					e.printStackTrace();
					throw new Exception("ObJEmpregador armazena RemoteException => " + e.getMessage());
				}catch (FinderException e) {
					e.printStackTrace();
					throw new Exception("ObJEmpregador armazena FinderException => " + e.getMessage());
				}								
			}catch (NamingException e) {
				e.printStackTrace();
				throw new Exception("ObJEmpregador armazena NamingException => " + e.getMessage());
			}
	}
	
	public void remove(int empregador) throws Exception{
			InitialContext 	ctx;
			try {
				ctx = new InitialContext();
				EmpregadorHome home = (EmpregadorHome)ctx.lookup("ejb/br/smat/ejb/empregador/EmpregadorHome");
				
				try {
						if(empregador > 0){
					
							Empregador e = home.findByPrimaryKey(new EmpregadorKey(empregador));
							e.remove();
						}
				}catch (RemoteException e) {
					e.printStackTrace();
					throw new Exception("ObJEmpregador armazena RemoteException => " + e.getMessage());
				}catch (FinderException e) {
					e.printStackTrace();
					throw new Exception("ObJEmpregador armazena FinderException => " + e.getMessage());
				}								
			}catch (NamingException e) {
				e.printStackTrace();
				throw new Exception("ObJEmpregador armazena NamingException => " + e.getMessage());
			}
			System.out.println("*********** nao entrou nas excecoes do ObjEmpregador ***********");
	}
	


	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
	}

}
