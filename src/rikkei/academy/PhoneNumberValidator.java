package rikkei.academy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String pattern = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(phoneNumber);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(PhoneNumberValidator.isValidPhoneNumber("(84)-(0978489648)"));
        System.out.println(PhoneNumberValidator.isValidPhoneNumber("(a8)-(22222222)"));

    }
}
