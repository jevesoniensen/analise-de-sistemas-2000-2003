package br.smat.ejb.vinculoempregaticio;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPVinculoEmpregaticio_c01bbf62
 * @generated
 */
public class EJSLocalBMPVinculoEmpregaticio_c01bbf62
	extends EJSLocalWrapper
	implements br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioLocal {
	/**
	 * EJSLocalBMPVinculoEmpregaticio_c01bbf62
	 * @generated
	 */
	public EJSLocalBMPVinculoEmpregaticio_c01bbf62() {
		super();
	}
	/**
	 * getVinculoEmpregaticio
	 * @generated
	 */
	public int getVinculoEmpregaticio() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioBean beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.VinculoEmpregaticioBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getVinculoEmpregaticio();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioBean beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.VinculoEmpregaticioBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getNome();
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
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioBean beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.VinculoEmpregaticioBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			beanRef.setNome(nome);
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
		return;
	}
}
