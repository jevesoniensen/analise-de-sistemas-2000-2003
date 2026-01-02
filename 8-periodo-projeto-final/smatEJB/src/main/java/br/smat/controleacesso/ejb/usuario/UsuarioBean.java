package br.smat.controleacesso.ejb.usuario;

import java.sql.Connection;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.naming.Context;
import javax.naming.InitialContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import	br.smat.conexao.Conexao;
import br.smat.ejb.agentesaude.AgenteSaudeKey;

/**
 * Bean implementation class for Enterprise Bean: Usuario
 */
public class UsuarioBean implements javax.ejb.EntityBean {

	private javax.ejb.EntityContext ctx;
	
	private int usuario;
	private String nome;
	private String senha;
	private AgenteSaudeKey agenteSaude;

	private boolean atualiza;		
	

	/**
	 * Returns the agenteSaude.
	 * @return AgenteSaudeKey
	 */
	public AgenteSaudeKey getAgenteSaude() {
		atualiza = false;
		return agenteSaude;
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
	 * Returns the senha.
	 * @return String
	 */
	public String getSenha() {
		atualiza = false;
		return senha;
	}

	/**
	 * Returns the usuario.
	 * @return int
	 */
	public int getUsuario() {
		atualiza = false;
		return usuario;
	}

	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(AgenteSaudeKey agenteSaude) {
		atualiza = true;
		this.agenteSaude = agenteSaude;
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
	 * Sets the senha.
	 * @param senha The senha to set
	 */
	public void setSenha(String senha) {
		atualiza = true;		
		this.senha = senha;
	}

	/**
	 * Sets the usuario.
	 * @param usuario The usuario to set
	 */
	public void setUsuario(int usuario) {
		atualiza = true;		
		this.usuario = usuario;
	}
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		usuario = 0;
		nome = null;
		senha = null;
		agenteSaude = null;

		atualiza = false;		
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		atualiza = false;
		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			
			UsuarioKey key = (UsuarioKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_usuarios ?");

		    stmt.setInt(1,key.usuario);

	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){

				usuario = rs.getInt("usuario");
		    	nome   = rs.getString("nome");
				senha = rs.getString("senha");
				
				if(rs.getInt("agenteSaude") != 0)
					agenteSaude = new AgenteSaudeKey(rs.getInt("agenteSaude"));

		    }
		    else{
			   throw new EJBException("Erro ao carregar Usuarios");
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
	public void ejbRemove() throws javax.ejb.RemoveException {

		Connection conn = null;
		atualiza = false;
	
		try{
			conn = Conexao.getConnection();
			UsuarioKey key = (UsuarioKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_usuarios ?");
		    stmt.setInt(1,key.usuario);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("Erro ao excluir Usuarios");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new EJBException("Erro ao excluir Usuarios");
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{throw new EJBException("Erro ao excluir Usuarios");}
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
			UsuarioKey key = (UsuarioKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_usuarios ?,?,?,?");

			
			System.out.println("Store agenteSaude " + agenteSaude);

		    stmt.setInt(1,key.usuario);
			stmt.setString(2,nome);
			stmt.setString(3,senha);
			
			if(agenteSaude == null)
				stmt.setNull(4,Types.INTEGER);
			else
				stmt.setInt(4,agenteSaude.agenteSaude);
				
			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("Erro ao alterar Usuarios: "+rs);
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("Erro ao alterar Usuarios ");}
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
	public UsuarioKey ejbCreate(  String nome,
								   String senha,
								   int    agenteSaude)
		throws javax.ejb.CreateException {
		atualiza = false;
			Connection 	conn 	= null;			
			UsuarioKey 	retVal  = null;
			
			try{
				
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_usuarios null,?,?,?");
				

			    stmt.setString(1,nome);
			    stmt.setString(2,senha);

			     if(agenteSaude == 0)
			     	stmt.setNull(3,Types.INTEGER);
			     else
			     	stmt.setInt(3,agenteSaude);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					usuario = rs.getInt("usuario");
				else
					throw new EJBException("Erro ao inserir Usuarios");

			    setNome(nome);
			    setSenha(senha);
			    
			    if(agenteSaude != 0)
				    setAgenteSaude(new AgenteSaudeKey(agenteSaude));
				    
				retVal = new UsuarioKey(usuario);
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
	public void ejbPostCreate( String nome,
							    String senha,
								int    agenteSaude)
		throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public UsuarioKey ejbFindByPrimaryKey(UsuarioKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_usuarios ?");
				stmt.setInt(1,key.usuario);
				
				
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next())
					return key;
				else
					throw new FinderException("UsuarioBean ejbFindByPrimaryKey => Usuario not found");
			}
			catch(SQLException e){
					throw new FinderException("UsuarioBean ejbFindByPrimaryKey => Usuario not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}

	public UsuarioKey ejbFindByNomeSenha(String nome,String senha) throws FinderException
	{
		Connection conn = null;
		UsuarioKey retVal = null;
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_usuarios null,?,?");
			
			stmt.setString(1,nome);
			stmt.setString(2,senha);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				System.out.println("no bean => " + rs.getInt("usuario"));
				
				if(rs.getInt("usuario") != 0)
					retVal = new UsuarioKey(rs.getInt("usuario"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("UsuarioBean ejbFindByNomeSenha => Usuario not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}
	
	public Collection ejbFindAll() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;
				
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_usuarios");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new UsuarioKey(rs.getInt("usuario")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("UsuarioBean ejbFindAll => UsuarioKey not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new EJBException("UsuarioBean ejbFindAll");
			}
		}
		return retVal;
	}	
}
