package br.smat.ejb.relatoriosalvo;

import java.sql.Connection;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.EntityContext;
import javax.ejb.FinderException;
import javax.naming.Context;
import javax.naming.InitialContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import br.smat.conexao.Conexao;
import br.smat.ejb.campo.CampoKey;

/**
 * Bean implementation class for Enterprise Bean: RelatorioSalvo
 */
public class RelatorioSalvoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int relatorio;
	private int tipoAgrupamento;
	private int local;
	private String queryLocal;
	private int periodicidade;
	private CampoKey campo1;
	private String queryCampo1;
	private CampoKey campo2;
	private String queryCampo2;
	private String dataInicio;
	private String dataFim;
	private String titulo;
	private String texto;
	private String dataCriacao;
	
	private boolean atualiza;

	/**
	 * Returns the campo1.
	 * @return CampoKey
	 */
	public CampoKey getCampo1() {
		atualiza = false;
		return campo1;
	}

	/**
	 * Returns the campo2.
	 * @return CampoKey
	 */
	public CampoKey getCampo2() {
		atualiza = false;
		return campo2;
	}

	/**
	 * Returns the dataFim.
	 * @return String
	 */
	public String getDataFim() {
		atualiza = false;
		return dataFim;
	}

	/**
	 * Returns the dataInicio.
	 * @return String
	 */
	public String getDataInicio() {
		atualiza = false;
		return dataInicio;
	}

	/**
	 * Returns the local.
	 * @return int
	 */
	public int getLocal() {
		atualiza = false;
		return local;
	}

	/**
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade() {
		atualiza = false;
		return periodicidade;
	}

	/**
	 * Returns the queryCampo1.
	 * @return String
	 */
	public String getQueryCampo1() {
		atualiza = false;
		return queryCampo1;
	}

	/**
	 * Returns the queryCampo2.
	 * @return String
	 */
	public String getQueryCampo2() {
		atualiza = false;
		return queryCampo2;
	}

	/**
	 * Returns the queryLocal.
	 * @return String
	 */
	public String getQueryLocal() {
		atualiza = false;
		return queryLocal;
	}

	/**
	 * Returns the relatorio.
	 * @return int
	 */
	public int getRelatorio() {
		atualiza = false;
		return relatorio;
	}

	/**
	 * Returns the texto.
	 * @return String
	 */
	public String getTexto() {
		atualiza = false;
		return texto;
	}

	/**
	 * Returns the tipoAgrupamento.
	 * @return int
	 */
	public int getTipoAgrupamento() {
		atualiza = false;
		return tipoAgrupamento;
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
	 * Sets the campo1.
	 * @param campo1 The campo1 to set
	 */
	public void setCampo1(CampoKey campo1) {
		atualiza = true;
		this.campo1 = campo1;
	}

	/**
	 * Sets the campo2.
	 * @param campo2 The campo2 to set
	 */
	public void setCampo2(CampoKey campo2) {
		atualiza = true;;
		this.campo2 = campo2;
	}

	/**
	 * Sets the dataFim.
	 * @param dataFim The dataFim to set
	 */
	public void setDataFim(String dataFim) {
		atualiza = true;
		this.dataFim = dataFim;
	}

	/**
	 * Sets the dataInicio.
	 * @param dataInicio The dataInicio to set
	 */
	public void setDataInicio(String dataInicio) {
		atualiza = true;
		this.dataInicio = dataInicio;
	}

	/**
	 * Sets the local.
	 * @param local The local to set
	 */
	public void setLocal(int local) {
		atualiza = true;
		this.local = local;
	}

	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade) {
		atualiza = true;
		this.periodicidade = periodicidade;
	}

	/**
	 * Sets the queryCampo1.
	 * @param queryCampo1 The queryCampo1 to set
	 */
	public void setQueryCampo1(String queryCampo1) {
		atualiza = true;
		this.queryCampo1 = queryCampo1;
	}

	/**
	 * Sets the queryCampo2.
	 * @param queryCampo2 The queryCampo2 to set
	 */
	public void setQueryCampo2(String queryCampo2) {
		atualiza = true;
		this.queryCampo2 = queryCampo2;
	}

	/**
	 * Sets the queryLocal.
	 * @param queryLocal The queryLocal to set
	 */
	public void setQueryLocal(String queryLocal) {
		atualiza = true;
		this.queryLocal = queryLocal;
	}

	/**
	 * Sets the relatorio.
	 * @param relatorio The relatorio to set
	 */
	public void setRelatorio(int relatorio) {atualiza = true;
		this.relatorio = relatorio;
	}

	/**
	 * Sets the texto.
	 * @param texto The texto to set
	 */
	public void setTexto(String texto) {
		atualiza = true;
		this.texto = texto;
	}

	/**
	 * Sets the tipoAgrupamento.
	 * @param tipoAgrupamento The tipoAgrupamento to set
	 */
	public void setTipoAgrupamento(int tipoAgrupamento) {
		atualiza = true;
		this.tipoAgrupamento = tipoAgrupamento;
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
	 * Returns the dataCriacao.
	 * @return String
	 */
	public String getDataCriacao() {
		atualiza=false;
		return dataCriacao;
	}	

	/**
	 * Sets the dataCriacao.
	 * @param dataCriacao The dataCriacao to set
	 */
	public void setDataCriacao(String dataCriacao) {
		atualiza = true;
		this.dataCriacao = dataCriacao;
	}
				
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		relatorio = 0;
		tipoAgrupamento = 0;
		local = 0;
		queryLocal = null;
		periodicidade = 0;
		campo1 = null;
		queryCampo1 = null;
		campo2 = null;
		queryCampo2 = null;
		dataInicio = null;
		dataFim = null;
		titulo = null;
		texto = null;
		dataCriacao = null;
		atualiza = false;			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;
		atualiza = false;
		try{
			conn = Conexao.getConnection();
			RelatorioSalvoKey key = (RelatorioSalvoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_relatorios ?");
		    stmt.setInt(1,key.relatorio);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){

				relatorio = rs.getInt("relatorio");
				tipoAgrupamento = rs.getInt("tipoAgrupamento");
				local = rs.getInt("local");
				queryLocal = rs.getString("queryLocal");
				periodicidade = rs.getInt("periodicidade");
				campo1 = new CampoKey(rs.getInt("campo1"));
				queryCampo1 = rs.getString("queryCampo1");
				
				if(rs.getInt("campo2") > 0)
					campo2 = new CampoKey(rs.getInt("campo2"));

				queryCampo2 = rs.getString("queryCampo2");
				dataInicio = rs.getString("dataInicio");
				dataFim = rs.getString("dataFim");
				titulo = rs.getString("titulo");
				texto = rs.getString("texto");
				dataCriacao = rs.getString("dataCriacao");


		    }
		    else{
			   throw new EJBException("RelatorioBean ejbLoad => Erro ao carregar Relatorio");
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
			RelatorioSalvoKey key = (RelatorioSalvoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_relatorios ?");
		    stmt.setInt(1,key.relatorio);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("RelatorioBean ejbRemove => Erro ao excluir Relatorio");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new EJBException("RelatorioBean ejbRemove => Erro ao excluir Relatorio");

		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{}
		}
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {

		if(atualiza){
			Connection conn = null;
			try{
				
				boolean updateTexto = false;
				PreparedStatement stmtTexto = null;

				conn = Conexao.getConnection();
				RelatorioSalvoKey key = (RelatorioSalvoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_relatorios ?,?,?,?,?,?,?,?,?,?,?,?,?");
					
					
	
				stmt.setInt(1,relatorio);
				stmt.setInt(2,tipoAgrupamento);
				stmt.setInt(3,local);
				stmt.setString(4,queryLocal);
				stmt.setInt(5,periodicidade);
				stmt.setInt(6,campo1.campo);
				stmt.setString(7,queryCampo1);
				
				
				if(campo2 != null)
					stmt.setInt(8,campo2.campo);
				else
					stmt.setNull(8,Types.INTEGER);
					
				stmt.setString(9,queryCampo2);
				stmt.setString(10,dataInicio);
				stmt.setString(11,dataFim);
				stmt.setString(12,titulo);
				
				if(texto != null){
					if(texto.length() <= 4000)
						stmt.setString(13,texto);
					else
						stmt.setString(13,null);
				}
				else
					stmt.setString(13,null);
				
			    int rs = stmt.executeUpdate();

			    if(rs != 1){
			    	throw new EJBException("RelatorioBean ejbStore => Erro ao alterar Relatorio: "+rs);
			    }
			    
			    if(texto != null)
			    	if(texto.length() > 4000){
						stmtTexto = conn.prepareStatement
							("update relatorios set texto = ? where relatorio = ?");
	
						stmtTexto.setString(1,texto);
						stmtTexto.setInt(2,key.relatorio);
						
						System.out.println("entrou no update ");
						
						rs = stmtTexto.executeUpdate();
						
					    if(rs != 1){
					    	throw new EJBException("RelatorioBean ejbStore => Erro ao alterar texto do Relatorio: "+rs);
					    }						
				    }
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("RelatorioBean ejbStore => Erro alterar o relatorio: "+e.getMessage());

			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){}
			}		
		}
		atualiza = false;	
				
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
	public RelatorioSalvoKey ejbCreate(int tipoAgrupamento,
										int local,
										String queryLocal,
										int periodicidade,
										int campo1,
										String queryCampo1,
										int campo2,
										String queryCampo2,
										String dataInicio,
										String dataFim,
										String titulo,
										String texto)
		throws javax.ejb.CreateException {

			Connection 	conn 	= null;			
			RelatorioSalvoKey 	retVal  = null;
			
			try{
				PreparedStatement stmtTexto = null;
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_relatorios null,?,?,?,?,?,?,?,?,?,?,?,?");
				

				stmt.setInt(1,tipoAgrupamento);
				stmt.setInt(2,local);
				stmt.setString(3,queryLocal);
				stmt.setInt(4,periodicidade);
				stmt.setInt(5,campo1);
				stmt.setString(6,queryCampo1);
				
				
				if(campo2 > 0)
					stmt.setInt(7,campo2);
				else
					stmt.setNull(7,Types.INTEGER);
					
				stmt.setString(8,queryCampo2);
				stmt.setString(9,dataInicio);
				stmt.setString(10,dataFim);
				stmt.setString(11,titulo);

				if(texto != null){
					if(texto.length() <= 4000)
						stmt.setString(12,texto);
					else
						stmt.setString(12,null);			    
				}
				else
					stmt.setString(12,null);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					relatorio = rs.getInt("relatorio");
				else
					throw new EJBException("RelatorioBean ejbCreate => Erro ao inserir Relatorio");				

			    if(texto != null)
			    	if(texto.length() > 4000){
						stmtTexto = conn.prepareStatement
							("update relatorios set texto = ? where relatorio = ?");
	
						stmtTexto.setString(1,texto);
						stmtTexto.setInt(2,relatorio);

						int rss = stmtTexto.executeUpdate();
						
					    if(rss != 1){
					    	throw new EJBException("RelatorioBean ejbStore => Erro ao alterar texto do Relatorio: "+rs);
					    }							
				    }
				
				setTipoAgrupamento(tipoAgrupamento);
				setLocal(local);
				setQueryLocal(queryLocal);
				setPeriodicidade(periodicidade);
				setCampo1(new CampoKey(campo1));
				setQueryCampo1(queryCampo1);
				
				
				if(campo2 != 0)
					setCampo2(new CampoKey(campo2));
					
				setQueryCampo2(queryCampo2);
				setDataInicio(dataInicio);
				setDataFim(dataFim);
				setTitulo(titulo);
				setTexto(texto);
				
				atualiza= false;	
			    
				retVal = new RelatorioSalvoKey(relatorio);
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new  CreateException("RelatorioBean ejbCreate Erro ao inserir Relatorio");
			}
			finally{
				try{
					atualiza = false;					
					conn.close();
				}
				catch(SQLException e){
					throw new  CreateException("MedicoBean ejbCreate Erro ao inserir acidente");
				}
			}
			
			return retVal;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(		int tipoAgrupamento,
										int local,
										String queryLocal,
										int periodicidade,
										int campo1,
										String queryCampo1,
										int campo2,
										String queryCampo2,
										String dataInicio,
										String dataFim,
										String titulo,
										String texto) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.relatoriosalvo.RelatorioSalvoKey ejbFindByPrimaryKey(
		br.smat.ejb.relatoriosalvo.RelatorioSalvoKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_medicos ?");
				stmt.setInt(1,key.relatorio);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("RelatorioBean ejbFindByPrimaryKey => Relatorio not found");
			}
			catch(SQLException e){
					throw new FinderException("RelatorioBean ejbFindByPrimaryKey => Relatorio not found SQLException");
			}
			finally{
				atualiza = false;				
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
			
	}

	public Collection ejbFindAllRelatorios() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_relatorios");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new RelatorioSalvoKey(rs.getInt("relatorio")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("RelatorioBean ejbFindAllRelatorios => Relatorios not Found");
		}
		finally{
			atualiza = false;			
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}
}
