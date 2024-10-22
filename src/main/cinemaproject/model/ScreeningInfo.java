package main.cinemaproject.model;

//lớp ScreeningInfo được tạo ra để lưu trữ kết quả truy vấn từ ScreeningStatus.

public class ScreeningInfo {
    private String theater;
    private String movieName;
    private String showtime;
    private String status;
    private double price;
    public ScreeningInfo(String theater, String movieName, String showtime, double price, String status) {
        this.theater = theater;
        this.movieName = movieName;
        this.showtime = showtime;
        this.price = price;
        this.status = status;
    }

    public ScreeningInfo() 
    {}

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
