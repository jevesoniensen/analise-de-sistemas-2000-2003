package br.smat.ejb.locallesao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPLocalLesao_74f3b409
 * @generated
 */
public class EJSLocalBMPLocalLesao_74f3b409
	extends EJSLocalWrapper
	implements br.smat.ejb.locallesao.LocalLesaoLocal {
	/**
	 * EJSLocalBMPLocalLesao_74f3b409
	 * @generated
	 */
	public EJSLocalBMPLocalLesao_74f3b409() {
		super();
	}
	/**
	 * getLocalLesaoPai
	 * @generated
	 */
	public br.smat.ejb.locallesao.LocalLesaoKey getLocalLesaoPai() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.locallesao.LocalLesaoKey _EJS_result = null;
		try {
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getLocalLesaoPai();
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
	 * getLocalLesao
	 * @generated
	 */
	public int getLocalLesao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getLocalLesao();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getNome();
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
	 * setLocalLesaoPai
	 * @generated
	 */
	public void setLocalLesaoPai(
		br.smat.ejb.locallesao.LocalLesaoKey localLesaoPai) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			beanRef.setLocalLesaoPai(localLesaoPai);
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
		return;
	}
	/**
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setNome(nome);
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
}
