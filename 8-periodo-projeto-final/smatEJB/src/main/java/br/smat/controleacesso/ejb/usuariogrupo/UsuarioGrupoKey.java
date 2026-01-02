package br.smat.controleacesso.ejb.usuariogrupo;

import br.smat.controleacesso.ejb.grupo.GrupoKey;
import br.smat.controleacesso.ejb.usuario.UsuarioKey;

/**
 * Key class for Entity Bean: UsuarioGrupo
 */
public class UsuarioGrupoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;

	public GrupoKey 	grupo;
	public UsuarioKey	usuario;

	/**
	 * Creates an empty key for Entity Bean: UsuarioGrupo
	 */
	public UsuarioGrupoKey() {
	}

	public UsuarioGrupoKey(GrupoKey 	grupo,UsuarioKey	usuario) {
		this.grupo 	= grupo;
		this.usuario 	= usuario;
	}

	public UsuarioGrupoKey(int 	grupo,int	usuario) {
		this.grupo 	= new GrupoKey(grupo);
		this.usuario	= new UsuarioKey(usuario);
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey) {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey o =
				(br
					.smat
					.controleacesso
					.ejb
					.usuariogrupo
					.UsuarioGrupoKey) otherKey;
			return (super.equals(otherKey));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (super.hashCode());
	}
}
