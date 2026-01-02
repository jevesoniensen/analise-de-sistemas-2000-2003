package br.smat.ejb.pontofiscalizacaoramotividade;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPPontoFiscalizacaoRamoAtividade_7687b9ec
 * @generated
 */
public class EJSLocalBMPPontoFiscalizacaoRamoAtividade_7687b9ec
	extends EJSLocalWrapper
	implements
		br
		.smat
		.ejb
		.pontofiscalizacaoramotividade
		.PontoFiscalizacaoRamoAtividadeLocal {
	/**
	 * EJSLocalBMPPontoFiscalizacaoRamoAtividade_7687b9ec
	 * @generated
	 */
	public EJSLocalBMPPontoFiscalizacaoRamoAtividade_7687b9ec() {
		super();
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
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoramotividade
						.PontoFiscalizacaoRamoAtividadeBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getPontoFiscalizacao();
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
	 * getRamoAtividade
	 * @generated
	 */
	public br.smat.ejb.ramoatividade.RamoAtividadeKey getRamoAtividade() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.ramoatividade.RamoAtividadeKey _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoramotividade
						.PontoFiscalizacaoRamoAtividadeBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getRamoAtividade();
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
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoramotividade
						.PontoFiscalizacaoRamoAtividadeBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			beanRef.setPontoFiscalizacao(pontoFiscalizacao);
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
	 * setRamoAtividade
	 * @generated
	 */
	public void setRamoAtividade(
		br.smat.ejb.ramoatividade.RamoAtividadeKey ramoAtividade) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeBean beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoramotividade
						.PontoFiscalizacaoRamoAtividadeBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			beanRef.setRamoAtividade(ramoAtividade);
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
