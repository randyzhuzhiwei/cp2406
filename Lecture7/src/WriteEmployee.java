import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class WriteEmployee {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Path filePath= Paths.get("C:\\Personal\\employee.txt");

        String s="";
        String delimiter = ",";
        int id;
        String name;
        double payrate;
        final int QUIT=999;


            try{
                OutputStream output = new BufferedOutputStream(Files.newOutputStream(filePath,CREATE));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

                System.out.println("Enter Employee ID:");
                id= Integer.parseInt(in.nextLine());

                while(id != QUIT)
                {

                    System.out.println("Enter Employee Name:");
                    name= in.nextLine();
                    System.out.println("Enter Pay Rate:");
                    payrate = Double.parseDouble(in.nextLine());

                    s = id + delimiter + name + delimiter + payrate;

                    writer.write(s,0,s.length());
                    writer.newLine();

                    System.out.println("Enter Employee ID or 999 to quit:");
                    id= Integer.parseInt(in.nextLine());

                }
                writer.close();

        } catch (IOException e)
            {
                System.out.println("IO Exception");
            }


    }
}
