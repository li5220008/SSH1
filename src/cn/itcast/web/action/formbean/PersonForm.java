package cn.itcast.web.action.formbean;

import org.apache.struts.action.ActionForm;

/**
 * desc:
 * User: weiguili(li5220008@163.com)
 * Date: 13-8-15
 * Time: 下午3:06
 */
public class PersonForm extends ActionForm {
    private Integer  id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
