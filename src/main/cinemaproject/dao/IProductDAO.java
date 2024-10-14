package main.cinemaproject.dao;

import java.util.List;
import main.cinemaproject.model.Product;

public interface IProductDAO {
    // Phương thức lấy danh sách sản phẩm
    List<Product> getAllProducts();

    // Phương thức thêm sản phẩm
    boolean addProduct(Product product);

    // Phương thức cập nhật thông tin sản phẩm
    boolean updateProduct(Product product);

    // Phương thức xóa sản phẩm
    boolean deleteProduct(int id);

    // Phương thức lấy sản phẩm theo ID
    Product getProductById(int id);

    // Phương thức kiểm tra tồn tại sản phẩm
    boolean isProductExist(String name, String nhaCungCap);

    // Phương thức lấy sản phẩm theo tên và nhà cung cấp
    Product getProductByNameAndSupplier(String name, String nhaCungCap);
}
