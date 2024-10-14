package main.cinemaproject.controller;

import main.cinemaproject.dao.EmployeeDAO;
import main.cinemaproject.model.Employee;
import main.cinemaproject.database.JBDCUntil;

import java.sql.Connection;
import java.util.ArrayList;

public class EmployeeController {

    public ArrayList<Employee> getAllEmployees() {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            return employeeDAO.getAllEmployee();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    public boolean addEmployee(Employee employee) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            boolean success = employeeDAO.addEmployee(employee); 
            employeeDAO.addEmployeeCredentials(employee.getId(), employee.getUsername(), employee.getPassword());
            return success;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    public boolean updateEmployee(Employee employee) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            employeeDAO.updateEmployee(employee);
            employeeDAO.updateEmployeeCredentials(employee.getId(), employee.getUsername(), employee.getPassword());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    public boolean deleteEmployee(int employeeId) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            employeeDAO.deleteEmployee(employeeId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    public Employee getEmployeeById(int employeeId) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            return employeeDAO.getEmployeeById(employeeId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }
}
