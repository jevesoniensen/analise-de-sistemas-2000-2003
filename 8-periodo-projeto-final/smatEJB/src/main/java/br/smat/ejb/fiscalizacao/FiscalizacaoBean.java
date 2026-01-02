package br.smat.ejb.fiscalizacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.agentecausador.AgenteCausadorKey;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
import br.smat.ejb.emitente.EmitenteKey;
import br.smat.ejb.empregador.EmpregadorKey;

/**
 * Bean implementation class for Enterprise Bean: Fiscalizacao
 */
public class FiscalizacaoBean implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;
	
	private 	int 			fiscalizacao;
	private	AgenteSaudeKey	agenteSaude;
	private	EmpregadorKey	empregador;
	private	String			dataAbertura;
	private	String			dataFinalizacao;
	private	String			titulo;
	private	String			obsGerais;			
	
	private	boolean 		atualiza;

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
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador() {
		atualiza = false;				
		return empregador;
	}

	/**
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getFiscalizacao() {
		atualiza = false;		
		return fiscalizacao;
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
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador) {
		atualiza = true;		
		this.empregador = empregador;
	}

	/**
	 * Sets the fiscalizacao.
	 * @param fiscalizacao The fiscalizacao to set
	 */
	public void setFiscalizacao(int fiscalizacao) {
		atualiza = true;		
		this.fiscalizacao = fiscalizacao;
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
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		fiscalizacao 	= 0;
		agenteSaude	 	= null;
		empregador   	= null;
		dataAbertura	= null;
		dataFinalizacao	= null;
		titulo			= null;
		obsGerais 		= null;
		atualiza 		= false;				
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
			FiscalizacaoKey  key = (FiscalizacaoKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_fiscalizacoes ?");
		    stmt.setInt(1,key.fiscalizacao);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.fiscalizacao 	 	= rs.getInt("fiscalizacao");
		    	this.agenteSaude	 	= new AgenteSaudeKey(rs.getInt("agenteSaude"));		    	
		    	this.empregador	 	= new EmpregadorKey(rs.getInt("empregador"));		    	
		    	this.dataAbertura	 	= rs.getString("dataAbertura");
		    	this.dataFinalizacao	= rs.getString("dataFinalizacao");
		    	this.titulo			= rs.getString("titulo");
		    	this.obsGerais			= rs.getString("obsGerais");		    	
		    }
		    else{
			   throw new EJBException("FiscalizacaoBean ejbLoad EJBException");
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
			FiscalizacaoKey key = (FiscalizacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement	("exec sp_smat_excluir_fiscalizacoes ?");
		    stmt.setInt(1,key.fiscalizacao);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("FiscalizacaoBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			throw new EJBException("FiscalizacaoBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("FiscalizacaoBean ejbRemove EJBException");
			}
		}		
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
		
		System.out.println("ejbLoad fisccalizacao => " + dataFinalizacao);
		
		if(atualiza){
			Connection conn = null;
		
			try{
				conn = Conexao.getConnection();
				FiscalizacaoKey key = (FiscalizacaoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_fiscalizacoes ?,?,?,?,?,?");
	
			    stmt.setInt(1,key.fiscalizacao);
				stmt.setInt(2,this.agenteSaude.agenteSaude);
				stmt.setInt(3,this.empregador.empregador);			
				
				
				System.out.println("Data da finalização => " + dataFinalizacao);
				
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
			    	throw new EJBException("FiscalizacaoBean ejbStore EJBException rs:"+rs);
			    }
			    else{
			    	
			    if(obsGerais != null)
			    	if(obsGerais.length() > 8000){
			    		stmt = null;
						stmt = conn.prepareStatement
							("update fiscalizacoes set obsGerais = ? where fiscalizacao = ?");
	
						stmt.setString(1,obsGerais);
						stmt.setInt(2,fiscalizacao);

						int rss = stmt.executeUpdate();
						
					    if(rss != 1){
					    	throw new EJBException("FiscalizacaoBean ejbStore => Erro ao alterar observações da fiscalização: "+rs);
					    }							
				    }			    	
			    	
			    }
			    
			}
			catch(SQLException e){
				throw new EJBException("FiscalizacaoBean ejbStore => Erro ao alterar fiscalização SQLException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("FiscalizacaoBean ejbStore => Erro ao alterar fiscalização SQLException");					
				}
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
	public FiscalizacaoKey ejbCreate(	int			agenteSaude,
										int			empregador,
										String			titulo,
										String			obsGerais)
		throws javax.ejb.CreateException {

			Connection		conn 	= null;			
			FiscalizacaoKey	retVal  = null;
			
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_fiscalizacoes null,?,?,?,?,?");
	
				stmt.setInt(1,agenteSaude);
				stmt.setInt(2,empregador);			
				
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
					fiscalizacao = rs.getInt("fiscalizacao"   );					                            
					dataAbertura = rs.getString("dataAbertura");
		    	
				    if(obsGerais != null)
				    	if(obsGerais.length() > 8000){
				    		stmt = null;
							stmt = conn.prepareStatement
								("update fiscalizacoes set obsGerais = ? where fiscalizacao = ?");
	
							stmt.setString(1,obsGerais);
							stmt.setInt(2,fiscalizacao);

							int rss = stmt.executeUpdate();
							
						    if(rss != 1){
						    	throw new EJBException("FiscalizacaoBean ejbCreate => Erro ao incluir observações da fiscalização: "+rs);
						    }							
				    	}			    	
				    	
			    }
			    else{
				   	throw new EJBException("FiscalizacaoBean ejbCreate => Erro ao incluir observações da fiscalização: "+rs);			    	
			    }
			    
			    
			    setFiscalizacao(fiscalizacao);
			    setAgenteSaude(new AgenteSaudeKey(agenteSaude));
			    setEmpregador(new EmpregadorKey(empregador));
			    setDataAbertura(dataAbertura);
			    setDataFinalizacao(dataFinalizacao);
			    setTitulo(titulo);
			    setObsGerais(obsGerais);
			    
		
				retVal = new FiscalizacaoKey(fiscalizacao);
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
	public void ejbPostCreate( int			agenteSaude,
								int			empregador,
								String			titulo,
								String			obsGerais) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public FiscalizacaoKey ejbFindByPrimaryKey(FiscalizacaoKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_fiscalizacoes ?");
				stmt.setInt(1,key.fiscalizacao);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("FiscalizacaoBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("FiscalizacaoBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}		
	}
	
    public Collection ejbFindAllFiscalizacao() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_fiscalizacoes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new FiscalizacaoKey(rs.getInt("fiscalizacao")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("FiscalizacaoBean ejbFindAllFiscalizacao FinderException");
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
