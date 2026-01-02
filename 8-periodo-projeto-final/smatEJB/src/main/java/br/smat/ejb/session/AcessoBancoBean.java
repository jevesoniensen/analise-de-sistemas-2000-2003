package br.smat.ejb.session;

import br.smat.conexao.*;
import br.smat.ejb.empregador.Empregador;
import br.smat.ejb.empregador.EmpregadorHome;
import br.smat.ejb.telefoneempregador.TelefoneEmpregador;
import br.smat.ejb.telefoneempregador.TelefoneEmpregadorHome;


import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.ejb.CreateException;
import javax.naming.*;

/**
 * Bean implementation class for Enterprise Bean: AcessoBanco
 */
public class AcessoBancoBean implements javax.ejb.SessionBean {
	private javax.ejb.SessionContext mySessionCtx;
	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}
	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}
	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {

	
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}
	
	public void cadastraAcidente(){

		System.out.println("chamou o cadastra acidente");
		
	
		InitialContext ctx = null;
		Object o = null,o1 = null;
				
		try {
			ctx = new InitialContext();
		} catch (NamingException e) {
		}

		try {
			o = ctx.lookup("ejb/br/smat/ejb/empregador/EmpregadorHome");
			o1 = ctx.lookup("ejb/br/smat/ejb/telefoneempregador/TelefoneEmpregadorHome");
		} catch (NamingException e) {
		}		
		
		EmpregadorHome home = (EmpregadorHome)o;

		TelefoneEmpregadorHome home1 = (TelefoneEmpregadorHome)o1;
		
		Empregador emp = null;
		TelefoneEmpregador tel = null;
		

			try {
				try {
					emp = home.create(1,1,1,"Nome","Doc",1,"RUA","Bairro","CEP","COMP");
				} catch (SQLException e) {
					System.out.println("erro na  SQLException tel");
				}
			} catch (RemoteException e) {
				System.out.println("erro na  RemoteException tel");
			} catch (CreateException e) {
				System.out.println("erro na  CreateException tel");
			}


			try {
				tel = home1.create(1,"DESC","TEL","DD");
			} catch (RemoteException e) {
				System.out.println("erro na  RemoteException tel");
			} catch (CreateException e) {
				System.out.println("erro na  CreateException tel");
				//throw new Exception("erro na exception");
			}
	
	}
}
