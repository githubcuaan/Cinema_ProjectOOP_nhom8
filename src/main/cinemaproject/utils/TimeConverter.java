package main.cinemaproject.utils;

/**
 *
 * @author DinhAn
 */
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class TimeConverter {
    
    // Phương thức chuyển đổi chuỗi thời gian từ định dạng hh:mm AM/PM sang java.sql.Time
    public static Time convertToSqlTime(String timeString) {
        try {
            // Định nghĩa DateTimeFormatter với định dạng hh:mm AM/PM
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
            
            // Chuyển chuỗi thành LocalTime
            LocalTime localTime = LocalTime.parse(timeString, formatter);
            
            // Chuyển LocalTime thành java.sql.Time
            return Time.valueOf(localTime);
        } catch (Exception e) {
            System.out.println("Lỗi định dạng thời gian: " + e.getMessage());
            return null;
        }
    }

    public static String convertToString(java.sql.Time time) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a"); // Định dạng giờ
        return sdf.format(time);
    }
}