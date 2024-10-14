package main.cinemaproject.dao;

import main.cinemaproject.model.ScreeningStatus;
import main.cinemaproject.database.JBDCUntil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScreeningStatusDAO implements IScreeningStatusDAO {
    
    public boolean addScreening(ScreeningStatus screening) {
        String sql = "INSERT INTO screenings (movie_id, theater, showtime, showdate, seats_available, total_seats) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = JBDCUntil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, screening.getMovieId());
            pstmt.setString(2, screening.getTheater());
            pstmt.setTime(3, screening.getShowtime());
            pstmt.setDate(4, new java.sql.Date(screening.getShowdate().getTime()));
            pstmt.setInt(5, screening.getSeatsAvailable());
            pstmt.setInt(6, screening.getTotalSeats());
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ScreeningStatus getScreeningById(int id) {
        String sql = "SELECT * FROM screenings WHERE id = ?";
        try (Connection conn = JBDCUntil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                return new ScreeningStatus(
                    rs.getInt("id"),
                    rs.getString("theater"),
                    rs.getInt("movie_id"),
                    rs.getTime("showtime"),
                    rs.getDate("showdate"),
                    rs.getInt("seats_available"),
                    rs.getInt("total_seats")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<ScreeningStatus> getAllScreenings() {
        List<ScreeningStatus> screenings = new ArrayList<>();
        String sql = "SELECT * FROM screenings";
        try (Connection conn = JBDCUntil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                screenings.add(new ScreeningStatus(
                    rs.getInt("id"),
                    rs.getString("theater"),
                    rs.getInt("movie_id"),
                    rs.getTime("showtime"),
                    rs.getDate("showdate"),
                    rs.getInt("seats_available"),
                    rs.getInt("total_seats")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return screenings;
    }
    
    public boolean updateScreening(ScreeningStatus screening) {
        String sql = "UPDATE screenings SET movie_id = ?, theater = ?, showtime = ?, showdate = ?, seats_available = ?, total_seats = ? WHERE id = ?";
        try (Connection conn = JBDCUntil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, screening.getMovieId());
            pstmt.setString(2, screening.getTheater());
            pstmt.setTime(3, screening.getShowtime());
            pstmt.setDate(4, new java.sql.Date(screening.getShowdate().getTime()));
            pstmt.setInt(5, screening.getSeatsAvailable());
            pstmt.setInt(6, screening.getTotalSeats());
            pstmt.setInt(7, screening.getId());
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean deleteScreening(int id) {
        String sql = "DELETE FROM screenings WHERE id = ?";
        try (Connection conn = JBDCUntil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
