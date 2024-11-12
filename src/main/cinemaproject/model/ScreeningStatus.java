package main.cinemaproject.model;

import java.sql.Time;
import java.util.Date;

public class ScreeningStatus {
    private int id;
    private int theater_id;
    private int movieId;
    private Time showtime;
    private Date showdate;
    private double price;
    private int seatsAvailable;
    private int totalSeats;

    // Constructor không tham số
    public ScreeningStatus() {}

    // Constructor có tham số
    public ScreeningStatus(int id, int theater_id, int movieId, Time showtime, Date showdate,double price, int seatsAvailable, int totalSeats) {
        this.id = id;
        this.theater_id = theater_id;
        this.movieId = movieId;
        this.showtime = showtime;
        this.showdate = showdate;
        this.price = price;
        this.seatsAvailable = seatsAvailable;
        this.totalSeats = totalSeats;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTheaterId() {
        return theater_id;
    }

    public void setTheater(int theater_id) {
        this.theater_id = theater_id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public Time getShowtime() {
        return showtime;
    }

    public void setShowtime(Time showtime) {
        this.showtime = showtime;
    }

    public Date getShowdate() {
        return showdate;
    }

    public void setShowdate(Date showdate) {
        this.showdate = showdate;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ScreeningStatus{" +
               "id=" + id +
               ", theater='" + theater_id + '\'' +
               ", movieId=" + movieId +
               ", showtime=" + showtime +
               ", showdate=" + showdate +
               ", seatsAvailable=" + seatsAvailable +
               ", totalSeats=" + totalSeats +
               ", price=" + price +
               '}';
    }
}

