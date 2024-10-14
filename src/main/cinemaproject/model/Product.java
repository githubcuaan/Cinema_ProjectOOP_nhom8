package main.cinemaproject.model;

public class Product {
    private int id;
    private String ten;
    private String loaiSanPham;
    private double giaBan;
    private int soLuong;
    private String nhaCungCap;

    // Constructor không tham số
    public Product() {
    }

    // Constructor đầy đủ tham số
    public Product(int id, String ten, String loaiSanPham, double giaBan, int soLuong, String nhaCungCap) {
        this.id = id;
        this.ten = ten;
        this.loaiSanPham = loaiSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaCungCap = nhaCungCap;
    }

    // Getter và Setter cho từng thuộc tính
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    // Phương thức toString để hiển thị thông tin sản phẩm
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", loaiSanPham='" + loaiSanPham + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaCungCap='" + nhaCungCap + '\'' +
                '}';
    }
}
