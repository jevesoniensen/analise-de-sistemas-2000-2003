package br.smat.ejb.medidacorretivainvestigacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPMedidaCorretivaInvestigacao_fece7eb8
 * @generated
 */
public class EJSLocalBMPMedidaCorretivaInvestigacao_fece7eb8
	extends EJSLocalWrapper
	implements br.smat.ejb.medidacorretivainvestigacao.MedidaCorretivaInvestigacaoLocal {
	/**
	 * EJSLocalBMPMedidaCorretivaInvestigacao_fece7eb8
	 * @generated
	 */
	public EJSLocalBMPMedidaCorretivaInvestigacao_fece7eb8() {
		super();
	}
	/**
	 * getInvestigacao
	 * @generated
	 */
	public br.smat.ejb.investigacao.InvestigacaoKey getInvestigacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.investigacao.InvestigacaoKey _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacaoBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getInvestigacao();
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
	 * getTipoMedidaCorretiva
	 * @generated
	 */
	public br
		.smat
		.ejb
		.tipomedidacorretiva
		.TipoMedidaCorretivaKey getTipoMedidaCorretiva() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacaoBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getTipoMedidaCorretiva();
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
	 * getPrazoDias
	 * @generated
	 */
	public int getPrazoDias() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacaoBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getPrazoDias();
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
	 * getObservacao
	 * @generated
	 */
	public java.lang.String getObservacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacaoBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getObservacao();
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
	 * setInvestigacao
	 * @generated
	 */
	public void setInvestigacao(
		br.smat.ejb.investigacao.InvestigacaoKey investigacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacaoBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setInvestigacao(investigacao);
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
	/**
	 * setObservacao
	 * @generated
	 */
	public void setObservacao(java.lang.String observacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacaoBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			beanRef.setObservacao(observacao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setPrazoDias
	 * @generated
	 */
	public void setPrazoDias(int prazoDias) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacaoBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setPrazoDias(prazoDias);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
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
			.TipoMedidaCorretivaKey tipoMedidaCorretiva) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacaoBean) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.setTipoMedidaCorretiva(tipoMedidaCorretiva);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 7, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
