package main.cinemaproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.cinemaproject.model.Theater;

public class TheaterDao {
    private Connection connection;

    public TheaterDao(Connection c)
    {
        this.connection = c;
    }
    
    public Theater getTheaterById(int id)
    {
        String querry = "SELECT * FROM theater WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(querry)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // Trả về đối tượng Theater nếu tìm thấy
                    return new Theater(
                        resultSet.getInt("id"),
                       resultSet.getString("name"),
                    resultSet.getString("location"),
                      resultSet.getString("phone"),
                  resultSet.getString("description")
                    );
                }
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<Theater> getAllTheaters() {
        String querry = "SELECT * FROM theater";
        ArrayList<Theater> theaters = new ArrayList<>();

        //chuan bi cau lenh sql
        try(PreparedStatement statement = connection.prepareStatement(querry);
            ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()) {
                Theater theater = new Theater(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("location"),
                    resultSet.getString("phone"),
                    resultSet.getString("description")
                );
                theaters.add(theater);
            }
        } catch(SQLException e) {
                e.printStackTrace();
        }
        return theaters;
    }

    public ArrayList<String> getAllTheaterNames() {
        String query = "SELECT name FROM theater";  // Sửa lại câu lệnh SQL để lấy tên rạp
        ArrayList<String> theaterNames = new ArrayList<>();  // Danh sách chứa tên các rạp
    
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            
            // Duyệt qua kết quả và thêm tên rạp vào danh sách
            while (resultSet.next()) {
                String theaterName = resultSet.getString("name");
                theaterNames.add(theaterName);
            }
        } catch (SQLException e) {
            e.printStackTrace();  // In ra lỗi nếu có vấn đề với cơ sở dữ liệu
        }
    
        return theaterNames;  // Trả về danh sách tên rạp
    }    
    
    public boolean deleteTheater(int theaterId)
    {
        String querry = "DELETE FROM theater WHERE id = ? ";
        try (PreparedStatement statement = connection.prepareStatement(querry)) {
            statement.setInt(1, theaterId);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected >0;
        } catch (Exception e) {
           System.out.println("co loi lon gi khi xoa"+e.getMessage());
           return false;
        }
    }

    public boolean addTheater(Theater theater)
    {
        String querry = "INSERT INTO theater (name, location, phone, description) VALUES (?,?,?,?) ";
        try (PreparedStatement statement = connection.prepareStatement(querry)) {
            statement.setString(1, theater.getName());
            statement.setString(2, theater.getLocation());
            statement.setString(3, theater.getPhone());
            statement.setString(4, theater.getDescription());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected >0;
        } catch (Exception e) {
            System.out.println("co loi khi them"+e.getMessage());
            return false;
        }
    }

    public boolean updateTheater(Theater theater)
    {
        String querry = "UPDATE theater SET name = ?, location = ?, phone = ?, description = ? WHERE id = ? ";
        try (PreparedStatement statement = connection.prepareStatement(querry)) {
            statement.setString(1, theater.getName());
            statement.setString(2, theater.getLocation());
            statement.setString(3, theater.getPhone());
            statement.setString(4, theater.getDescription());
            statement.setString(5, String.valueOf(theater.getId()));
            int rowsAffected = statement.executeUpdate();
            return rowsAffected >0;
        } catch (Exception e) {
            System.out.println("co loi khi cap nhat:"+e.getMessage());
            return false;
        }
    }

    public int getTheaterId(String theaterName) {
        String query = "SELECT id FROM theater WHERE name = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, theaterName);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("id");
            }
        } catch (Exception e) {
            System.out.println("Error while getting theater id: " + e.getMessage());
        }
        return -1;
    }
}
