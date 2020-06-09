package Controllers;

import Commons.FuncCustomerFileCSV;
import Models.Customer;
import Sort.NameCustomerComparator;
import exception.EmailException;
import exception.GenderException;
import exception.IdCardException;
import exception.NameException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static Controllers.MainController.displayMainMenu;
import static Controllers.MainController.showServices;

public class NewCustomer {
    public static List<Customer> listCustomer = new ArrayList<Customer>() ;
    public static void addNewCustomer(){
        listCustomer = FuncCustomerFileCSV.getFileCSV();
        Choose add = new Choose();
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Full Name : ");
        customer.setName(NameException.CheckName());
        System.out.println("Enter gender : ");
        customer.setGender(GenderException.inputGender());
        System.out.println("Enter id Card : ");
        customer.setIdCard(IdCardException.inputIdCardNumbers());
        System.out.println("Enter Phone : ");
        customer.setPhone(scanner.nextLine());
        System.out.println("Enter Mail : ");
        customer.setMail(EmailException.inputCustomerEmail());
        System.out.println("Enter customer Type : ");
        customer.setCustomerType(scanner.nextLine());
        System.out.println("Enter service : ");
        customer.setService(scanner.nextLine());
        listCustomer.add(customer);
        FuncCustomerFileCSV.writeNewCustomer(listCustomer);
        System.out.println(" Please Enter Continue .....");
        scanner.nextLine();
        displayMainMenu();
    }
    public static void showInformationCustomers() {
        listCustomer = FuncCustomerFileCSV.getFileCSV();
        Collections.sort(listCustomer,new NameCustomerComparator());
        for (Customer  customer: listCustomer) {
            System.out.println("------------------------");
            System.out.println("Name rom : " + customer.getName());
            System.out.println("Birthday: " + customer.getBirthday());
            System.out.println("Gender : " + customer.getGender());
            System.out.println("ID Card : " + customer.getIdCard());
            System.out.println("Phone : " + customer.getPhone());
            System.out.println("Mail : " + customer.getMail());
            System.out.println("Customer type : "+customer.getCustomerType());
            System.out.println("Service : "+customer.getService());
            System.out.println("-------------------------");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter Continue .....");
        scanner.nextLine();
        displayMainMenu();
    }

//    public static void sortNameAndYear(){
//        listCustomer = FuncCustomerFileCSV.getFileCSV();
//        Collections.sort(listCustomer,new NameCustomerComparator());
//
//    }

    

    public static void showNameCustomer() {
        listCustomer = FuncCustomerFileCSV.getFileCSV();
        int i = 1 ;
        System.out.println("--------LIST CUSTOMER ---------");
        for (Customer customer : listCustomer) {
            System.out.println((i++)+". " + customer.getName());
        }
    }

}
