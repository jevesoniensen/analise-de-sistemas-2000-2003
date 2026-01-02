package br.smat.ejb.pontofiscalizacaoramotividade;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPPontoFiscalizacaoRamoAtividade_7687b9ec
 * @generated
 */
public class EJSRemoteBMPPontoFiscalizacaoRamoAtividade_7687b9ec
	extends EJSWrapper
	implements PontoFiscalizacaoRamoAtividade {
	/**
	 * EJSRemoteBMPPontoFiscalizacaoRamoAtividade_7687b9ec
	 * @generated
	 */
	public EJSRemoteBMPPontoFiscalizacaoRamoAtividade_7687b9ec()
		throws java.rmi.RemoteException {
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
		.PontoFiscalizacaoKey getPontoFiscalizacao()
		throws java.rmi.RemoteException {
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
	 * getRamoAtividade
	 * @generated
	 */
	public br.smat.ejb.ramoatividade.RamoAtividadeKey getRamoAtividade()
		throws java.rmi.RemoteException {
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
	 * setRamoAtividade
	 * @generated
	 */
	public void setRamoAtividade(
		br.smat.ejb.ramoatividade.RamoAtividadeKey ramoAtividade)
		throws java.rmi.RemoteException {
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
