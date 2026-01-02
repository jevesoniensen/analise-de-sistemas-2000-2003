package br.smat.conexao;

import java.sql.*;


public class ConnectDB
{	
	private Connection conn;
	
	public ConnectDB()
	{
		SingleConnect sc = SingleConnect.instance();
		conn = sc.getConnection();
	}
		
	public synchronized ResultSet selectDB(String sql) 
	{
		try
		{
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			return rs;		
		}
		catch(Exception e)
		{
			System.out.println("selectDB " + e.getMessage());
		}	
		return null;
	}
	
	public int updateDB(String sql)
	{
		try
		{
			Statement stmt = conn.createStatement();
			int linhas = stmt.executeUpdate(sql);

			stmt.close();
			
			return linhas;
		}
		catch(Exception e)
		{
			System.out.println("updateDB " + e.getMessage());
		}
		
		return -1;
	}
}