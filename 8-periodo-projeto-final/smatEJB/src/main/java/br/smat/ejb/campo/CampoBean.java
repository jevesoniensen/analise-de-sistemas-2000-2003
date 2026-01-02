package br.smat.ejb.campo;

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

import javax.sql.DataSource;

import	br.smat.conexao.Conexao;
import br.smat.objetosauxiliares.auxcampo.*;

/**
 * Bean implementation class for Enterprise Bean: Campo
 */
public class CampoBean implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;

	private int campo;
	private String tabela;
	private String coluna;
	private String pai;
	private String nome;
	private String label;
	
	private boolean atualiza;	

	/**
	 * Returns the campo.
	 * @return int
	 */
	public int getCampo() {
		atualiza = false;
		return campo;
	}

	/**
	 * Returns the coluna.
	 * @return String
	 */
	public String getColuna() {
		atualiza = false;
		return coluna;
	}

	/**
	 * Returns the pai.
	 * @return String
	 */
	public String getPai() {
		atualiza = false;
		return pai;
	}

	/**
	 * Returns the tabela.
	 * @return String
	 */
	public String getTabela() {
		atualiza = false;
		return tabela;
	}

	/**
	 * Sets the campo.
	 * @param campo The campo to set
	 */
	public void setCampo(int campo) {
		atualiza = true;
		this.campo = campo;
	}

	/**
	 * Sets the coluna.
	 * @param coluna The coluna to set
	 */
	public void setColuna(String coluna) {
		atualiza = true;
		this.coluna = coluna;
	}

	/**
	 * Sets the pai.
	 * @param pai The pai to set
	 */
	public void setPai(String pai) {
		atualiza = true;
		this.pai = pai;
	}

	/**
	 * Sets the tabela.
	 * @param tabela The tabela to set
	 */
	public void setTabela(String tabela) {
		atualiza = true;
		this.tabela = tabela;
	}

	/**
	 * Returns the label.
	 * @return String
	 */
	public String getLabel() {
		atualiza = false;
		return label;
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
	 * Sets the label.
	 * @param label The label to set
	 */
	public void setLabel(String label) {
		atualiza = true;
		this.label = label;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		atualiza = true;
		this.nome = nome;
	}
	
	public AuxCampo[] getRegistros() {

		atualiza = false;
		Connection conn = null;
		Vector vCampo = new Vector();
		AuxCampo aux = null;
		
		try{
			conn = Conexao.getConnection();
			CampoKey key = (CampoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_registroscampo ?");
		    stmt.setInt(1,key.campo);

	    	ResultSet rs = stmt.executeQuery();

		    while(rs.next()){
		    	
		    	aux = new AuxCampo(rs.getInt("registro"),rs.getString("nomeRegistro"));
		    	vCampo.add(aux);

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
		
		return (AuxCampo[])vCampo.toArray(new AuxCampo[0]);
		
	} 	
		
	public AuxCampo[] getRegistrosFilhos() {

		atualiza = false;
		Connection conn = null;
		Vector vCampo = new Vector();
		AuxCampo aux = null;
		
		try{
			conn = Conexao.getConnection();
			CampoKey key = (CampoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_registroscampo ?,?");
				
		    stmt.setInt(1,key.campo);
			stmt.setString(2,"A");

	    	ResultSet rs = stmt.executeQuery();

		    while(rs.next()){
		    	
		    	aux = new AuxCampo(rs.getInt("registro"),rs.getString("nomeRegistro"));
		    	vCampo.add(aux);

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
		
		return (AuxCampo[])vCampo.toArray(new AuxCampo[0]);
		
	} 		
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		campo = 0;
		tabela = null;
		coluna = null;
		pai = null;
		nome = null;
		label = null;
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
			CampoKey key = (CampoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_campos ?");
		    stmt.setInt(1,key.campo);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		campo = rs.getInt("campo");
		    	tabela   = rs.getString("tabela");
		    	coluna   = rs.getString("coluna");
		    	pai   = rs.getString("pai");
		    	nome = rs.getString("nome");
		    	label = rs.getString("label");
		    }
		    else{
			   throw new EJBException("Erro ao carregar Campos");
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
		atualiza = false;

		Connection conn = null;
	
		try{
			conn = Conexao.getConnection();
			CampoKey key = (CampoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_campos ?");
		    stmt.setInt(1,key.campo);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("Erro ao excluir Campos");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			 throw new EJBException("Erro ao excluir Campos");
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{ throw new EJBException("Erro ao excluir Campos");}
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
				CampoKey key = (CampoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_campos ?,?,?,?,?,?");

			    stmt.setInt(1,key.campo);
				stmt.setString(2,tabela);
				stmt.setString(3,coluna);
				stmt.setString(4,pai);
				stmt.setString(5,nome);
				stmt.setString(6,label);
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("Failed to update: "+rs);
			    }
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				try{
					conn.close();
					atualiza = false;												
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
	public br.smat.ejb.campo.CampoKey ejbCreate(String tabela,
												 String coluna,
												 String pai,
												 String nome,
												 String label)
		throws javax.ejb.CreateException {
			
			Connection 	conn 	= null;			
			CampoKey 	retVal  = null;
								
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_campos null,?,?,?,?,?");
				
				stmt.setString(1,tabela);
				stmt.setString(2,coluna);
				stmt.setString(3,pai);
				stmt.setString(4,nome);
				stmt.setString(5,label);
				
				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					campo = rs.getInt("campo");
				else
					throw new EJBException("FAILED TO INSERT");

				setTabela(tabela);
				setColuna(coluna);
				setPai(pai);
				setNome(nome);
				setLabel(label);

				retVal = new CampoKey(campo);
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
			atualiza = false;					
			return retVal;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(String tabela,
							   String coluna,
							   String pai,
							   String nome,
							   String label	
	) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.campo.CampoKey ejbFindByPrimaryKey(
		br.smat.ejb.campo.CampoKey key)
		throws javax.ejb.FinderException {
			
			Connection conn = null;
			atualiza = false;										
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_campos ?");
				stmt.setInt(1,key.campo);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("CampoBean ejbFindByPrimaryKey => Campo not found");
			}
			catch(SQLException e){
					throw new FinderException("CampoBean ejbFindByPrimaryKey => Campo not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}

	}

	public Collection ejbFindAllCampos() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;									
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_campos");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new CampoKey(rs.getInt("campo")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("CampoBean ejbFindAllCampos => Campo not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}

	public Collection ejbFindAllCampos(int campo1) throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;									
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_campos null,?");
			
			stmt.setInt(1,campo1);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new CampoKey(rs.getInt("campo")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("CampoBean ejbFindAllCampos => Campo not Found");
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
