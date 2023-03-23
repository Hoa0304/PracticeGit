package CustomException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    static Scanner scanner = new Scanner(System.in);
       static  String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
       static Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

        public static boolean isValidEmail(String email) {
            Matcher matcher = EMAIL_PATTERN.matcher(email);
            return matcher.matches();

    }

    static void validate(String email) throws EmailException {

        if (!(isValidEmail(email))){
            throw new EmailException("not valid email format");
        } else {
            System.out.println("welcome to out team");
        }
    }

    public static void main(String args[]) {

        try {
            System.out.println("Nhập email ");
            String email = scanner.nextLine();
            validate(email);
        } catch (Exception m) {
            System.out.println("Wrong email format: " + m);
        }
    }
}
