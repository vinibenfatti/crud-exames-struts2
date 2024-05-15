package org.apache.struts.edit.actions.login;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.services.LoginService;
import org.apache.struts.edit.services.impl.LoginServiceImpl;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginAction extends ActionSupport {

    private LoginService loginService = new LoginServiceImpl();

    private String username;
    private String password;

    @Override
    public String execute() {
        try {
            this.loginService.login(username, password);
            return SUCCESS;
        }catch (Exception e) {
            return ERROR;
        }
    }
}

