package main.cinemaproject.model;

//lớp MovieStatistics được tạo ra để lưu trữ thông tin thống kê về phim ở trang DoanhThu.
public class MovieStatistics {
    private String movieName;
    private String director;
    private String releaseDate;
    private int totalTicketsSold;
    private double totalRevenue;

    public MovieStatistics(String movieName, String director, String releaseDate, int totalTicketsSold, double totalRevenue) {
        this.movieName = movieName;
        this.director = director;
        this.releaseDate = releaseDate;
        this.totalTicketsSold = totalTicketsSold;
        this.totalRevenue = totalRevenue;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDirector() {
        return director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getTotalTicketsSold() {
        return totalTicketsSold;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    @Override
    public String toString() {
        return "Movie: " + movieName + ", Director: " + director + ", Release Date: " + releaseDate +
               ", Tickets Sold: " + totalTicketsSold + ", Total Revenue: " + totalRevenue;
    }
}
