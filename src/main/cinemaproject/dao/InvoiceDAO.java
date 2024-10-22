package main.cinemaproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import main.cinemaproject.database.JBDCUntil;
import main.cinemaproject.model.Invoice;

public class InvoiceDAO {
    private Connection connection;
    public InvoiceDAO(Connection connection) {
        this.connection = JBDCUntil.getConnection();
    }
    
    public int addInvoice(Invoice invoice) {
        String sql = "INSERT INTO invoices (customer_id, total_amount, purchase_date) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, invoice.getCustomer_id());
            preparedStatement.setDouble(2, invoice.getTotal_amount());
            preparedStatement.setDate(3, new java.sql.Date(invoice.getPurchase_date().getTime()));
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0; // Return 0 to indicate failure
        }
    }
}
