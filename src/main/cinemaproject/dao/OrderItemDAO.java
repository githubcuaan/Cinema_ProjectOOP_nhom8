package main.cinemaproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.cinemaproject.model.OrderItem;

public class OrderItemDAO {
    private Connection connection;

    public OrderItemDAO(Connection connection) {
        this.connection = connection;
    }

    public void addOrderItem(OrderItem orderItem) throws SQLException {
        String sql = "INSERT INTO order_items (product_id, invoice_id, quantity, price) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, orderItem.getProductId());
            statement.setInt(2, orderItem.getInvoiceId());
            statement.setInt(3, orderItem.getQuantity());
            statement.setDouble(4, orderItem.getPrice());
            statement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public OrderItem getOrderItemById(int id) throws SQLException {
        String sql = "SELECT * FROM order_items WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new OrderItem(
                    resultSet.getInt("product_id"),
                    resultSet.getInt("invoice_id"),
                    resultSet.getInt("quantity"),
                    resultSet.getDouble("price")
                );
            }
        }
        return null; // Return null if not found
    }

    public void updateOrderItem(OrderItem orderItem) throws SQLException {
        String sql = "UPDATE order_items SET product_id = ?, invoice_id = ?, quantity = ?, price = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, orderItem.getProductId());
            statement.setInt(2, orderItem.getInvoiceId());
            statement.setInt(3, orderItem.getQuantity());
            statement.setDouble(4, orderItem.getPrice());
            statement.setInt(5, orderItem.getId()); // Assuming OrderItem has a getId() method
            statement.executeUpdate();
        }
    }

    public void deleteOrderItem(int id) throws SQLException {
        String sql = "DELETE FROM order_items WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }

    public List<OrderItem> getAllOrderItems() throws SQLException {
        List<OrderItem> orderItems = new ArrayList<>();
        String sql = "SELECT * FROM order_items";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                orderItems.add(new OrderItem(
                    resultSet.getInt("product_id"),
                    resultSet.getInt("invoice_id"),
                    resultSet.getInt("quantity"),
                    resultSet.getDouble("price")
                ));
            }
        }
        return orderItems;
    }

    public List<OrderItem> getOrderItemsByInvoiceId(int invoiceId) throws SQLException {
        List<OrderItem> orderItems = new ArrayList<>();
        String sql = "SELECT * FROM order_items WHERE invoice_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, invoiceId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                orderItems.add(new OrderItem(
                    resultSet.getInt("product_id"),
                    resultSet.getInt("invoice_id"),
                    resultSet.getInt("quantity"),
                    resultSet.getDouble("price")
                ));
            }
        }
        return orderItems;
    }

    public double calculateTotalAmount(int invoiceId) throws SQLException {
        double totalAmount = 0.0;
        String sql = "SELECT SUM(price * quantity) AS total FROM order_items WHERE invoice_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, invoiceId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                totalAmount = resultSet.getDouble("total");
            }
        }
        return totalAmount; // Trả về tổng tiền hàng
    }

}
