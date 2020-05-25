package exception;

import java.util.Scanner;

public class GenderException extends Exception {
    public static final String FEMALE = "Female";
    public static final String MALE = "Male";
    public static final String UNKNOWN = "Unknown";
    public static final String MESSAGE = "Gender options: Female, Male or Unknown.";


    public static String inputGender() {
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.nextLine().trim().toLowerCase();
        gender = gender.substring(0,1).toUpperCase() + gender.substring(1);
        switch (gender) {
            case FEMALE:
                return FEMALE;
            case MALE:
                return MALE;
            case UNKNOWN:
                return UNKNOWN;
            default:
                System.out.println(MESSAGE);
        }
        return inputGender();
    }
}
