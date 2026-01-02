package br.smat.objetosauxiliares.generico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Vector;

import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.objetosauxiliares.auxagentecausador.AuxAgenteCausador;
import br.smat.objetosauxiliares.auxdepoimento.AuxDepoimento;
import br.smat.objetosauxiliares.auxempregador.AuxEmpregador;
import br.smat.objetosauxiliares.auxfiscalizacaoempregador.AuxFiscalizacaoEmpregador;
import br.smat.objetosauxiliares.auxinvestigacao.AuxInvestigacao;
import br.smat.objetosauxiliares.auxitempontofiscalizacao.AuxItemPontoFiscalizacao;
import br.smat.objetosauxiliares.auxlistinvestigacao.AuxListInvestigacao;
import br.smat.objetosauxiliares.auxlocalatendimento.AuxLocalAtendimento;
import br.smat.objetosauxiliares.auxlocallesao.AuxLocalLesao;
import br.smat.objetosauxiliares.auxmedidacorretiva.AuxMedidaCorretiva;
import br.smat.objetosauxiliares.auxmonitor.AuxMonitor;
import br.smat.objetosauxiliares.auxpesquisaacidente.AuxPesquisaAcidente;
import br.smat.objetosauxiliares.auxpessoa.AuxPessoa;
import br.smat.objetosauxiliares.auxpontofiscalizacaoramoatividade.AuxPontoFiscalizacaoRamoAtividade;
import br.smat.objetosauxiliares.auxramoatividade.AuxRamoAtividade;
import br.smat.objetosauxiliares.auxregional.AuxRegional;
import br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha;
import br.smat.objetosauxiliares.auxtramitefiscalizacao.AuxTramiteFiscalizacao;
import br.smat.objetosauxiliares.menu.Menu;

import br.smat.relatorio.Relatorio;

/**
 * Bean implementation class for Enterprise Bean: Generico
 */
