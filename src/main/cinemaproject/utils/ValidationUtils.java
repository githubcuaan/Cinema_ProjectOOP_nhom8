
package main.cinemaproject.utils;

import java.util.regex.Pattern;

/**
 *
 * @author DinhAn
 */
public class ValidationUtils {
    //method kiểm tra định dạng email
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }
    
    //method kiểm tra định dạng số điện thoại 
    public static boolean isValidPhoneNumber(String phone) {
        String phoneRegex = "^\\d{10,15}$"; // Điều chỉnh regex theo định dạng số điện thoại bạn muốn
        return Pattern.matches(phoneRegex, phone);
    }
    //method kiểm tra định dạng ngày
    public static boolean isValidDate(String date) {
        String dateRegex = "^\\d{4}/\\d{2}/\\d{2}$"; // Định dạng yyyy/MM/dd
        return Pattern.matches(dateRegex, date);
    }
    
    //method kiểm tra định dạng giờ
    public static boolean isValidTime(String time) {
        String timeRegex = "^\\d{1,2}:\\d{2} [AP]M$"; // Định dạng hh:mm AM/PM
        return Pattern.matches(timeRegex, time);
    }
}
