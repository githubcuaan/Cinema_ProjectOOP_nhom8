package main.cinemaproject.dao;

import main.cinemaproject.model.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import main.cinemaproject.database.JBDCUntil;

public class CustomersDAO implements ICustomerDAO {
    private Connection connection;

    public CustomersDAO() {
        this.connection = JBDCUntil.getConnection();
    }

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

    //thêm khách hàng
    @Override
    public boolean addCustomer(Customers customer) {
        String checkUsernameQuery = "SELECT COUNT(*) FROM customers WHERE username = ?";
        String addCustomerQuery = "INSERT INTO customers (name, email, phone, username, password, membershipLevel) VALUES (?, ?, ?, ?, ?, ?)";

        Connection localConnection = null;
        PreparedStatement checkUsernameStmt = null;
        PreparedStatement customerStmt = null;

        try {
            localConnection = this.connection;
            localConnection.setAutoCommit(false);

            // Kiểm tra xem username đã tồn tại chưa
            checkUsernameStmt = localConnection.prepareStatement(checkUsernameQuery);
            checkUsernameStmt.setString(1, customer.getUsername());
            ResultSet resultSet = checkUsernameStmt.executeQuery();
            if (resultSet.next() && resultSet.getInt(1) > 0) {
                throw new SQLException("Username already exists");
            }

            // Thêm khách hàng
            customerStmt = localConnection.prepareStatement(addCustomerQuery, Statement.RETURN_GENERATED_KEYS);
            customerStmt.setString(1, customer.getName());
            customerStmt.setString(2, customer.getEmail());
            customerStmt.setString(3, customer.getPhone());
            customerStmt.setString(4, customer.getUsername());
            customerStmt.setString(5, customer.getPassword());
            customerStmt.setString(6, customer.getMembershipLevel());

            int affectedRows = customerStmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating customer failed, no rows affected.");
            }

            localConnection.commit();
            return true;
        } catch (SQLException e) {
            if (localConnection != null) {
                try {
                    localConnection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (e.getMessage().equals("Username already exists")) {
                javax.swing.JOptionPane.showMessageDialog(null, "Lỗi: Tên tài khoản đã tồn tại. Vui lòng chọn tên tài khoản khác.", "Lỗi đăng ký", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (e instanceof java.sql.SQLDataException) {
                javax.swing.JOptionPane.showMessageDialog(null, "Lỗi: Sai kiểu dữ liệu. Vui lòng kiểm tra lại thông tin nhập vào.", "Lỗi dữ liệu", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi thêm khách hàng. Vui lòng thử lại.", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            return false;
        } finally {
            if (checkUsernameStmt != null) try { checkUsernameStmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (customerStmt != null) try { customerStmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (localConnection != null) {
                try {
                    localConnection.setAutoCommit(true);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //tìm kiếm khách hàng
    @Override
    public ArrayList<Customers> searchCustomers(String searchTerm) {
        ArrayList<Customers> filteredCustomers = new ArrayList<>();
        String sql = "SELECT * FROM customers WHERE name LIKE ? OR email LIKE ? OR phone LIKE ?";
        try (Connection conn = JBDCUntil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            String likeSearchTerm = "%" + searchTerm + "%";
            pstmt.setString(1, likeSearchTerm);
            pstmt.setString(2, likeSearchTerm);
            pstmt.setString(3, likeSearchTerm);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Customers customer = new Customers();
                // Set customer properties from ResultSet
                filteredCustomers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filteredCustomers;
    }
}
