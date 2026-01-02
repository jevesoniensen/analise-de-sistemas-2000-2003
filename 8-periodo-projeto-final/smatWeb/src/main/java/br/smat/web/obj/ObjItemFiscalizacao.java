package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.struts.digester.SetNextRule;

import br.smat.ejb.itemfiscalizacao.ItemFiscalizacao;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoHome;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjItemFiscalizacao {

	private int 	itemFiscalizacao;
	private String nome;

	/**
	 * Constructor for ObjItemFiscalizacao.
	 */
	public ObjItemFiscalizacao(int 	itemFiscalizacao,String nome) {		
		super();
		this.nome = nome;
		this.itemFiscalizacao = itemFiscalizacao;
	}
	
	public static Collection findAllItemFiscalizacao() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				ItemFiscalizacaoHome home = (ItemFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/itemfiscalizacao/ItemFiscalizacaoHome");
					try {
						col = (Collection)home.findAllItemFiscalizacao();
					} catch (RemoteException e) {
						throw new Exception(" ObjFonte findAllItemFiscalizacao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjFonte findAllItemFiscalizacao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjFonte findAllItemFiscalizacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjFonte findAllItemFiscalizacao NamingException=> " + e.getMessage());
			}
			return col;			 		
	}		
	
	public void save() throws Exception{
		
		try {
			InitialContext ctx = new InitialContext();
					
			ItemFiscalizacaoHome home = (ItemFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/itemfiscalizacao/ItemFiscalizacaoHome");
					
			ItemFiscalizacao itemFiscalizacaoH = null;
			
			if(this.itemFiscalizacao == 0){
				itemFiscalizacaoH = home.create(nome);	
				this.itemFiscalizacao = itemFiscalizacaoH.getItemFiscalizacao();	
			}
			else{
				itemFiscalizacaoH = home.findByPrimaryKey(new ItemFiscalizacaoKey(this.itemFiscalizacao));

				itemFiscalizacaoH.setNome(this.nome);	
			}
			
			
		} catch (RemoteException e) {
			throw new Exception("ObjFonte save Exception=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjFonte save Exception=> " + e.getMessage());			
		} catch (CreateException e) {
			throw new Exception("ObjFonte save Exception=> " + e.getMessage());			
		} catch (FinderException e) {
			throw new Exception("ObjFonte save Exception=> " + e.getMessage());
		}			
	}
	
	public static void remove(int itemFiscalizacao) throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			ItemFiscalizacaoHome home = (ItemFiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/itemfiscalizacao/ItemFiscalizacaoHome");
					
			
			ItemFiscalizacao itemFiscalizacaoH = home.findByPrimaryKey(new ItemFiscalizacaoKey(itemFiscalizacao));
	
			itemFiscalizacaoH.remove();						
			
			
		} catch (RemoteException e) {
			throw new Exception("ObjFonte remove Exception=> " + e.getMessage());			
		} catch (NamingException e) {
			throw new Exception("ObjFonte remove Exception=> " + e.getMessage());			
		} catch (FinderException e) {
			throw new Exception("ObjFonte remove Exception=> " + e.getMessage());			
		} catch (RemoveException e) {
			throw new Exception("ObjFonte remove Exception=> " + e.getMessage());
		}			
	}

	/**
	 * Returns the itemFiscalizacao.
	 * @return int
	 */
	public int getItemFiscalizacao() {
		return itemFiscalizacao;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(int itemFiscalizacao) {
		this.itemFiscalizacao = itemFiscalizacao;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
