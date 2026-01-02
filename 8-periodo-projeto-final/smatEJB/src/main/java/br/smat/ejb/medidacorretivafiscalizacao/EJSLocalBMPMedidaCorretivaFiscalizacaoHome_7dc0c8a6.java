package br.smat.ejb.medidacorretivafiscalizacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPMedidaCorretivaFiscalizacaoHome_7dc0c8a6
 * @generated
 */
public class EJSLocalBMPMedidaCorretivaFiscalizacaoHome_7dc0c8a6
	extends EJSLocalWrapper
	implements
		br
		.smat
		.ejb
		.medidacorretivafiscalizacao
		.MedidaCorretivaFiscalizacaoLocalHome {
	/**
	 * EJSLocalBMPMedidaCorretivaFiscalizacaoHome_7dc0c8a6
	 * @generated
	 */
	public EJSLocalBMPMedidaCorretivaFiscalizacaoHome_7dc0c8a6() {
		super();
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
				.medidacorretivafiscalizacao
				.EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6) container
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
	 * create
	 * @generated
	 */
	public br
		.smat
		.ejb
		.medidacorretivafiscalizacao
		.MedidaCorretivaFiscalizacaoLocal create(
			int tramiteFiscalizacao,
			int fiscalizacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			java.lang.String observacao)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.ejb
			.medidacorretivafiscalizacao
			.MedidaCorretivaFiscalizacaoLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(
					tramiteFiscalizacao,
					fiscalizacao,
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
	 * findAllMedidaCorretivaFiscalizacao
	 * @generated
	 */
	public java.util.Collection findAllMedidaCorretivaFiscalizacao(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.findAllMedidaCorretivaFiscalizacao_Local(
					tramiteFiscalizacao,
					fiscalizacao);
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
	 * findByPrimaryKey
	 * @generated
	 */
	public br
		.smat
		.ejb
		.medidacorretivafiscalizacao
		.MedidaCorretivaFiscalizacaoLocal findByPrimaryKey(
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.ejb
			.medidacorretivafiscalizacao
			.MedidaCorretivaFiscalizacaoLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6) container
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
}
