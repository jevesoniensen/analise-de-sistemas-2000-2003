package br.smat.ejb.medidacorretivafiscalizacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPMedidaCorretivaFiscalizacao_7dc0c8a6
 * @generated
 */
public class EJSRemoteBMPMedidaCorretivaFiscalizacao_7dc0c8a6
	extends EJSWrapper
	implements MedidaCorretivaFiscalizacao {
	/**
	 * EJSRemoteBMPMedidaCorretivaFiscalizacao_7dc0c8a6
	 * @generated
	 */
	public EJSRemoteBMPMedidaCorretivaFiscalizacao_7dc0c8a6()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getTipoMedidaCorretiva
	 * @generated
	 */
	public br
		.smat
		.ejb
		.tipomedidacorretiva
		.TipoMedidaCorretivaKey getTipoMedidaCorretiva()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacaoBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getTipoMedidaCorretiva();
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
	 * getTramiteFiscalizacao
	 * @generated
	 */
	public br
		.smat
		.ejb
		.tramitefiscalizacao
		.TramiteFiscalizacaoKey getTramiteFiscalizacao()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacaoBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getTramiteFiscalizacao();
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
	 * getObservacao
	 * @generated
	 */
	public java.lang.String getObservacao() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacaoBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getObservacao();
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
	 * getPrazoDias
	 * @generated
	 */
	public int getPrazoDias() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacaoBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getPrazoDias();
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
	 * setObservacao
	 * @generated
	 */
	public void setObservacao(java.lang.String observacao)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacaoBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setObservacao(observacao);
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
	 * setTipoMedidaCorretiva
	 * @generated
	 */
	public void setTipoMedidaCorretiva(
		br
			.smat
			.ejb
			.tipomedidacorretiva
			.TipoMedidaCorretivaKey tipoMedidaCorretiva)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacaoBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setTipoMedidaCorretiva(tipoMedidaCorretiva);
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
	 * setTramiteFiscalizacao
	 * @generated
	 */
	public void setTramiteFiscalizacao(
		br
			.smat
			.ejb
			.tramitefiscalizacao
			.TramiteFiscalizacaoKey tramiteFiscalizacao)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacaoBean) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.setTramiteFiscalizacao(tramiteFiscalizacao);
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
	 * setPrazoDias
	 * @generated
	 */
	public void setPrazoDias(int prazoDias) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacaoBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			beanRef.setPrazoDias(prazoDias);
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
