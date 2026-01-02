package br.smat.ejb.dadoinvestigacao;

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
import br.smat.ejb.investigacao.InvestigacaoKey;
import br.smat.ejb.representanteempresa.RepresentanteEmpresaKey;
import br.smat.ejb.testemunha.TestemunhaKey;
import br.smat.ejb.tipodepoimento.TipoDepoimentoKey;
import br.smat.ejb.trabalhador.TrabalhadorKey;

/**
 * Bean implementation class for Enterprise Bean: DadoInvestigacao
 */
public class DadoInvestigacaoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private InvestigacaoKey 			investigacao;
	private int			 			dadoInvestigacao;
	private RepresentanteEmpresaKey	representanteEmpresa;
	private TestemunhaKey				testemunha;
	private AgenteSaudeKey 			agenteSaude;
	private String			 			dataHora;
	private AgenteCausadorKey 			agenteCausador;
	private TrabalhadorKey			 	trabalhador;
	private String			 			descricao;
	private TipoDepoimentoKey			tipoDepoimento;
	
	private boolean atualiza;	

	/**
	 * Returns the agenteCausador.
	 * @return int
	 */
	public AgenteCausadorKey getAgenteCausador() {
		atualiza = false;
		return agenteCausador;
	}

	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public AgenteSaudeKey getAgenteSaude() {
		atualiza = false;
		return agenteSaude;
	}

	/**
	 * Returns the dadoInvestigacao.
	 * @return int
	 */
	public int getDadoInvestigacao() {
		atualiza = false;
		return dadoInvestigacao;
	}

	/**
	 * Returns the dataHora.
	 * @return String
	 */
	public String getDataHora() {
		atualiza = false;
		return dataHora;
	}

	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		atualiza = false;
		return descricao;
	}

	/**
	 * Returns the investigacao.
	 * @return InvestigacaoKey
	 */
	public InvestigacaoKey getInvestigacao() {
		atualiza = false;
		return investigacao;
	}

	/**
	 * Returns the representanteEmpresa.
	 * @return int
	 */
	public RepresentanteEmpresaKey getRepresentanteEmpresa() {
		atualiza = false;
		return representanteEmpresa;
	}

	/**
	 * Returns the testemunha.
	 * @return int
	 */
	public TestemunhaKey getTestemunha() {
		atualiza = false;
		return testemunha;
	}

	/**
	 * Returns the trabalhador.
	 * @return int
	 */
	public TrabalhadorKey getTrabalhador() {
		atualiza = false;
		return trabalhador;
	}

	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(AgenteCausadorKey agenteCausador) {
		atualiza = true;
		this.agenteCausador = agenteCausador;
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
	 * Sets the dadoInvestigacao.
	 * @param dadoInvestigacao The dadoInvestigacao to set
	 */
	public void setDadoInvestigacao(int dadoInvestigacao) {
		atualiza = true;
		this.dadoInvestigacao = dadoInvestigacao;
	}

	/**
	 * Sets the dataHora.
	 * @param dataHora The dataHora to set
	 */
	public void setDataHora(String dataHora) {
		atualiza = true;
		this.dataHora = dataHora;
	}

	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		atualiza = true;
		this.descricao = descricao;
	}

	/**
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(InvestigacaoKey investigacao) {
		atualiza = true;
		this.investigacao = investigacao;
	}

	/**
	 * Sets the representanteEmpresa.
	 * @param representanteEmpresa The representanteEmpresa to set
	 */
	public void setRepresentanteEmpresa(RepresentanteEmpresaKey representanteEmpresa) {
		atualiza = true;
		this.representanteEmpresa = representanteEmpresa;
	}

	/**
	 * Sets the testemunha.
	 * @param testemunha The testemunha to set
	 */
	public void setTestemunha(TestemunhaKey testemunha) {
		atualiza = true;
		this.testemunha = testemunha;
	}

	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(TrabalhadorKey trabalhador) {
		atualiza = true;
		this.trabalhador = trabalhador;
	}

	/**
	 * Returns the tipoDepoimento.
	 * @return TipoDepoimentoKey
	 */
	public TipoDepoimentoKey getTipoDepoimento() {
		atualiza = false;	
		return tipoDepoimento;
	}

	/**
	 * Sets the tipoDepoimento.
	 * @param tipoDepoimento The tipoDepoimento to set
	 */
	public void setTipoDepoimento(TipoDepoimentoKey tipoDepoimento) {
		atualiza = true;
		this.tipoDepoimento = tipoDepoimento;
	}
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		investigacao		 = null;
		dadoInvestigacao	 = 0;
		representanteEmpresa = null;
		testemunha			 = null;
		agenteSaude			 = null;
		dataHora			 = null;
		agenteCausador		 = null;
		trabalhador			 = null;
		descricao			 = null;
		tipoDepoimento		 = null;

	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			DadoInvestigacaoKey key = (DadoInvestigacaoKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_dadosinvestigacao ?,?");
		    stmt.setInt(1,key.investigacao.investigacao);
		    stmt.setInt(2,key.dadoInvestigacao);		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.investigacao 			= new InvestigacaoKey(rs.getInt("investigacao"));
	    		this.dadoInvestigacao		= rs.getInt("dadoInvestigacao");
	    		
	    		if(rs.getInt("representanteEmpresa") != 0)
					this.representanteEmpresa 	= new RepresentanteEmpresaKey(rs.getInt("representanteEmpresa"));

				if(rs.getInt("testemunha") != 0)
					this.testemunha			= new TestemunhaKey(rs.getInt("testemunha"));

				if(rs.getInt("agenteSaude") != 0)
					this.agenteSaude			= new AgenteSaudeKey(rs.getInt("agenteSaude"));

				this.dataHora				= rs.getString("datahora");
				this.agenteCausador		= new AgenteCausadorKey(rs.getInt("agenteCausador"));
				
				if(rs.getInt("trabalhador") != 0)
					this.trabalhador			= new TrabalhadorKey(rs.getInt("trabalhador"));

				this.descricao				= rs.getString("descricao");
				this.tipoDepoimento		= new TipoDepoimentoKey(rs.getInt("tipoDepoimento"));
				
		    }
		    else{
			   throw new EJBException("DadoInvestigacaoBean ejbLoad EJBException");
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
			DadoInvestigacaoKey key = (DadoInvestigacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement	("exec sp_smat_excluir_dadosinvestigacao ?,?");
		    stmt.setInt(1,key.investigacao.investigacao);
		    stmt.setInt(2,key.dadoInvestigacao);
		    
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("DadoInvestigacaoBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("DadoInvestigacaoBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("DadoInvestigacaoBean ejbRemove EJBException");}
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
				DadoInvestigacaoKey key = (DadoInvestigacaoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_dadosinvestigacao ?,?,?,?,?,?,?,?,?,?");
	
			    stmt.setInt(1,key.dadoInvestigacao);
			    stmt.setInt(2,key.investigacao.investigacao);
			    if(representanteEmpresa != null)
					stmt.setInt(3,this.representanteEmpresa.representanteEmpresa);
				else
					stmt.setNull(3,Types.INTEGER);
				
				if(testemunha != null)					
					stmt.setInt(4,this.testemunha.testemunha);			
				else
					stmt.setNull(4,Types.INTEGER);
				

								
				if(agenteSaude != null){
					System.out.println("agente de saudeeeeeeee => " + agenteSaude.agenteSaude);
					stmt.setInt(5,this.agenteSaude.agenteSaude);							
				}
				else
					stmt.setNull(5,Types.INTEGER);				
				
				if(dataHora == null || dataHora.trim().length() == 0)
					stmt.setString(6,null);
				else
					stmt.setString(6,dataHora);
				
				stmt.setInt(7,agenteCausador.agenteCausador);				
				
				if(trabalhador != null)
					stmt.setInt(8,trabalhador.trabalhador);
				else
					stmt.setNull(8,Types.INTEGER);					
				
				if(descricao.trim().length() < 8000)
	  				stmt.setString(9,descricao);
				else
					stmt.setString(9,null);
					
				stmt.setInt(10,tipoDepoimento.tipoDepoimento);
	  				
								
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("InvestigacaoBean ejbStore EJBException rs:"+rs);
			    }
			    else{
			    	
				    if(descricao != null)
				    	if(descricao.length() > 8000){
				    		stmt = null;
							stmt = conn.prepareStatement
								("update DadosInvestigacao set descricao = ? where investigacao = ? and dadoInvestigacao = ?");
	
							stmt.setString(1,descricao);
							stmt.setInt(2,investigacao.investigacao);
							stmt.setInt(3,dadoInvestigacao);

							int rss = stmt.executeUpdate();
							
						    if(rss != 1){
						    	throw new EJBException("DadoInvestigacaoBean ejbStore => Erro ao alterar descrições do dado da investigação: "+rs);
						    }							
				    	}						
			    	
			    }
			    
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("DadoInvestigacaoBean ejbStore EJBException");

			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){throw new EJBException("DadoInvestigacaoBean ejbStore EJBException");}
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
	public DadoInvestigacaoKey ejbCreate(	int 	investigacao,
											int 	pessoa,
											String  dataHora,
											int	agenteCausador,
											String  descricao,
											int	tipoDepoimento)
		throws javax.ejb.CreateException {

			
			this.agenteSaude			= null;			
			this.testemunha			= null;			
			this.representanteEmpresa	= null;
			this.trabalhador			= null;
					
			switch(tipoDepoimento){
				case 1:
					setAgenteSaude(new AgenteSaudeKey(pessoa));
					break;
				case 2:
					setTestemunha(new TestemunhaKey(pessoa));
					break;
				case 3:
					setRepresentanteEmpresa(new RepresentanteEmpresaKey(pessoa));
					break;
				case 4:
					setTrabalhador(new TrabalhadorKey(pessoa));
					break;															
			}
			
			setDataHora(dataHora);
			setDescricao(descricao);
			setTipoDepoimento(new TipoDepoimentoKey(tipoDepoimento));
			setAgenteCausador(new AgenteCausadorKey(agenteCausador));
			
			Connection 			conn 	= null;			
			DadoInvestigacaoKey	retVal  = null;
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_dadosinvestigacao null,?,?,?,?,?,?,?,?,?");

			    stmt.setInt(1,investigacao);
			    
			    if(this.representanteEmpresa != null)
				    stmt.setInt(2,this.representanteEmpresa.representanteEmpresa);
				else
					stmt.setNull(2,Types.INTEGER);
				
				if(this.testemunha != null)
				    stmt.setInt(3,this.testemunha.testemunha);
				else
					stmt.setNull(3,Types.INTEGER);				    
				    
				if(this.agenteSaude != null)    
				    stmt.setInt(4,this.agenteSaude.agenteSaude);
				else
					stmt.setNull(4,Types.INTEGER);
									    
			    stmt.setString(5,dataHora);			    			    			    
			    stmt.setInt(6,this.agenteCausador.agenteCausador);
			    
			    if(this.trabalhador != null)
				    stmt.setInt(7,this.trabalhador.trabalhador);
				else
					stmt.setNull(7,Types.INTEGER);				    
			    
			    if(descricao != null && descricao.trim().length() < 8000)
				    stmt.setString(8,descricao);
				else
					stmt.setString(8,null);
					
				stmt.setInt(9,tipoDepoimento);

				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next()){
					dadoInvestigacao = rs.getInt("dadoInvestigacao");					                            
					
				    if(descricao != null)
				    	if(descricao.length() > 8000){
				    		stmt = null;
							stmt = conn.prepareStatement
								("update DadosInvestigacao set descricao = ? where investigacao = ? and dadoInvestigacao = ?");
	
							stmt.setString(1,descricao);
							stmt.setInt(2,investigacao);
							stmt.setInt(3,dadoInvestigacao);

							int rss = stmt.executeUpdate();
							
						    if(rss != 1){
						    	throw new EJBException("DadoInvestigacaoBean ejbCreate => Erro ao incluir descrições do dado da investigação: "+rs);
						    }							
				    	}						
				}
				else
					throw new EJBException("DadoInvestigacaoBean ejbCreate EJBException");
		
		
				retVal = new DadoInvestigacaoKey(investigacao,dadoInvestigacao);
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
	public void ejbPostCreate(	int 	investigacao,
									int 	pessoa,
									String  dataHora,
									int	agenteCausador,
									String  descricao,
									int	tipoDepoimento) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public DadoInvestigacaoKey ejbFindByPrimaryKey(DadoInvestigacaoKey key)
		throws javax.ejb.FinderException {
			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_dadosinvestigacao ?,?");
				stmt.setInt(1,key.investigacao.investigacao);
				stmt.setInt(2,key.dadoInvestigacao);
				
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("DadoInvestigacaoBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("DadoInvestigacaoBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}

    public Collection ejbFindAllDadoInvestigacao(int investigacao) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_dadosinvestigacao ? ");
			stmt.setInt(1,investigacao);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new DadoInvestigacaoKey(investigacao,rs.getInt("dadoInvestigacao")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("DadoInvestigacaoBean ejbFindAllDadoInvestigacao FinderException");
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

