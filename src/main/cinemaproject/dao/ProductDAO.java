package main.cinemaproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.cinemaproject.model.Product;

public class ProductDAO implements IProductDAO {
    private Connection connection;

    public ProductDAO(Connection connection) {
        this.connection = connection;
    }

    // Phương thức lấy danh sách sản phẩm 
    @Override
    public List<Product> getAllProducts() {
        String query = "SELECT * FROM products";
        List<Product> products = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Product product = new Product(
                        resultSet.getInt("id"),
                        resultSet.getString("ten"),
                        resultSet.getString("loai_san_pham"),
                        resultSet.getDouble("gia_ban"),
                        resultSet.getInt("so_luong"),
                        resultSet.getString("nha_cung_cap")
                    );
                    products.add(product);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return products;
    }

    // Phương thức thêm sản phẩm
    @Override
    public boolean addProduct(Product product) {
        String query = "INSERT INTO products (ten, loai_san_pham, gia_ban, so_luong, nha_cung_cap) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, product.getTen());
            statement.setString(2, product.getLoaiSanPham());
            statement.setDouble(3, product.getGiaBan());
            statement.setInt(4, product.getSoLuong());
            statement.setString(5, product.getNhaCungCap());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức cập nhật thông tin sản phẩm
    @Override
    public boolean updateProduct(Product product) {
        String query = "UPDATE products SET ten = ?, loai_san_pham = ?, gia_ban = ?, so_luong = ?, nha_cung_cap = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, product.getTen());
            statement.setString(2, product.getLoaiSanPham());
            statement.setDouble(3, product.getGiaBan());
            statement.setInt(4, product.getSoLuong());
            statement.setString(5, product.getNhaCungCap());
            statement.setInt(6, product.getId());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức xóa sản phẩm
    @Override
    public boolean deleteProduct(int id) {
        String query = "DELETE FROM products WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức lấy sản phẩm theo ID
    @Override
    public Product getProductById(int id) {
        String query = "SELECT * FROM products WHERE id = ?";
        Product product = null;
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                product = new Product(
                    resultSet.getInt("id"),
                    resultSet.getString("ten"),
                    resultSet.getString("loai_san_pham"),
                    resultSet.getDouble("gia_ban"),
                    resultSet.getInt("so_luong"),
                    resultSet.getString("nha_cung_cap")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean isProductExist(String name, String nhaCungCap) {
        String sql = "SELECT COUNT(*) FROM products WHERE ten = ? AND nha_cung_cap = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, nhaCungCap);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Log the error or throw a custom exception
        }
        return false;
    }

    @Override
    public Product getProductByNameAndSupplier(String name, String nhaCungCap) {
        String sql = "SELECT * FROM products WHERE ten = ? AND nha_cung_cap = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, nhaCungCap);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Product(
                        rs.getInt("id"),
                        rs.getString("ten"),
                        rs.getString("loai_san_pham"),
                        rs.getDouble("gia_ban"),
                        rs.getInt("so_luong"),
                        rs.getString("nha_cung_cap")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
