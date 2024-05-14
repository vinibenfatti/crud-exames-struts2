package org.apache.struts.edit.repositories.impl;

import org.apache.struts.edit.models.Employee;
import org.apache.struts.edit.repositories.EmployeeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.apache.struts.edit.enums.EmployeeRepositoryEnum.DELETE_EMPLOYEE;
import static org.apache.struts.edit.enums.EmployeeRepositoryEnum.FIND_BY_CD_FUNCIONARIO;
import static org.apache.struts.edit.enums.EmployeeRepositoryEnum.SELECT_ALL_EMPLOYEES;
import static org.apache.struts.edit.enums.EmployeeRepositoryEnum.INSERT_INTO_EMPLOYEE;
import static org.apache.struts.edit.enums.EmployeeRepositoryEnum.UPDATE_EMPLOYEE;

public class EmployeeRepositoryImpl extends AbstractRepository implements EmployeeRepository {
    @Override
    public List<Employee> getAllEmployees() {
        openConnection();
        ResultSet resultSet = getResultSet(SELECT_ALL_EMPLOYEES.getQuery());
        return getEmployees(resultSet);
    }

    @Override
    public void saveEmployee(Employee employee) {
        openConnection();
        PreparedStatement statement = preparedStatement(INSERT_INTO_EMPLOYEE.getQuery());
        try {
            statement.setString(1, employee.getNm_funcionario());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteEmployee(Employee employee) {
        openConnection();
        PreparedStatement statement = preparedStatement(DELETE_EMPLOYEE.getQuery());
        try {
            statement.setLong(1, employee.getCd_funcionario());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updateEmployee(Employee employee) {
        openConnection();
        PreparedStatement statement = preparedStatement(UPDATE_EMPLOYEE.getQuery());
        try {
            statement.setString(1, employee.getNm_funcionario());
            statement.setLong(2, employee.getCd_funcionario());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Employee findByCdFuncionario(Long cdFuncionario) {
        openConnection();
        PreparedStatement statement = preparedStatement(FIND_BY_CD_FUNCIONARIO.getQuery());
        try {
            statement.setLong(1, cdFuncionario);
            ResultSet resultSet = statement.executeQuery();
            return getEmployees(resultSet).get(0);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Employee> getEmployees(ResultSet resultSet) {
        List<Employee> employees = new ArrayList<>();
        try {
            while (resultSet.next()) {
                employees.add(getEmployee(resultSet));
            }
            return employees;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Employee getEmployee(ResultSet resultSet) {
        try {
            Employee employee = new Employee();
            employee.setCd_funcionario(resultSet.getLong("cd_funcionario"));
            employee.setNm_funcionario(resultSet.getString("nm_funcionario"));
            return employee;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
