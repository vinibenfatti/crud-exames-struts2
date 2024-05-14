package org.apache.struts.edit.actions.login;

import com.opensymphony.xwork2.ActionSupport;

public class SaveInactiveTimeAction extends ActionSupport {

    private double inactiveTime;


    @Override
    public String execute() {

        return SUCCESS;
    }
}
