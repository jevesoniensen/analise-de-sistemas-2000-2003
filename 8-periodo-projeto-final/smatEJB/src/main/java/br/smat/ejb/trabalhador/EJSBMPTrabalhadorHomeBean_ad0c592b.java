package br.smat.ejb.trabalhador;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTrabalhadorHomeBean_ad0c592b
 * @generated
 */
public class EJSBMPTrabalhadorHomeBean_ad0c592b extends EJSHome {
	/**
	 * EJSBMPTrabalhadorHomeBean_ad0c592b
	 * @generated
	 */
	public EJSBMPTrabalhadorHomeBean_ad0c592b()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllTrabalhadores
	 * @generated
	 */
	public java.util.Collection findAllTrabalhadores()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TrabalhadorBean bean = (TrabalhadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTrabalhadores();
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
	 * findByPrimaryKey
	 * @generated
	 */
	public Trabalhador findByPrimaryKey(
		br.smat.ejb.trabalhador.TrabalhadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Trabalhador _EJS_bmp = (Trabalhador) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.trabalhador.TrabalhadorKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TrabalhadorBean _EJS_bean =
					(TrabalhadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.trabalhador
							.TrabalhadorKey) _EJS_bean
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
				(Trabalhador) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.trabalhador.Trabalhador create(
		int municipio,
		int ufRG,
		int ufCTPS,
		int estadoCivil,
		java.lang.String nome,
		java.lang.String cpf,
		java.lang.String rg,
		int carteiraTrabalho,
		int serie,
		java.lang.String dataEmissaoCTPS,
		java.lang.String dataNascimento,
		java.lang.String sexo,
		int numero,
		java.lang.String rua,
		java.lang.String bairro,
		java.lang.String cep,
		java.lang.String complemento,
		java.lang.String nomeResponsavel,
		java.lang.String dataEmissaoRG,
		java.lang.String orgaoExpedidorRG,
		java.lang.String pisPasepNit,
		java.lang.String telefone,
		java.lang.String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.trabalhador.Trabalhador result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.trabalhador.TrabalhadorBean bean =
				(br.smat.ejb.trabalhador.TrabalhadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.trabalhador.TrabalhadorKey _primaryKey =
				bean.ejbCreate(
					municipio,
					ufRG,
					ufCTPS,
					estadoCivil,
					nome,
					cpf,
					rg,
					carteiraTrabalho,
					serie,
					dataEmissaoCTPS,
					dataNascimento,
					sexo,
					numero,
					rua,
					bairro,
					cep,
					complemento,
					nomeResponsavel,
					dataEmissaoRG,
					orgaoExpedidorRG,
					pisPasepNit,
					telefone,
					ddd);
			result =
				(br.smat.ejb.trabalhador.Trabalhador) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				municipio,
				ufRG,
				ufCTPS,
				estadoCivil,
				nome,
				cpf,
				rg,
				carteiraTrabalho,
				serie,
				dataEmissaoCTPS,
				dataNascimento,
				sexo,
				numero,
				rua,
				bairro,
				cep,
				complemento,
				nomeResponsavel,
				dataEmissaoRG,
				orgaoExpedidorRG,
				pisPasepNit,
				telefone,
				ddd);
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
	 * findAllTrabalhadores_Local
	 * @generated
	 */
	public java.util.Collection findAllTrabalhadores_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TrabalhadorBean bean = (TrabalhadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTrabalhadores();
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
	/**
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public TrabalhadorLocal findByPrimaryKey_Local(
		br.smat.ejb.trabalhador.TrabalhadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TrabalhadorLocal _EJS_bmp =
			(TrabalhadorLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.trabalhador.TrabalhadorKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TrabalhadorBean _EJS_bean =
					(TrabalhadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.trabalhador
							.TrabalhadorKey) _EJS_bean
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
				(TrabalhadorLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.trabalhador.TrabalhadorLocal create_Local(
		int municipio,
		int ufRG,
		int ufCTPS,
		int estadoCivil,
		java.lang.String nome,
		java.lang.String cpf,
		java.lang.String rg,
		int carteiraTrabalho,
		int serie,
		java.lang.String dataEmissaoCTPS,
		java.lang.String dataNascimento,
		java.lang.String sexo,
		int numero,
		java.lang.String rua,
		java.lang.String bairro,
		java.lang.String cep,
		java.lang.String complemento,
		java.lang.String nomeResponsavel,
		java.lang.String dataEmissaoRG,
		java.lang.String orgaoExpedidorRG,
		java.lang.String pisPasepNit,
		java.lang.String telefone,
		java.lang.String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.trabalhador.TrabalhadorLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.trabalhador.TrabalhadorBean bean =
				(br.smat.ejb.trabalhador.TrabalhadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.trabalhador.TrabalhadorKey _primaryKey =
				bean.ejbCreate(
					municipio,
					ufRG,
					ufCTPS,
					estadoCivil,
					nome,
					cpf,
					rg,
					carteiraTrabalho,
					serie,
					dataEmissaoCTPS,
					dataNascimento,
					sexo,
					numero,
					rua,
					bairro,
					cep,
					complemento,
					nomeResponsavel,
					dataEmissaoRG,
					orgaoExpedidorRG,
					pisPasepNit,
					telefone,
					ddd);
			result =
				(
					br
						.smat
						.ejb
						.trabalhador
						.TrabalhadorLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				municipio,
				ufRG,
				ufCTPS,
				estadoCivil,
				nome,
				cpf,
				rg,
				carteiraTrabalho,
				serie,
				dataEmissaoCTPS,
				dataNascimento,
				sexo,
				numero,
				rua,
				bairro,
				cep,
				complemento,
				nomeResponsavel,
				dataEmissaoRG,
				orgaoExpedidorRG,
				pisPasepNit,
				telefone,
				ddd);
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
	 * findByAcidente
	 * @generated
	 */
	public br.smat.ejb.trabalhador.Trabalhador findByAcidente(int acidente)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		br.smat.ejb.trabalhador.Trabalhador result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TrabalhadorBean bean = (TrabalhadorBean) beanO.getEnterpriseBean();
			br.smat.ejb.trabalhador.TrabalhadorKey pKey =
				bean.ejbFindByAcidente(acidente);
			result =
				(br.smat.ejb.trabalhador.Trabalhador) super.activateBean(
					(java.lang.Object) pKey);
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
	 * findByAcidente_Local
	 * @generated
	 */
	public br.smat.ejb.trabalhador.TrabalhadorLocal findByAcidente_Local(
		int acidente)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		br.smat.ejb.trabalhador.TrabalhadorLocal result = null;
		EntityBeanO beanO = null;

		br.smat.ejb.trabalhador.TrabalhadorKey pKey = null;
		try {
			beanO = super.getFinderEntityBeanO();
			TrabalhadorBean bean = (TrabalhadorBean) beanO.getEnterpriseBean();
			pKey = bean.ejbFindByAcidente(acidente);
			result =
				(br
					.smat
					.ejb
					.trabalhador
					.TrabalhadorLocal) activateBean_Local(pKey);
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
