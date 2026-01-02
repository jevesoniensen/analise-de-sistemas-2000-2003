package br.smat.conexao;

import java.sql.*;

class SingleConnect
{
	private static SingleConnect instancia;
	private Connection con;
	
	private SingleConnect() throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
		while(true)
		{
			try
			{
				if(con!=null)
					con.close();				
				con = DriverManager.getConnection("jdbc:odbc:smat","smat","smat");
				break;
			}
			catch(Exception e)
			{
				System.out.println("teste1" + e.getMessage());
			}
		}	
	}
	
	public static SingleConnect instance()
	{
		if(instancia == null)
			try 
			{	
				instancia = new SingleConnect();
			}
			catch(Exception e)
			{
				System.out.println("teste2" + e.getMessage());
			}
			
		return instancia;
	}
	
	public Connection getConnection()
	{
		return con;
	}
}