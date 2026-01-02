package br.smat.ejb.pontofiscalizacaoitemfiscalizacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPPontoFiscalizacaoItemFiscalizaca_8febdf95
 * @generated
 */
public class EJSRemoteBMPPontoFiscalizacaoItemFiscalizaca_8febdf95
	extends EJSWrapper
	implements PontoFiscalizacaoItemFiscalizacao {
	/**
	 * EJSRemoteBMPPontoFiscalizacaoItemFiscalizaca_8febdf95
	 * @generated
	 */
	public EJSRemoteBMPPontoFiscalizacaoItemFiscalizaca_8febdf95()
		throws java.rmi.RemoteException {
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
		.ItemFiscalizacaoKey getItemFiscalizacao()
		throws java.rmi.RemoteException {
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
	 * getPontoFiscalizacao
	 * @generated
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacao
		.PontoFiscalizacaoKey getPontoFiscalizacao()
		throws java.rmi.RemoteException {
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
	 * setItemFiscalizacao
	 * @generated
	 */
	public void setItemFiscalizacao(
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey itemFiscalizacao)
		throws java.rmi.RemoteException {
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
	/**
	 * setPontoFiscalizacao
	 * @generated
	 */
	public void setPontoFiscalizacao(
		br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey pontoFiscalizacao)
		throws java.rmi.RemoteException {
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
}
