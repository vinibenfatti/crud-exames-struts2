package org.apache.struts.edit.services;

import org.apache.struts.edit.models.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeBean();

    void saveEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    void updateEmployee(Employee employee);
}
