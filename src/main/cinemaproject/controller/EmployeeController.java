package main.cinemaproject.controller;

import main.cinemaproject.dao.EmployeeDAO;
import main.cinemaproject.model.Employee;
import main.cinemaproject.utils.JBDCUtils;

import java.sql.Connection;
import java.util.ArrayList;

public class EmployeeController {

    private Connection connection;

    public ArrayList<Employee> getAllEmployees() {
        try {
            connection = JBDCUtils.getConnection();
            if (connection == null) return new ArrayList<>(); // Handle connection failure
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            return employeeDAO.getAllEmployee();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    public boolean addEmployee(Employee employee) {
        try {
            connection = JBDCUtils.getConnection();
            if (connection == null) return false; // Handle connection failure
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            if (employeeDAO.isUsernameExists(employee.getUsername())) {
                javax.swing.JOptionPane.showMessageDialog(null, "Username đã tồn tại, hãy chọn tên khác");
                return false;
            } else {
                boolean success = employeeDAO.addEmployee(employee); 
                return success;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    public boolean updateEmployee(Employee employee) {
        try {
            connection = JBDCUtils.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            employeeDAO.updateEmployee(employee);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    public boolean deleteEmployee(int employeeId) {
        try {
            connection = JBDCUtils.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            employeeDAO.deleteEmployee(employeeId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    public Employee getEmployeeById(int employeeId) {
        try {
            connection = JBDCUtils.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            return employeeDAO.getEmployeeById(employeeId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    public int getIdByUsername(String username)
    {
        try {
            connection = JBDCUtils.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            int employeeId = employeeDAO.getIdByUsername(username);
            return employeeId;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        finally
        {
            JBDCUtils.closeConnection(connection);
        }
    }
}
