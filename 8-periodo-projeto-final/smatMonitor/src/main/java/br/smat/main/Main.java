package br.smat.main;

import javax.mail.MessagingException;

import br.smat.AgenteSaude.AgenteSaude;
import br.smat.AgenteSaude.AgenteSaudeFactory;
import br.smat.monitor.Monitor;
import br.smat.monitor.MonitorFactory;
import br.smat.smtp.EnviaEmail;
import br.smat.smtp.mail.Mail;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class Main {

	private static EnviaEmail enviaEmail;

	/**
	 * Constructor for Main.
	 */
	public Main() {
		super();
	}

	public static void main(String[] args) {

		String		corpoMensagem = null;
		String		assunto = null;
		String		remetente = null;
		
		MonitorFactory monitorFactory = new MonitorFactory();
		Monitor[] monitor =	monitorFactory.getAllMonitor();
		
		AgenteSaude[] 		agenteSaude = null;
		AgenteSaudeFactory 	agenteSaudeFactory = new AgenteSaudeFactory();
		agenteSaude = agenteSaudeFactory.getAllAgenteSaude();


		String[]	destinatarios = new String[agenteSaude.length];	

		assunto   = "SMAT - Nível crítico";
		remetente = "marcus@rla13.pucpr.br";

		for(int i=0;i<agenteSaude.length;i++){
			destinatarios[i] = agenteSaude[i].getEmail();
		}
		
		
		System.out.println("*************************************");
		System.out.println("*****   Iniciando SmatMonitor   *****");
		System.out.println("*************************************\n\n\n");
		
		
		if(monitor == null ||monitor.length == 0)
			System.out.println("Não há monitores cadastrados!");
		int cont = 0;
		for(int i=0;i<monitor.length;i++){
			if(monitor[i].situacaoCritica()){
				
				corpoMensagem = "     O monitor " + monitor[i].getMonitor() + " verificou que," +
								"\nna data de " + monitor[i].getUltimaDataExecucao() + ", o numero máximo" + 
								"\nde acidentes que é de " + monitor[i].getMaxAcidente() + " foi igualado/ultrapassado" +
								"\nchegando ao numero de " + monitor[i].getNumAcidentes();
				
				System.out.println("**** Enviando mensagem ****\n");
				System.out.println("De: 	 " + remetente );
				System.out.print("Para: ");
				for(int j=0;j < destinatarios.length;j++){

					System.out.print(destinatarios[j]);
					
					if(j != destinatarios.length-1)
						System.out.print("; ");
					else
						System.out.print("\n");
				}

				System.out.println("Assunto: " + assunto );
				System.out.println("Texto:   " + corpoMensagem);

				Mail mail = new Mail(remetente,destinatarios,assunto,corpoMensagem);
				try{
					mail.sendMail();
					System.out.println("**** E-mail enviado com sucesso! ****\n\n\n");
				}catch(MessagingException e){

					System.out.println("\n\n**** Erro ao enviar email do monitor "+monitor[i].getMonitor()+" ****\n\n\n");
				}
			}else
				cont++;
			
			if(cont == monitor.length)
				System.out.println("Nenhum monitor excedeu o número máximo de acidentes!");
		}
	}
	
}
