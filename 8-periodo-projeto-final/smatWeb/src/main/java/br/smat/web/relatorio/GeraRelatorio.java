package br.smat.web.relatorio;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.campo.Campo;
import br.smat.ejb.campo.CampoKey;
import br.smat.ejb.relatoriosalvo.RelatorioSalvo;
import br.smat.ejb.relatoriosalvo.RelatorioSalvoHome;
import br.smat.ejb.relatoriosalvo.RelatorioSalvoKey;
import br.smat.objetosauxiliares.generico.Generico;
import br.smat.objetosauxiliares.generico.GenericoHome;
import br.smat.relatorio.Relatorio;
import br.smat.util.FuncoesComuns;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class GeraRelatorio {
	
	private int relatorio;
	private int periodicidade;
	private String dataInicial = null;
	private String dataFinal = null;
	private String agrupamento = null;
	private int estado;
	private int[] regional;
	private int[] municipio;
	private int campo1;
	private int[] dadosCampo1 = null;
	private int campo2;
	private int[] dadosCampo2 = null;
	private String titulo = null;
	private String texto = null;
		
	public GeraRelatorio(int periodicidade,
							String dataInicial,
							String dataFinal,
							String agrupamento,
							int estado,
							int[] regional,
							int[] municipio,
							int campo1,
							int[] dadosCampo1,
							int campo2,
							int[] dadosCampo2,
							String titulo,
							String texto){
		
		this.periodicidade = periodicidade;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.agrupamento = agrupamento;
		this.estado = estado;
		this.regional  =regional;
		this.municipio = municipio;
		this.campo1 = campo1;
		this.dadosCampo1 = dadosCampo1;
		this.campo2 = campo2;
		this.dadosCampo2 = dadosCampo2;
		this.titulo = titulo;
		this.texto = texto;
	}

	public static Relatorio geraRelatorio(RelatorioSalvo rel){

		Relatorio relatGerado = null;
		

		try{
		CampoKey campo2Key = rel.getCampo2();

		int c2 = 0;

		if(campo2Key != null)
			c2 = campo2Key.campo;

			
		
		
		

			relatGerado = gera( rel.getPeriodicidade(),
			      rel.getDataInicio(),
				  rel.getDataFim(),
				  String.valueOf(rel.getTipoAgrupamento()),
				  rel.getLocal(),
				  rel.getQueryLocal(),
				  rel.getCampo1().campo,
				  rel.getQueryCampo1(),
				  c2,
				  rel.getQueryCampo2(),
				  rel.getTitulo(),
				  rel.getTexto());
		} catch (RemoteException e){}
		
		return relatGerado;
	}

	public Relatorio geraRelatorio(){


		Relatorio rel = null;
		String queryLocal = "";
		String queryCampo1 = "";
		String queryCampo2 = "";
		int    local = 1;

		
		if(regional != null){
			queryLocal = toQuery(regional);
			local = 2;
		}
		else
			if(municipio != null){
				local = 3;
				queryLocal = toQuery(municipio);
			}
			else
				queryLocal = String.valueOf(estado);
			
		if(dadosCampo1 != null)
			queryCampo1 = toQuery(dadosCampo1);

		if(dadosCampo2 != null)
			queryCampo2 = toQuery(dadosCampo2);
		
		return gera(periodicidade,
					 dataInicial,
					 dataFinal,
					 agrupamento,
					 local,
					 queryLocal,
					 campo1,
					 queryCampo1,
					 campo2,
					 queryCampo2,
					 titulo,
					 texto );
	} 
						
	private static Relatorio gera(int periodicidade,
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
								   String texto ){
		
		InitialContext 	ctx;
		Relatorio rel = null;
		Generico		generico;
										   	

		try{
				/* System.out.println(" ****** geraRelatorio() ******");
				 System.out.println("periodicidade => " + periodicidade);
				 System.out.println("dataInicial => " + dataInicial);
				 System.out.println("dataFinal => " + dataFinal);
				 System.out.println("agrupamento => " + agrupamento);
				 System.out.println("local => " + local);
				 System.out.println("queryLocal => " + queryLocal);
				 System.out.println("campo1 => " + campo1);
				 System.out.println("queryCampo1 => " + queryCampo1);
				 System.out.println("campo2 => " + campo2);
				 System.out.println("queryCampo2 => " + queryCampo2);
				 System.out.println("titulo => " + titulo);
				 System.out.println("texto => " + texto);
				 System.out.println(" ************************************");*/
											 			
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
				generico = (Generico)home.create();
				
				rel = generico.geraRelatorio(periodicidade,
											 FuncoesComuns.setNullSeVazio(dataInicial),
											 FuncoesComuns.setNullSeVazio(dataFinal),
											 FuncoesComuns.setNullSeVazio(agrupamento),
											 local,
											 FuncoesComuns.setNullSeVazio(queryLocal),
											 campo1,
											 FuncoesComuns.setNullSeVazio(queryCampo1),
											 campo2,
											 FuncoesComuns.setNullSeVazio(queryCampo2),
											 FuncoesComuns.setNullSeVazio(titulo),
											 FuncoesComuns.setNullSeVazio(texto ));
						
						
				} catch (RemoteException e) {
					e.printStackTrace();
				} catch (CreateException e) {
					e.printStackTrace();
				} catch (NamingException e) {
					e.printStackTrace();
				} catch (Exception e){
					e.printStackTrace();
				}

		return rel;
		
	}
	public void save() throws Exception{
		
		InitialContext ctx = null;

		RelatorioSalvo rel = null;
		String queryLocal = "";
		String queryCampo1 = "";
		String queryCampo2 = "";
		int    local = 1;

		
		if(regional != null){
			queryLocal = toQuery(regional);
			local = 2;
		}
		else
			if(municipio != null){
				local = 3;
				queryLocal = toQuery(municipio);
			}
			else
				queryLocal = String.valueOf(estado);
			
		if(dadosCampo1 != null)
			queryCampo1 = toQuery(dadosCampo1);

		if(dadosCampo2 != null)
			queryCampo2 = toQuery(dadosCampo2);			
			
		try{

				ctx = new InitialContext();
				RelatorioSalvoHome home = (RelatorioSalvoHome)ctx.lookup("ejb/br/smat/ejb/relatoriosalvo/RelatorioSalvoHome");
			
				if(relatorio == 0){

					rel = home.create(Integer.parseInt(agrupamento),
								local,
								FuncoesComuns.setNullSeVazio(queryLocal),
								periodicidade,
								campo1,
								FuncoesComuns.setNullSeVazio(queryCampo1),
								campo2,
								FuncoesComuns.setNullSeVazio(queryCampo2),
								FuncoesComuns.setNullSeVazio(dataInicial),
								FuncoesComuns.setNullSeVazio(dataFinal),
								FuncoesComuns.setNullSeVazio(titulo),
								FuncoesComuns.setNullSeVazio(texto));
	
					  relatorio = rel.getRelatorio();
					  
					  System.out.println("Gravou o relatório => " + relatorio);
				}
				else{
					rel = home.findByPrimaryKey(new RelatorioSalvoKey(relatorio));
					
					rel.setTipoAgrupamento(Integer.parseInt(agrupamento));
					rel.setLocal(local);
					rel.setQueryLocal(queryLocal);
					rel.setPeriodicidade(periodicidade);
					rel.setCampo1(new CampoKey(campo1));
					rel.setQueryCampo1(queryCampo1);
					rel.setCampo2(new CampoKey(campo2));
					rel.setQueryCampo2(queryCampo2);
					rel.setDataInicio(dataInicial);
					rel.setDataFim(dataFinal);
					rel.setTitulo(titulo);
					rel.setTexto(texto);
					
					System.out.println("Gravou o relatório que já existia => " + relatorio);
				}
			} catch (RemoteException e) {
				e.printStackTrace();
				throw new Exception("Gera Relatorio save RemoteException => " + e.getMessage()); 
			} catch (CreateException e) {
				e.printStackTrace();
				throw new Exception("Gera Relatorio save CreateException => " + e.getMessage());				
			} catch (NamingException e) {
				e.printStackTrace();
				throw new Exception("Gera Relatorio save NamingException => " + e.getMessage());				
			} catch (Exception e){
				e.printStackTrace();
				throw new Exception("Gera Relatorio save Exception => " + e.getMessage());	
			}					
	}
	
	private String toQuery(int[] array){

		String query = "";

	//	System.out.println("*** toQuery ***");
		
		if(array != null){

	//		System.out.println("array => " + array.length);

			for(int i=0; i< array.length;i++){
				query += String.valueOf(array[i]);

				if(i < (array.length-1))
					query += ",";
			}
		}
		
		return query;
	}
	/**
	 * Returns the relatorio.
	 * @return int
	 */
	public int getRelatorio() {
		return relatorio;
	}

	/**
	 * Returns the agrupamento.
	 * @return String
	 */
	public String getAgrupamento() {
		return agrupamento;
	}

	/**
	 * Returns the campo1.
	 * @return int
	 */
	public int getCampo1() {
		return campo1;
	}

	/**
	 * Returns the campo2.
	 * @return int
	 */
	public int getCampo2() {
		return campo2;
	}

	/**
	 * Returns the dadosCampo1.
	 * @return int[]
	 */
	public int[] getDadosCampo1() {
		return dadosCampo1;
	}

	/**
	 * Returns the dadosCampo2.
	 * @return int[]
	 */
	public int[] getDadosCampo2() {
		return dadosCampo2;
	}

	/**
	 * Returns the dataFinal.
	 * @return String
	 */
	public String getDataFinal() {
		return dataFinal;
	}

	/**
	 * Returns the dataInicial.
	 * @return String
	 */
	public String getDataInicial() {
		return dataInicial;
	}

	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Returns the municipio.
	 * @return int[]
	 */
	public int[] getMunicipio() {
		return municipio;
	}

	/**
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade() {
		return periodicidade;
	}

	/**
	 * Returns the regional.
	 * @return int[]
	 */
	public int[] getRegional() {
		return regional;
	}

	/**
	 * Returns the texto.
	 * @return String
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * Returns the titulo.
	 * @return String
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the agrupamento.
	 * @param agrupamento The agrupamento to set
	 */
	public void setAgrupamento(String agrupamento) {
		this.agrupamento = agrupamento;
	}

	/**
	 * Sets the campo1.
	 * @param campo1 The campo1 to set
	 */
	public void setCampo1(int campo1) {
		this.campo1 = campo1;
	}

	/**
	 * Sets the campo2.
	 * @param campo2 The campo2 to set
	 */
	public void setCampo2(int campo2) {
		this.campo2 = campo2;
	}

	/**
	 * Sets the dadosCampo1.
	 * @param dadosCampo1 The dadosCampo1 to set
	 */
	public void setDadosCampo1(int[] dadosCampo1) {
		this.dadosCampo1 = dadosCampo1;
	}

	/**
	 * Sets the dadosCampo2.
	 * @param dadosCampo2 The dadosCampo2 to set
	 */
	public void setDadosCampo2(int[] dadosCampo2) {
		this.dadosCampo2 = dadosCampo2;
	}

	/**
	 * Sets the dataFinal.
	 * @param dataFinal The dataFinal to set
	 */
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	/**
	 * Sets the dataInicial.
	 * @param dataInicial The dataInicial to set
	 */
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(int[] municipio) {
		this.municipio = municipio;
	}

	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}

	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(int[] regional) {
		this.regional = regional;
	}

	/**
	 * Sets the texto.
	 * @param texto The texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * Sets the titulo.
	 * @param titulo The titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
