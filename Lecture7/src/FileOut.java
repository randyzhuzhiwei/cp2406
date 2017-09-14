import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;

public class FileOut {


    public static void main(String[] args) {

        Path filePath= Paths.get("C:\\Personal\\test.txt");

        String s ="ABCDF";

        byte[] data=s.getBytes();
        System.out.println(data[0]);
        System.out.println(data[1]);
        OutputStream output=null;
        try{
            output = new BufferedOutputStream(Files.newOutputStream(filePath,CREATE));
            output.write(data);
            output.flush();
            output.close();
        }
        catch (IOException e)
        {
            System.out.println("IO Exception");
        }

    }
}
