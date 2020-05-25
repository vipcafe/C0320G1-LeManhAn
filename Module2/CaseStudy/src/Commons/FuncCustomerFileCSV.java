package Commons;

import Models.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncCustomerFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_lINE_SEPARATOR = "\n";
    private static final String fileNameCustomer = "D:\\C0320G1-LeManhAn\\Module2\\CaseStudy\\src\\Data\\Customer.csv";
    private static final String FILE_HEADER_VILLA = "name,birthday,idCard,phone,mail,customerType,service";

    public static void writeNewCustomer(List<Customer> customer) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileNameCustomer);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_lINE_SEPARATOR);
            for (Customer customers : customer) {
//                ---------------SERVICE------------------
                fileWriter.append(customers.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customers.getBirthday()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customers.getGender()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customers.getIdCard()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customers.getPhone()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customers.getMail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customers.getCustomerType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((CharSequence) customers.getService());
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

    public static List<Customer> getFileCSV() {
        BufferedReader br = null;
        List<Customer> listCustomer = new ArrayList<Customer>();
        Path path = Paths.get(fileNameCustomer);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(fileNameCustomer);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameCustomer));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setName(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setIdCard(splitData[3]);
                customer.setPhone(splitData[4]);
//     ------------------------------------------------------------------------
                customer.setMail(splitData[5]);
                customer.setService(splitData[6]);

                listCustomer.add(customer);
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
        return listCustomer;
    }
}


