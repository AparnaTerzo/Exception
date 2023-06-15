package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
//Checked Exceptions
public class FileNotFound {
    public static void main(String[] args) {
        try {
            var Reader = new FileReader("index.txt");
            System.out.println("file opened");
        }
        catch(FileNotFoundException e){
            //System.out.println("File not exist");
            System.out.println(e.getMessage());
        }
    }
}
