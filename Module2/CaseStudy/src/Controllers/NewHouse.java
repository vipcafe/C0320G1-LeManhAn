package Controllers;

import Commons.FuncHouseFileCSV;
import Commons.FuncVillaFileCSV;
import Models.House;
import Models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Controllers.MainController.showServices;

public class NewHouse {
       public static List<House> listHouse = new ArrayList<House>() ;
    public static void addNewHouse(){
            listHouse = FuncHouseFileCSV.getFileCSV();
            Choose add = new Choose();
            House house = new House();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Name House : ");
            house.setName(scanner.nextLine());
            add.area(house);
            System.out.println("Enter rental Fee : ");
            house.setRentalFee(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter max Guest : ");
            house.setMaxGuest(Integer.parseInt(scanner.nextLine()));
            System.out.println("Enter Rental Type : ");
            house.setRentalType(scanner.nextLine());
            System.out.println("Enter Rom Standard : ");
            house.setRoomStandard(scanner.nextLine());
            System.out.println("Enter House Description : ");
            house.setHouseDescription(scanner.nextLine());
            System.out.println("Enter Number of Floors : ");
            house.setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
            listHouse.add(house);
            FuncHouseFileCSV.writeNewHouseToCSV(listHouse);
            System.out.println("Add new House complete ! Please Enter Continue .....");
            scanner.nextLine();
            showServices();
    }

        public static void showAllHouse(){
                listHouse = FuncHouseFileCSV.getFileCSV();
                for (House house : listHouse){
                        System.out.println("-for (House house : listHouse------------------------");
                        System.out.println("Name house : "+house.getName());
                        System.out.println("Area house : "+house.getArea());
                        System.out.println("Rental Fee : "+house.getRentalFee());
                        System.out.println("Max Guest : "+house.getMaxGuest());
                        System.out.println("Rental Type : "+ house.getRentalType());
                        System.out.println("Rom Standard : "+house.getRoomStandard());
                        System.out.println("House Description : "+house.getHouseDescription());
                        System.out.println("Number Of Floors : "+house.getNumberOfFloors());
                        System.out.println("-------------------------");
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println(" Please Enter Continue .....");
                scanner.nextLine();
                showServices();
        }

        public static void showNameHouse(){
                listHouse = FuncHouseFileCSV.getFileCSV();
                for (House house : listHouse){
                        System.out.println("Name house : "+house.getName());
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println(" Please Enter Continue .....");
                scanner.nextLine();
                showServices();
        }

}
