
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
}
