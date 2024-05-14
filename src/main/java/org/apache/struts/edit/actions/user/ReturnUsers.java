package org.apache.struts.edit.actions.user;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.User;
import org.apache.struts.edit.services.UserService;
import org.apache.struts.edit.services.impl.UserServiceImpl;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnUsers extends ActionSupport {

    private UserService userService = new UserServiceImpl();

    private List<User> users;

    @Override
    public String execute() {
        this.users = userService.getAllUsers();
        return SUCCESS;
    }

}
