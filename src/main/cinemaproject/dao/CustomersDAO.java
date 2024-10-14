package main.cinemaproject.dao;

import main.cinemaproject.model.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

public class CustomersDAO implements ICustomerDAO {
    private Connection connection;

    public CustomersDAO(Connection connection) {
        this.connection = connection;
    }

    //lấy tất cả thông tin khách hàng
    @Override
    public ArrayList<Customers> getAllCustomers() {
        ArrayList<Customers> customers = new ArrayList<>();
        String query = "SELECT * FROM customers";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String membershipLevel = resultSet.getString("membershipLevel");
                customers.add(new Customers(id, name, email, phone, username, password, membershipLevel));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    //lấy thông tin khách hàng theo id
    @Override
    public Customers getCustomerById(int id) {
        String query = "SELECT * FROM customers WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) 
            {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String membershipLevel = resultSet.getString("membershipLevel");
                return new Customers(id, name, email, phone, username, password, membershipLevel);
            }
        } 
        catch (SQLException e) 
            {
                e.printStackTrace();
            }
        return null;
    }

    //thêm khách hàng
    @Override
    public boolean addCustomer(Customers customer) {
        String query = "INSERT INTO customers (name, email, phone, username, password, membershipLevel) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getEmail());
            statement.setString(3, customer.getPhone());
            statement.setString(4, customer.getUsername());
            statement.setString(5, customer.getPassword());
            statement.setString(6, customer.getMembershipLevel());
            int affectedRows = statement.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //cập nhật thông tin khách hàng
    @Override
    public boolean updateCustomer(Customers customer) {
        String query = "UPDATE customers SET name = ?, email = ?, phone = ?, username = ?, password = ?, membershipLevel = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getEmail());
            statement.setString(3, customer.getPhone());
            statement.setString(4, customer.getUsername());
            statement.setString(5, customer.getPassword());
            statement.setString(6, customer.getMembershipLevel());
            statement.setInt(7, customer.getId());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //xóa khách hàng theo id
    @Override
    public boolean deleteCustomer(int id) {
        String query = "DELETE FROM customers WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //đăng nhập
    @Override
    public Customers login(String username, String password) {
        String query = "SELECT * FROM customers WHERE username = ? AND password = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password); 
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Customers(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("membershipLevel")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //đăng ký
    @Override
    public boolean register(String username, String email, String password) {
        String query = "INSERT INTO customers (username, email, password) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, email);
            statement.setString(3, password);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Add customer credentials
    @Override
    public void addCustomerCredentials(int customerId, String username, String password) {
        String sql = "INSERT INTO customers (customer_id, username, password) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, customerId);
            stmt.setString(2, username);
            stmt.setString(3, password);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Consider logging the error or throwing a custom exception
        }
    }

    // Get customer credentials
    @Override
    public String[] getCustomerCredentials(int customerId) {
        String sql = "SELECT username, password FROM customers WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, customerId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new String[]{rs.getString("username"), rs.getString("password")};
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Consider logging the error or throwing a custom exception
        }
        return null;
    }

    // Update customer credentials
    @Override
    public void updateCustomerCredentials(int customerId, String username, String password) {
        String sql = "UPDATE customers SET username = ?, password = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setInt(3, customerId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Consider logging the error or throwing a custom exception
        }
    }

    // Delete customer credentials
    public void deleteCustomerCredentials(int customerId) {
        String sql = "DELETE FROM customers WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, customerId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Consider logging the error or throwing a custom exception
        }
    }
}
