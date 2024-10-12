package main.cinemaproject.dao;

import main.cinemaproject.model.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomersDAO implements ICustomerDAO {
    private Connection connection;

    public CustomersDAO(Connection connection) {
        this.connection = connection;
    }

    //lấy tất cả thông tin khách hàng
    @Override
    public List<Customers> getAllCustomers() {
        List<Customers> customers = new ArrayList<>();
        String query = "SELECT * FROM customers";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                 int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                customers.add(new Customers(id, name, email, phone));
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
        try (PreparedStatement statement = connection.prepareStatement(query)) 
        {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) 
            {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                return new Customers(id, name, email, phone);
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
    public void addCustomer(Customers customer) {
        String query = "INSERT INTO customers (id, name, email, phone, username, password) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, customer.getId());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getEmail());
            statement.setString(4, customer.getPhone());
            statement.setString(5, customer.getUsername());
            statement.setString(6, customer.getPassword());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //cập nhật thông tin khách hàng
    @Override
    public void updateCustomer(Customers customer) {
        String query = "UPDATE customers SET name = ?, email = ?, phone = ?, username = ?, password = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getEmail());
            statement.setString(3, customer.getPhone());
            statement.setString(4, customer.getUsername());
            statement.setString(5, customer.getPassword());
            statement.setInt(6, customer.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //xóa khách hàng theo id
    @Override
    public void deleteCustomer(int id) {
        String query = "DELETE FROM customers WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
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
                        null 
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
}