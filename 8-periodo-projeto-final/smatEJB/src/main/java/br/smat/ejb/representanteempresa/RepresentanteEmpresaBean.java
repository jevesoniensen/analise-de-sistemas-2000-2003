package br.smat.ejb.representanteempresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import br.smat.conexao.Conexao;
import br.smat.ejb.empregador.EmpregadorKey;

/**
 * Bean implementation class for Enterprise Bean: RepresentanteEmpresa
 */
public class RepresentanteEmpresaBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int 			representanteEmpresa;
	private EmpregadorKey 	empregador;	
	private String			nome;
	
	private boolean 		atualiza;	

	/**
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador() {
		atualiza = false;
		return empregador;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		atualiza = false;
		return nome;
	}

	/**
	 * Returns the representanteEmpresa.
	 * @return int
	 */
	public int getRepresentanteEmpresa() {
		atualiza = false;
		return representanteEmpresa;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador) {
		atualiza = true;
		this.empregador = empregador;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		atualiza = true;
		this.nome = nome;
	}

	/**
	 * Sets the representanteEmpresa.
	 * @param representanteEmpresa The representanteEmpresa to set
	 */
	public void setRepresentanteEmpresa(int representanteEmpresa) {
		atualiza = true;
		this.representanteEmpresa = representanteEmpresa;
	}
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		representanteEmpresa 	= 0;
		empregador				= null;
		nome					= null;
		atualiza				= false;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			RepresentanteEmpresaKey key = (RepresentanteEmpresaKey)ctx.getPrimaryKey();
			System.out.println(key);
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_representantesempresa ?");
		    stmt.setInt(1,key.representanteEmpresa);		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.representanteEmpresa 	= rs.getInt("representanteEmpresa");
	    		this.empregador			= new EmpregadorKey(rs.getInt("empregador"));
		    	this.nome           		= rs.getString("nome");		    	
		    }
		    else{
			   throw new EJBException("RepresentanteEmpresaBean ejbLoad EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){}
		}			
		
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws RemoveException {
		Connection conn = null;
		atualiza = false;
	
		try{
			conn = Conexao.getConnection();
			RepresentanteEmpresaKey key = (RepresentanteEmpresaKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_representantesempresas ?");
			    stmt.setInt(1,key.representanteEmpresa);		    
	    	int r = stmt.executeUpdate();
	    	
		    if(r == 0){
		    	System.out.println("ERRO 1");
				throw new RemoveException("Erro ao excluir o Representante da Empresa!");
		    }
		}
		catch(SQLException e){
	    	System.out.println("ERRO 2");
			//e.printStackTrace();
			throw new RemoveException("Erro ao excluir o Representante da Empresa!");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
		    	System.out.println("ERRO 3");
				e.printStackTrace();
				throw new RemoveException("Erro ao excluir o Representante da Empresa!");
			}
		}		
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
		if(atualiza){
			Connection conn = null;
		
			try{
				conn = Conexao.getConnection();
				RepresentanteEmpresaKey key = (RepresentanteEmpresaKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_representantesempresas ?,?,?");
	
			    stmt.setInt(1,key.representanteEmpresa);
			    stmt.setInt(2,this.empregador.empregador);			    
				stmt.setString(3,this.nome);
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("RepresentanteEmpresaBean ejbStore EJBException rs:"+rs);
			    }
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("RepresentanteEmpresaBean ejbStore EJBException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){}
			}					
		}		
	}
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return ctx;
	}
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		this.ctx = ctx;
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		ctx = null;
	}
	/**
	 * ejbCreate
	 */
	public RepresentanteEmpresaKey ejbCreate(int empresa,String nome)
		throws javax.ejb.CreateException {
			Connection 			conn 	= null;			
			RepresentanteEmpresaKey 	retVal  = null;
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_representantesempresas null,?,?");
			    stmt.setInt(1,empresa);					
			    stmt.setString(2,nome);

				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next())
					representanteEmpresa = rs.getInt("representanteEmpresa");					                            
				else
					throw new EJBException("RepresentanteEmpresaBean ejbCreate EJBException");

			    setNome(nome);
			    setEmpregador(new EmpregadorKey(empresa));
		
				retVal = new RepresentanteEmpresaKey(representanteEmpresa);
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){}
			}
			
			return retVal;

	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int empresa,String nome) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public RepresentanteEmpresaKey ejbFindByPrimaryKey(RepresentanteEmpresaKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_representantesempresa ?");
				stmt.setInt(1,key.representanteEmpresa);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("RepresentanteEmpresaBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("RepresentanteEmpresaBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}
	
    public Collection ejbFindAllRepresentanteEmpresa() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_representantesempresa");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new RepresentanteEmpresaKey(rs.getInt("representanteEmpresa")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("RepresentanteEmpresaBean ejbFindAllRepresentanteEmpresa FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}		

    public Collection ejbFindAllRepresentanteByEmpresa(int empresa) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_representantesempresa null,?");
			
			stmt.setInt(1,empresa);

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new RepresentanteEmpresaKey(rs.getInt("representanteEmpresa")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("RepresentanteEmpresaBean ejbFindAllRepresentanteByEmpresa() FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}
}
