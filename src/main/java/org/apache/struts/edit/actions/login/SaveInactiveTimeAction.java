package org.apache.struts.edit.actions.login;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.edit.services.UserService;
import org.apache.struts.edit.services.impl.UserServiceImpl;

public class SaveInactiveTimeAction extends ActionSupport {

    private UserService userService = new UserServiceImpl();

    private double inactiveTime;


    @Override
    public String execute() {
        inactiveTime = userService.saveInactiveTime(inactiveTime);
        return SUCCESS;
    }
}
