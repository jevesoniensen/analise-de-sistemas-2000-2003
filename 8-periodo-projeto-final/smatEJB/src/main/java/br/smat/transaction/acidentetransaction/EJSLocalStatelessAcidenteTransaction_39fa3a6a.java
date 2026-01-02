package br.smat.transaction.acidentetransaction;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalStatelessAcidenteTransaction_39fa3a6a
 * @generated
 */
public class EJSLocalStatelessAcidenteTransaction_39fa3a6a
	extends EJSLocalWrapper
	implements br.smat.transaction.acidentetransaction.AcidenteTransactionLocal {
	/**
	 * EJSLocalStatelessAcidenteTransaction_39fa3a6a
	 * @generated
	 */
	public EJSLocalStatelessAcidenteTransaction_39fa3a6a() {
		super();
	}
	/**
	 * armazenaAcidente
	 * @generated
	 */
	public java.lang.String armazenaAcidente(
		int acidente,
		int empresa,
		int emitente,
		java.lang.String nome,
		java.lang.String nomeResponsavel,
		java.lang.String dataNascimento,
		java.lang.String sexo,
		int estadoCivil,
		int ctps,
		int serie,
		java.lang.String dataEmissaoCTPS,
		int ufCTPS,
		java.lang.String remuneracaoMensal,
		java.lang.String rg,
		java.lang.String dataEmissaoRG,
		java.lang.String orgaoExpedidorRG,
		int ufRG,
		java.lang.String cpf,
		java.lang.String pisPasepNit,
		int municipio,
		java.lang.String rua,
		int numero,
		java.lang.String bairro,
		java.lang.String complemento,
		java.lang.String cep,
		java.lang.String ddd,
		java.lang.String telefone,
		int vinculoEmpregaticio,
		int ocupacao,
		int area,
		java.lang.String aposentado,
		int trabalhador,
		int empresaTerceira,
		java.lang.String dataAcidente,
		java.lang.String hora,
		int horasTrabalhadas,
		int tipoAcidente,
		java.lang.String dataUltimodiaTrab,
		int tipoLocalAcidente,
		java.lang.String descricaoLocal,
		int estadoAcidente,
		int municipioAcidente,
		int[] localLesaoAcidente,
		int agenteCausador,
		java.lang.String descricaoSituacaoGeradora,
		java.lang.String registroPolicial,
		java.lang.String amputacao,
		java.lang.String obito,
		br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha[] vTestemunhas,
		int medico,
		java.lang.String nomeMedico,
		int localAtendimento,
		java.lang.String dataAtestado,
		java.lang.String horaAtestado,
		java.lang.String internacao,
		java.lang.String afastamento,
		int duracaoTratamento,
		java.lang.String descNaturezaLesao,
		int diagnostico,
		java.lang.String observacoes,
		int crm,
		int ufCRM,
		int fonte,
		java.lang.String numDocFonte,
		java.lang.String dataEmissaoFonte,
		java.lang.String distritoSaude,
		java.lang.String descricaoDiagnostico)
		throws java.lang.Exception {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br
				.smat
				.transaction
				.acidentetransaction
				.AcidenteTransactionBean beanRef =
				(
					br
						.smat
						.transaction
						.acidentetransaction
						.AcidenteTransactionBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				beanRef.armazenaAcidente(
					acidente,
					empresa,
					emitente,
					nome,
					nomeResponsavel,
					dataNascimento,
					sexo,
					estadoCivil,
					ctps,
					serie,
					dataEmissaoCTPS,
					ufCTPS,
					remuneracaoMensal,
					rg,
					dataEmissaoRG,
					orgaoExpedidorRG,
					ufRG,
					cpf,
					pisPasepNit,
					municipio,
					rua,
					numero,
					bairro,
					complemento,
					cep,
					ddd,
					telefone,
					vinculoEmpregaticio,
					ocupacao,
					area,
					aposentado,
					trabalhador,
					empresaTerceira,
					dataAcidente,
					hora,
					horasTrabalhadas,
					tipoAcidente,
					dataUltimodiaTrab,
					tipoLocalAcidente,
					descricaoLocal,
					estadoAcidente,
					municipioAcidente,
					localLesaoAcidente,
					agenteCausador,
					descricaoSituacaoGeradora,
					registroPolicial,
					amputacao,
					obito,
					vTestemunhas,
					medico,
					nomeMedico,
					localAtendimento,
					dataAtestado,
					horaAtestado,
					internacao,
					afastamento,
					duracaoTratamento,
					descNaturezaLesao,
					diagnostico,
					observacoes,
					crm,
					ufCRM,
					fonte,
					numDocFonte,
					dataEmissaoFonte,
					distritoSaude,
					descricaoDiagnostico);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * save
	 * @generated
	 */
	public void save() throws java.lang.Exception, javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.transaction
				.acidentetransaction
				.AcidenteTransactionBean beanRef =
				(
					br
						.smat
						.transaction
						.acidentetransaction
						.AcidenteTransactionBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			beanRef.save();
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
		return;
	}
}
