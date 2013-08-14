package cn.itcast.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.itcast.service.PersonService;

public class PersonAction extends Action {
	@Resource PersonService personService;
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {/*
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(
				this.getServlet().getServletContext());
		PersonService personService = (PersonService)ctx.getBean("personService");*/
		request.setAttribute("persons", personService.getPersons()); 
		return mapping.findForward("list");
	}
	
}
