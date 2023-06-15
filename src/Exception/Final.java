package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Final {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
             reader = new FileReader("index.txt");
             var value = reader.read();

        }
        catch (IOException e) {
            System.out.println("could not read data");
        }
        finally {
            if(reader!= null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
