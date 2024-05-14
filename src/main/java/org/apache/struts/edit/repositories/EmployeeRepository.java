package org.apache.struts.edit.repositories;

import org.apache.struts.edit.models.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee findByCdFuncionario(Long cdFuncionario);
}
