package main.cinemaproject.controller;

import main.cinemaproject.dao.EmployeeDAO;
import main.cinemaproject.dao.CustomersDAO;
import main.cinemaproject.model.Employee;
import main.cinemaproject.model.Customers;
import main.cinemaproject.utils.JBDCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AuthController {
    private Connection connection;

    //đăng nhập nhân viên
    public Employee loginEmployee(String username, String password) {
        try {
            connection = JBDCUtils.getConnection();
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            return employeeDAO.login(username, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //đăng nhập khách hàng
    public Customers loginCustomer(String username, String password) {
        try {
            connection = JBDCUtils.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            if (isUsernameTaken(username)) {
                return customersDAO.login(username, password);
            } else {
                return null; // Username does not exist
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //đăng ký khách hàng
    public boolean registerCustomer(String username, String email, String password) {
        try {
            connection = JBDCUtils.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            if (!isUsernameTaken(username)) {
                return customersDAO.register(username, email, password);
            } else {
                JOptionPane.showMessageDialog(null, "Tên đăng nhập đã tồn tại. Vui lòng chọn tên khác.");
                return false; // Username already exists
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra trong quá trình đăng ký. Vui lòng thử lại sau.");
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    // Kiểm tra xem tên người dùng đã tồn tại chưa
    public boolean isUsernameTaken(String username) {
        String query = "SELECT COUNT(*) FROM customers WHERE username = ?";
        try (Connection connection = JBDCUtils.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0; // Trả về true nếu có ít nhất 1 bản ghi
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Trả về false nếu không có lỗi xảy ra và không tìm thấy tên người dùng
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
