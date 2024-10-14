package main.cinemaproject.controller;

import main.cinemaproject.dao.EmployeeDAO;
import main.cinemaproject.dao.CustomersDAO;
import main.cinemaproject.model.Employee;
import main.cinemaproject.model.Customers;
import main.cinemaproject.database.JBDCUntil;

import java.sql.Connection;

public class AuthController {
    //đăng nhập nhân viên
    public Employee loginEmployee(String username, String password) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            return employeeDAO.login(username, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    //đăng nhập khách hàng
    public Customers loginCustomer(String username, String password) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            return customersDAO.login(username, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    //đăng ký khách hàng
    public boolean registerCustomer(String username, String email, String password) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            return customersDAO.register(username, email, password);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }
}

