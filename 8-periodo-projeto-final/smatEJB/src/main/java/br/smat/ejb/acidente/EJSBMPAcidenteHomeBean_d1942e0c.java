package br.smat.ejb.acidente;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPAcidenteHomeBean_d1942e0c
 * @generated
 */
public class EJSBMPAcidenteHomeBean_d1942e0c extends EJSHome {
	/**
	 * EJSBMPAcidenteHomeBean_d1942e0c
	 * @generated
	 */
	public EJSBMPAcidenteHomeBean_d1942e0c() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public Acidente findByPrimaryKey(
		br.smat.ejb.acidente.AcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Acidente _EJS_bmp = (Acidente) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.acidente.AcidenteKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				AcidenteBean _EJS_bean =
					(AcidenteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.acidente
							.AcidenteKey) _EJS_bean
							.ejbFindByPrimaryKey(
						primaryKey);
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
			} catch (javax.ejb.FinderException finderEx) {
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
				throw finderEx;
			} finally {
				if (_EJS_beanO != null)
					super.discardFinderEntityBeanO(_EJS_beanO);
			}
			_EJS_bmp =
				(Acidente) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public AcidenteLocal findByPrimaryKey_Local(
		br.smat.ejb.acidente.AcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		AcidenteLocal _EJS_bmp =
			(AcidenteLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.acidente.AcidenteKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				AcidenteBean _EJS_bean =
					(AcidenteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.acidente
							.AcidenteKey) _EJS_bean
							.ejbFindByPrimaryKey(
						primaryKey);
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
			} catch (javax.ejb.FinderException finderEx) {
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
				throw finderEx;
			} finally {
				if (_EJS_beanO != null)
					super.discardFinderEntityBeanO(_EJS_beanO);
			}
			_EJS_bmp =
				(AcidenteLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.acidente.Acidente create(
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
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.acidente.Acidente result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.acidente.AcidenteBean bean =
				(br.smat.ejb.acidente.AcidenteBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.acidente.AcidenteKey _primaryKey =
				bean.ejbCreate(
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
			result =
				(br.smat.ejb.acidente.Acidente) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
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
			super.afterPostCreate(beanO, _primaryKey);
		} catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if (preCreateFlag && !createFailed)
				super.afterPostCreateCompletion(beanO);
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.acidente.AcidenteLocal create_Local(
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
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.acidente.AcidenteLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.acidente.AcidenteBean bean =
				(br.smat.ejb.acidente.AcidenteBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.acidente.AcidenteKey _primaryKey =
				bean.ejbCreate(
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
			result =
				(br.smat.ejb.acidente.AcidenteLocal) super.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
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
			super.afterPostCreate(beanO, _primaryKey);
		} catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if (preCreateFlag && !createFailed)
				super.afterPostCreateCompletion(beanO);
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
	/**
	 * findAllAcidentes
	 * @generated
	 */
	public java.util.Collection findAllAcidentes()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AcidenteBean bean = (AcidenteBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAcidentes();
			result = super.getCMP20Collection(pKeys);
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
		} catch (javax.ejb.FinderException finderEx) {
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
			throw finderEx;
		} finally {
			if (beanO != null)
				super.discardFinderEntityBeanO(beanO);
		}
		return result;
	}
	/**
	 * findAllAcidentes_Local
	 * @generated
	 */
	public java.util.Collection findAllAcidentes_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AcidenteBean bean = (AcidenteBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAcidentes();
			result = super.getCMP20Collection_Local(pKeys);
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
		} catch (javax.ejb.FinderException finderEx) {
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
			throw finderEx;
		} finally {
			if (beanO != null)
				super.discardFinderEntityBeanO(beanO);
		}
		return result;
	}
}
