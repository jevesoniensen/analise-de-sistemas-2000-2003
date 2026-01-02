package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.locallesao.LocalLesao;
import br.smat.ejb.locallesao.LocalLesaoHome;
import br.smat.ejb.locallesao.LocalLesaoKey;
import br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjLocalLesao {

	private int 	localLesao;
	private String nome;
	private int 	localLesaoPai;
	
	/**
	 * Constructor for ObjLocalLesao.
	 */
	public ObjLocalLesao(	int 	localLesao,
							String 	nome,
							int 	localLesaoPai) {
		super();
		this.localLesao 	= localLesao;
		this.nome			= nome;
		this.localLesaoPai	= localLesaoPai;
	}

	public ObjLocalLesao(	int 	localLesao) {
		super();
		this.localLesao 	= localLesao;
	}
	
	/**
	 * Constructor for ObjLocalLesao.
	 */
	public ObjLocalLesao() {
		super();
	}	
	
	public static LocalLesao findByPrimaryKey(int localLesao) throws Exception{		
			InitialContext ctx;
			LocalLesao ls = null;
			try {
				ctx = new InitialContext();
				LocalLesaoHome home = (LocalLesaoHome)ctx.lookup("ejb/br/smat/ejb/locallesao/LocalLesaoHome");
				ls = (LocalLesao)home.findByPrimaryKey(new LocalLesaoKey(localLesao));
			}catch (NamingException e) {
				throw new Exception("ObjLocalLesao findByPrimaryKey NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjLocalLesao findByPrimaryKey RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjLocalLesao findByPrimaryKey FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjLocalLesao findByPrimaryKey Exception=> " + e.getMessage());
			}
			return ls;			 		
	}	
	
	public static Collection findAllLocaisLesao() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				LocalLesaoHome home = (LocalLesaoHome)ctx.lookup("ejb/br/smat/ejb/locallesao/LocalLesaoHome");
				col = (Collection)home.findAllLocaisLesao();
			}catch (NamingException e) {
				throw new Exception("ObjLocalLesao findAllLocaisLesao NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjLocalLesao findAllLocaisLesao RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjLocalLesao findAllLocaisLesao FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjLocalLesao findAllLocaisLesao Exception=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllLocaisLesao(int pai) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				LocalLesaoHome home = (LocalLesaoHome)ctx.lookup("ejb/br/smat/ejb/locallesao/LocalLesaoHome");
				col = (Collection)home.findAllLocaisLesao(pai);
			}catch (NamingException e) {
				throw new Exception("ObjLocalLesao findAllLocaisLesao NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjLocalLesao findAllLocaisLesao RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjLocalLesao findAllLocaisLesao FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjLocalLesao findAllLocaisLesao Exception=> " + e.getMessage());
			}
			return col;			 		
	}		

	public void save()  throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			LocalLesaoHome home = (LocalLesaoHome)ctx.lookup("ejb/br/smat/ejb/locallesao/LocalLesaoHome");
			
			LocalLesao localLesaoH= null;		
			
			if(localLesao == 0){
				localLesaoH = home.create(nome,localLesaoPai);	
				
				this.localLesao = localLesaoH.getLocalLesao();
			}
			else{
				localLesaoH = home.findByPrimaryKey(new LocalLesaoKey(localLesao));

				localLesaoH.setNome(nome);
			}
			
			
		} catch (RemoteException e) {
			throw new Exception("ObjLocalLesao save RemoteException=> " + e.getMessage());						
		} catch (NamingException e) {
			throw new Exception("ObjLocalLesao save NamingException=> " + e.getMessage());						
		} catch (CreateException e) {
			throw new Exception("ObjLocalLesao save CreateException=> " + e.getMessage());						
		} catch (FinderException e) {
			throw new Exception("ObjLocalLesao save FinderException=> " + e.getMessage());						
		}		
	}
	
	public void remove() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			LocalLesaoHome home = (LocalLesaoHome)ctx.lookup("ejb/br/smat/ejb/locallesao/LocalLesaoHome");
			
			LocalLesao localLesaoH = home.findByPrimaryKey(new LocalLesaoKey(localLesao));
	
			localLesaoH.remove();

		} catch (RemoteException e) {
			throw new Exception("ObjLocalLesao remove RemoteException=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjLocalLesao remove NamingException=> " + e.getMessage());			
		} catch (FinderException e) {
			throw new Exception("ObjLocalLesao remove FinderException=> " + e.getMessage());			
		} catch (RemoveException e) {
			throw new Exception("ObjLocalLesao remove RemoteException=> " + e.getMessage());			
		} catch (Exception e) {			
			throw new Exception("ObjLocalLesao remove Exception=> " + e.getMessage());			
		} 		
	}

	/**
	 * Returns the localLesao.
	 * @return int
	 */
	public int getLocalLesao() {
		return localLesao;
	}

	/**
	 * Returns the localLesaoPai.
	 * @return LocalLesaoKey
	 */
	public int getLocalLesaoPai() {
		return localLesaoPai;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the localLesao.
	 * @param localLesao The localLesao to set
	 */
	public void setLocalLesao(int localLesao) {
		this.localLesao = localLesao;
	}

	/**
	 * Sets the localLesaoPai.
	 * @param localLesaoPai The localLesaoPai to set
	 */
	public void setLocalLesaoPai(int localLesaoPai) {
		this.localLesaoPai = localLesaoPai;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
