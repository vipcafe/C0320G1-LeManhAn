package Commons;
import Models.SingleRom;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncRomFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_lINE_SEPARATOR = "\n";
    private static final String fileNameRom = "D:\\C0320G1-LeManhAn\\Module2\\CaseStudy\\src\\Data\\Rom.csv";
    private static final String FILE_HEADER_VILLA = "name,area,rentalFee,maxGuest,rentalType,externalService";

    public static void writeNewVillaToCSV(List<SingleRom> listRom) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileNameRom);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_lINE_SEPARATOR);
            for (SingleRom singleRom : listRom) {
//                ---------------SERVICE------------------
                fileWriter.append(singleRom.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(singleRom.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(singleRom.getRentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(singleRom.getMaxGuest()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(singleRom.getRentalType());
                fileWriter.append(COMMA_DELIMITER);
//                -----------------Villa---------------------------
                fileWriter.append(String.valueOf(singleRom.getExternalService()));
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

    public static List<SingleRom> getFileCSV() {
        BufferedReader br = null;
        List<SingleRom> listRom = new ArrayList<SingleRom>();
        Path path = Paths.get(fileNameRom);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(fileNameRom);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameRom));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                SingleRom rom = new SingleRom();
                rom.setName(splitData[0]);
                rom.setArea(Double.parseDouble(splitData[1]));
                rom.setRentalFee(Double.parseDouble(splitData[2]));
                rom.setMaxGuest(Integer.parseInt(splitData[3]));
                rom.setRentalType(splitData[4]);
//     ------------------------------------------------------------------------
                rom.setExternalService(splitData[5]);
                listRom.add(rom);
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
        return listRom;
    }
}

