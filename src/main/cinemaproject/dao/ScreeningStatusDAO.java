package main.cinemaproject.dao;

import main.cinemaproject.model.ScreeningStatus;
import main.cinemaproject.model.ScreeningInfo;
import java.sql.Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScreeningStatusDAO implements IScreeningStatusDAO {
    private Connection connection;

    public ScreeningStatusDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean addScreening(ScreeningStatus screening) {
        String sql = "INSERT INTO screening_status (movie_id, theater_id, showtime, showdate, seats_available, total_seats, ticket_price) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, screening.getMovieId());
            pstmt.setInt(2, screening.getTheaterId());
            pstmt.setTime(3, screening.getShowtime());
            pstmt.setDate(4, new java.sql.Date(screening.getShowdate().getTime()));
            pstmt.setInt(5, screening.getSeatsAvailable());
            pstmt.setInt(6, screening.getTotalSeats());
            pstmt.setDouble(7, screening.getPrice()); 
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ScreeningStatus getScreeningById(int id) {
        String sql = "SELECT * FROM screening_status WHERE id = ?";
        ScreeningStatus screeningStatus = null;
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) { // Sử dụng PreparedStatement trực tiếp
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    screeningStatus = new ScreeningStatus(
                        rs.getInt("id"),
                        rs.getInt("theater_id"),
                        rs.getInt("movie_id"), 
                        rs.getTime("showtime"),
                        rs.getDate("showdate"),
                        rs.getDouble("ticket_price"),
                        rs.getInt("seats_available"),
                        rs.getInt("total_seats")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return screeningStatus;
    }
    
    public List<ScreeningStatus> getAllScreenings() {
        List<ScreeningStatus> screenings = new ArrayList<>();
        String sql = "SELECT * FROM screening_status";
        try (Connection conn = connection;
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                screenings.add(new ScreeningStatus(
                    rs.getInt("id"),
                    rs.getInt("theater_id"),
                    rs.getInt("movie_id"),
                    rs.getTime("showtime"),
                    rs.getDate("showdate"),
                    rs.getDouble("price"),
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
        String sql = "UPDATE screening_status SET movie_id = ?, theater_id = ?, showtime = ?, showdate = ?, seats_available = ?, total_seats = ?,ticket_price = ? WHERE id = ?";
        try (Connection conn = connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, screening.getMovieId());
            pstmt.setInt(2, screening.getTheaterId());
            pstmt.setTime(3, screening.getShowtime());
            pstmt.setDate(4, new java.sql.Date(screening.getShowdate().getTime()));
            pstmt.setInt(5, screening.getSeatsAvailable());
            pstmt.setInt(6, screening.getTotalSeats());
            pstmt.setDouble(7, screening.getPrice());
            pstmt.setInt(8, screening.getId());
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean deleteScreening(int id) {
        String sql = "DELETE FROM screening_status WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) { // Sử dụng PreparedStatement trực tiếp
            pstmt.setInt(1, id);
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            // Có thể thêm logging hoặc thông báo lỗi ở đây
            return false;
        }
    }

    public List<ScreeningInfo> getScreeningInfo(String selectedMovie, String selectedTheater, String selectedDate) {
        List<ScreeningInfo> screeningInfoList = new ArrayList<>();
        String sql = "SELECT " +
            "t.name AS 'Tên Rạp', " +
            "m.name AS 'Tên Phim', " +
            "ss.showtime AS 'Giờ Chiếu', " +
            "ss.ticket_price AS 'Giá Vé', " +
            "CASE " +
            "    WHEN ss.seats_available = 0 THEN 'Hết vé' " +
            "    ELSE CONCAT('Còn ', ss.seats_available, ' ghế') " +
            "END AS 'Tình Trạng' " +
            "FROM screening_status ss " +
            "JOIN movies m ON ss.movie_id = m.id " +
            "JOIN theater t ON ss.theater_id = t.id " +
            "WHERE (? = 'Tất Cả Phim' OR m.name = ?) " +
            "AND (? = 'Tất Cả Rạp' OR t.name = ?) " +
            "AND (? = '' OR DATE(ss.showdate) = ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, selectedMovie);
            pstmt.setString(2, selectedMovie);
            pstmt.setString(3, selectedTheater);
            pstmt.setString(4, selectedTheater);
            pstmt.setString(5, selectedDate);
            pstmt.setString(6, selectedDate);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    ScreeningInfo info = new ScreeningInfo(
                        rs.getString("Tên Rạp"),
                        rs.getString("Tên Phim"),
                        rs.getString("Giờ Chiếu"),
                        rs.getDouble("Giá Vé"),
                        rs.getString("Tình Trạng")
                    );
                    screeningInfoList.add(info);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return screeningInfoList;
    }


    public int getScreeningStatusId( String theater, String date, String showtime) {
        String sql = "SELECT ss.id FROM screening_status ss " +
                     "JOIN theater t ON ss.theater_id = t.id " +
                     "WHERE t.name = ? AND ss.showdate = ? AND ss.showtime = ? ";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, theater);
            pstmt.setString(2, date);
            pstmt.setString(3, showtime);
            
            // Logging the parameters
            System.out.println("Parameters: " + theater + ", " + date + ", " + showtime);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    // Phương thức lấy tất cả thông tin screening
    public List<ScreeningStatus> getAllScreening() {
        List<ScreeningStatus> screeningList = new ArrayList<>();
        String sql = "SELECT ss.id, m.name AS movie_name, ss.showtime, ss.showdate, " +
                     "ss.ticket_price, ss.seats_available, ss.total_seats, t.name AS theater_name " +
                     "FROM screening_status ss " +
                     "JOIN movies m ON ss.movie_id = m.id " +
                     "JOIN theater t ON ss.theater_id = t.id";

        try (PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                ScreeningStatus screening = new ScreeningStatus();
                screening.setId(rs.getInt("id"));
                screening.setShowtime(rs.getTime("showtime"));
                screening.setShowdate(rs.getDate("showdate"));
                screening.setPrice(rs.getDouble("ticket_price"));
                screening.setSeatsAvailable(rs.getInt("seats_available"));
                screening.setTotalSeats(rs.getInt("total_seats"));
                screening.setMovieName(rs.getString("movie_name")); // Thiết lập tên phim
                screening.setTheaterName(rs.getString("theater_name")); // Thiết lập tên rạp
                screeningList.add(screening);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return screeningList;
    }

    // Phương thức tìm kiếm suất chiếu theo tên phim, tên rạp, ngày chiếu, giờ chiếu
    public List<ScreeningStatus> searchScreening(String searchText) {
        List<ScreeningStatus> screeningList = new ArrayList<>();
        String sql = "SELECT ss.id, m.name AS movie_name, ss.showtime, ss.showdate, " +
                     "ss.ticket_price, ss.seats_available, ss.total_seats, t.name AS theater_name " +
                     "FROM screening_status ss " +
                     "JOIN movies m ON ss.movie_id = m.id " +
                     "JOIN theater t ON ss.theater_id = t.id " +
                     "WHERE m.name LIKE ? OR t.name LIKE ? OR ss.showdate LIKE ? OR ss.showtime LIKE ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, "%" + searchText + "%");
            pstmt.setString(2, "%" + searchText + "%");
            pstmt.setString(3, "%" + searchText + "%");
            pstmt.setString(4, "%" + searchText + "%");
            
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    ScreeningStatus screening = new ScreeningStatus();
                    screening.setId(rs.getInt("id"));
                    screening.setShowtime(rs.getTime("showtime"));
                    screening.setShowdate(rs.getDate("showdate"));
                    screening.setPrice(rs.getDouble("ticket_price"));
                    screening.setSeatsAvailable(rs.getInt("seats_available"));
                    screening.setTotalSeats(rs.getInt("total_seats"));
                    screening.setMovieName(rs.getString("movie_name")); // Thiết lập tên phim
                    screening.setTheaterName(rs.getString("theater_name")); // Thiết lập tên rạp
                    screeningList.add(screening);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return screeningList;
    }
}
