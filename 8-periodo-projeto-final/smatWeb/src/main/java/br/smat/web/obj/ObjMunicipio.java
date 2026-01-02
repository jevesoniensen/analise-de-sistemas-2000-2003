package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.naming.InitialContext;

import br.smat.ejb.municipio.Municipio;
import br.smat.ejb.municipio.MunicipioHome;
import br.smat.ejb.municipio.MunicipioKey;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjMunicipio {
	public ObjMunicipio(){
	}

	public static Municipio findByPrimaryKey(int municipio) throws Exception{	
			InitialContext ctx;
			Municipio col = null;
			if(municipio > 0){	
				try {
					ctx = new InitialContext();
					MunicipioHome home = (MunicipioHome)ctx.lookup("ejb/br/smat/ejb/municipio/MunicipioHome");
						try {
							col = (Municipio)home.findByPrimaryKey(new MunicipioKey(municipio));
						} catch (RemoteException e) {
							throw new Exception(" ObjMunicipio findByPrimaryKey RemoteException=> " + e.getMessage());
						} catch (FinderException e) {
							throw new Exception("ObjMunicipio findByPrimaryKey FinderException=> " + e.getMessage());
						} catch (Exception e) {
							throw new Exception("ObjMunicipio findByPrimaryKey Exception=> " + e.getMessage());
						}								
				} catch (NamingException e) {
					throw new Exception("ObjMunicipio findByPrimaryKey NamingException=> " + e.getMessage());
				}
			}
			return col;			 		
	}	
	
	public static Collection findAllMunicipios() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				MunicipioHome home = (MunicipioHome)ctx.lookup("ejb/br/smat/ejb/municipio/MunicipioHome");
					try {
						col = (Collection)home.findAllMunicipios();
					} catch (RemoteException e) {
						throw new Exception(" ObjMunicipio findAllMunicipios RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjMunicipio findAllMunicipios FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjMunicipio findAllMunicipios Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjMunicipio findAllMunicipios NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllMunicipios(int estado) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				MunicipioHome home = (MunicipioHome)ctx.lookup("ejb/br/smat/ejb/municipio/MunicipioHome");
					try {
						col = (Collection)home.findAllMunicipios(estado);
					} catch (RemoteException e) {
						throw new Exception(" ObjMunicipio findAllMunicipios RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjMunicipio findAllMunicipios FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjMunicipio findAllMunicipios Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjMunicipio findAllMunicipios NamingException=> " + e.getMessage());
			}
			return col;			 		
	}

	public static Collection findAllMunicipiosByRegional(int regional) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				MunicipioHome home = (MunicipioHome)ctx.lookup("ejb/br/smat/ejb/municipio/MunicipioHome");
					try {
						col = (Collection)home.findAllMunicipiosByRegional(regional);
					} catch (RemoteException e) {
						throw new Exception(" ObjMunicipio findAllMunicipiosByRegional RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjMunicipio findAllMunicipiosByRegional FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjMunicipio findAllMunicipiosByRegional Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjMunicipio findAllMunicipiosByRegional NamingException=> " + e.getMessage());
			}
			return col;			 		
	}			
}
