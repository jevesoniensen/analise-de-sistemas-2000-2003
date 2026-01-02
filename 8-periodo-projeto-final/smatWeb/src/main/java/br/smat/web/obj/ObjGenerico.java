package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.objetosauxiliares.auxagentecausador.AuxAgenteCausador;
import br.smat.objetosauxiliares.auxdepoimento.AuxDepoimento;
import br.smat.objetosauxiliares.auxempregador.AuxEmpregador;
import br.smat.objetosauxiliares.auxfiscalizacaoempregador.AuxFiscalizacaoEmpregador;
import br.smat.objetosauxiliares.auxinvestigacao.AuxInvestigacao;
import br.smat.objetosauxiliares.auxitempontofiscalizacao.AuxItemPontoFiscalizacao;
import br.smat.objetosauxiliares.auxlistinvestigacao.AuxListInvestigacao;
import br.smat.objetosauxiliares.auxlocalatendimento.AuxLocalAtendimento;
import br.smat.objetosauxiliares.auxlocallesao.AuxLocalLesao;
import br.smat.objetosauxiliares.auxmedidacorretiva.AuxMedidaCorretiva;
import br.smat.objetosauxiliares.auxmonitor.AuxMonitor;
import br.smat.objetosauxiliares.auxpesquisaacidente.AuxPesquisaAcidente;
import br.smat.objetosauxiliares.auxpessoa.AuxPessoa;
import br.smat.objetosauxiliares.auxpontofiscalizacaoramoatividade.AuxPontoFiscalizacaoRamoAtividade;
import br.smat.objetosauxiliares.auxramoatividade.AuxRamoAtividade;
import br.smat.objetosauxiliares.auxregional.AuxRegional;
import br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha;
import br.smat.objetosauxiliares.auxtramitefiscalizacao.AuxTramiteFiscalizacao;
import br.smat.objetosauxiliares.generico.Generico;
import br.smat.objetosauxiliares.generico.GenericoHome;
import br.smat.objetosauxiliares.menu.Menu;
import br.smat.util.FuncoesComuns;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjGenerico {

	public static String getHoraAtual() throws Exception{		
			InitialContext 		ctx;
			String 				dataAtual = null;
			Generico			generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						dataAtual = generico.getHoraAtual();
					} catch (RemoteException e) {
						throw new Exception(" ObjGenerico getHoraAtual RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getHoraAtual FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getHoraAtual Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getHoraAtual NamingException=> " + e.getMessage());
			}
			return dataAtual;			 		
	}	

	public static String getDataAtual() throws Exception{		
			InitialContext 		ctx;
			String 				dataAtual = null;
			Generico			generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						dataAtual = generico.getDataAtual();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico getDataAtual RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getDataAtual FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getDataAtual Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getDataAtual NamingException=> " + e.getMessage());
			}
			return dataAtual;			 		
	}	

	public static AuxEmpregador[] listEmpregadores() throws Exception{		
			InitialContext 	ctx;
			AuxEmpregador[] auxEmpregadors = null;
			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxEmpregadors = generico.listEmpregadores();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listEmpregadores() RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listEmpregadores() FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listEmpregadores() Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listEmpregadores() NamingException=> " + e.getMessage());
			}
			return auxEmpregadors;			 		
	}	
	
	public static AuxEmpregador[] listEmpregadores(String razaoSocial) throws Exception{		
			InitialContext 	ctx;
			AuxEmpregador[] auxEmpregadors = null;
			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxEmpregadors = generico.listEmpregadores(razaoSocial);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listEmpregadores(String razaoSocial) RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listEmpregadores(String razaoSocial) FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listEmpregadores(String razaoSocial) Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listEmpregadores(String razaoSocial) NamingException=> " + e.getMessage());
			}
			return auxEmpregadors;			 		
	}

	public static Menu[] montaMenu(int usuario) throws Exception{

			/*****************************
			 * 							 *
			 *    Paramêtros para		 *
			 *    alteração do layout	 * 
			 * 	  do menu				 *
			 * 			 				 * 
			 *****************************/ 

		
			/*****************************
			 * 							 *
			 * 	   Fim dos parâmetros	 *
			 * 		  do Menu			 *
			 * 							 *
			 *****************************/

				
			InitialContext 	ctx;

			Menu[] menu = null;
			
			Generico		generico;

			int ordem1=0,ordem2=1,ordem3=1,ordem4=1;

			String padraoMenu = "Menu1";
			String fimMenu = null;

		
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						menu = generico.montaMenu(usuario);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico montaMenu(int usuario) RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico montaMenu(int usuario) FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico montaMenu(int usuario) Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico montaMenu(int usuario) NamingException=> " + e.getMessage());
			}

			for(int i=0; i < menu.length;i++){

				switch(menu[i].getNivel()){

						case 0:
							ordem1=0;
							ordem2=0;
							ordem3=0;
							ordem4=0;

							menu[i].setHeight(23);
							menu[i].setWidth(130);
							menu[i].setBgColor("\"#61809F\"");
							menu[i].setBgHighColor("\"#61809F\"");
							menu[i].setFontColor("\"#FFFFFF\"");
							menu[i].setFontHighColor("\"#FFFFFF\"");

							menu[i].setPosicaoMenu("");
							break;
								
						case 1:
							ordem2=0;
							ordem3=0;
							ordem4=0;
							
							ordem1++;						
							
							menu[i].setHeight(23);
							menu[i].setWidth(130);
							menu[i].setBgColor("\"#61809F\"");
							menu[i].setBgHighColor("\"#61809F\"");
							menu[i].setFontColor("\"#FFFFFF\"");
							menu[i].setFontHighColor("\"#A2B3C7\"");
							
							menu[i].setPosicaoMenu("_" + ordem1);
							break;
						case 2:
							ordem3=0;
							ordem4=0;
							
							ordem2++;

							menu[i].setHeight(21);
							menu[i].setWidth(100);
							menu[i].setBgColor("\"#A2B3C7\"");
							menu[i].setBgHighColor("\"#A2B3C7\"");
							menu[i].setFontColor("\"#516B86\"");
							menu[i].setFontHighColor("\"#FFFFFF\"");
							menu[i].setPosicaoMenu("_" + ordem1+"_"+ordem2);
							break;
						case 3:
							ordem4=0;
							
							ordem3++;						

							menu[i].setHeight(21);
							menu[i].setWidth(100);
							menu[i].setBgColor("\"#A2B3C7\"");
							menu[i].setBgHighColor("\"#A2B3C7\"");
							menu[i].setFontColor("\"#516B86\"");
							menu[i].setFontHighColor("\"#FFFFFF\"");
														
							menu[i].setPosicaoMenu("_" + ordem1+"_"+ordem2+"_"+ordem3);
							break;
						case 4:
							
							ordem4++;

							menu[i].setHeight(21);
							menu[i].setWidth(100);
							menu[i].setBgColor("\"#A2B3C7\"");
							menu[i].setBgHighColor("\"#A2B3C7\"");
							menu[i].setFontColor("\"#516B86\"");
							menu[i].setFontHighColor("\"#FFFFFF\"");
														
							menu[i].setPosicaoMenu("_" + ordem1+"_"+ordem2+"_"+ordem3+"_"+ordem4);
							break;
				}
			}
			
			for(int i=0; i < menu.length;i++){
				System.out.println(menu[i].getPosicaoMenu());
			}

			return menu;
	}
	
	public static AuxPesquisaAcidente[] pesquisaAcidente(int estado,
								  int regional,
								  int municipio,
								  String amputacao,
								  String obito,
								  String registroPolicial,
								  String internacao,
								  int tipoAcidente,
								  int diagnostico,
								  int fonte,
								  int area,
								  String dataInicial,
								  String dataFinal) throws Exception{

			InitialContext 	ctx;

			
			Generico		generico;
			
			AuxPesquisaAcidente[] pesquisa = null;
			

			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						pesquisa = generico.pesquisaAcidente(estado,
															 regional,
															 municipio,
															 FuncoesComuns.setNullSeVazio(amputacao),
															 FuncoesComuns.setNullSeVazio(obito),
															 FuncoesComuns.setNullSeVazio(registroPolicial),
															 FuncoesComuns.setNullSeVazio(internacao),
															 tipoAcidente,
															 diagnostico,
															 fonte,
															 area,
															 FuncoesComuns.setNullSeVazio(dataInicial),
															 FuncoesComuns.setNullSeVazio(dataFinal));
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico montaMenu(int usuario) RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico montaMenu(int usuario) FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico montaMenu(int usuario) Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico montaMenu(int usuario) NamingException=> " + e.getMessage());
			}
		
		return pesquisa;
		
	}
	public static AuxPontoFiscalizacaoRamoAtividade[] listPontoFiscalizacaoRamoAtividade(int ramoAtividade)
	throws Exception{
			InitialContext 						ctx;
			AuxPontoFiscalizacaoRamoAtividade[] auxPontoFiscalizacaoRamoAtividades = null;
			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxPontoFiscalizacaoRamoAtividades = generico.listPontoFiscalizacaoRamoAtividade(ramoAtividade);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listPontoFiscalizacaoRamoAtividade(String ramoAtividade) RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listPontoFiscalizacaoRamoAtividade(String ramoAtividade) FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listPontoFiscalizacaoRamoAtividade(String ramoAtividade) Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listPontoFiscalizacaoRamoAtividade(String ramoAtividade) NamingException=> " + e.getMessage());
			}
			return auxPontoFiscalizacaoRamoAtividades;			 		
		
	}
	
	public static AuxItemPontoFiscalizacao[] listAuxItemPontoFiscalizacaos(int pontoFiscalizacao)
	throws Exception{
			InitialContext 						ctx;
			AuxItemPontoFiscalizacao[] auxItemPontoFiscalizacao = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxItemPontoFiscalizacao = generico.listItemPontoFiscalizacao(pontoFiscalizacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listAuxItemPontoFiscalizacaos(int pontoFiscalizacao) RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listAuxItemPontoFiscalizacaos(int pontoFiscalizacao) FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listAuxItemPontoFiscalizacaos(int pontoFiscalizacao) Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listAuxItemPontoFiscalizacaos(int pontoFiscalizacao) NamingException=> " + e.getMessage());
			}
			return auxItemPontoFiscalizacao;			 		
		
	}	
	
	public static void gravaItemPontoFiscalizacao(int pontoFiscalizacao,String itensFiscalizacao)
	throws Exception,RemoteException{
		InitialContext 	ctx;		
		Generico		generico;		
		try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						generico.gravaItemPontoFiscalizacao(pontoFiscalizacao,itensFiscalizacao);
					
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico gravaItemPontoFiscalizacao RemoteException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico gravaItemPontoFiscalizacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico gravaItemPontoFiscalizacao NamingException=> " + e.getMessage());
			}				
	}
	
	public static AuxFiscalizacaoEmpregador[] listAuxFiscalizacaoEmpregadorAgente()
	throws Exception{
			InitialContext 						ctx;
			AuxFiscalizacaoEmpregador[] auxFiscalizacaoEmpregador = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxFiscalizacaoEmpregador = generico.listAuxFiscalizacaoEmpregadorAgente();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listAuxFiscalizacaoEmpregadorAgente RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listAuxFiscalizacaoEmpregadorAgente FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listAuxFiscalizacaoEmpregadorAgente Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listAuxFiscalizacaoEmpregadorAgente NamingException=> " + e.getMessage());
			}
			return auxFiscalizacaoEmpregador;			 				
	}		
	
	public static AuxFiscalizacaoEmpregador listAuxFiscalizacaoEmpregadorAgente(int fiscalizacao)
	throws Exception{
			InitialContext 						ctx;
			AuxFiscalizacaoEmpregador auxFiscalizacaoEmpregador = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxFiscalizacaoEmpregador = generico.listAuxFiscalizacaoEmpregadorAgente(fiscalizacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listAuxFiscalizacaoEmpregadorAgente RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listAuxFiscalizacaoEmpregadorAgente FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listAuxFiscalizacaoEmpregadorAgente Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listAuxFiscalizacaoEmpregadorAgente NamingException=> " + e.getMessage());
			}
			return auxFiscalizacaoEmpregador;			 				
	}

	public static AuxInvestigacao getTramiteInvestigacao(int investigacao)
	throws Exception{
			InitialContext 						ctx;
			AuxInvestigacao auxInvestigacao = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxInvestigacao = generico.getTramiteInvestigacao(investigacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico getTramiteInvestigacao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getTramiteInvestigacao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getTramiteInvestigacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getTramiteInvestigacao NamingException=> " + e.getMessage());
			}
			return auxInvestigacao;			 				
	}			

	public static AuxListInvestigacao[] getAllInvestigacoes()
	throws Exception{
			InitialContext 						ctx;
			AuxListInvestigacao[] auxListInvestigacao = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxListInvestigacao = generico.getAllInvestigacoes();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico getTramiteInvestigacao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getTramiteInvestigacao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getTramiteInvestigacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getTramiteInvestigacao NamingException=> " + e.getMessage());
			}
			return auxListInvestigacao;			 				
	}

	public static AuxDepoimento[] getAllDepoimentosInvestigacao(int investigacao)
	throws Exception{
			InitialContext 						ctx;
			AuxDepoimento[] auxDepoimento = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxDepoimento = generico.getAllDepoimentosInvestigacao(investigacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico getAllDepoimentosInvestigacao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getAllDepoimentosInvestigacao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getAllDepoimentosInvestigacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getAllDepoimentosInvestigacao NamingException=> " + e.getMessage());
			}
			return auxDepoimento;			 				
	}

	public static AuxPessoa[] pesquisarPessoa(int tipoDepoimento,String nome,int acidente)
	throws Exception{
			InitialContext 						ctx;
			AuxPessoa[] auxPessoa = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxPessoa = generico.pesquisarPessoa(tipoDepoimento,nome,acidente);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico pesquisarPessoa RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico pesquisarPessoa FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico pesquisarPessoa Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico pesquisarPessoa NamingException=> " + e.getMessage());
			}
			return auxPessoa;			 				
	}
	
	public static AuxTestemunha[] getAllTestemunhasAcidente(int acidente)
	throws Exception{
			InitialContext 						ctx;
			AuxTestemunha[] auxTestemunha = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxTestemunha = generico.getAllTestemunhasAcidente(acidente);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico getAllTestemunhasAcidente RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getAllTestemunhasAcidente FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getAllTestemunhasAcidente Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getAllTestemunhasAcidente NamingException=> " + e.getMessage());
			}
			return auxTestemunha;			 				
	}
	public static AuxItemPontoFiscalizacao[] listItemRoteiro(	int tramiteFiscalizacao,
																				int fiscalizacao,
																				int pontoFiscalizacao)
	throws Exception{
			InitialContext 						ctx;
			AuxItemPontoFiscalizacao[] auxItemPontoFiscalizacao = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxItemPontoFiscalizacao = generico.listItemRoteiroPontoFiscal(tramiteFiscalizacao,fiscalizacao,pontoFiscalizacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listItemRoteiro RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listItemRoteiro FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listItemRoteiro Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listItemRoteiro NamingException=> " + e.getMessage());
			}
			return auxItemPontoFiscalizacao;			 		
		
	}	
	
	public static AuxItemPontoFiscalizacao[] listItemRoteiro(int fiscalizacao)
	throws Exception{
			InitialContext 						ctx;
			AuxItemPontoFiscalizacao[] auxItemPontoFiscalizacao = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxItemPontoFiscalizacao = generico.listItensRoteiro(fiscalizacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listItemRoteiro RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listItemRoteiro FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listItemRoteiro Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listItemRoteiro NamingException=> " + e.getMessage());
			}
			return auxItemPontoFiscalizacao;			 		
		
	}	
	
	public static AuxItemPontoFiscalizacao[] listItemRoteiro(int fiscalizacao,int tramiteFiscalizacao)
	throws Exception{
			InitialContext 						ctx;
			AuxItemPontoFiscalizacao[] auxItemPontoFiscalizacao = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxItemPontoFiscalizacao = generico.listItensRoteiro(fiscalizacao,tramiteFiscalizacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listItemRoteiro(int fiscalizacao,int tramiteFiscalizacao) RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listItemRoteiro(int fiscalizacao,int tramiteFiscalizacao) FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listItemRoteiro(int fiscalizacao,int tramiteFiscalizacao) Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listItemRoteiro(int fiscalizacao,int tramiteFiscalizacao) NamingException=> " + e.getMessage());
			}
			return auxItemPontoFiscalizacao;			 		
		
	}		
	
	public static AuxItemPontoFiscalizacao[] listDetalhesItensRoteiro(int fiscalizacao,int tramiteFiscalizacao)
	throws Exception{
			InitialContext 						ctx;
			AuxItemPontoFiscalizacao[] auxItemPontoFiscalizacao = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxItemPontoFiscalizacao = generico.listDetalhesItensRoteiro(fiscalizacao,tramiteFiscalizacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listItemRoteiro(int fiscalizacao,int tramiteFiscalizacao) RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listItemRoteiro(int fiscalizacao,int tramiteFiscalizacao) FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listItemRoteiro(int fiscalizacao,int tramiteFiscalizacao) Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listItemRoteiro(int fiscalizacao,int tramiteFiscalizacao) NamingException=> " + e.getMessage());
			}
			return auxItemPontoFiscalizacao;			 		
		
	}			
		

	public static AuxTramiteFiscalizacao[] listTramitesFiscalizacao(int fiscalizacao)
	throws Exception{
			InitialContext 						ctx;
			AuxTramiteFiscalizacao[] auxTramiteFiscalizacao = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxTramiteFiscalizacao = generico.listTramitesFiscalizacao(fiscalizacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listTramitesFiscalizacao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listTramitesFiscalizacao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listTramitesFiscalizacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listTramitesFiscalizacao NamingException=> " + e.getMessage());
			}
			return auxTramiteFiscalizacao;			 		
		
	}	
	
	public static AuxMedidaCorretiva[] listAllMedidaCorretivaFiscalizacao(int fiscalizacao, int tramite)
	throws Exception{
			InitialContext 						ctx;
			AuxMedidaCorretiva[] auxMedidaCorretiva = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxMedidaCorretiva = generico.listAllMedidaCorretivaFiscalizacao(fiscalizacao,tramite);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listTramitesFiscalizacao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listTramitesFiscalizacao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listTramitesFiscalizacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listTramitesFiscalizacao NamingException=> " + e.getMessage());
			}
			return auxMedidaCorretiva;			 		
		
	}	
	
	public static AuxMonitor[] listAllMonitor()
	throws Exception{
			InitialContext 						ctx;
			AuxMonitor[] auxMonitor = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxMonitor = generico.listAllMonitor();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listAllMonitor RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listAllMonitor FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listAllMonitor Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listAllMonitor NamingException=> " + e.getMessage());
			}
			return auxMonitor;			 		
		
	}		

	public static AuxMedidaCorretiva[] getAllMedidasCorretivasInvestigacao(int investigacao)
	throws Exception{
			InitialContext 						ctx;
			AuxMedidaCorretiva[] auxMedidaCorretiva = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxMedidaCorretiva = generico.getAllMedidasCorretivasInvestigacao(investigacao);
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico getAllMedidasCorretivasInvestigacao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getAllMedidasCorretivasInvestigacao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getAllMedidasCorretivasInvestigacao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getAllMedidasCorretivasInvestigacao NamingException=> " + e.getMessage());
			}
			return auxMedidaCorretiva;			 		
		
	}

	public static AuxAgenteCausador[] getAllAgentesCausadores()
	throws Exception{
			InitialContext 						ctx;
			AuxAgenteCausador[] auxAgenteCausador = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxAgenteCausador = generico.getAllAgentesCausadores();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico getAllAgentesCausadores RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getAllAgentesCausadores FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getAllAgentesCausadores Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getAllAgentesCausadores NamingException=> " + e.getMessage());
			}
			return auxAgenteCausador;			 		
		
	}

	public static AuxLocalAtendimento[] getAllLocaisAtendimento()
	throws Exception{
			InitialContext 						ctx;
			AuxLocalAtendimento[] auxLocalAtendimento = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxLocalAtendimento = generico.getAllLocaisAtendimento();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico getAllLocaisAtendimento RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getAllLocaisAtendimento FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getAllLocaisAtendimento Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getAllLocaisAtendimento NamingException=> " + e.getMessage());
			}
			return auxLocalAtendimento;			 		
		
	}

	public static AuxRegional[] getAllRegionais()
	throws Exception{
			InitialContext 						ctx;
			AuxRegional[] auxRegional = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxRegional = generico.getAllRegionais();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico getAllRegionais RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico getAllRegionais FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico getAllRegionais Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico getAllRegionais NamingException=> " + e.getMessage());
			}
			return auxRegional;			 		
		
	}

	public static AuxLocalLesao[] listAllLocaisLesao()
	throws Exception{
			InitialContext 						ctx;
			AuxLocalLesao[] auxLocalLesao = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxLocalLesao = generico.listAlllocaisLesao();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listAlllocaisLesao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listAlllocaisLesao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listAlllocaisLesao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listAlllocaisLesao NamingException=> " + e.getMessage());
			}
			return auxLocalLesao;			 		
		
	}	
	
	public static AuxRamoAtividade[] listAllRamoAtividade()
	throws Exception{
			InitialContext 						ctx;
			AuxRamoAtividade[] auxRamoAtividades = null;

			Generico		generico;
			try {
				ctx = new InitialContext();
				GenericoHome home = (GenericoHome)ctx.lookup("ejb/br/smat/objetosauxiliares/generico/GenericoHome");
					try {
						generico = (Generico)home.create();
						auxRamoAtividades = generico.listAllRamoAtividade();
					} catch (RemoteException e) {
						throw new Exception("ObjGenerico listAlllocaisLesao RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjGenerico listAlllocaisLesao FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjGenerico listAlllocaisLesao Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjGenerico listAlllocaisLesao NamingException=> " + e.getMessage());
			}
			return auxRamoAtividades;			 		
		
	}		


}
