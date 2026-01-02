package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.medidacorretivainvestigacao.MedidaCorretivaInvestigacao;
import br.smat.ejb.medidacorretivainvestigacao.MedidaCorretivaInvestigacaoHome;
import br.smat.ejb.medidacorretivainvestigacao.MedidaCorretivaInvestigacaoKey;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjMedidaCorretivaInvestigacao {
	
	

	private int		investigacao;
	private int		tipoMedidaCorretiva;	
	private int		prazoDias;
	private String		observacao;

	/**
	 * Constructor for ObjMedidaCorretivaFiscalizacao.
	 */
	public ObjMedidaCorretivaInvestigacao(	int		investigacao,
											int		tipoMedidaCorretiva,
											int		prazoDias,
											String		observacao)
		throws Exception{
		
		this.investigacao 	= investigacao;
		this.tipoMedidaCorretiva	= tipoMedidaCorretiva;
		this.prazoDias				= prazoDias;
		this.observacao			= observacao;
	}


	public void save() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			MedidaCorretivaInvestigacaoHome home = (MedidaCorretivaInvestigacaoHome)ctx.lookup("ejb/br/smat/ejb/medidacorretivainvestigacao/MedidaCorretivaInvestigacaoHome");
			MedidaCorretivaInvestigacao	 	medidaCorretivaInvestigacao 	= null;		

			medidaCorretivaInvestigacao = home.create(investigacao,tipoMedidaCorretiva,prazoDias,observacao);
		
			
		} catch (RemoteException e) {
				throw new  Exception("ObjMedidaCorretivaInvestigacao RemoteException Erro ao inserir medida corretiva " + e.getMessage());							
		} catch (NamingException e) {
				throw new  Exception("ObjMedidaCorretivaInvestigacao NamingException Erro ao inserir medida corretiva " + e.getMessage());							
		} catch (CreateException e) {
				throw new  Exception("ObjMedidaCorretivaInvestigacao CreateException Erro ao inserir medida corretiva " + e.getMessage());							
		} 	
	}

	public static MedidaCorretivaInvestigacao findByPrimaryKey(int investigacao,int tipoMedidaCorretiva) throws Exception{
		
		MedidaCorretivaInvestigacao	 	medidaCorretivaInvestigacao 	= null;		
					
		try {
			InitialContext ctx = new InitialContext();
					
			MedidaCorretivaInvestigacaoHome home = (MedidaCorretivaInvestigacaoHome)ctx.lookup("ejb/br/smat/ejb/medidacorretivainvestigacao/MedidaCorretivaInvestigacaoHome");

			medidaCorretivaInvestigacao = home.findByPrimaryKey(new MedidaCorretivaInvestigacaoKey(investigacao,tipoMedidaCorretiva));
		
			
		} catch (RemoteException e) {
				throw new  Exception("ObjMedidaCorretivaInvestigacao RemoteException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (NamingException e) {
				throw new  Exception("ObjMedidaCorretivaInvestigacao NamingException Erro ao inserir fiscalização " + e.getMessage());							
		} 
		
		return medidaCorretivaInvestigacao;
	}

}
