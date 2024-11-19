package main.cinemaproject.controller;

import main.cinemaproject.dao.InvoiceDAO;
import main.cinemaproject.model.Invoice;
import main.cinemaproject.utils.JBDCUtils;
import java.sql.Connection;
import java.sql.SQLException;

public class InvoiceController {
    private InvoiceDAO invoiceDAO;
    private Connection connection;
    
    public InvoiceController() {
        this.connection = JBDCUtils.getConnection();
        this.invoiceDAO = new InvoiceDAO(connection);
    }

    public int addInvoice(Invoice invoice) {
        return invoiceDAO.addInvoice(invoice);
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Xử lý ngoại lệ nếu cần
            }
        }
    }
}
