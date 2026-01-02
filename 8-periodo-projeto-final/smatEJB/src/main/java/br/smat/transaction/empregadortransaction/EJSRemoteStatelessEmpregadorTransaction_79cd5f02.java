package br.smat.transaction.empregadortransaction;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteStatelessEmpregadorTransaction_79cd5f02
 * @generated
 */
public class EJSRemoteStatelessEmpregadorTransaction_79cd5f02
	extends EJSWrapper
	implements EmpregadorTransaction {
	/**
	 * EJSRemoteStatelessEmpregadorTransaction_79cd5f02
	 * @generated
	 */
	public EJSRemoteStatelessEmpregadorTransaction_79cd5f02()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getEmpregador
	 * @generated
	 */
	public int getEmpregador() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br
				.smat
				.transaction
				.empregadortransaction
				.EmpregadorTransactionBean beanRef =
				(
					br
						.smat
						.transaction
						.empregadortransaction
						.EmpregadorTransactionBean) container
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
	 * armazena
	 * @generated
	 */
	public java.lang.String armazena(
		int empregador,
		int ramoAtividade,
		int municipio,
		int tipoEmpregador,
		java.lang.String razaoSocial,
		java.lang.String documento,
		int numero,
		java.lang.String rua,
		java.lang.String bairro,
		java.lang.String cep,
		java.lang.String complemento)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br
				.smat
				.transaction
				.empregadortransaction
				.EmpregadorTransactionBean beanRef =
				(
					br
						.smat
						.transaction
						.empregadortransaction
						.EmpregadorTransactionBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result =
				beanRef.armazena(
					empregador,
					ramoAtividade,
					municipio,
					tipoEmpregador,
					razaoSocial,
					documento,
					numero,
					rua,
					bairro,
					cep,
					complemento);
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
	 * setEmpregador
	 * @generated
	 */
	public void setEmpregador(int empregador) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.transaction
				.empregadortransaction
				.EmpregadorTransactionBean beanRef =
				(
					br
						.smat
						.transaction
						.empregadortransaction
						.EmpregadorTransactionBean) container
						.preInvoke(
					this,
					2,
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
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
}
