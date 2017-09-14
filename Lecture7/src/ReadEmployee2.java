import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;

public class ReadEmployee2 {


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
            System.out.println("Enter READ Employee ID:");
            id= Integer.parseInt(in.nextLine());

            while(id != QUIT)
            {

                byte[] data=template.getBytes();

                ByteBuffer inBuf = ByteBuffer.wrap(data);
                fc.position(id * RECSIZE);
                fc.read(inBuf);

                s= new String(data);

                System.out.println("ID "+ id + " "+ s);

                System.out.println("Enter READ Employee ID or 999 to quit:");
                id= Integer.parseInt(in.nextLine());

            }

            fc.close();
        } catch (IOException e)
            {
                System.out.println("IO Exception");
            }


    }
}
