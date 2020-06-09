package Controllers;

import Commons.FuncRomFileCSV;
import Models.SingleRom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Controllers.MainController.showServices;

public class NewRom {
    public static List<SingleRom> singleRom = new ArrayList<SingleRom>();

    public static void addNewRom() {
        singleRom = FuncRomFileCSV.getFileCSV();
        Choose add = new Choose();
        SingleRom rom = new SingleRom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name Rom : ");
        rom.setName(scanner.nextLine());
        add.area(rom);
        System.out.println("Enter rental Fee : ");
        rom.setRentalFee(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter max Guest : ");
        rom.setMaxGuest(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter Rental Type : ");
        rom.setRentalType(scanner.nextLine());
        System.out.println("Enter External Service : ");
        rom.setExternalService(scanner.nextLine());
        singleRom.add(rom);
        FuncRomFileCSV.writeNewVillaToCSV(singleRom);
        System.out.println("Add new House complete ! Please Enter Continue .....");
        scanner.nextLine();
        showServices();
    }

    public static void showAllRom() {
        singleRom = FuncRomFileCSV.getFileCSV();
        for (SingleRom rom : singleRom) {
            System.out.println("------------------------");
            System.out.println("Name rom : " + rom.getName());
            System.out.println("Area rom : " + rom.getArea());
            System.out.println("Rental Fee : " + rom.getRentalFee());
            System.out.println("Max Guest : " + rom.getMaxGuest());
            System.out.println("Rental Type : " + rom.getRentalType());
            System.out.println("External Service : " + rom.getExternalService());
            System.out.println("-------------------------");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter Continue .....");
        scanner.nextLine();
        showServices();
    }

    public static void showNameRom() {
        singleRom = FuncRomFileCSV.getFileCSV();
        for (SingleRom rom : singleRom) {
            System.out.println("Name house : " + rom.getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter Continue .....");
        scanner.nextLine();
        showServices();
    }

}

