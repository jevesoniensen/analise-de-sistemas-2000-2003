package br.smat.ejb.ramoatividade;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPRamoAtividade_e9cc9ed1
 * @generated
 */
public class EJSLocalBMPRamoAtividade_e9cc9ed1
	extends EJSLocalWrapper
	implements br.smat.ejb.ramoatividade.RamoAtividadeLocal {
	/**
	 * EJSLocalBMPRamoAtividade_e9cc9ed1
	 * @generated
	 */
	public EJSLocalBMPRamoAtividade_e9cc9ed1() {
		super();
	}
	/**
	 * getRamoSuperior
	 * @generated
	 */
	public br.smat.ejb.ramoatividade.RamoAtividadeKey getRamoSuperior() {
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
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getCnae
	 * @generated
	 */
	public int getCnae() {
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
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getRamoAtividade
	 * @generated
	 */
	public int getRamoAtividade() {
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
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() {
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
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * setCnae
	 * @generated
	 */
	public void setCnae(int cnae) {
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
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 4, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome) {
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
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setRamoSuperior
	 * @generated
	 */
	public void setRamoSuperior(
		br.smat.ejb.ramoatividade.RamoAtividadeKey ramoSuperior) {
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
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
