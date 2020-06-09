package Controllers;
import java.io.IOException;
import java.util.Scanner;

import static Controllers.NewBooking.addNewBooking;
import static Controllers.NewCustomer.addNewCustomer;
import static Controllers.NewCustomer.showInformationCustomers;
import static Controllers.NewHouse.*;
import static Controllers.NewRom.*;
import static Controllers.NewVilla.*;

public class MainController {
    public static void displayMainMenu() {
        System.out.println("1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        Scanner scanner = new Scanner(System.in);
        String add = scanner.nextLine();
        switch (add) {
            case "1":
                addNewServies();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomers();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("Fails !! please Enter continue ...");
                scanner.nextLine();
                displayMainMenu();
        }
    }

    public static void addNewServies() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        Scanner scanner = new Scanner(System.in);
        String add = scanner.nextLine();
        switch (add) {
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRom();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fails !! please Enter continue ...");
                scanner.nextLine();
                addNewServies();
        }
    }


//-------------------------------showServices-----------------------
    public static void showServices()  {
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Rom Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        Scanner scanner = new Scanner(System.in);
        String add = scanner.nextLine();
        switch (add) {
            case "1":
                showAllVilla();
                break;
            case "2":
                showAllHouse();
                break;
            case "3":
                showAllRom();
                break;
            case "4":
                showNameVilla();
                break;
            case "5":
                showNameHouse();
                break;
            case "6":
                showNameRom();
                break;
            case "7":
                displayMainMenu();
                break;
            case "8":
                System.exit(0);
                break;
            default:
                System.out.println("Fails !! please Enter continue ...");
                scanner.nextLine();
                showServices();
        }
    }


//    --------------------------Show-------------------------------------
//------------------------------1-----------------------------------------


    public static void main(String[] args) throws IOException {
        displayMainMenu();
    }
}
