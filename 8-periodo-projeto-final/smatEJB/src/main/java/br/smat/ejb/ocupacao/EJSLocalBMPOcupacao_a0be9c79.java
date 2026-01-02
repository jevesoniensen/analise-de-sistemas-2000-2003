package br.smat.ejb.ocupacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPOcupacao_a0be9c79
 * @generated
 */
public class EJSLocalBMPOcupacao_a0be9c79
	extends EJSLocalWrapper
	implements br.smat.ejb.ocupacao.OcupacaoLocal {
	/**
	 * EJSLocalBMPOcupacao_a0be9c79
	 * @generated
	 */
	public EJSLocalBMPOcupacao_a0be9c79() {
		super();
	}
	/**
	 * getCbo
	 * @generated
	 */
	public int getCbo() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.ocupacao.OcupacaoBean beanRef =
				(br.smat.ejb.ocupacao.OcupacaoBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getCbo();
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
	 * getOcupacao
	 * @generated
	 */
	public int getOcupacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.ocupacao.OcupacaoBean beanRef =
				(br.smat.ejb.ocupacao.OcupacaoBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getOcupacao();
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
			br.smat.ejb.ocupacao.OcupacaoBean beanRef =
				(br.smat.ejb.ocupacao.OcupacaoBean) container.preInvoke(
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
	 * setCbo
	 * @generated
	 */
	public void setCbo(int cbo) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.ocupacao.OcupacaoBean beanRef =
				(br.smat.ejb.ocupacao.OcupacaoBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			beanRef.setCbo(cbo);
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
			br.smat.ejb.ocupacao.OcupacaoBean beanRef =
				(br.smat.ejb.ocupacao.OcupacaoBean) container.preInvoke(
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
