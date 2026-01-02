package br.smat.ejb.representanteempresa;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPRepresentanteEmpresa_7d569c42
 * @generated
 */
public class EJSRemoteBMPRepresentanteEmpresa_7d569c42
	extends EJSWrapper
	implements RepresentanteEmpresa {
	/**
	 * EJSRemoteBMPRepresentanteEmpresa_7d569c42
	 * @generated
	 */
	public EJSRemoteBMPRepresentanteEmpresa_7d569c42()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getEmpregador
	 * @generated
	 */
	public br.smat.ejb.empregador.EmpregadorKey getEmpregador()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.empregador.EmpregadorKey _EJS_result = null;
		try {
			br.smat.ejb.representanteempresa.RepresentanteEmpresaBean beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.RepresentanteEmpresaBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getEmpregador();
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
	 * getRepresentanteEmpresa
	 * @generated
	 */
	public int getRepresentanteEmpresa() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.representanteempresa.RepresentanteEmpresaBean beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.RepresentanteEmpresaBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getRepresentanteEmpresa();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.representanteempresa.RepresentanteEmpresaBean beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.RepresentanteEmpresaBean) container
						.preInvoke(
					this,
					2,
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
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setEmpregador
	 * @generated
	 */
	public void setEmpregador(br.smat.ejb.empregador.EmpregadorKey empregador)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.representanteempresa.RepresentanteEmpresaBean beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.RepresentanteEmpresaBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			beanRef.setEmpregador(empregador);
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
			br.smat.ejb.representanteempresa.RepresentanteEmpresaBean beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.RepresentanteEmpresaBean) container
						.preInvoke(
					this,
					4,
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
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setRepresentanteEmpresa
	 * @generated
	 */
	public void setRepresentanteEmpresa(int representanteEmpresa)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.representanteempresa.RepresentanteEmpresaBean beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.RepresentanteEmpresaBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			beanRef.setRepresentanteEmpresa(representanteEmpresa);
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
}
