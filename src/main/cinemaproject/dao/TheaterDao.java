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
        String querry = "SECLECT * FROM theater";
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
}
