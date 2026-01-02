package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.relatoriosalvo.RelatorioSalvo;
import br.smat.ejb.relatoriosalvo.RelatorioSalvoHome;
import br.smat.ejb.relatoriosalvo.RelatorioSalvoKey;


/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjRelatorioSalvo {
	
	
	public static Collection findAllRelatorios() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				RelatorioSalvoHome home = (RelatorioSalvoHome)ctx.lookup("ejb/br/smat/ejb/relatoriosalvo/RelatorioSalvoHome");
					try {
						col = (Collection)home.findAllRelatorios();
					} catch (RemoteException e) {
						throw new Exception(" ObjRelatorioSalvo findAllRelatorios RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjRelatorioSalvo findAllRelatorios FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjRelatorioSalvo findAllRelatorios Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjRelatorioSalvo findAllRelatorios NamingException=> " + e.getMessage());
			}
			return col;			 		
	}

	public static RelatorioSalvo findByPrimaryKey(int relatorio) throws Exception{		
			InitialContext ctx;
			RelatorioSalvo relSalvo = null;
			
			try {
				ctx = new InitialContext();
				RelatorioSalvoHome home = (RelatorioSalvoHome)ctx.lookup("ejb/br/smat/ejb/relatoriosalvo/RelatorioSalvoHome");
					try {
						relSalvo = home.findByPrimaryKey(new RelatorioSalvoKey(relatorio));
					} catch (RemoteException e) {
						throw new Exception(" ObjRelatorioSalvo findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjRelatorioSalvo findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjRelatorioSalvo findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjRelatorioSalvo findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return relSalvo;			 		
	}	
}
