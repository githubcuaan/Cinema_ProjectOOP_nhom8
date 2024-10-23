package main.cinemaproject.controller;

import main.cinemaproject.dao.InvoiceDAO;
import main.cinemaproject.model.Invoice;
import main.cinemaproject.utils.JBDCUtils;
import java.sql.Connection;

public class InvoiceController {
    private InvoiceDAO invoiceDAO;
    private Connection connection = JBDCUtils.getConnection();
    
    public InvoiceController() {
        this.invoiceDAO = new InvoiceDAO(connection);
    }

    public void addInvoice(Invoice invoice) {
        invoiceDAO.addInvoice(invoice);
    }
}
