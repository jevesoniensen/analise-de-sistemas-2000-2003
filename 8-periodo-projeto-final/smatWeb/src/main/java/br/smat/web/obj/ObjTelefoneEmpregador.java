package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.empregador.EmpregadorKey;
import br.smat.ejb.telefoneempregador.TelefoneEmpregador;
import br.smat.ejb.telefoneempregador.TelefoneEmpregadorHome;
import br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey;
import br.smat.util.FuncoesComuns;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTelefoneEmpregador {

	private int	telefoneEmpregador;

	/**
	 * Constructor for ObjTelefoneEmpregador.
	 */
	public ObjTelefoneEmpregador() {
		super();
	}	

	/**
	 * Returns the telefoneEmpregador.
	 * @return int
	 */
	public int getTelefoneEmpregador() {
		return telefoneEmpregador;
	}

	/**
	 * Sets the telefoneEmpregador.
	 * @param telefoneEmpregador The telefoneEmpregador to set
	 */
	public void setTelefoneEmpregador(int telefoneEmpregador) {
		this.telefoneEmpregador = telefoneEmpregador;
	}
	
	public Collection findAllTelefonesEmpregador(int empregador) throws Exception{
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				TelefoneEmpregadorHome home = (TelefoneEmpregadorHome)ctx.lookup("ejb/br/smat/ejb/telefoneempregador/TelefoneEmpregadorHome");
					try {
						col = (Collection)home.findAllTelefonesEmpregadores(empregador);
					} catch (RemoteException e) {
						throw new Exception(" ObjGenerico getHoraAtual RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getHoraAtual FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getHoraAtual Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getHoraAtual NamingException=> " + e.getMessage());
			}
			return col;			 		
		
	}
	
	public String armazena(int empregador,int telefoneEmpregador,String descricao,String ddd,String numero){
			InitialContext 	ctx;
			String			resultado = "";
			try {
				ctx = new InitialContext();
				TelefoneEmpregadorHome home = (TelefoneEmpregadorHome)ctx.lookup("ejb/br/smat/ejb/telefoneempregador/TelefoneEmpregadorHome");
				
				try {
						if(telefoneEmpregador > 0){
							TelefoneEmpregador te = home.findByPrimaryKey(new TelefoneEmpregadorKey(telefoneEmpregador,new EmpregadorKey(empregador)));
							te.setDdd(FuncoesComuns.setNullSeVazio(ddd));
							te.setDescricao(FuncoesComuns.setNullSeVazio(descricao));
							te.setNumero(FuncoesComuns.setNullSeVazio(numero));
							setTelefoneEmpregador(telefoneEmpregador);
							resultado = "Telefone do Empregador alterado com sucesso!";
						}
						else{		
							TelefoneEmpregador t;
							int aux = 0;
							t = (TelefoneEmpregador)home.create(empregador,
																FuncoesComuns.setNullSeVazio(descricao),
																FuncoesComuns.setNullSeVazio(numero),
																FuncoesComuns.setNullSeVazio(ddd));
							aux = t.getTelefoneEmpregador();							
							
							setTelefoneEmpregador(aux);
							resultado = "Telefone do Empregador inserido com sucesso!";
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
	
	public String remove(int telefoneEmpregador,int empregador){
			InitialContext 	ctx;
			String			resultado = "Problemas na exclusão do empregador!";
			try {
				ctx = new InitialContext();
				TelefoneEmpregadorHome home = (TelefoneEmpregadorHome)ctx.lookup("ejb/br/smat/ejb/telefoneempregador/TelefoneEmpregadorHome");
				
				try {
						if(telefoneEmpregador > 0){
					
							TelefoneEmpregador te = home.findByPrimaryKey(new TelefoneEmpregadorKey(telefoneEmpregador,new EmpregadorKey(empregador)));
							te.remove();
						
							resultado = "Telefone Empregador excluido com sucesso!";
						}
						else
							resultado = "É necessário selecionar um Telefone do Empregador!";

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
	

}
