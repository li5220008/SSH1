package cn.itcast.web.action;

import cn.itcast.bean.Person;
import cn.itcast.service.PersonService;
import cn.itcast.web.action.formbean.PersonForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * desc:
 * User: weiguili(li5220008@163.com)
 * Date: 13-8-15
 * Time: 下午2:54
 */
public class PersonManageAction extends DispatchAction {
    @Resource
    PersonService personService;

    public ActionForward add(
            ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PersonForm formbean = (PersonForm)form;
        personService.save(new Person(formbean.getName()));
        request.setAttribute("message","添加成功！");
        return mapping.findForward("message");
    }

}
