package exception;

import java.util.Scanner;

public class IdCardException extends Exception {
    public static final String MESSAGE = "ID Card Numbers must has 9 digits (ex. XXX XXX XXX)";
    public static final String REGEX = "\\d{3}\\s\\d{3}\\s\\d{3}";

    public static String inputIdCardNumbers() {
        Scanner scanner = new Scanner(System.in);
        String idCardNumbers = scanner.nextLine().trim();
        if (idCardNumbers.matches(REGEX)) {
            return idCardNumbers;
        } else {
            System.out.println(MESSAGE);
        }
        return inputIdCardNumbers();
    }
}
