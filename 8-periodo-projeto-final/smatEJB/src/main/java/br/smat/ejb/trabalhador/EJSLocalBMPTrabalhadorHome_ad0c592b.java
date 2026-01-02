package br.smat.ejb.trabalhador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTrabalhadorHome_ad0c592b
 * @generated
 */
public class EJSLocalBMPTrabalhadorHome_ad0c592b
	extends EJSLocalWrapper
	implements br.smat.ejb.trabalhador.TrabalhadorLocalHome {
	/**
	 * EJSLocalBMPTrabalhadorHome_ad0c592b
	 * @generated
	 */
	public EJSLocalBMPTrabalhadorHome_ad0c592b() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.trabalhador.TrabalhadorLocal create(
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
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.trabalhador.TrabalhadorLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.trabalhador
				.EJSBMPTrabalhadorHomeBean_ad0c592b _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.trabalhador
						.EJSBMPTrabalhadorHomeBean_ad0c592b) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(
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
	public br.smat.ejb.trabalhador.TrabalhadorLocal findByPrimaryKey(
		br.smat.ejb.trabalhador.TrabalhadorKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.trabalhador.TrabalhadorLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.trabalhador
				.EJSBMPTrabalhadorHomeBean_ad0c592b _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.trabalhador
						.EJSBMPTrabalhadorHomeBean_ad0c592b) container
						.preInvoke(
					this,
					2,
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
	 * findAllTrabalhadores
	 * @generated
	 */
	public java.util.Collection findAllTrabalhadores()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.trabalhador
				.EJSBMPTrabalhadorHomeBean_ad0c592b _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.trabalhador
						.EJSBMPTrabalhadorHomeBean_ad0c592b) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllTrabalhadores_Local();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
				.trabalhador
				.EJSBMPTrabalhadorHomeBean_ad0c592b _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.trabalhador
						.EJSBMPTrabalhadorHomeBean_ad0c592b) container
						.preInvoke(
					this,
					4,
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
	 * findByAcidente
	 * @generated
	 */
	public br.smat.ejb.trabalhador.TrabalhadorLocal findByAcidente(
		int acidente)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.trabalhador.TrabalhadorLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.trabalhador
				.EJSBMPTrabalhadorHomeBean_ad0c592b _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.trabalhador
						.EJSBMPTrabalhadorHomeBean_ad0c592b) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByAcidente_Local(acidente);
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
}
