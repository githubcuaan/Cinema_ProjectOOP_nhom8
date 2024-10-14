package main.cinemaproject.controller;

import main.cinemaproject.dao.ProductDAO;
import main.cinemaproject.model.Product;
import main.cinemaproject.database.JBDCUntil;

import java.sql.Connection;
import java.util.List;

public class ProductController {
    
    public List<Product> getAllProducts() {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            return productDAO.getAllProducts();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    public boolean addProduct(Product product) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            productDAO.addProduct(product);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    public boolean updateProduct(Product product) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            productDAO.updateProduct(product);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    public boolean deleteProduct(int productId) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            productDAO.deleteProduct(productId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }

    public Product getProductById(int productId) {
        Connection connection = null;
        try {
            connection = JBDCUntil.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            return productDAO.getProductById(productId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUntil.closeConnection(connection);
        }
    }
}
