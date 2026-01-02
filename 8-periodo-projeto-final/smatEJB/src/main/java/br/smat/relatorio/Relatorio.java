package br.smat.relatorio;

import java.io.Serializable;

import javax.transaction.Synchronization;

public  class Relatorio implements Serializable{
	
	private String		campo1;
	private String		campo2;
	private String		labelLocal;
	private String[]	nomeLocal;
	private String[]	nomeRegistrosCampo1;
	private String[]	nomeRegistrosCampo2;
	private String[]		mesAno;
	private int[] 	quantidade;
	private String titulo;
	private String texto;
	private String dataInicial;
	private String dataFinal;
	private String nomePeriodicidade;
	
	private int length;
	
	private int contNomeLocal;
	private int contNomeRegistrosCampo1;
	private int contNomeRegistrosCampo2;
	private int contMesAno;
	private int contQuantidade;
	
	public Relatorio(String   nomePeriodicidade,
				      String   labelLocal,
					  String   campo1,
					  String   campo2,
					  String[] nomeLocal,
					  String[] nomeRegistrosCampo1,
					  String[] nomeRegistrosCampo2,
					  String[] mesAno,
					  int[]    quantidade,
					  String   titulo,
					  String   texto,
					  String   dataInicial,
					  String   dataFinal){
		
		
		this.nomePeriodicidade = nomePeriodicidade;
		this.labelLocal = labelLocal;
		this.campo1 = campo1;
		this.campo2 = campo2;
		this.nomeLocal = nomeLocal;
		this.nomeRegistrosCampo1 = nomeRegistrosCampo1;
		this.nomeRegistrosCampo2 = nomeRegistrosCampo2;
		this.mesAno = mesAno;
		this.quantidade = quantidade;
		this.titulo = titulo;
		this.texto = texto;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}
	
	public String[] getNomeLocal(){ 
		
		return nomeLocal;
	}

	public String[] getNomeRegistrosCampo1(){
		return nomeRegistrosCampo1;
	}
	
	public String[] getNomeRegistrosCampo2(){
		return nomeRegistrosCampo2;
	}

	public String[] getMesAno(){
		return mesAno;
	}
	/**
	 * Returns the campo1.
	 * @return String
	 */
	public String getCampo1() {
		return campo1;
	}

	/**
	 * Returns the campo2.
	 * @return String
	 */
	public String getCampo2() {
		return campo2;
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
	
	public int getLengthCampo2(){
		return nomeRegistrosCampo2.length;
	}	

	public String[] getQuantidade()
	{
					
		String[] aux;
		int j=0;

		int max = nomeRegistrosCampo1.length * nomeRegistrosCampo2.length;
		int auxCont = 0;
		

		
		auxCont = contQuantidade;

		/*System.out.println("** ANTES **");	
		System.out.println("auxCont       => " + auxCont);
		System.out.println("max => " + max);
		System.out.println("contQuantidade => " + contQuantidade);*/
		
		aux = new String[max];
		
	
		
		for(int i=contQuantidade;i < (auxCont + max); i++){

			if(i == quantidade.length){
				break;
			}

			aux[j++] = String.valueOf(quantidade[i]);
			
			contQuantidade++;
		}
	/*	System.out.println("** DEPOIS **");
		System.out.println("auxCont       => " + auxCont);
		System.out.println("max => " + max);
		System.out.println("contQuantidade => " + contQuantidade);		*/
		
		if(contQuantidade == quantidade.length)
			contQuantidade = 0;
				
		return aux;
	}
	
	public int getColSpanPeriodo(){
		
		int colSpan = 0;
		colSpan = 1 + (nomeRegistrosCampo1.length * nomeRegistrosCampo2.length);
		
		return colSpan;
	}
	/**
	 * Returns the labelLocal.
	 * @return String
	 */
	public String getLabelLocal() {
		return labelLocal;
	}

	/**
	 * Returns the nomePeriodicidade.
	 * @return String
	 */
	public String getNomePeriodicidade() {
		return nomePeriodicidade;
	}

}
