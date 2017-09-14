import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;

public class WriteEmployee2 {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Path filePath= Paths.get("C:\\Personal\\employee2.txt");

        String s="";
        String delimiter = ",";
        int id;
        String name;
        double payrate;
        String template = "000,          ,00.00" + System.getProperty("line.separator");

        final int RECSIZE = template.length();

        FileChannel fc =null;

        final int QUIT=999;


        try{
            fc = (FileChannel)Files.newByteChannel(filePath,READ,WRITE,CREATE);
            System.out.println("Enter Employee ID:");
            id= Integer.parseInt(in.nextLine());

            while(id != QUIT)
            {

                System.out.println("Enter Employee Name:");
                name= in.nextLine();
                System.out.println("Enter Pay Rate:");
                payrate = Double.parseDouble(in.nextLine());
                s = id + delimiter + name + delimiter + payrate;

                byte[] data=s.getBytes();

                ByteBuffer out = ByteBuffer.wrap(data);

                fc.position(id * RECSIZE);
                fc.write(out);

                System.out.println("Enter Employee ID or 999 to quit:");
                id= Integer.parseInt(in.nextLine());

            }

            fc.close();

        } catch (IOException e)
        {
            System.out.println("IO Exception");
        }


    }
}
