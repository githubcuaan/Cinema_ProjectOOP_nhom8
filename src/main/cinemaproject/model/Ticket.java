package main.cinemaproject.model;

public class Ticket {
    private int id;
    private int movieId;  // Khóa ngoại từ bảng movies
    private int customerId;  // Khóa ngoại từ bảng customers
    private double price;  // Giá vé
    private String purchaseDate;  // Định dạng yyyy-mm-dd
    private String seatNumber;  // Số ghế ngồi

    // Constructor không tham số
    public Ticket() {}

    // Constructor có tham số
    public Ticket(int id, int movieId, int customerId, double price, String purchaseDate, String seatNumber) {
        this.id = id;
        this.movieId = movieId;
        this.customerId = customerId;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.seatNumber = seatNumber;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Override phương thức toString() để in thông tin vé
    @Override
    public String toString() {
        return "Ticket{" +
               "id=" + id +
               ", movieId=" + movieId +
               ", customerId=" + customerId +
               ", price=" + price +
               ", purchaseDate='" + purchaseDate + '\'' +
               ", seatNumber='" + seatNumber + '\'' +
               '}';
    }
}
