package Commons;

import Models.Villa;
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

public class FuncVillaFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_lINE_SEPARATOR = "\n";
    private static final String fileNameVilla = "D:\\C0320G1-LeManhAn\\Module2\\CaseStudy\\src\\Data\\Villa.csv";
    private static final String FILE_HEADER_VILLA = "name,area,rentalFee,maxGuest,rentalType,romStandard,villaDescription,numberOfFloors,poolArea";

    public static void writeNewVillaToCSV(List<Villa> listVilla) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileNameVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_lINE_SEPARATOR);
            for (Villa villa : listVilla) {
//                ---------------SERVICE------------------
                fileWriter.append(villa.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxGuest()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRentalType());
//                -----------------Villa---------------------------
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getVillaDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloors()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getPoolArea()));
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

    public static List<Villa> getFileCSV() {
        BufferedReader br = null;
        List<Villa> listVilla = new ArrayList<>();
        Path path = Paths.get(fileNameVilla);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(fileNameVilla);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameVilla));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setName(splitData[0]);
                villa.setArea(Double.parseDouble(splitData[1]));
                villa.setRentalFee(Double.parseDouble(splitData[2]));
                villa.setMaxGuest(Integer.parseInt(splitData[3]));
                villa.setRentalType(splitData[4]);
//     ------------------------------------------------------------------------
                villa.setRomStandard(splitData[5]);
                villa.setVillaDescription(splitData[6]);
                villa.setNumberOfFloors(Integer.parseInt(splitData[7]));
                villa.setPoolArea(Double.parseDouble(splitData[8]));
                listVilla.add(villa);

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
        return listVilla;
    }
}
