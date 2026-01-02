package br.smat.ejb.medidacorretivainvestigacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPMedidaCorretivaInvestigacaoHome_fece7eb8
 * @generated
 */
public class EJSLocalBMPMedidaCorretivaInvestigacaoHome_fece7eb8
	extends EJSLocalWrapper
	implements
		br
		.smat
		.ejb
		.medidacorretivainvestigacao
		.MedidaCorretivaInvestigacaoLocalHome {
	/**
	 * EJSLocalBMPMedidaCorretivaInvestigacaoHome_fece7eb8
	 * @generated
	 */
	public EJSLocalBMPMedidaCorretivaInvestigacaoHome_fece7eb8() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br
		.smat
		.ejb
		.medidacorretivainvestigacao
		.MedidaCorretivaInvestigacaoLocal create(
			int investigacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			java.lang.String observacao)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.ejb
			.medidacorretivainvestigacao
			.MedidaCorretivaInvestigacaoLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(
					investigacao,
					tipoMedidaCorretiva,
					prazoDias,
					observacao);
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
	public br
		.smat
		.ejb
		.medidacorretivainvestigacao
		.MedidaCorretivaInvestigacaoLocal findByPrimaryKey(
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.ejb
			.medidacorretivainvestigacao
			.MedidaCorretivaInvestigacaoLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8) container
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
	 * findAllMedidaCorretivaInvestigacao
	 * @generated
	 */
	public java.util.Collection findAllMedidaCorretivaInvestigacao(
		int investigacao)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.findAllMedidaCorretivaInvestigacao_Local(
					investigacao);
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
				.medidacorretivainvestigacao
				.EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8) container
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
}
