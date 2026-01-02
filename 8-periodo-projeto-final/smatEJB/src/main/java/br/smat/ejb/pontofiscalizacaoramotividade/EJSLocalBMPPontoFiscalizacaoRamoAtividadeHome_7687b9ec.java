package br.smat.ejb.pontofiscalizacaoramotividade;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPPontoFiscalizacaoRamoAtividadeHome_7687b9ec
 * @generated
 */
public class EJSLocalBMPPontoFiscalizacaoRamoAtividadeHome_7687b9ec
	extends EJSLocalWrapper
	implements
		br
		.smat
		.ejb
		.pontofiscalizacaoramotividade
		.PontoFiscalizacaoRamoAtividadeLocalHome {
	/**
	 * EJSLocalBMPPontoFiscalizacaoRamoAtividadeHome_7687b9ec
	 * @generated
	 */
	public EJSLocalBMPPontoFiscalizacaoRamoAtividadeHome_7687b9ec() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacaoramotividade
		.PontoFiscalizacaoRamoAtividadeLocal create(
			int pontoFiscalizacao,
			int ramoAtividade)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.ejb
			.pontofiscalizacaoramotividade
			.PontoFiscalizacaoRamoAtividadeLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoramotividade
						.EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(pontoFiscalizacao, ramoAtividade);
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
		.pontofiscalizacaoramotividade
		.PontoFiscalizacaoRamoAtividadeLocal findByPrimaryKey(
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.ejb
			.pontofiscalizacaoramotividade
			.PontoFiscalizacaoRamoAtividadeLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoramotividade
						.EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec) container
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
				.pontofiscalizacaoramotividade
				.EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoramotividade
						.EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec) container
						.preInvoke(
					this,
					2,
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
				container.postInvoke(this, 2, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
