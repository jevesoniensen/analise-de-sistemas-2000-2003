package br.smat.ejb.investigacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.agentesaude.AgenteSaudeKey;

/**
 * Bean implementation class for Enterprise Bean: Investigacao
 */
public class InvestigacaoBean implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;
	
	private	int			investigacao;
	private	AgenteSaudeKey	agenteSaude;
	private	AcidenteKey		acidente;
	private	String			dataAbertura;
	private	String			dataFinalizacao;
	private	String			titulo;
	private	String			obsGerais;			
	
	private	boolean 		atualiza;	

	/**
	 * Returns the acidente.
	 * @return AcidenteKey
	 */
	public AcidenteKey getAcidente() {
		atualiza = false;		
		return acidente;
	}

	/**
	 * Returns the agenteSaude.
	 * @return AgenteSaudeKey
	 */
	public AgenteSaudeKey getAgenteSaude() {
		atualiza = false;
		return agenteSaude;
	}

	/**
	 * Returns the dataAbertura.
	 * @return String
	 */
	public String getDataAbertura() {
		atualiza = false;
		return dataAbertura;
	}

	/**
	 * Returns the dataFinalizacao.
	 * @return String
	 */
	public String getDataFinalizacao() {
		atualiza = false;
		return dataFinalizacao;
	}

	/**
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getInvestigacao() {
		atualiza = false;
		return investigacao;
	}

	/**
	 * Returns the obsGerais.
	 * @return String
	 */
	public String getObsGerais() {
		atualiza = false;
		return obsGerais;
	}

	/**
	 * Returns the titulo.
	 * @return String
	 */
	public String getTitulo() {
		atualiza = false;
		return titulo;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(AcidenteKey acidente) {
		atualiza = true;
		this.acidente = acidente;
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
	 * Sets the dataAbertura.
	 * @param dataAbertura The dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura) {
		atualiza = true;
		this.dataAbertura = dataAbertura;
	}

	/**
	 * Sets the dataFinalizacao.
	 * @param dataFinalizacao The dataFinalizacao to set
	 */
	public void setDataFinalizacao(String dataFinalizacao) {
		atualiza = true;
		this.dataFinalizacao = dataFinalizacao;
	}

	/**
	 * Sets the fiscalizacao.
	 * @param fiscalizacao The fiscalizacao to set
	 */
	public void setInvestigacao(int investigacao) {
		atualiza = true;
		this.investigacao = investigacao;
	}

	/**
	 * Sets the obsGerais.
	 * @param obsGerais The obsGerais to set
	 */
	public void setObsGerais(String obsGerais) {
		atualiza = true;
		this.obsGerais = obsGerais;
	}

	/**
	 * Sets the titulo.
	 * @param titulo The titulo to set
	 */
	public void setTitulo(String titulo) {
		atualiza = true;
		this.titulo = titulo;
	}
	
	public void finalizar(){

			Connection conn = null;
		
			try{
				conn = Conexao.getConnection();
				InvestigacaoKey key = (InvestigacaoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_investigacoes ?,null,null,null,null,null,?");
	
			    stmt.setInt(1,key.investigacao);
				stmt.setString(2,"S");
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("InvestigacaoBean finalizar() EJBException rs:"+rs);
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
	 * ejbActivate
	 */
	public void ejbActivate() {
		investigacao		= 0;
		agenteSaude			= null;
		acidente			= null;
		dataAbertura		= null;
		dataFinalizacao		= null;
		titulo				= null;
		obsGerais			= null;			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		atualiza = false;		

		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			InvestigacaoKey  key = (InvestigacaoKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_investigacoes ?");
		    stmt.setInt(1,key.investigacao);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.investigacao	 	= rs.getInt("investigacao");
		    	this.agenteSaude	 	= new AgenteSaudeKey(rs.getInt("agenteSaude"));		    	
		    	this.acidente		 	= new AcidenteKey(rs.getInt("acidente"));		    	
		    	this.dataAbertura	 	= rs.getString("dataAbertura");
		    	this.dataFinalizacao	= rs.getString("dataFinalizacao");
		    	this.titulo			= rs.getString("titulo");
		    	this.obsGerais			= rs.getString("obsGerais");		    	
		    }
		    else{
			   throw new EJBException("InvestigacaoBean ejbLoad EJBException");
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
		}		}
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
			InvestigacaoKey key = (InvestigacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement	("exec sp_smat_excluir_investigacoes ?");
		    stmt.setInt(1,key.investigacao);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("InvestigacaoBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("InvestigacaoBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("InvestigacaoBean ejbRemove EJBException");
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
				InvestigacaoKey key = (InvestigacaoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_investigacoes ?,?,?,?,?,?");
	
			    stmt.setInt(1,key.investigacao);
				stmt.setInt(2,this.agenteSaude.agenteSaude);
				stmt.setInt(3,this.acidente.acidente);			
				
				if(dataFinalizacao == null || dataFinalizacao.trim().length() == 0)
					stmt.setString(4,null);
				else
					stmt.setString(4,dataFinalizacao);
				
				stmt.setString(5,titulo);				
				
				if(obsGerais.trim().length() < 8000)
	  				stmt.setString(6,obsGerais);
				else
					stmt.setString(6,null);
	  				
								
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("InvestigacaoBean ejbStore EJBException rs:"+rs);
			    }
			    else{
			    	
			    if(obsGerais != null)
			    	if(obsGerais.length() > 8000){
			    		stmt = null;
						stmt = conn.prepareStatement
							("update investigacoes set obsGerais = ? where investigacao = ?");
	
						stmt.setString(1,obsGerais);
						stmt.setInt(2,investigacao);

						int rss = stmt.executeUpdate();
						
					    if(rss != 1){
					    	throw new EJBException("InvestigacaoBean ejbStore => Erro ao alterar observações da investigacao: "+rs);
					    }							
				    }			    	
			    	
			    }
			    
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("InvestigacaoBean ejbStore => Erro ao alterar observações da investigacao");
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
	public InvestigacaoKey ejbCreate(	int			agenteSaude,
										int			acidente,
										String			titulo,
										String			obsGerais)
		throws javax.ejb.CreateException {
			Connection		conn 	= null;			
			InvestigacaoKey	retVal  = null;
			
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_investigacoes null,?,?,?,?,?");
	
				stmt.setInt(1,agenteSaude);
				stmt.setInt(2,acidente);			
				
				if(dataFinalizacao == null || dataFinalizacao.trim().length() == 0)
					stmt.setString(3,null);
				else
					stmt.setString(3,dataFinalizacao);
				
				stmt.setString(4,titulo);				
				
				if(obsGerais.trim().length() < 8000)
	  				stmt.setString(5,obsGerais);
				else
					stmt.setString(5,null);
	  				
								
				ResultSet rs = stmt.executeQuery();

				if(rs.next()){
					investigacao = rs.getInt("investigacao"   );					                            
					dataAbertura = rs.getString("dataAbertura");
		    	
				    if(obsGerais != null)
				    	if(obsGerais.length() > 8000){
				    		stmt = null;
							stmt = conn.prepareStatement
								("update investigacoes set obsGerais = ? where investigacao = ?");
	
							stmt.setString(1,obsGerais);
							stmt.setInt(2,investigacao);

							int rss = stmt.executeUpdate();
							
						    if(rss != 1){
						    	throw new EJBException("InvestigacaoBean ejbCreate => Erro ao incluir observações da fiscalização: "+rs);
						    }							
				    	}			    	
				    	
			    }
			    else{
				   	throw new EJBException("InvestigacaoBean ejbCreate => Erro ao incluir observações da fiscalização: "+rs);			    	
			    }
			    
			    
				setInvestigacao(investigacao);
			    setAgenteSaude(new AgenteSaudeKey(agenteSaude));
				setAcidente(new AcidenteKey(acidente));
				setDataAbertura(dataAbertura);
			    setDataFinalizacao(dataFinalizacao);
			    setTitulo(titulo);
			    setObsGerais(obsGerais);
			    
		
				retVal = new InvestigacaoKey(investigacao);
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
	public void ejbPostCreate(	int			agenteSaude,
									int			acidente,
									String			titulo,
									String			obsGerais) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public InvestigacaoKey ejbFindByPrimaryKey(InvestigacaoKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_investigacoes ?");
				stmt.setInt(1,key.investigacao);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("InvestigacaoBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("InvestigacaoBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}		
	}
	
    public Collection ejbFindAllInvestigacao() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_investigacoes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new InvestigacaoKey(rs.getInt("investigacao")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("InvestigacaoBean ejbFindAllInvestigacao FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}
	

	/**
	 * ejbFindByAcidente
	 */
	public InvestigacaoKey ejbFindByAcidente(int acidente)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_investigacoes null,?");
				stmt.setInt(1,acidente);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
				{
					if(rs.getInt("investigacao") != 0)
						return new InvestigacaoKey(rs.getInt("investigacao"));
					else
						throw new FinderException("InvestigacaoBean ejbFindByPrimaryKey FinderException 1");
				}
				else
					throw new FinderException("InvestigacaoBean ejbFindByPrimaryKey FinderException 2");
			}
			catch(SQLException e){
					throw new FinderException("InvestigacaoBean ejbFindByPrimaryKey FinderException 3");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}		
	}			
}
