package org.apache.struts.edit.actions.logout;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {

    @Override
    public String execute() {
        // Limpe quaisquer sessões de usuário ou cookies e redirecione para a página de login
        return SUCCESS;
    }
}