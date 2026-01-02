package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupo;
import br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoHome;
import br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjUsuarioGrupo {

	private int usuario;
	private int grupo;

	/**
	 * Constructor for ObjUsuarioGrupo.
	 */
	public ObjUsuarioGrupo(int usuario,int grupo) {
		super();
		this.usuario 	= usuario;
		this.grupo		= grupo;
	}

	public static UsuarioGrupo[] findAll() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				UsuarioGrupoHome home = (UsuarioGrupoHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/usuariogrupo/UsuarioGrupoHome");
					try {
						col = (Collection)home.findAll();
					} catch (RemoteException e) {
						throw new Exception(" ObjUsuarioGrupo findAll RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjUsuarioGrupo findAll FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjUsuarioGrupo findAll Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjUsuarioGrupo findAll NamingException=> " + e.getMessage());
			}
			return (UsuarioGrupo[])col.toArray(new UsuarioGrupo[0]);			 		
	}
	
	public static UsuarioGrupo findByPrimaryKey(int usuario,int grupo) throws Exception{		
			InitialContext ctx;
			UsuarioGrupo ug = null;
			try {
				ctx = new InitialContext();
				UsuarioGrupoHome home = (UsuarioGrupoHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/usuariogrupo/UsuarioGrupoHome");
					try {
						ug = home.findByPrimaryKey(new UsuarioGrupoKey(grupo,usuario));
					} catch (RemoteException e) {
						throw new Exception(" ObjUsuarioGrupo findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjUsuarioGrupo findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjUsuarioGrupo findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjUsuarioGrupo findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return ug;			 		
	}

	public void save() throws Exception{
		
		try {
			InitialContext ctx = new InitialContext();
					
			UsuarioGrupoHome home = (UsuarioGrupoHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/usuariogrupo/UsuarioGrupoHome");
			
			home.create(grupo,usuario);

		} catch (CreateException e) {		
			throw new Exception("ObjUsuarioGrupo save Exception=> " + e.getMessage());	
		} catch (RemoteException e) {
			throw new Exception("ObjUsuarioGrupo save Exception=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjUsuarioGrupo save Exception=> " + e.getMessage());
		}			
	}


	public void remove() throws Exception{
		
		try {
			InitialContext ctx = new InitialContext();
					
			UsuarioGrupoHome 	home = (UsuarioGrupoHome)ctx.lookup
								("ejb/br/smat/controleacesso/ejb/usuariogrupo/UsuarioGrupoHome");
			UsuarioGrupo 		usuarioGrupo = null;
			
			usuarioGrupo = home.findByPrimaryKey(new UsuarioGrupoKey(grupo,usuario));
			
			usuarioGrupo.remove();
			
		} catch (RemoteException e) {
			throw new Exception("ObjUsuarioGrupo save Exception=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjUsuarioGrupo save Exception=> " + e.getMessage());
		} catch (FinderException e) {
			throw new Exception("ObjUsuarioGrupo save Exception=> " + e.getMessage());			
		}			
	}


	/**
	 * Returns the grupo.
	 * @return int
	 */
	public int getGrupo() {
		return grupo;
	}

	/**
	 * Returns the usuario.
	 * @return int
	 */
	public int getUsuario() {
		return usuario;
	}

	/**
	 * Sets the grupo.
	 * @param grupo The grupo to set
	 */
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	/**
	 * Sets the usuario.
	 * @param usuario The usuario to set
	 */
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

}
