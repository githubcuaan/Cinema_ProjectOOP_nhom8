package main.cinemaproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.cinemaproject.utils.JBDCUtils;
import main.cinemaproject.model.Invoice;

public class InvoiceDAO {
    private Connection connection;
    public InvoiceDAO(Connection connection) {
        this.connection = JBDCUtils.getConnection();
    }
    
    public int addInvoice(Invoice invoice) {
        String sql = "INSERT INTO invoices (customer_id, total_amount, purchase_date) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setInt(1, invoice.getCustomer_id());
            preparedStatement.setDouble(2, invoice.getTotal_amount());
            preparedStatement.setDate(3, new java.sql.Date(invoice.getPurchase_date().getTime()));
            
            // Thực hiện cập nhật
            preparedStatement.executeUpdate();
            
            // Lấy invoiceId vừa được tạo
            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1); // Trả về invoiceId
                } else {
                    throw new SQLException("Không thể lấy invoiceId, không có khóa được tạo.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0; // Trả về 0 để chỉ ra lỗi
        }
    }
}
