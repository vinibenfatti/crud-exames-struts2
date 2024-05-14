package org.apache.struts.edit.actions.employee;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.Employee;
import org.apache.struts.edit.services.EmployeeService;
import org.apache.struts.edit.services.impl.EmployeeServiceImpl;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnEmployees extends ActionSupport {

    private EmployeeService employeeService = new EmployeeServiceImpl();

    private List<Employee> employees;

    @Override
    public String execute() {
        this.employees = employeeService.getAllEmployees();
        return SUCCESS;
    }
}
