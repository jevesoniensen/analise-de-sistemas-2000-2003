package br.smat.controleacesso.ejb.pagina;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPPaginaHome_81265800
 * @generated
 */
public class EJSLocalBMPPaginaHome_81265800
	extends EJSLocalWrapper
	implements br.smat.controleacesso.ejb.pagina.PaginaLocalHome {
	/**
	 * EJSLocalBMPPaginaHome_81265800
	 * @generated
	 */
	public EJSLocalBMPPaginaHome_81265800() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.controleacesso.ejb.pagina.PaginaLocal create(
		java.lang.String nome)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.pagina.PaginaLocal _EJS_result = null;
		try {
			br
				.smat
				.controleacesso
				.ejb
				.pagina
				.EJSBMPPaginaHomeBean_81265800 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.pagina
						.EJSBMPPaginaHomeBean_81265800) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(nome);
		} catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.controleacesso.ejb.pagina.PaginaLocal findByPrimaryKey(
		br.smat.controleacesso.ejb.pagina.PaginaKey key)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.pagina.PaginaLocal _EJS_result = null;
		try {
			br
				.smat
				.controleacesso
				.ejb
				.pagina
				.EJSBMPPaginaHomeBean_81265800 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.pagina
						.EJSBMPPaginaHomeBean_81265800) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(key);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * findPermisaoPagina
	 * @generated
	 */
	public br.smat.controleacesso.ejb.pagina.PaginaLocal findPermisaoPagina(
		int usuario,
		int pagina)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.pagina.PaginaLocal _EJS_result = null;
		try {
			br
				.smat
				.controleacesso
				.ejb
				.pagina
				.EJSBMPPaginaHomeBean_81265800 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.pagina
						.EJSBMPPaginaHomeBean_81265800) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.findPermisaoPagina_Local(usuario, pagina);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * findAllPaginas
	 * @generated
	 */
	public java.util.Collection findAllPaginas()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.controleacesso
				.ejb
				.pagina
				.EJSBMPPaginaHomeBean_81265800 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.pagina
						.EJSBMPPaginaHomeBean_81265800) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllPaginas_Local();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.controleacesso
				.ejb
				.pagina
				.EJSBMPPaginaHomeBean_81265800 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.pagina
						.EJSBMPPaginaHomeBean_81265800) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (javax.ejb.EJBException ex) {
			_EJS_s.setUncheckedLocalException(ex);
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
