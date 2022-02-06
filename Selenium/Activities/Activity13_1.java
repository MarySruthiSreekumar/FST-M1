import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;


public class Activity13_1 {
    public static void main(String[] args) throws IOException, CsvException {
        FileReader file = new FileReader("src/test/java/tests/sample.csv");
        CSVReader reader = new CSVReader(file);
        List<String[]> list = reader.readAll();
        System.out.println("Total number of rows: "+list.size());
        Iterator <String[]> itr = list.iterator();
        while (itr.hasNext())
        {
            String[] str = itr.next();
            System.out.print("Values are :");
            for(int i=0;i<str.length;i++)
            {
                System.out.print(" "+str[i]);
            }
            System.out.println(" ");
        }
        reader.close();
    }
}
