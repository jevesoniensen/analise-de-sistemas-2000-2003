package br.smat.web.logoff;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @version 	1.0
 * @author
 */
public class LogOffAction extends Action {

	/**
	* Constructor
	*/
	public LogOffAction() {

		super();

	}
	public ActionForward perform(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws IOException, ServletException {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		// return value

		try {

			System.out.println("logOff");
			request.getSession(true).invalidate();

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erroBanco","Você saiu do sistema!");
			return mapping.findForward("LogOff");

		}


		// Finish with
//		forward.setName("LogOff_");
///		forward.setPath("/Login.do");										
//		return forward;
		request.setAttribute("erroBanco","Você saiu do sistema!");
		return mapping.findForward("LogOff");

	}
}
