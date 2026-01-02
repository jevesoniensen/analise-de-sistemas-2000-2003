package br.smat.ejb.ramoatividade;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPRamoAtividade_e9cc9ed1
 * @generated
 */
public class EJSRemoteBMPRamoAtividade_e9cc9ed1
	extends EJSWrapper
	implements RamoAtividade {
	/**
	 * EJSRemoteBMPRamoAtividade_e9cc9ed1
	 * @generated
	 */
	public EJSRemoteBMPRamoAtividade_e9cc9ed1()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getRamoSuperior
	 * @generated
	 */
	public br.smat.ejb.ramoatividade.RamoAtividadeKey getRamoSuperior()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.ramoatividade.RamoAtividadeKey _EJS_result = null;
		try {
			br.smat.ejb.ramoatividade.RamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.ramoatividade
						.RamoAtividadeBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getRamoSuperior();
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
	 * getCnae
	 * @generated
	 */
	public int getCnae() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.ramoatividade.RamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.ramoatividade
						.RamoAtividadeBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getCnae();
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
	/**
	 * getRamoAtividade
	 * @generated
	 */
	public int getRamoAtividade() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.ramoatividade.RamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.ramoatividade
						.RamoAtividadeBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getRamoAtividade();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.ramoatividade.RamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.ramoatividade
						.RamoAtividadeBean) container
						.preInvoke(
					this,
					3,
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
			container.postInvoke(this, 3, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setCnae
	 * @generated
	 */
	public void setCnae(int cnae) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.ramoatividade.RamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.ramoatividade
						.RamoAtividadeBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setCnae(cnae);
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
			br.smat.ejb.ramoatividade.RamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.ramoatividade
						.RamoAtividadeBean) container
						.preInvoke(
					this,
					5,
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
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setRamoSuperior
	 * @generated
	 */
	public void setRamoSuperior(
		br.smat.ejb.ramoatividade.RamoAtividadeKey ramoSuperior)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.ramoatividade.RamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.ramoatividade
						.RamoAtividadeBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setRamoSuperior(ramoSuperior);
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
		return;
	}
}
