import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;
public class RandomAccessTest {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Path filePath= Paths.get("C:\\Personal\\randomFile.txt");

        String s="XYZ";

        byte[] data=s.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);
        FileChannel fc =null;

            try{
                fc = (FileChannel)Files.newByteChannel(filePath,READ,WRITE,CREATE);

                fc.position(0);
                while(out.hasRemaining())
                    fc.write(out);
                out.rewind();
                fc.position(22);
                while(out.hasRemaining())
                    fc.write(out);
                out.rewind();
                fc.position(12);
                while(out.hasRemaining())
                    fc.write(out);
                fc.close();

        } catch (IOException e)
            {
                System.out.println("IO Exception");
            }


    }
}
