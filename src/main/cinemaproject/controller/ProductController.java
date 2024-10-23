package main.cinemaproject.controller;

import main.cinemaproject.dao.ProductDAO;
import main.cinemaproject.model.Product;
import main.cinemaproject.utils.JBDCUtils;

import java.sql.Connection;
import java.util.List;

public class ProductController {
    
    public List<Product> getAllProducts() {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            return productDAO.getAllProducts();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //thêm sản phẩm
    public boolean addProduct(Product product) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            productDAO.addProduct(product);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //cập nhật sản phẩm
    public boolean updateProduct(Product product) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            productDAO.updateProduct(product);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //xóa sản phẩm theo id
    public boolean deleteProduct(int productId) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            productDAO.deleteProduct(productId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //lấy sản phẩm theo id
    public Product getProductById(int productId) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            return productDAO.getProductById(productId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //kiểm tra sản phẩm có tồn tại không
    public boolean isProductExist(String name, String supplier) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            return productDAO.isProductExist(name, supplier);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //lấy sản phẩm theo tên và nhà cung cấp
    public Product getProductByNameAndSupplier(String name, String supplier) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            ProductDAO productDAO = new ProductDAO(connection);
            return productDAO.getProductByNameAndSupplier(name, supplier);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally { 
            JBDCUtils.closeConnection(connection);
        }
    }
}
