package main.cinemaproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.cinemaproject.model.Movie;
import main.cinemaproject.model.MovieStatistics;

public class MovieDAO implements IMovieDAO {
    private Connection connection;

    public MovieDAO(Connection connection) {
        this.connection = connection;
    }
    // Phương thức thêm một bộ phim vào cơ sở dữ liệu
    @Override
    public void addMovie(Movie movie) {
        String query = "INSERT INTO movies (name, genre, release_date, director, duration) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, movie.getName());
            statement.setString(2, movie.getGenre());
            statement.setString(3, movie.getReleaseDate());
            statement.setString(4, movie.getDirector());
            statement.setInt(5, movie.getDuration());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Phương thức tìm bộ phim bằng ID
    @Override
    public Movie getMovieById(int id) {
        String query = "SELECT * FROM movies WHERE id = ?";
        Movie movie = null;

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            statement.setInt(1, id);
            if (resultSet.next()) {
                movie = new Movie(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("genre"),
                        resultSet.getString("release_date"),
                        resultSet.getString("director"),
                        resultSet.getInt("duration")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movie;
    }

    // Phương thức lấy tất cả các phim
    @Override
    public ArrayList<Movie> getAllMovies() {
        String query = "SELECT * FROM movies";
        ArrayList<Movie> movies = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Movie movie = new Movie(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("genre"),
                        resultSet.getString("release_date"),
                        resultSet.getString("director"),
                        resultSet.getInt("duration")
                );
                movies.add(movie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movies;
    }

    // Phương thức cập nhật thông tin phim
    @Override
    public void updateMovie(Movie movie) {
        String query = "UPDATE movies SET name = ?, genre = ?, release_date = ?, director = ?, duration = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, movie.getName());
            statement.setString(2, movie.getGenre());
            statement.setString(3, movie.getReleaseDate());
            statement.setString(4, movie.getDirector());
            statement.setInt(5, movie.getDuration());
            statement.setInt(6, movie.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Phương thức xóa phim
    @Override
    public void deleteMovie(int id) {
        String query = "DELETE FROM movies WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
    // Phương thức lấy danh sách phim kèm số vé bán và tổng doanh thu trong khoảng thời gian
    public List<MovieStatistics> getMovieStatistics(String startDate, String endDate) {
        String query = "SELECT m.name AS movie_name, m.director, m.release_date, " +
                       "COUNT(t.id) AS total_tickets_sold, SUM(t.price) AS total_revenue " +
                       "FROM movies m " +
                       "LEFT JOIN tickets t ON m.id = t.movie_id " +
                       "WHERE t.purchase_date BETWEEN ? AND ? " +
                       "GROUP BY m.id, m.name, m.director, m.release_date";
        
        List<MovieStatistics> movieStatsList = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, startDate);
            stmt.setString(2, endDate);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String movieName = rs.getString("movie_name");
                String director = rs.getString("director");
                String releaseDate = rs.getString("release_date");
                int totalTicketsSold = rs.getInt("total_tickets_sold");
                double totalRevenue = rs.getDouble("total_revenue");

                MovieStatistics movieStats = new MovieStatistics(movieName, director, releaseDate, totalTicketsSold, totalRevenue);
                movieStatsList.add(movieStats);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return movieStatsList;
    }
    // Phương thức lấy danh sách phim kèm số vé bán và tổng doanh thu
    public List<MovieStatistics> getMovieStatistics() {
        String query = "SELECT m.name AS movie_name, m.director, m.release_date, " +
                       "COUNT(t.id) AS total_tickets_sold, SUM(t.price) AS total_revenue " +
                       "FROM movies m " +
                       "LEFT JOIN tickets t ON m.id = t.movie_id " +
                       "GROUP BY m.id, m.name, m.director, m.release_date";
        
        List<MovieStatistics> movieStatsList = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String movieName = rs.getString("movie_name");
                String director = rs.getString("director");
                String releaseDate = rs.getString("release_date");
                int totalTicketsSold = rs.getInt("total_tickets_sold");
                double totalRevenue = rs.getDouble("total_revenue");

                MovieStatistics movieStats = new MovieStatistics(movieName, director, releaseDate, totalTicketsSold, totalRevenue);
                movieStatsList.add(movieStats);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return movieStatsList;
    }

    // Phương thức lấy danh sách phim kèm số vé bán và tổng doanh thu trong khoảng thời gian từ tên phim và khoảng thời gian
    public List<MovieStatistics> getMovieStatistics(String movieName, String startDate, String endDate) {
        String query = "SELECT m.name AS movie_name, m.director, m.release_date, " +
                       "COUNT(t.id) AS total_tickets_sold, SUM(t.price) AS total_revenue " +
                       "FROM movies m " +
                       "LEFT JOIN tickets t ON m.id = t.movie_id " +
                       "WHERE m.name = ? AND t.purchase_date BETWEEN ? AND ? " +
                       "GROUP BY m.id, m.name, m.director, m.release_date";
        
        List<MovieStatistics> movieStatsList = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, movieName);
            stmt.setString(2, startDate);
            stmt.setString(3, endDate);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String movieNameResult = rs.getString("movie_name");
                String director = rs.getString("director");
                String releaseDate = rs.getString("release_date");
                int totalTicketsSold = rs.getInt("total_tickets_sold");
                double totalRevenue = rs.getDouble("total_revenue");

                MovieStatistics movieStats = new MovieStatistics(movieNameResult, director, releaseDate, totalTicketsSold, totalRevenue);
                movieStatsList.add(movieStats);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return movieStatsList;
    }

    // Phương thức lấy danh sách phim kèm số vé bán và tổng doanh thu trong khoảng thời gian từ tên phim
    public List<MovieStatistics> getMovieStatistics(String movieName) {
        String query = "SELECT m.name AS movie_name, m.director, m.release_date, " +
                       "COUNT(t.id) AS total_tickets_sold, SUM(t.price) AS total_revenue " +
                       "FROM movies m " +
                       "LEFT JOIN tickets t ON m.id = t.movie_id " +
                       "WHERE m.name = ? " +
                       "GROUP BY m.id, m.name, m.director, m.release_date";
        
        List<MovieStatistics> movieStatsList = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, movieName);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String movieNameResult = rs.getString("movie_name");
        
                String director = rs.getString("director");
                String releaseDate = rs.getString("release_date");
                int totalTicketsSold = rs.getInt("total_tickets_sold");
                double totalRevenue = rs.getDouble("total_revenue");

                MovieStatistics movieStats = new MovieStatistics(movieNameResult, director, releaseDate, totalTicketsSold, totalRevenue);
                movieStatsList.add(movieStats);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return movieStatsList;
    }
}


