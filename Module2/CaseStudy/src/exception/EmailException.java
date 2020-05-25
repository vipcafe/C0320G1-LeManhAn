package exception;

import java.util.Scanner;

public class EmailException extends Exception {
    private static final String MESSAGE = "Email format is abc@abc.abc!";
    private static final String REGEX = "\\w+@\\w+\\.\\w+";


    public static String inputCustomerEmail()  {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine().trim();
        if (email.matches(REGEX)) {
            return email;
        } else {
            System.out.println(MESSAGE);
        }
        return inputCustomerEmail();
    }
}