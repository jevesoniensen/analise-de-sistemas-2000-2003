package br.smat.ejb.roteiros;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPRoteiros_f05933e0
 * @generated
 */
public class EJSLocalBMPRoteiros_f05933e0
	extends EJSLocalWrapper
	implements br.smat.ejb.roteiros.RoteirosLocal {
	/**
	 * EJSLocalBMPRoteiros_f05933e0
	 * @generated
	 */
	public EJSLocalBMPRoteiros_f05933e0() {
		super();
	}
	/**
	 * getGrauConformidade
	 * @generated
	 */
	public br
		.smat
		.ejb
		.grauconformidade
		.GrauConformidadeKey getGrauConformidade() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.grauconformidade.GrauConformidadeKey _EJS_result = null;
		try {
			br.smat.ejb.roteiros.RoteirosBean beanRef =
				(br.smat.ejb.roteiros.RoteirosBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getGrauConformidade();
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
	 * getItemFiscalizacao
	 * @generated
	 */
	public br
		.smat
		.ejb
		.itemfiscalizacao
		.ItemFiscalizacaoKey getItemFiscalizacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey _EJS_result = null;
		try {
			br.smat.ejb.roteiros.RoteirosBean beanRef =
				(br.smat.ejb.roteiros.RoteirosBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getItemFiscalizacao();
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
	 * getTramiteFiscalizacao
	 * @generated
	 */
	public br
		.smat
		.ejb
		.tramitefiscalizacao
		.TramiteFiscalizacaoKey getTramiteFiscalizacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey _EJS_result =
			null;
		try {
			br.smat.ejb.roteiros.RoteirosBean beanRef =
				(br.smat.ejb.roteiros.RoteirosBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getTramiteFiscalizacao();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.roteiros.RoteirosBean beanRef =
				(br.smat.ejb.roteiros.RoteirosBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getNome();
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
	 * setGrauConformidade
	 * @generated
	 */
	public void setGrauConformidade(
		br.smat.ejb.grauconformidade.GrauConformidadeKey grauConformidade) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.roteiros.RoteirosBean beanRef =
				(br.smat.ejb.roteiros.RoteirosBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setGrauConformidade(grauConformidade);
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
	 * setItemFiscalizacao
	 * @generated
	 */
	public void setItemFiscalizacao(
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey itemFiscalizacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.roteiros.RoteirosBean beanRef =
				(br.smat.ejb.roteiros.RoteirosBean) container.preInvoke(
					this,
					5,
					_EJS_s);
			beanRef.setItemFiscalizacao(itemFiscalizacao);
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
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.roteiros.RoteirosBean beanRef =
				(br.smat.ejb.roteiros.RoteirosBean) container.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setNome(nome);
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
	 * setTramiteFiscalizacao
	 * @generated
	 */
	public void setTramiteFiscalizacao(
		br
			.smat
			.ejb
			.tramitefiscalizacao
			.TramiteFiscalizacaoKey tramiteFiscalizacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.roteiros.RoteirosBean beanRef =
				(br.smat.ejb.roteiros.RoteirosBean) container.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.setTramiteFiscalizacao(tramiteFiscalizacao);
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
