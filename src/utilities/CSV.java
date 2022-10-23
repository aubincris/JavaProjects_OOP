package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    //This method will read data from a CSV file and return as a list
    public static List<String[]> read(String file){
        List<String[]> data = new LinkedList<>();
        String line;

        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine()) != null){
                String[] records = line.split(",");
                data.add(records);

            }

        }catch(FileNotFoundException e){
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }

        return data;

    }
}
