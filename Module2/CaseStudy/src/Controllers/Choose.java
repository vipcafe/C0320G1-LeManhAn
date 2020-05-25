package Controllers;

import Models.Service;
import Models.Villa;

import java.util.Scanner;

public class Choose {
    public void area(Service service){
        Scanner scanner = new Scanner(System.in);
        while (service.getArea() < 30 ){
            try {
                System.out.println("Enter Area : ");
                service.setArea(Double.parseDouble(scanner.nextLine()));
                if(service.getArea() < 30){
                    System.out.println("Please !! Enter Area number > 30 m2");
                }
            }catch (Exception Ex){
                System.out.println("Error !! Please Enter continue ....");
                scanner.nextLine();
            }
        }
    }
}
