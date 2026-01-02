package br.smat.ejb.campo;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPCampo_e4bbba30
 * @generated
 */
public class EJSRemoteBMPCampo_e4bbba30 extends EJSWrapper implements Campo {
	/**
	 * EJSRemoteBMPCampo_e4bbba30
	 * @generated
	 */
	public EJSRemoteBMPCampo_e4bbba30() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getCampo
	 * @generated
	 */
	public int getCampo() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getCampo();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getColuna
	 * @generated
	 */
	public java.lang.String getColuna() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getColuna();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 3, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getPai
	 * @generated
	 */
	public java.lang.String getPai() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getPai();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 6, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getTabela
	 * @generated
	 */
	public java.lang.String getTabela() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					7,
					_EJS_s);
			_EJS_result = beanRef.getTabela();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 7, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setColuna
	 * @generated
	 */
	public void setColuna(java.lang.String coluna)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setColuna(coluna);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 8, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setPai
	 * @generated
	 */
	public void setPai(java.lang.String pai) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					11,
					_EJS_s);
			beanRef.setPai(pai);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 11, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setTabela
	 * @generated
	 */
	public void setTabela(java.lang.String tabela)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					12,
					_EJS_s);
			beanRef.setTabela(tabela);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 12, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * getLabel
	 * @generated
	 */
	public java.lang.String getLabel() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getLabel();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getNome();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setLabel
	 * @generated
	 */
	public void setLabel(java.lang.String label)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					9,
					_EJS_s);
			beanRef.setLabel(label);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 9, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					10,
					_EJS_s);
			beanRef.setNome(nome);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 10, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * getRegistros
	 * @generated
	 */
	public br.smat.objetosauxiliares.auxcampo.AuxCampo[] getRegistros()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxcampo.AuxCampo[] _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getRegistros();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 0, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getRegistrosFilhos
	 * @generated
	 */
	public br.smat.objetosauxiliares.auxcampo.AuxCampo[] getRegistrosFilhos()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxcampo.AuxCampo[] _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getRegistrosFilhos();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 1, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
}
