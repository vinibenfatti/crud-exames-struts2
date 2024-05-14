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
public class DeleteUser extends ActionSupport {

    private UserService userService = new UserServiceImpl();

    private User user;

    @Override
    public String input() throws Exception {
        this.user = userService.getUserBean();
        return INPUT;
    }

    @Override
    public String execute() throws Exception {
        userService.deleteUser(this.user);
        return SUCCESS;
    }
}
