package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.tipoempregador.TipoEmpregador;
import br.smat.ejb.tipoempregador.TipoEmpregadorHome;
import br.smat.ejb.tipoempregador.TipoEmpregadorKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTipoEmpregador {
	
	private int tipoEmpregador;
	
	public ObjTipoEmpregador(){		
	}

	public static TipoEmpregador findByPrimaryKey(int tipoempregador) throws Exception{		
			InitialContext ctx;
			TipoEmpregador col = null;
			try {
				ctx = new InitialContext();
				TipoEmpregadorHome home = (TipoEmpregadorHome)ctx.lookup("ejb/br/smat/ejb/tipoempregador/TipoEmpregadorHome");
					try {
						col = (TipoEmpregador)home.findByPrimaryKey(new TipoEmpregadorKey(tipoempregador));
					} catch (RemoteException e) {
						throw new Exception(" ObjTipoEmpregador findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjTipoEmpregador findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjTipoEmpregador findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjTipoEmpregador findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}
	
	public static Collection findAllTiposEmpredadores() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				TipoEmpregadorHome home = (TipoEmpregadorHome)ctx.lookup("ejb/br/smat/ejb/tipoempregador/TipoEmpregadorHome");
					try {
						col = (Collection)home.findAllTiposEmpregadores();
					} catch (RemoteException e) {
						throw new Exception(" ObjTipoEmpregador findAllTiposEmpredadores RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjTipoEmpregador findAllTiposEmpredadores FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjTipoEmpregador findAllTiposEmpredadores Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjTipoEmpregador findAllTiposEmpredadores NamingException=> " + e.getMessage());
			}
			return col;			 		
	}
	
	public String armazena(int tipoEmpregador,String nome,String docIdentificador){
			InitialContext 	ctx;
			String			resultado = "";
			try {
				ctx = new InitialContext();
				TipoEmpregadorHome home = (TipoEmpregadorHome)ctx.lookup("ejb/br/smat/ejb/tipoempregador/TipoEmpregadorHome");
				
				try {
						if(tipoEmpregador > 0){
							TipoEmpregador te = home.findByPrimaryKey(new TipoEmpregadorKey(tipoEmpregador));
							te.setNome(nome);
							te.setDocIdentificador(docIdentificador);
							resultado = "Tipo empregador alterado com sucesso!";
						}
						else{		
							TipoEmpregador t;
							int aux = 0;
							t = (TipoEmpregador)home.create(nome,docIdentificador);
							aux = t.getTipoEmpregador();							
							
							setTipoEmpregador(aux);
							resultado = "Tipo empregador inserido com sucesso!";
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
	
	public String remove(int tipoEmpregador){
			InitialContext 	ctx;
			String			resultado = "Problemas na exclusão do empregador!";
			try {
				ctx = new InitialContext();
				TipoEmpregadorHome home = (TipoEmpregadorHome)ctx.lookup("ejb/br/smat/ejb/tipoempregador/TipoEmpregadorHome");
				
				try {
						if(tipoEmpregador > 0){
					
							TipoEmpregador te = home.findByPrimaryKey(new TipoEmpregadorKey(tipoEmpregador));
							te.remove();
						
							resultado = "Tipo empregador excluido com sucesso!";
						}
						else
							resultado = "É necessário selecionar um Tipo de empregador!";

						return resultado;
				} 
				catch (RemoteException e) {
					resultado = "RemoteException";
				} 
				catch (FinderException e) {
					resultado = "FinderException";
				}				
			} 
			catch (NamingException e) {
				resultado = "NamingException";
			}				
			finally{
				return resultado;
			}
			
	}
	
	/**
	 * Returns the tipoEmpregador.
	 * @return int
	 */
	public int getTipoEmpregador() {
		return tipoEmpregador;
	}

	/**
	 * Sets the tipoEmpregador.
	 * @param tipoEmpregador The tipoEmpregador to set
	 */
	public void setTipoEmpregador(int tipoEmpregador) {
		this.tipoEmpregador = tipoEmpregador;
	}

}
