package main.cinemaproject.dao;

import main.cinemaproject.model.Employee;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO implements IEmployeeDAO{
    private Connection connection;

    public EmployeeDAO(Connection connection) {
        this.connection = connection;
    }
    @Override
    public Employee getEmployeeById(int id) {
        String query = "SELECT * FROM employees WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Employee(
                        resultSet.getInt("id"), 
                        resultSet.getString("name"), 
                        resultSet.getString("email"), 
                        resultSet.getString("phone"), 
                        resultSet.getString("role"), 
                        resultSet.getDouble("salary"),
                        resultSet.getString("username"),
                        resultSet.getString("password")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi lấy thông tin nhân viên: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Employee> getAllEmployee() {
        ArrayList<Employee> eList = new ArrayList<>();
        String query = "SELECT * FROM employees";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                // Tạo đối tượng Employee từ dữ liệu trong ResultSet
                Employee employee = new Employee(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getString("role"),
                    resultSet.getDouble("salary")
                );
                eList.add(employee);
            }
        } catch (SQLException e) {
            // Ghi log lỗi
            System.err.println("Lỗi khi lấy danh sách nhân viên: " + e.getMessage());
            e.printStackTrace();
        }
        return eList;
    }

    @Override
    public Employee login(String username, String password) {
        String query = "SELECT * FROM employees WHERE username = ? AND password = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        resultSet.getString("role"),
                        resultSet.getDouble("salary"),
                        null, // Don't return the password
                        resultSet.getString("username")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String[] getEmployeeCredentials(int employeeId) throws SQLException {
        String query = "SELECT username, password FROM employees WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, employeeId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new String[]{resultSet.getString("username"), resultSet.getString("password")};
                }
            }
        }
        return new String[]{"", ""};
    }

    @Override
    public void deleteEmployee(int employeeId) throws SQLException {
        String query = "DELETE FROM employees WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, employeeId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Xóa nhân viên thất bại, không tìm thấy ID: " + employeeId);
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi xóa nhân viên: " + e.getMessage());
            throw e; // Re-throw để caller có thể xử lý
        }
    }

    public void updateEmployee(Employee employee) throws SQLException {
        String query = "UPDATE employees SET name = ?, email = ?, phone = ?, salary = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getEmail());
            statement.setString(3, employee.getPhone());
            statement.setDouble(4, employee.getSalary());
            statement.setInt(5, employee.getId());
            statement.executeUpdate();
        }
    }

    public void updateEmployeeCredentials(int employeeId, String username, String password) throws SQLException {
        String query = "UPDATE employees SET username = ?, password = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setInt(3, employeeId);
            statement.executeUpdate();
        }
    }

    public int addEmployee(Employee employee) throws SQLException {
        String query = "INSERT INTO employees (name, email, phone, role, salary, username, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getEmail());
            statement.setString(3, employee.getPhone());
            statement.setString(4, employee.getRole());
            statement.setDouble(5, employee.getSalary());
            statement.setString(6, employee.getUsername()); // Thêm username
            statement.setString(7, employee.getPassword()); // Thêm password
            statement.executeUpdate();
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                }
            }
        }
        return -1;
    }

    public void addEmployeeCredentials(int employeeId, String username, String password) throws SQLException {
        String query = "UPDATE employees SET username = ?, password = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setInt(3, employeeId);
            statement.executeUpdate();
        }
    }

    public boolean isUsernameExists(String username) throws SQLException {
        String query = "SELECT COUNT(*) FROM employees WHERE username = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }

}
