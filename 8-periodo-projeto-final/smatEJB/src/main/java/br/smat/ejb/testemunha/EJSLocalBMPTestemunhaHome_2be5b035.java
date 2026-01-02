package br.smat.ejb.testemunha;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTestemunhaHome_2be5b035
 * @generated
 */
public class EJSLocalBMPTestemunhaHome_2be5b035
	extends EJSLocalWrapper
	implements br.smat.ejb.testemunha.TestemunhaLocalHome {
	/**
	 * EJSLocalBMPTestemunhaHome_2be5b035
	 * @generated
	 */
	public EJSLocalBMPTestemunhaHome_2be5b035() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.testemunha.TestemunhaLocal create(
		int acidente,
		int municipio,
		java.lang.String nome,
		int numero,
		java.lang.String rua,
		java.lang.String bairro,
		java.lang.String cep,
		java.lang.String complemento,
		java.lang.String telefone,
		java.lang.String ddd)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.testemunha.TestemunhaLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.testemunha
				.EJSBMPTestemunhaHomeBean_2be5b035 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.testemunha
						.EJSBMPTestemunhaHomeBean_2be5b035) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(
					acidente,
					municipio,
					nome,
					numero,
					rua,
					bairro,
					cep,
					complemento,
					telefone,
					ddd);
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
	public br.smat.ejb.testemunha.TestemunhaLocal findByPrimaryKey(
		br.smat.ejb.testemunha.TestemunhaKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.testemunha.TestemunhaLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.testemunha
				.EJSBMPTestemunhaHomeBean_2be5b035 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.testemunha
						.EJSBMPTestemunhaHomeBean_2be5b035) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(primaryKey);
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
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.testemunha
				.EJSBMPTestemunhaHomeBean_2be5b035 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.testemunha
						.EJSBMPTestemunhaHomeBean_2be5b035) container
						.preInvoke(
					this,
					3,
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
	 * findAllTestemunhas
	 * @generated
	 */
	public java.util.Collection findAllTestemunhas(int acidente)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.testemunha
				.EJSBMPTestemunhaHomeBean_2be5b035 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.testemunha
						.EJSBMPTestemunhaHomeBean_2be5b035) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllTestemunhas_Local(acidente);
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
}
