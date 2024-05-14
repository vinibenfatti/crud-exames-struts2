package org.apache.struts.edit.actions.employee;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.Employee;
import org.apache.struts.edit.services.EmployeeService;
import org.apache.struts.edit.services.impl.EmployeeServiceImpl;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployee extends ActionSupport {
    private EmployeeService employeeService = new EmployeeServiceImpl();

    private Employee employee;

    @Override
    public String input() {
        this.employee = employeeService.getEmployeeBean();
        return INPUT;
    }

    @Override
    public String execute() {
        employeeService.updateEmployee(employee);
        return SUCCESS;
    }

}
