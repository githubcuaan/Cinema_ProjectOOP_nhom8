package main.cinemaproject.model;

public class Movie {
    private int id;
    private String name;
    private String genre;
    private String releaseDate;  // Định dạng yyyy-mm-dd
    private String director;
    private int duration;  // Thời lượng phim tính bằng phút

    // Constructor không tham số
    public Movie() {}

    // Constructor có tham số
    public Movie(int id, String name, String genre, String releaseDate, String director, int duration) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.duration = duration;
    }

    public Movie(String name, String genre, String releaseDate, String director, int duration) {
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.duration = duration;
    }
    
    

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Override phương thức toString() để dễ dàng in thông tin
    @Override
    public String toString() {
        return "Movie{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", genre='" + genre + '\'' +
               ", releaseDate='" + releaseDate + '\'' +
               ", director='" + director + '\'' +
               ", duration=" + duration +
               '}';
    }
}
