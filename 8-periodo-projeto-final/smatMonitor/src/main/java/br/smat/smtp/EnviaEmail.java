package br.smat.smtp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class EnviaEmail {

	private Socket 			socket;
	private String 			server;
	private int				porta;
	private BufferedReader 	bufferedReader;
	private PrintStream		printStream;
	private String				hostOrigem;

	public EnviaEmail(String server) {
		super();
		this.porta 	= 25;
		this.server 	= server;
		init();
	}

	public EnviaEmail(String server,int porta) {
		super();
		this.porta 	= porta;
		this.server 	= server;
		init();
	}
	
	public void init(){
		try {
			socket 			= new Socket(server, porta);
			System.out.println("Conectando-se com => " + socket+"\n");
			printStream 	= new PrintStream(socket.getOutputStream());
//			System.out.println("printStream = " + printStream);			
			bufferedReader	= new BufferedReader(new InputStreamReader(socket.getInputStream()));			
			hostOrigem		= "Host:"+InetAddress.getLocalHost().getHostName();
			System.out.println("\n"+hostOrigem+"\n\n");			
		} catch (UnknownHostException e) {
		//	e.printStackTrace();
		} catch (IOException e) {
		//	e.printStackTrace();
		}
		
	}
	
	public void enviaEmail(	String emailOrigem,
								String emailDestino,
								String assunto,
								String corpo) throws Exception{

			try{
			System.out.println("Inicio do envio ...... ");									

				comunicacao(hostOrigem);
				comunicacao(emailOrigem);
				comunicacao(emailDestino);
				comunicacao(assunto);
				comunicacao(corpo);	

			System.out.println("*************************************************************");
			System.out.println("** hostOrigem = " + hostOrigem);			
			System.out.println("** emailOrigem = " + emailOrigem);									
			System.out.println("** emailDestino = " + emailDestino);									
			System.out.println("** assunto = " + assunto);									
			System.out.println("** corpo = " + corpo);
			System.out.println("*************************************************************");
			System.out.println("Mensagem enviada com sucesso!");
			System.out.println("\n\n\n\n");

			}catch(Exception e){
				//e.printStackTrace();
				throw new Exception("Erro");
			}
	}
	
	public String comunicacao(String msg) throws Exception{
		
		String retorno = null;
		
		try {
			printStream.println(msg);
			printStream.println();
			printStream.flush();		
			
			retorno = bufferedReader.readLine();
			
			if(retorno != null)
				if(retorno.equals("501 Unknown command"))
					throw new Exception("Erro!");
			
			//System.out.println("RETORNOOOOOOOO" + retorno);
			//System.out.println("Mensagem enviada com sucesso!");			
		} catch (IOException e) {
			//e.printStackTrace();
			throw new Exception("Erro!");
		}
		return retorno;
	}
	
}