public class GenericoBean implements javax.ejb.SessionBean {
	private javax.ejb.SessionContext mySessionCtx;
	/**
	 * getSessionContext
	 */ 
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}
	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}
	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}
	
	public String getHoraAtual() throws FinderException,Exception {
		Connection 	conn 		= null;
		String 		dataAtual 	= null;
			
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select convert(char(5),getDate(),8)");
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next())			
				dataAtual = rs.getString(1);			
		}
		catch(Exception e){
			e.printStackTrace();
			throw new FinderException("Problemas ao pegar a data atual no banco de dados");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("Problemas ao pegar a data atual no banco de dados");
			}
		}
		return dataAtual;		
	}
	
	public String getDataAtual() throws FinderException,Exception {
		Connection 	conn 		= null;
		String 		dataAtual 	= null;
			
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select convert(char(10),getDate(),103)");
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next())			
				dataAtual = rs.getString(1);			
		}
		catch(Exception e){
			e.printStackTrace();
			throw new FinderException("Problemas ao pegar a data atual no banco de dados");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("Problemas ao pegar a data atual no banco de dados");
			}
		}
		return dataAtual;		
	}
	
	public AuxEmpregador[] listEmpregadores() throws FinderException,Exception
	{
		Connection conn = null;
		Vector retVal = new Vector();
			
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_empregadores null,1");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				retVal.addElement(new AuxEmpregador(rs.getInt("empregador"),
													 rs.getInt("ramoAtividade"),
													 rs.getInt("municipio"),
													 rs.getInt("tipoEmpregador"),
													 rs.getString("razaoSocial"),
													 rs.getString("documento"),													 
													 rs.getInt("numero"),	
													 rs.getString("rua"),
													 rs.getString("bairro"),
													 rs.getString("cep"),
													 rs.getString("complemento"),													 													 												 
													 rs.getString("nomeRamoAtividade"),													 
													 rs.getInt("ramoSuperior"),														 
													 rs.getString("nomeRamoSuperior"),													 
													 rs.getInt("estado")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EmpregadorBean ejbFindAllEmpregadores => Empregador not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("EmpregadorBean ejbFindAllEmpregadores Exception ");
			}
		}
		return (AuxEmpregador[])retVal.toArray(new AuxEmpregador[0]);
	}	
	
	public AuxEmpregador[] listEmpregadores(String razaoSocial) throws FinderException,Exception
	{
		Connection conn = null;
		Vector retVal = new Vector();
			
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_empregadores null,1,?");
			stmt.setString(1,razaoSocial);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				retVal.addElement(new AuxEmpregador(rs.getInt("empregador"),
													 rs.getInt("ramoAtividade"),
													 rs.getInt("municipio"),
													 rs.getInt("tipoEmpregador"),
													 rs.getString("razaoSocial"),
													 rs.getString("documento"),													 
													 rs.getInt("numero"),	
													 rs.getString("rua"),
													 rs.getString("bairro"),
													 rs.getString("cep"),
													 rs.getString("complemento"),													 													 												 
													 rs.getString("nomeRamoAtividade"),													 
													 rs.getInt("ramoSuperior"),														 
													 rs.getString("nomeRamoSuperior"),													 
													 rs.getInt("estado")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EmpregadorBean ejbFindAllEmpregadores => Empregador not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("EmpregadorBean ejbFindAllEmpregadores Exception ");
			}
		}
		return (AuxEmpregador[])retVal.toArray(new AuxEmpregador[0]);
	}
	
	public Relatorio geraRelatorio(int periodicidade,
							String dataInicial,
							String dataFinal,
							String agrupamento,
							int local,
							String queryLocal,
							int campo1,
							String queryCampo1,
							int campo2,
							String queryCampo2,
							String titulo,
							String texto )
		throws FinderException,Exception {

		Connection conn = null;

		int count = 0;
		String auxMesAno = "";
		
	
		//dados de saída da procedure
		String	 nomePeriodicidade = null;
		String	 labelLocal = null;
		String	 nomeCampo1 = null;
		String	 nomeCampo2 = null;
		Vector   nomeLocal = new Vector();
		Vector   nomeRegistrosCampo1 = new Vector();
		Vector   nomeRegistrosCampo2 = new Vector();
		Vector   mesAno = new Vector();
		Vector   vQuantidade = new Vector();
		int[]  quantidade = null;
  
		


		try
		{
			conn = Conexao.getConnection();

			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_gerar_relatorio ?,?,?,?,?,?,?,?,?");

			System.out.println("****** Generico ********");
			System.out.println("local => " + local);
			System.out.println("dadosLocal => " + queryLocal);
			System.out.println("campo1 => " + campo1);
			System.out.println("dadosCampo1 => " + queryCampo1);
			System.out.println("campo2 => " + campo2);
			System.out.println("dadosCampo2 => " + queryCampo2);
			System.out.println("dataInicial => " + dataInicial);
			System.out.println("dataFinal => " + dataFinal);
			System.out.println("periodicidade => " + periodicidade + '\n');
			System.out.println("************************");
			System.out.println();
			System.out.println();
			System.out.println();
						
			stmt.setInt(1,local);
			stmt.setString(2,queryLocal);
			stmt.setInt(3,campo1);
			stmt.setString(4,queryCampo1);
			
			if(campo2 > 0)
				stmt.setInt(5,campo2);
			else
				stmt.setNull(5,Types.INTEGER);
				
			stmt.setString(6,queryCampo2);
			stmt.setString(7,dataInicial);
			stmt.setString(8,dataFinal);
			stmt.setInt(9,periodicidade);	

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){

				if(nomeCampo1 == null){
					nomeCampo1 = rs.getString("nomecampo1");
				}
				
				if(nomeCampo2 == null){
					nomeCampo2 = rs.getString("nomecampo2");
				}

				if(labelLocal == null){
					labelLocal = rs.getString("labelLocal");
				}

				if(nomePeriodicidade == null){
					nomePeriodicidade = rs.getString("nomePeriodicidade");
				}				
				
				vQuantidade.add(new Integer(rs.getInt("quantidade")));

				auxMesAno = "";				
				if(periodicidade == 1)
				{
					if(rs.getInt("mes") < 10)
						auxMesAno = "0";
						
					auxMesAno += String.valueOf(rs.getInt("mes")) + "/" + String.valueOf(rs.getInt("ano"));
				}
				else
					auxMesAno = String.valueOf(rs.getInt("ano"));

				if(!mesAno.contains(auxMesAno))
					mesAno.add(auxMesAno);
				
				
				
				if(!nomeLocal.contains(rs.getString("nomelocal")))
					nomeLocal.add(rs.getString("nomelocal"));

				if(!nomeRegistrosCampo1.contains(rs.getString("nomeinf1")))
					nomeRegistrosCampo1.add(rs.getString("nomeinf1"));				

				if(!nomeRegistrosCampo2.contains(rs.getString("nomeinf2")))
					nomeRegistrosCampo2.add(rs.getString("nomeinf2"));

				/*System.out.print(rs.getInt("quantidade") 	 + "    ");
				System.out.print(rs.getInt("local") 		 + "    ");
				System.out.print(rs.getString("nomelocal") 	 + "    ");
				System.out.print(rs.getInt("inf1") 			 + "    ");
				System.out.print(rs.getString("nomeinf1") 	 + "    ");
				System.out.print(rs.getInt("inf2") 			 + "    ");
				System.out.println(rs.getString("nomeinf2"));*/

				
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EmpregadorBean ejbFindAllEmpregadores => Empregador not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("EmpregadorBean ejbFindAllEmpregadores Exception ");
			}
		}
		
		quantidade = new int[vQuantidade.size()];
		
		for(int i = 0; i < quantidade.length; i++)
		{
			quantidade[i] = ((Integer)vQuantidade.elementAt(i)).intValue();
		}
						  
		return new Relatorio(nomePeriodicidade,
							  labelLocal,		
							  nomeCampo1,
							  nomeCampo2,
							  ((String[])nomeLocal.toArray(new String[0])),
							  ((String[])nomeRegistrosCampo1.toArray(new String[0])),
							  ((String[])nomeRegistrosCampo2.toArray(new String[0])),
							  ((String[])mesAno.toArray(new String[0])),
							  quantidade,
							  titulo,
							  texto,
							  dataInicial,
							  dataFinal);
	}

	public Menu[] montaMenu(int usuario)
		throws FinderException,Exception
	{
		
		Connection conn = null;
		Menu menu = null;
		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_menu ?");
			stmt.setInt(1,usuario);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				menu = new Menu( rs.getInt("modulo"),
								 rs.getString("nome"),
								 rs.getString("estrutura"),
								 rs.getInt("moduloPai"),
								 rs.getInt("nivel"),
								 rs.getInt("paginaDefault"),
								 rs.getString("nomePaginaDefault"),
								 rs.getInt("filhos"));
										
				retVal.addElement(menu);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EmpregadorBean montaMenu => Menu not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("EmpregadorBean montaMenu Exception ");
			}
		}
		
		return (Menu[])retVal.toArray(new Menu[0]);
	}
	
	public AuxPesquisaAcidente[] pesquisaAcidente(int estado,
								  int regional,
								  int municipio,
								  String amputacao,
								  String obito,
								  String registroPolicial,
								  String internacao,
								  int tipoAcidente,
								  int diagnostico,
								  int fonte,
								  int area,
								  String dataInicial,
								  String dataFinal)
		throws FinderException,Exception
	{
		
		Connection conn = null;
		AuxPesquisaAcidente auxAcidente = null;
		Vector retVal= new Vector();
		


		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_pesquisaracidente ?,?,?,?,?,?,?,?,?,?,?,?,?");
			
			if(estado == 0)
				stmt.setNull(1,Types.INTEGER);
			else
				stmt.setInt(1,estado);

			if(regional == 0)
				stmt.setNull(2,Types.INTEGER);
			else
				stmt.setInt(2,regional);
				
			if(municipio == 0)
				stmt.setNull(3,Types.INTEGER);
			else
				stmt.setInt(3,municipio);

			stmt.setString(4,amputacao);
			stmt.setString(5,obito);
			stmt.setString(6,registroPolicial);
			stmt.setString(7,internacao);
			
			if(tipoAcidente == 0)
				stmt.setNull(8,Types.INTEGER);
			else
				stmt.setInt(8,tipoAcidente);
				
			if(diagnostico == 0)
				stmt.setNull(9,Types.INTEGER);
			else
				stmt.setInt(9,diagnostico);

			if(fonte == 0)
				stmt.setNull(10,Types.INTEGER);
			else
				stmt.setInt(10,fonte);				
			
			if(area == 0)
				stmt.setNull(11,Types.INTEGER);
			else
				stmt.setInt(11,area);
			
			stmt.setString(12,dataInicial);
			stmt.setString(13,dataFinal);
				
			
			ResultSet rs = stmt.executeQuery();

			
						
			while(rs.next()){

				auxAcidente = new AuxPesquisaAcidente(rs.getInt("estado"),
													rs.getString("nomeEstado"),
													rs.getInt("regional"),
													rs.getString("nomeRegional"),
													rs.getInt("municipio"),
													rs.getString("nomeMunicipio"),
													rs.getInt("area"),
													rs.getString("nomeArea"),
													rs.getInt("tipoAcidente"),
													rs.getString("nomeTipoAcidente"),
													rs.getInt("diagnostico"),
													rs.getString("nomeDiagnostico"),
													rs.getString("dataAcidente"),
													rs.getInt("acidente"),
													rs.getInt("trabalhador"),
													rs.getString("nomeTrabalhador"),
													rs.getString("obito"),
													rs.getString("amputacao"),
													rs.getString("registroPolicial"),
													rs.getString("internacao"),
													rs.getInt("fonte"),
													rs.getString("nomeFonte"));
				retVal.add(auxAcidente);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean pesquisaAcidente => PesquisaAcidente not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean pesquisaAcidente Exception ");
			}
		}
		
		if(retVal.isEmpty())
			return null;
		else
			return (AuxPesquisaAcidente[])retVal.toArray(new AuxPesquisaAcidente[0]);
	}

	public AuxPontoFiscalizacaoRamoAtividade[] listPontoFiscalizacaoRamoAtividade(int ramoAtividade)
	throws FinderException,Exception{

		Connection conn = null;
		AuxPontoFiscalizacaoRamoAtividade auxPontoFiscalizacaoRamoAtividade = null;
		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_pontosfiscalizaramoatividade null,?");
			if(ramoAtividade > 0)
				stmt.setInt(1,ramoAtividade);
			else
				stmt.setNull(1,Types.INTEGER);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxPontoFiscalizacaoRamoAtividade = new AuxPontoFiscalizacaoRamoAtividade(	rs.getInt("pontoFiscalizacao"),
															 							    rs.getInt("ramoAtividade"),
																							rs.getString("nomeRamoAtividade"),
																							rs.getString("nomePontoFiscalizacao"),
																							rs.getString("descricao"));
										
				retVal.addElement(auxPontoFiscalizacaoRamoAtividade);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listPontoFiscalizacaoRamoAtividade => Menu not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listPontoFiscalizacaoRamoAtividade Exception ");
			}
		}
		
		return (AuxPontoFiscalizacaoRamoAtividade[])retVal.toArray(new AuxPontoFiscalizacaoRamoAtividade[0]);
	}
	
	
	public AuxItemPontoFiscalizacao[] listItemPontoFiscalizacao(int pontoFiscalizacao)	
	throws FinderException,Exception{
		Connection conn = null;
		AuxItemPontoFiscalizacao auxItemPontoFiscalizacao = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_itensfiscalizacao null,?");
			stmt.setInt(1,pontoFiscalizacao);

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxItemPontoFiscalizacao = new AuxItemPontoFiscalizacao(	rs.getInt("itemFiscalizacao"),
																		    rs.getString("nome"),
																			rs.getString("checked"));
										
				retVal.addElement(auxItemPontoFiscalizacao);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listItemPontoFiscalizacao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listItemPontoFiscalizacao Exception ");
			}
		}
		
		return (AuxItemPontoFiscalizacao[])retVal.toArray(new AuxItemPontoFiscalizacao[0]);		
	}
	
	public void gravaItemPontoFiscalizacao(int pontoFiscalizacao,String itensFiscalizacao)
	throws Exception{
		Connection conn = null;

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_gravaexclui_itempontofiscaliza ?,?");
			stmt.setInt(1,pontoFiscalizacao);
			stmt.setString(2,itensFiscalizacao);

			int rs = stmt.executeUpdate();
			
			//if(rs == 0){
			//	throw new  RemoteException("GenericoBean gravaItemPontoFiscalizacao");					
			//}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new Exception("GenericoBean gravaItemPontoFiscalizacao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean gravaItemPontoFiscalizacao Exception ");
			}
		}		
	}
	
	public AuxFiscalizacaoEmpregador[] listAuxFiscalizacaoEmpregadorAgente()	
	throws FinderException,Exception{
		Connection conn = null;
		AuxFiscalizacaoEmpregador auxFiscalizacaoEmpregador = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_fiscalizacoes null,?");
			stmt.setInt(1,1);


			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxFiscalizacaoEmpregador = new AuxFiscalizacaoEmpregador(	rs.getInt("fiscalizacao"),
																		    rs.getInt("agenteSaude"),
																			rs.getString("nomeAgente"),
																			rs.getInt("empregador"),
																		    rs.getString("dataAbertura"),
																		    rs.getString("dataFinalizacao"),
																		    rs.getString("titulo"),
																		    rs.getString("obsGerais"),
																		    rs.getString("docEmpregador"),
																		    rs.getString("razaoSocial"));																			
										
				retVal.addElement(auxFiscalizacaoEmpregador);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean sp_smat_listar_fiscalizacoes => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean sp_smat_listar_fiscalizacoes Exception ");
			}
		}
		
		return (AuxFiscalizacaoEmpregador[])retVal.toArray(new AuxFiscalizacaoEmpregador[0]);		
	}	
	
	public AuxFiscalizacaoEmpregador listAuxFiscalizacaoEmpregadorAgente(int fiscalizacao)	
	throws FinderException,Exception{
		Connection conn = null;
		AuxFiscalizacaoEmpregador auxFiscalizacaoEmpregador = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_fiscalizacoes ?,?");
			stmt.setInt(1,fiscalizacao);
			stmt.setInt(2,1);

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxFiscalizacaoEmpregador = new AuxFiscalizacaoEmpregador(	rs.getInt("fiscalizacao"),
																		    rs.getInt("agenteSaude"),
																			rs.getString("nomeAgente"),
																			rs.getInt("empregador"),
																		    rs.getString("dataAbertura"),
																		    rs.getString("dataFinalizacao"),
																		    rs.getString("titulo"),
																		    rs.getString("obsGerais"),
																		    rs.getString("docEmpregador"),
																		    rs.getString("razaoSocial"));																			
										
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean sp_smat_listar_fiscalizacoes => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean sp_smat_listar_fiscalizacoes Exception ");
			}
		}
		
		return auxFiscalizacaoEmpregador;		
	}


	public AuxInvestigacao getTramiteInvestigacao(int investigacao)	
	throws FinderException,Exception{
		Connection conn = null;
		AuxInvestigacao auxInvestigacao = null;
		AuxDepoimento[] auxDepoimento = null;
		AuxMedidaCorretiva[] auxMedidaCorretivaInvestigacao = null;

		Vector retVal = new Vector();
		Vector depoimentos = null;
		Vector medidas = null;

		int agenteSaude = 0;
		int acidente = 0;
		String dataAbertura = null;
		String dataFinalizacao = null;
		String motivo = null;
		String obsGerais = null;

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_detalhesinvestigacao ?");
			stmt.setInt(1,investigacao);

			ResultSet rs = stmt.executeQuery();

			while(rs.next()){

				agenteSaude = rs.getInt("agenteSaude");
				acidente = rs.getInt("acidente");
				dataAbertura = rs.getString("dataAbertura");
				dataFinalizacao = rs.getString("dataFinalizacao");
				motivo = rs.getString("motivo");
				obsGerais = rs.getString("obsGerais");

				if(rs.getInt("dadoInvestigacao") != 0){
					
					if(depoimentos == null)
						depoimentos = new Vector();
					
					depoimentos.addElement(new AuxDepoimento(rs.getInt("dadoInvestigacao"),
															 rs.getInt("tipoDepoimento"),
															 rs.getString("nomeTipoDepoimento"),
															 rs.getInt("pessoa"),
															 rs.getString("nomePessoa"),
															 rs.getString("dataHora"),
															 rs.getInt("agenteCausador"),
															 rs.getString("nomeAgenteCausador"),
															 rs.getString("descricao")));		
				}
				
				if(rs.getInt("tipoMedidaCorretiva") != 0){
					
					if(medidas == null)
						medidas = new Vector();
					
					medidas.addElement(new AuxMedidaCorretiva(rs.getInt("tipoMedidaCorretiva"),
									   rs.getString("nomeTipoMedidaCorretiva"),
									   rs.getInt("prazoDias"),
									   rs.getString("observacao")));

				}
										
			}
			
			if(depoimentos != null)
				auxDepoimento = (AuxDepoimento[])depoimentos.toArray(new AuxDepoimento[0]);

			if(medidas != null)
				auxMedidaCorretivaInvestigacao = (AuxMedidaCorretiva[])medidas.toArray(new AuxMedidaCorretiva[0]);
							
			auxInvestigacao = new AuxInvestigacao(investigacao,agenteSaude,acidente,dataAbertura,dataFinalizacao,motivo,obsGerais,auxDepoimento,auxMedidaCorretivaInvestigacao);
			
			
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean getTramiteInvestigacao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean getTramiteInvestigacao Exception ");
			}
		}
		
		return auxInvestigacao;		
	}
	

	public AuxListInvestigacao[] getAllInvestigacoes()	
	throws FinderException,Exception{
		
		Connection conn = null;

		Vector retVal = null;

		AuxListInvestigacao auxListInvestigacao = null;
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_detalhesinvestigacao");

			ResultSet rs = stmt.executeQuery();

			while(rs.next()){

				auxListInvestigacao = new AuxListInvestigacao(rs.getInt("investigacao"),
																rs.getInt("agenteSaude"),
																rs.getString("nomeAgenteSaude"),
																rs.getString("motivo"),
																rs.getInt("trabalhador"),
																rs.getString("nomeTrabalhador"),
																rs.getString("dataAcidente"),
																rs.getString("dataAbertura"),
																rs.getString("dataFinalizacao"));

				if(retVal == null)
					retVal = new Vector();
				
				retVal.addElement(auxListInvestigacao);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean getTramiteInvestigacao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean getTramiteInvestigacao Exception ");
			}
		}
		
		if(retVal == null)
			return null;
		else
			return (AuxListInvestigacao[]) retVal.toArray(new AuxListInvestigacao[0]);
	}


	public AuxDepoimento[] getAllDepoimentosInvestigacao(int investigacao)	
	throws FinderException,Exception{
		
		Connection conn = null;

		Vector retVal = null;

		AuxDepoimento auxDepoimento = null;
				
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_dadosinvestigacao ?,null,'T'");

			stmt.setInt(1,investigacao);

			ResultSet rs = stmt.executeQuery();

			while(rs.next()){
				System.out.println("NO GENERICO");
				System.out.println("pessoa      => " + rs.getInt("pessoa"));
				System.out.println(" nomePessoa => " + rs.getString("nomePessoa"));
					
				auxDepoimento = new AuxDepoimento(rs.getInt("dadoInvestigacao"),
												  rs.getInt("tipoDepoimento"),
												  rs.getString("nomeTipoDepoimento"),
												  rs.getInt("pessoa"),
												  rs.getString("nomePessoa"),
												  rs.getString("dataHora"),
												  rs.getInt("agenteCausadorVo"),
												  rs.getInt("agenteCausadorPai"),
												  rs.getInt("agenteCausador"),
												  rs.getString("nomeAgenteCausador"),
												  rs.getString("descricao"));
				if(retVal == null)
					retVal = new Vector();
			
				retVal.addElement(auxDepoimento);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean getAllDepoimentosInvestigacao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean getAllDepoimentosInvestigacao Exception ");
			}
		}
		
		if(retVal == null)
			return null;
		else
			return (AuxDepoimento[]) retVal.toArray(new AuxDepoimento[0]);
	}

	public AuxPessoa[] pesquisarPessoa(int tipoDepoimento,String nomePessoa, int acidente)
	throws FinderException,Exception{
		
		Connection conn = null;

		Vector retVal = null;

		AuxPessoa auxPessoa = null;
				
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_pesquisarpessoa ?,?,?");

			stmt.setInt(1,tipoDepoimento);
			stmt.setString(2,nomePessoa);
			stmt.setInt(3,acidente);
			
			ResultSet rs = stmt.executeQuery();

			while(rs.next()){

				auxPessoa = new AuxPessoa(rs.getInt("pessoa"), rs.getString("nome"));
				
				if(retVal == null)
					retVal = new Vector();
			
				retVal.addElement(auxPessoa);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean pesquisarPessoa => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean pesquisarPessoa Exception ");
			}
		}
		
		if(retVal == null)
			return null;
		else
			return (AuxPessoa[]) retVal.toArray(new AuxPessoa[0]);
	}

	public AuxTestemunha[] getAllTestemunhasAcidente(int acidente)	
	throws FinderException,Exception{
		
		Connection conn = null;

		Vector retVal = null;

		AuxTestemunha auxTestemunha = null;
				
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_testemunhas null,?");

			stmt.setInt(1,acidente);

			ResultSet rs = stmt.executeQuery();

			while(rs.next()){

				auxTestemunha = new AuxTestemunha(rs.getInt("testemunha"),
												  rs.getString("nome"),
												  rs.getInt("municipio"),
												  rs.getInt("estado"),
												  rs.getString("rua"),
												  rs.getString("bairro"),
												  rs.getInt("numero"),
												  rs.getString("complemento"),
												  rs.getString("cep"),
												  rs.getString("telefone"),
												  rs.getString("ddd"));

				if(retVal == null)
					retVal = new Vector();
			
				retVal.addElement(auxTestemunha);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean getConnection => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean getAllDepoimentosInvestigacao Exception ");
			}
		}
		
		if(retVal == null)
			return null;
		else
			return (AuxTestemunha[]) retVal.toArray(new AuxTestemunha[0]);
	}

	public AuxItemPontoFiscalizacao[] listItemRoteiroPontoFiscal(	int 	tramiteFiscalizacao,
														int	fiscalizacao,
														int	pontoFiscalizacao)	
	throws FinderException,Exception{
		Connection conn = null;
		AuxItemPontoFiscalizacao auxItemPontoFiscalizacao = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_list_itemRoteiro ?,?,?");
			
			if(tramiteFiscalizacao > 0)
				stmt.setInt(1,tramiteFiscalizacao);
			else
				stmt.setNull(1,Types.INTEGER);
				
			if(fiscalizacao > 0)	
				stmt.setInt(2,fiscalizacao);
			else
				stmt.setNull(2,Types.INTEGER);
				
			stmt.setInt(3,pontoFiscalizacao);						

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxItemPontoFiscalizacao = new AuxItemPontoFiscalizacao(	rs.getInt("itemFiscalizacao"),
																		    rs.getString("nome"),
																			rs.getString("checked"));
										
				retVal.addElement(auxItemPontoFiscalizacao);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listItemRoteiro => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listItemRoteiro Exception ");
			}
		}
		
		return (AuxItemPontoFiscalizacao[])retVal.toArray(new AuxItemPontoFiscalizacao[0]);		
	}


	public AuxItemPontoFiscalizacao[] listItensRoteiro(int fiscalizacao)	
	throws FinderException,Exception{
		Connection conn = null;
		AuxItemPontoFiscalizacao auxItemPontoFiscalizacao = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_list_itemRoteiro null,?,null,?");

			System.out.print("fiscalizacao = " + fiscalizacao);
				
			if(fiscalizacao > 0)	
				stmt.setInt(1,fiscalizacao);
			else
				stmt.setNull(1,Types.INTEGER);
				
			stmt.setInt(2,1);						

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxItemPontoFiscalizacao = new AuxItemPontoFiscalizacao(	rs.getInt("itemFiscalizacao"),
																		    rs.getString("nome"),
																			rs.getString("checked"),
																			rs.getInt("tramiteFiscalizacao"));
										
				retVal.addElement(auxItemPontoFiscalizacao);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listItemRoteiro => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listItemRoteiro Exception ");
			}
		}
		
		return (AuxItemPontoFiscalizacao[])retVal.toArray(new AuxItemPontoFiscalizacao[0]);		
	}

	public AuxItemPontoFiscalizacao[] listItensRoteiro(int fiscalizacao,int tramiteFiscalizacao)	
	throws FinderException,Exception{
		Connection conn = null;
		AuxItemPontoFiscalizacao auxItemPontoFiscalizacao = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_list_itemRoteiro ?,?,null,?");

			stmt.setInt(1,tramiteFiscalizacao);
				
			if(fiscalizacao > 0)	
				stmt.setInt(2,fiscalizacao);
			else
				stmt.setNull(2,Types.INTEGER);
				
			stmt.setInt(3,2);						

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxItemPontoFiscalizacao = new AuxItemPontoFiscalizacao(	rs.getInt("itemFiscalizacao"),
																		    rs.getString("nome"),
																			rs.getString("checked"),
																			rs.getInt("tramiteFiscalizacao"));
										
				retVal.addElement(auxItemPontoFiscalizacao);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listItemRoteiro => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listItemRoteiro Exception ");
			}
		}
		
		return (AuxItemPontoFiscalizacao[])retVal.toArray(new AuxItemPontoFiscalizacao[0]);		
	}

	public AuxItemPontoFiscalizacao[] listDetalhesItensRoteiro(int fiscalizacao,int tramiteFiscalizacao)	
	throws FinderException,Exception{
		Connection conn = null;
		AuxItemPontoFiscalizacao auxItemPontoFiscalizacao = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_list_itemRoteiro ?,?,null,?");

			stmt.setInt(1,tramiteFiscalizacao);
				
			if(fiscalizacao > 0)	
				stmt.setInt(2,fiscalizacao);
			else
				stmt.setNull(2,Types.INTEGER);
				
			stmt.setInt(3,3);						

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxItemPontoFiscalizacao = new AuxItemPontoFiscalizacao(	rs.getInt("itemFiscalizacao"),
																		    rs.getString("nome"),
																			rs.getString("checked"),
																			rs.getInt("tramiteFiscalizacao"),
																			rs.getInt("grauConformidade"),
																			rs.getString("nomeGrauConformidadde"));
										
				retVal.addElement(auxItemPontoFiscalizacao);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listItemRoteiro => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listItemRoteiro Exception ");
			}
		}
		
		return (AuxItemPontoFiscalizacao[])retVal.toArray(new AuxItemPontoFiscalizacao[0]);		
	}


	public AuxTramiteFiscalizacao[] listTramitesFiscalizacao(int fiscalizacao)	
	throws FinderException,Exception{
		Connection conn = null;
		AuxTramiteFiscalizacao auxTramiteFiscalizacao = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tramitefiscalizacao ?,null,?");

			System.out.print("fiscalizacao = " + fiscalizacao);
				
			if(fiscalizacao > 0)	
				stmt.setInt(1,fiscalizacao);
			else
				stmt.setNull(1,Types.INTEGER);
				
			stmt.setInt(2,1);						

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxTramiteFiscalizacao = new AuxTramiteFiscalizacao(	rs.getInt("tramiteFiscalizacao"),
																		rs.getInt("fiscalizacao"),
																		rs.getInt("status"),
																		rs.getString("nomeStatus"),
																		rs.getString("data"));
										
				retVal.addElement(auxTramiteFiscalizacao);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listTramitesFiscalizacao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listTramitesFiscalizacao Exception ");
			}
		}
		
		return (AuxTramiteFiscalizacao[])retVal.toArray(new AuxTramiteFiscalizacao[0]);		
	}
	
	public AuxMedidaCorretiva[] listAllMedidaCorretivaFiscalizacao(int fiscalizacao,int tramite)	
	throws FinderException,Exception{
		Connection conn = null;
		AuxMedidaCorretiva auxMedidaCorretiva = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_medidascorretivasfiscalizacao ?,?,null,?");

			if(tramite > 0)	
				stmt.setInt(1,tramite);
			else
				stmt.setNull(1,Types.INTEGER);

			if(fiscalizacao > 0)	
				stmt.setInt(2,fiscalizacao);
			else
				stmt.setNull(2,Types.INTEGER);
				
			stmt.setString(3,"A");						

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxMedidaCorretiva = new AuxMedidaCorretiva(	rs.getInt("tipoMedidaCorretiva"),
																rs.getString("nome"),
																rs.getInt("prazoDias"),
																rs.getString("observacao"));
										
				retVal.addElement(auxMedidaCorretiva);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listAllMedidaCorretivaFiscalizacao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listAllMedidaCorretivaFiscalizacao Exception ");
			}
		}
		
		return (AuxMedidaCorretiva[])retVal.toArray(new AuxMedidaCorretiva[0]);		
	}		
	
	
	public AuxMonitor[] listAllMonitor()	
	throws FinderException,Exception{
		Connection conn = null;
		AuxMonitor auxMonitor = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_monitor null,?");
			stmt.setString(1,"B");						

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxMonitor = new AuxMonitor(	rs.getInt("monitor"),
												rs.getInt("periodicidade"),
												rs.getInt("campo"),
												rs.getInt("queryCampo"),
												rs.getInt("maxAcidente"),
												rs.getString("ultimaDataExecucao"),
												rs.getString("nomeRegistro"),
												rs.getString("labelCampo")); 
										
				retVal.addElement(auxMonitor);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listAllMedidaCorretivaFiscalizacao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listAllMedidaCorretivaFiscalizacao Exception ");
			}
		}
		
		return (AuxMonitor[])retVal.toArray(new AuxMonitor[0]);		
	}	


	public AuxMedidaCorretiva[] getAllMedidasCorretivasInvestigacao(int investigacao)
	throws FinderException,Exception{
		Connection conn = null;
		AuxMedidaCorretiva auxMedidaCorretiva = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_medidascorretivasinvestigacao ?,null,'T'");

			if(investigacao != 0)	
				stmt.setInt(1,investigacao);

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxMedidaCorretiva = new AuxMedidaCorretiva(	rs.getInt("tipoMedidaCorretiva"),
																rs.getString("nome"),
																rs.getInt("prazoDias"),
																rs.getString("observacao"));
										
				retVal.addElement(auxMedidaCorretiva);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean getAllMedidasCorretivasInvestigacao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean getAllMedidasCorretivasInvestigacao Exception ");
			}
		}
		
		return (AuxMedidaCorretiva[])retVal.toArray(new AuxMedidaCorretiva[0]);		
	}

	public AuxAgenteCausador[] getAllAgentesCausadores()
	throws FinderException,Exception{
		Connection conn = null;
		AuxAgenteCausador auxAgenteCausador = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_agentescausadores null,null,'T'");

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxAgenteCausador = new AuxAgenteCausador(rs.getInt("agenteCausador"),
										   				  rs.getInt("agenteCausadorPai"),
										   				  rs.getInt("agenteCausadorVo"),
										   				  rs.getString("nomeAgenteCausador"),
										   				  rs.getString("nomeAgenteCausadorPai"),
										   				  rs.getString("nomeAgenteCausadorVo"),
										   				  rs.getString("descricao"));
										
				retVal.addElement(auxAgenteCausador);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean getAllAgentesCausadores => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean getAllAgentesCausadores Exception ");
			}
		}
		
		return (AuxAgenteCausador[])retVal.toArray(new AuxAgenteCausador[0]);		
	}

	public AuxLocalAtendimento[] getAllLocaisAtendimento()
	throws FinderException,Exception{
		Connection conn = null;
		AuxLocalAtendimento auxLocalAtendimento = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_locaisatendimento null,'T'");

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxLocalAtendimento = new AuxLocalAtendimento(rs.getInt("localAtendimento"),
										   				  rs.getString("nome"),
										   				  rs.getInt("estado"),
										   				  rs.getInt("municipio"),
										   				  rs.getString("nomeMunicipio"));
										
				retVal.addElement(auxLocalAtendimento);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean getAllLocaisAtendimento => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean getAllLocaisAtendimento Exception");
			}
		}
		
		return (AuxLocalAtendimento[])retVal.toArray(new AuxLocalAtendimento[0]);		
	}

	public AuxRegional[] getAllRegionais()
	throws FinderException,Exception{
		Connection conn = null;
		AuxRegional auxRegional = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_regionais null,null,'T'");

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxRegional = new AuxRegional(rs.getInt("regional"),
										   	  rs.getString("nome"),
										   	  rs.getInt("estado"),
										   	  rs.getString("nomeEstado"),
										   	  rs.getString("rua"),
										   	  rs.getInt("numero"),
										   	  rs.getString("complemento"),
										   	  rs.getString("bairro"),
										   	  rs.getString("cep"),
										   	  rs.getInt("municipio"));
				retVal.addElement(auxRegional);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean getAllRegionais => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean getAllRegionais Exception");
			}
		}
		
		return (AuxRegional[])retVal.toArray(new AuxRegional[0]);		
	}

	public AuxLocalLesao[] listAlllocaisLesao()	
	throws FinderException,Exception{
		Connection conn = null;
		AuxLocalLesao auxLocalLesao = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_locaislesao null,null,?");
			stmt.setString(1,"A");						

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxLocalLesao = new AuxLocalLesao(	rs.getInt("localLesao"),
													rs.getString("nome"),
													rs.getInt("Pai"),																										
							 						rs.getString("nomePai")); 
										
				retVal.addElement(auxLocalLesao);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listAlllocaisLesao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listAlllocaisLesao Exception ");
			}
		}
		
		return (AuxLocalLesao[])retVal.toArray(new AuxLocalLesao[0]);		
	}	


	public AuxRamoAtividade[] listAllRamoAtividade()	
	throws FinderException,Exception{
		Connection conn = null;
		AuxRamoAtividade auxRamoAtividade = null;

		Vector retVal = new Vector();

		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_ramosatividade null,?,?");
			stmt.setInt(1,-1);
			stmt.setString(2,"A");						

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				auxRamoAtividade = new AuxRamoAtividade(	rs.getInt("ramoAtividade"),
															rs.getString("nome"),
															rs.getInt("cnae"),																
															rs.getInt("ramoSuperior"),																										
															rs.getString("nomeRamoSuperior")); 
										
				retVal.addElement(auxRamoAtividade);
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GenericoBean listAlllocaisLesao => not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("GenericoBean listAlllocaisLesao Exception ");
			}
		}
		
		return (AuxRamoAtividade[])retVal.toArray(new AuxRamoAtividade[0]);		
	}	
}