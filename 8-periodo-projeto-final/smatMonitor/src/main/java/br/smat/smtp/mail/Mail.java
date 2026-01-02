package br.smat.smtp.mail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



import br.smat.smtp.loginmail.LoginMail;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class Mail {

	private static final String SERVIDOR = "rla13.pucpr.br";
	private static final boolean DEBUG = false;
	
	private	String		remetente;
	private	String[]	destinatario;
	private	String		assunto;
	private	String 		corpoMensagem;

	public Mail(String		remetente,
				 String[]	destinatario,
				 String		assunto,
				 String 	corpoMensagem) {
				 	
		this.remetente 	= remetente;
		this.destinatario 	= destinatario;
		this.assunto		= assunto;
		this.corpoMensagem	= corpoMensagem;

	}
	
   public	void sendMail() throws MessagingException 
   { 
		Properties props = new Properties(); 
		props.put("mail.smtp.host",SERVIDOR);

		Authenticator auth = new LoginMail("marcus","");
       
       	Session session = Session.getDefaultInstance(props,auth); 
       	session.setDebug(DEBUG); 
    
       	Message msg = new MimeMessage(session); 
    
       	InternetAddress addressFrom = new InternetAddress(remetente); 

		Address para[] = new InternetAddress[destinatario.length];
		
		msg.setFrom(addressFrom); 
		msg.setSubject(assunto); 
       
		try { 

			msg.setContent(corpoMensagem,"text/html"); 

			for(int i = 0;i < destinatario.length; i++)
				para[i] = new InternetAddress(destinatario[i]);

            msg.setRecipients(Message.RecipientType.TO,para); 
           
            msg.setText(corpoMensagem); 

            Transport.send(msg); 
            Thread.sleep(10); 
		} 
      	catch (MessagingException e) { 
      		//e.printStackTrace();
			throw	new MessagingException(e.getMessage());
      	}
      	catch (Exception e) { 
			throw	new MessagingException(e.getMessage());
      	} 
   	}
}