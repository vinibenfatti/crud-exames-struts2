package org.apache.struts.edit.actions.user;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.User;
import org.apache.struts.edit.services.UserService;
import org.apache.struts.edit.services.impl.UserServiceImpl;

import java.util.logging.Logger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertUser extends ActionSupport {

    UserService userService = new UserServiceImpl();

    private User user;

    public String input() {
        this.user = new User();
        return INPUT;
    }

    public String execute() {
        Logger logger = Logger.getLogger(InsertUser.class.getName());
        logger.info("Inserting new user: " + user.toString());
        userService.saveUser(user);
        return SUCCESS;
    }
}
