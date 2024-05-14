package org.apache.struts.edit.actions.user;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.User;
import org.apache.struts.edit.services.UserService;
import org.apache.struts.edit.services.impl.UserServiceImpl;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUser extends ActionSupport {

    private UserService userService = new UserServiceImpl();

    private User user;

    public String input() {
        this.user = userService.getUserBean();
        return INPUT;
    }

    public String execute() {
        userService.updateUser(user);
        return SUCCESS;
    }
}
