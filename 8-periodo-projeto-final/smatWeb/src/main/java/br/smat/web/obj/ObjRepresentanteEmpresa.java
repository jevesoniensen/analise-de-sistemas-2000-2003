package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.representanteempresa.RepresentanteEmpresa;
import br.smat.ejb.representanteempresa.RepresentanteEmpresaHome;
import br.smat.ejb.representanteempresa.RepresentanteEmpresaKey;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjRepresentanteEmpresa {
	
	private int representanteEmpresa;
	private String nome;
	private int empregador;
		
	public ObjRepresentanteEmpresa(int representanteEmpresa,String nome,int empregador){
		
		this.representanteEmpresa = representanteEmpresa;
		this.nome = nome;
		this.empregador = empregador;
		
	}

	public static Collection findAllRepresentanteByEmpresa(int empresa) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				RepresentanteEmpresaHome home = (RepresentanteEmpresaHome)ctx.lookup("ejb/br/smat/ejb/representanteempresa/RepresentanteEmpresaHome");
					try {
						col = home.findAllRepresentanteByEmpresa(empresa);
					} catch (RemoteException e) {
						throw new Exception(" ObjDiagnostico findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjDiagnostico findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjDiagnostico findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjDiagnostico findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}
	

	public static RepresentanteEmpresa findByPrimaryKey(int representante) throws Exception{		
			InitialContext ctx;
			RepresentanteEmpresa col = null;
			try {
				ctx = new InitialContext();
				RepresentanteEmpresaHome home = (RepresentanteEmpresaHome)ctx.lookup("ejb/br/smat/ejb/representanteempresa/RepresentanteEmpresaHome");
					try {
						col = (RepresentanteEmpresa)home.findByPrimaryKey(new RepresentanteEmpresaKey(representante));
					} catch (RemoteException e) {
						throw new Exception(" ObjRepresentanteEmpresa findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjRepresentanteEmpresa findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjRepresentanteEmpresa findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjRepresentanteEmpresa findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}

	public void save() throws Exception{

		RepresentanteEmpresa rep = null;
		
		try {
			InitialContext ctx = new InitialContext();
				
			RepresentanteEmpresaHome home = (RepresentanteEmpresaHome)ctx.lookup("ejb/br/smat/ejb/representanteempresa/RepresentanteEmpresaHome");
			
			if(representanteEmpresa == 0){
				rep = home.create(empregador,nome);

				representanteEmpresa = rep.getRepresentanteEmpresa();

			}else{
				rep = home.findByPrimaryKey(new RepresentanteEmpresaKey(representanteEmpresa));
				rep.setNome(nome);
			}

			
		}
		catch (RemoteException e) {
			System.out.println("****************************");
			System.out.println("****** OBJREPRESENTANTEEMPRESA RemoteException*****");				
		//	e.printStackTrace();
			System.out.println("****************************");					
			throw new  Exception("ObjRepresentanteEmpresa RemoteException Erro ao inserir investigação " + e.getMessage());
		} catch (NamingException e) {
		} catch (CreateException e) {
			System.out.println("****************************");
			System.out.println("****** OBJREPRESENTANTEEMPRESA CreateException*****");				
		//	e.printStackTrace();
			System.out.println("****************************");					
			//e.printStackTrace();
			throw new  Exception("ObjRepresentanteEmpresa CreateException Erro ao inserir investigação " + e.getMessage());				
		} catch (Exception e) {
			System.out.println("****************************");
			System.out.println("****** OBJREPRESENTANTEEMPRESA Exception*****");				
	//		e.printStackTrace();
			System.out.println("****************************");				
			throw new  Exception("ObjRepresentanteEmpresa CreateException Erro ao inserir investigação " + e.getMessage());				
		}

		
	}
	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the representanteEmpresa.
	 * @return int
	 */
	public int getRepresentanteEmpresa() {
		return representanteEmpresa;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the representanteEmpresa.
	 * @param representanteEmpresa The representanteEmpresa to set
	 */
	public void setRepresentanteEmpresa(int representanteEmpresa) {
		this.representanteEmpresa = representanteEmpresa;
	}

}
