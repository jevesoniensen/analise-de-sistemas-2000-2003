package br.smat.conexao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class Conexao {
	
	
	
	public static Connection getConnection()
	{
		try{
			Context aux = new InitialContext();
			
			DataSource ds =(DataSource)aux.lookup("jdbc/SQLServerDS");
			ds.getConnection();

			return ds.getConnection();
		}
		catch(Exception e){
			System.out.println("Erro de conexao => br.smat.conexao.Connection");
			e.printStackTrace();
			return null;
		}
	}

}
