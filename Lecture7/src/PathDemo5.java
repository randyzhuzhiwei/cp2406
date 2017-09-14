import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo5 {

    public static void main(String[] args) {

        Path filePath=Paths.get("C:\\Personal\\test.txt");

        try{
            BasicFileAttributes attr = Files.readAttributes(filePath,BasicFileAttributes.class);

            System.out.println("Creation Time" + attr.creationTime());
            System.out.println("Last modified time" + attr.lastModifiedTime());
            System.out.println("Size" + attr.size());
        }
        catch (IOException e)
        {
            System.out.println("IO Exception");
        }
    }
}
