package org.apache.struts.edit.services.impl;

import org.apache.struts.edit.models.Employee;
import org.apache.struts.edit.repositories.EmployeeRepository;
import org.apache.struts.edit.repositories.impl.EmployeeRepositoryImpl;
import org.apache.struts.edit.services.EmployeeService;

import java.util.List;

import static org.apache.logging.log4j.util.Strings.isBlank;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Employee getEmployeeBean() {
        return new Employee();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.deleteEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        Employee employeeFromDB = employeeRepository.findByCdFuncionario(employee.getCd_funcionario());
        updateEmployeeFieldIfNeed(employee, employeeFromDB);
        employeeRepository.updateEmployee(employeeFromDB);
    }

    private void updateEmployeeFieldIfNeed(Employee employee, Employee employeeFromDB) {
        employeeFromDB.setNm_funcionario(!isBlank(employee.getNm_funcionario()) ? employee.getNm_funcionario() : employeeFromDB.getNm_funcionario());
    }
}
