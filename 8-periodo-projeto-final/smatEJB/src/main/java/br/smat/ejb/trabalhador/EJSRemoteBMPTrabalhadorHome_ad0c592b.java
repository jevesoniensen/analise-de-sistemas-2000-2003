package br.smat.ejb.trabalhador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPTrabalhadorHome_ad0c592b
 * @generated
 */
public class EJSRemoteBMPTrabalhadorHome_ad0c592b
	extends EJSWrapper
	implements br.smat.ejb.trabalhador.TrabalhadorHome {
	/**
	 * EJSRemoteBMPTrabalhadorHome_ad0c592b
	 * @generated
	 */
	public EJSRemoteBMPTrabalhadorHome_ad0c592b()
		throws java.rmi.RemoteException {
		super();
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
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.trabalhador.Trabalhador _EJS_result = null;
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
				_EJS_beanRef.create(
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
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.trabalhador.Trabalhador findByPrimaryKey(
		br.smat.ejb.trabalhador.TrabalhadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.trabalhador.Trabalhador _EJS_result = null;
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
			_EJS_result = _EJS_beanRef.findByPrimaryKey(primaryKey);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
		return _EJS_result;
	}
	/**
	 * findAllTrabalhadores
	 * @generated
	 */
	public java.util.Collection findAllTrabalhadores()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
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
			_EJS_result = _EJS_beanRef.findAllTrabalhadores();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
		return _EJS_result;
	}
	/**
	 * getEJBMetaData
	 * @generated
	 */
	public javax.ejb.EJBMetaData getEJBMetaData()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		javax.ejb.EJBMetaData _EJS_result = null;
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
			_EJS_result = _EJS_beanRef.getEJBMetaData();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getHomeHandle
	 * @generated
	 */
	public javax.ejb.HomeHandle getHomeHandle()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		javax.ejb.HomeHandle _EJS_result = null;
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
					5,
					_EJS_s);
			_EJS_result = _EJS_beanRef.getHomeHandle();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws java.rmi.RemoteException, javax.ejb.RemoveException {
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
					6,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 6, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(javax.ejb.Handle arg0)
		throws java.rmi.RemoteException, javax.ejb.RemoveException {
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
					7,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 7, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * findByAcidente
	 * @generated
	 */
	public br.smat.ejb.trabalhador.Trabalhador findByAcidente(int acidente)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.trabalhador.Trabalhador _EJS_result = null;
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
			_EJS_result = _EJS_beanRef.findByAcidente(acidente);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
}
