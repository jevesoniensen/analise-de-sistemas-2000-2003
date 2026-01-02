package br.smat.ejb.pontofiscalizacaoitemfiscalizacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPPontoFiscalizacaoItemFiscalizaca_8febdf95
 * @generated
 */
public class EJSLocalBMPPontoFiscalizacaoItemFiscalizaca_8febdf95
	extends EJSLocalWrapper
	implements
		br
		.smat
		.ejb
		.pontofiscalizacaoitemfiscalizacao
		.PontoFiscalizacaoItemFiscalizacaoLocal {
	/**
	 * EJSLocalBMPPontoFiscalizacaoItemFiscalizaca_8febdf95
	 * @generated
	 */
	public EJSLocalBMPPontoFiscalizacaoItemFiscalizaca_8febdf95() {
		super();
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
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoitemfiscalizacao
						.PontoFiscalizacaoItemFiscalizacaoBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getItemFiscalizacao();
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
	 * getPontoFiscalizacao
	 * @generated
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacao
		.PontoFiscalizacaoKey getPontoFiscalizacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoitemfiscalizacao
						.PontoFiscalizacaoItemFiscalizacaoBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getPontoFiscalizacao();
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
	 * setItemFiscalizacao
	 * @generated
	 */
	public void setItemFiscalizacao(
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey itemFiscalizacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoitemfiscalizacao
						.PontoFiscalizacaoItemFiscalizacaoBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			beanRef.setItemFiscalizacao(itemFiscalizacao);
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
		return;
	}
	/**
	 * setPontoFiscalizacao
	 * @generated
	 */
	public void setPontoFiscalizacao(
		br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey pontoFiscalizacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoitemfiscalizacao
						.PontoFiscalizacaoItemFiscalizacaoBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			beanRef.setPontoFiscalizacao(pontoFiscalizacao);
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
