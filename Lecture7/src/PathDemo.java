import java.nio.file.*;

public class PathDemo {
    public static void main(String[] args)
    {
        Path filePath=Paths.get("C:\\Personal\\test.txt");
        int count = filePath.getNameCount();
        System.out.println("Path is "+ filePath.toString());
        System.out.println("File name is "+ filePath.getFileName());
        System.out.println("There are  "+ count + " elements in the file");
        for(int i=0;i<count;i++)
        {
            System.out.println("Element "+ i + " is "+ filePath.getName(i));
        }
    }
}
