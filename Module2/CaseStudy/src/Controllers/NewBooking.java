package Controllers;

import Commons.FuncCustomerFileCSV;
import Models.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Controllers.NewCustomer.showNameCustomer;

public class NewBooking {
public static void addNewBooking(){
    showNameCustomer();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please choose one object :");
    int choose = scanner.nextInt();
    List<Customer>listCustomer = FuncCustomerFileCSV.getFileCSV();
    System.out.println(listCustomer);
}
}
