package br.smat.ejb.tipoacidente;
/**
 * Local interface for Enterprise Bean: TipoAcidente
 */
public interface TipoAcidenteLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the nome.
	 * @return Object
	 */
	public String getNome();
	/**
	 * Returns the tipoAcidente.
	 * @return Object
	 */
	public int getTipoAcidente();
}
