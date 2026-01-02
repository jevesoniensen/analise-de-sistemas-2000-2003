package br.smat.ejb.acidente;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPAcidenteHome_d1942e0c
 * @generated
 */
public class EJSLocalBMPAcidenteHome_d1942e0c
	extends EJSLocalWrapper
	implements br.smat.ejb.acidente.AcidenteLocalHome {
	/**
	 * EJSLocalBMPAcidenteHome_d1942e0c
	 * @generated
	 */
	public EJSLocalBMPAcidenteHome_d1942e0c() {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.acidente.AcidenteLocal findByPrimaryKey(
		br.smat.ejb.acidente.AcidenteKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.acidente.AcidenteLocal _EJS_result = null;
		try {
			br.smat.ejb.acidente.EJSBMPAcidenteHomeBean_d1942e0c _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.acidente
						.EJSBMPAcidenteHomeBean_d1942e0c) container
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
			br.smat.ejb.acidente.EJSBMPAcidenteHomeBean_d1942e0c _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.acidente
						.EJSBMPAcidenteHomeBean_d1942e0c) container
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
	public br.smat.ejb.acidente.AcidenteLocal create(
		int area,
		int vinculoEmpregaticio,
		int ocupacao,
		int localAtendimento,
		int empregador,
		int medico,
		int diagnostico,
		int fonte,
		int agenteCausador,
		int tipoLocalAcidente,
		int trabalhador,
		int empregadorTerceiro,
		int tipoAcidente,
		int emitente,
		int municipio,
		java.lang.String dataAcidente,
		java.lang.String registroPolicial,
		java.lang.String amputacao,
		java.lang.String obito,
		int horasTrabalhadas,
		java.lang.String descLocalAcidente,
		java.lang.String numDocFonte,
		java.lang.String dataEmissaoFonte,
		java.lang.String naturezaLesao,
		java.lang.String dataHoraDiagnostico,
		java.lang.String afastamento,
		java.lang.String internacao,
		java.lang.String observacaoDiagnostico,
		int duracaoTratamento,
		java.lang.String aposentado,
		float remuneracao,
		java.lang.String distritoSaude,
		java.lang.String ultimaTrabalhado,
		java.lang.String descricaoSituacaoGeradora,
		java.lang.String descricaoDiagnostico)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.acidente.AcidenteLocal _EJS_result = null;
		try {
			br.smat.ejb.acidente.EJSBMPAcidenteHomeBean_d1942e0c _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.acidente
						.EJSBMPAcidenteHomeBean_d1942e0c) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(
					area,
					vinculoEmpregaticio,
					ocupacao,
					localAtendimento,
					empregador,
					medico,
					diagnostico,
					fonte,
					agenteCausador,
					tipoLocalAcidente,
					trabalhador,
					empregadorTerceiro,
					tipoAcidente,
					emitente,
					municipio,
					dataAcidente,
					registroPolicial,
					amputacao,
					obito,
					horasTrabalhadas,
					descLocalAcidente,
					numDocFonte,
					dataEmissaoFonte,
					naturezaLesao,
					dataHoraDiagnostico,
					afastamento,
					internacao,
					observacaoDiagnostico,
					duracaoTratamento,
					aposentado,
					remuneracao,
					distritoSaude,
					ultimaTrabalhado,
					descricaoSituacaoGeradora,
					descricaoDiagnostico);
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
	 * findAllAcidentes
	 * @generated
	 */
	public java.util.Collection findAllAcidentes()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br.smat.ejb.acidente.EJSBMPAcidenteHomeBean_d1942e0c _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.acidente
						.EJSBMPAcidenteHomeBean_d1942e0c) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllAcidentes_Local();
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
}
