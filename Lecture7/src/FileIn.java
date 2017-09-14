import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;

public class FileIn {


    public static void main(String[] args) {

        Path filePath= Paths.get("C:\\Personal\\test.txt");

        String s ="ABCDF";

        byte[] data=s.getBytes();
        System.out.println(data[0]);
        System.out.println(data[1]);
        InputStream input=null;
        try{
            input =  Files.newInputStream(filePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s =reader.readLine();
            System.out.println(s);
            input.close();
        }
        catch (IOException e)
        {
            System.out.println("IO Exception");
        }

    }
}
