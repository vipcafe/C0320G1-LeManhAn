package Controllers;
import Commons.FuncVillaFileCSV;
import Models.Villa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Controllers.MainController.showServices;

public class NewVilla {
    private static List<Villa> listVilla = new ArrayList<Villa>();
    public static void addNewVilla() {
        listVilla = FuncVillaFileCSV.getFileCSV();
        Choose add = new Choose();
        Villa villa = new Villa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name Villa : ");
        villa.setName(scanner.nextLine());
        add.area(villa);
        System.out.println("Enter rental Fee : ");
        villa.setRentalFee(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter max Guest : ");
        villa.setRentalFee(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Rental Type : ");
        villa.setRentalType(scanner.nextLine());
        System.out.println("Enter Rom Standard : ");
        villa.setRomStandard(scanner.nextLine());
        System.out.println("Enter villa Description : ");
        villa.setVillaDescription(scanner.nextLine());
        System.out.println("Enter Number of Floors : ");
        villa.setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter Pool Area : ");
        villa.setPoolArea(Double.parseDouble(scanner.nextLine()));
        listVilla.add(villa);
        FuncVillaFileCSV.writeNewVillaToCSV(listVilla);
        System.out.println("Add new Villa complete ! Please Enter Continue .....");
        scanner.nextLine();
        showServices();
    }

    public static void showAllVilla(){
        listVilla = FuncVillaFileCSV.getFileCSV();
        for (Villa villa : listVilla){
            System.out.println("-------------------------");
            System.out.println("Name villa : "+villa.getName());
            System.out.println("Area villa : "+villa.getArea());
            System.out.println("Rental Fee : "+villa.getRentalFee());
            System.out.println("Max Guest : "+villa.getMaxGuest());
            System.out.println("Rental Type : "+ villa.getRentalType());
            System.out.println("Villa Description : "+villa.getVillaDescription());
            System.out.println("Number Of Floors : "+villa.getNumberOfFloors());
            System.out.println("Pool Area : "+villa.getPoolArea());
            System.out.println("-------------------------");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter Continue .....");
        scanner.nextLine();
        showServices();
    }

    public static void showNameVilla(){
        listVilla = FuncVillaFileCSV.getFileCSV();
        int i = 1 ;
        for (Villa villa : listVilla){
            System.out.println((i++)+" : "+villa.getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter Continue .....");
        scanner.nextLine();
        showServices();
    }
}

