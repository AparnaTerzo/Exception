package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ioexception {
    public static void main(String[] args) {
        try {
            var reader = new FileReader("index.txt");
            var value = reader.read();
            new SimpleDateFormat().parse( "");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException | ParseException e){
            System.out.println("Could not read data");
        }
    }
}
