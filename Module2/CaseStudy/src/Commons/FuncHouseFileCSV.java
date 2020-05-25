package Commons;

import Models.House;
import Models.Service;
import Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncHouseFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_lINE_SEPARATOR = "\n";
    private static final String fileNameHouse = "D:\\C0320G1-LeManhAn\\Module2\\CaseStudy\\src\\Data\\House.csv";
    private static final String FILE_HEADER_VILLA = "name,area,rentalFee,maxGuest,rentalType,romStandard,houseDescription,numberOfFloors";

    public static void writeNewHouseToCSV(List<House> listHouse) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileNameHouse);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_lINE_SEPARATOR);
            for (House house : listHouse) {
//                ---------------SERVICE------------------
                fileWriter.append(house.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxGuest()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRentalType());
//                -----------------Villa---------------------------
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getHouseDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloors()));
                fileWriter.append(NEW_lINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in CSV fire write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();

            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static List<House> getFileCSV() {
        BufferedReader br = null;
        List<House> listHouse = new ArrayList<>();
        Path path = Paths.get(fileNameHouse);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(fileNameHouse);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameHouse));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                House house = new House();
                house.setName(splitData[0]);
                house.setArea(Double.parseDouble(splitData[1]));
                house.setRentalFee(Double.parseDouble(splitData[2]));
                house.setMaxGuest(Integer.parseInt(splitData[3]));
                house.setRentalType(splitData[4]);
//     ------------------------------------------------------------------------
                house.setRoomStandard(splitData[5]);
                house.setHouseDescription(splitData[6]);
                house.setNumberOfFloors(Integer.parseInt(splitData[7]));
                listHouse.add(house);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listHouse;
    }
}
