
package main.cinemaproject.utils;

/**
 *
 * @author DinhAn
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCUtils {
    public static Connection getConnection()
    {
        Connection c = null;
        
        try {
            //tạo thông số
            String url = "jdbc:mysql://localhost:3306/cinema";
            String user = "root";
            String password = "Dinhan.0321@";
//            String password = "Duong.28";
            
            //đăng kí driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //tạo kết nối
            c = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
    
    public static void closeConnection(Connection c)
    {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
