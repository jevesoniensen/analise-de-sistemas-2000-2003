package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.campo.Campo;
import br.smat.ejb.campo.CampoHome;
import br.smat.ejb.campo.CampoKey;
import br.smat.objetosauxiliares.auxcampo.AuxCampo;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjCampo {
	

	public static Collection ejbFindAllCampos() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				CampoHome home = (CampoHome)ctx.lookup("ejb/br/smat/ejb/campo/CampoHome");
					try {
						col = (Collection)home.findAllCampos();
					} catch (RemoteException e) {
						throw new Exception(" ObjCampo ejbFindAllCampos RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjCampo ejbFindAllCampos FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjCampo ejbFindAllCampos Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjCampo ejbFindAllCampos NamingException=> " + e.getMessage());
			}
			return col;			 		
	}

	public static Collection ejbFindAllCampos(int campo1) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				CampoHome home = (CampoHome)ctx.lookup("ejb/br/smat/ejb/campo/CampoHome");
					try {
						if(campo1 > 0)
							col = (Collection)home.findAllCampos(campo1);
					    else
					    	col = (Collection)home.findAllCampos();
					} catch (RemoteException e) {
						throw new Exception(" ObjCampo ejbFindAllCampos RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjCampo ejbFindAllCampos FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjCampo ejbFindAllCampos Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjCampo ejbFindAllCampos NamingException=> " + e.getMessage());
			}
			return col;			 		
	}

	public static AuxCampo[] getRegistros(int campo) throws Exception{		
			InitialContext ctx;
			AuxCampo aCampo = null;
			Campo objCampo = null;
			AuxCampo[] retVal = null;
			try {
				ctx = new InitialContext();
				CampoHome home = (CampoHome)ctx.lookup("ejb/br/smat/ejb/campo/CampoHome");
					try {
						objCampo = (Campo)home.findByPrimaryKey(new CampoKey(campo));
						retVal = objCampo.getRegistros();
						
					} catch (RemoteException e) {
						throw new Exception(" ObjCampo ejbFindAllCampos RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjCampo ejbFindAllCampos FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjCampo ejbFindAllCampos Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjCampo ejbFindAllCampos NamingException=> " + e.getMessage());
			}

			return retVal;			 		
	}
	
	public static AuxCampo[] getRegistrosFilhos(int campo) throws Exception{		
			InitialContext ctx;
			AuxCampo aCampo = null;
			Campo objCampo = null;
			AuxCampo[] retVal = null;
			try {
				ctx = new InitialContext();
				CampoHome home = (CampoHome)ctx.lookup("ejb/br/smat/ejb/campo/CampoHome");
					try {
						objCampo = (Campo)home.findByPrimaryKey(new CampoKey(campo));
						retVal = objCampo.getRegistrosFilhos();
						
					} catch (RemoteException e) {
						throw new Exception(" ObjCampo ejbFindAllCampos RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjCampo ejbFindAllCampos FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjCampo ejbFindAllCampos Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjCampo ejbFindAllCampos NamingException=> " + e.getMessage());
			}

			return retVal;			 		
	}	
}
