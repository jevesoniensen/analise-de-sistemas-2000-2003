package br.smat.controleacesso.ejb.modulo;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPModulo_17db6578
 * @generated
 */
public class EJSRemoteBMPModulo_17db6578 extends EJSWrapper implements Modulo {
	/**
	 * EJSRemoteBMPModulo_17db6578
	 * @generated
	 */
	public EJSRemoteBMPModulo_17db6578() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getModuloPai
	 * @generated
	 */
	public br.smat.controleacesso.ejb.modulo.ModuloKey getModuloPai()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.modulo.ModuloKey _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.modulo.ModuloBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getModuloPai();
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
	 * getPaginaDefault
	 * @generated
	 */
	public br.smat.controleacesso.ejb.pagina.PaginaKey getPaginaDefault()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.pagina.PaginaKey _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.modulo.ModuloBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getPaginaDefault();
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
	 * getModulo
	 * @generated
	 */
	public int getModulo() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.controleacesso.ejb.modulo.ModuloBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getModulo();
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
	 * getEstrutura
	 * @generated
	 */
	public java.lang.String getEstrutura() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.modulo.ModuloBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getEstrutura();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.modulo.ModuloBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloBean) container
						.preInvoke(
					this,
					4,
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
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setEstrutura
	 * @generated
	 */
	public void setEstrutura(java.lang.String estrutura)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.modulo.ModuloBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			beanRef.setEstrutura(estrutura);
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
	 * setModuloPai
	 * @generated
	 */
	public void setModuloPai(
		br.smat.controleacesso.ejb.modulo.ModuloKey moduloPai)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.modulo.ModuloBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setModuloPai(moduloPai);
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
	/**
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.modulo.ModuloBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloBean) container
						.preInvoke(
					this,
					7,
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
			container.postInvoke(this, 7, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setPaginaDefault
	 * @generated
	 */
	public void setPaginaDefault(
		br.smat.controleacesso.ejb.pagina.PaginaKey paginaDefault)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.modulo.ModuloBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloBean) container
						.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setPaginaDefault(paginaDefault);
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
}
