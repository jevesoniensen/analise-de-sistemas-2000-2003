package br.smat.smtp.loginmail;



import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class LoginMail extends Authenticator {


	private	String	userName;
	private	String	password;

	/**
	 * Constructor for LoginMail.
	 */
	public LoginMail(String userName,String password) {

		this.userName = userName;
		this.password = password;

	}


   public PasswordAuthentication getPasswordAuthentication(){ 

     	return new PasswordAuthentication(userName, password);
   } 
}
