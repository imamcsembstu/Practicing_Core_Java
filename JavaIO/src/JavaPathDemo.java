import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class JavaPathDemo {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("hello.txt"); // Relative path.
        File file = path.toFile();
        System.out.println("File = " + file);
        // Direct File Class
        File myFile = new File("hello.txt");
        System.out.println("myFile = " + myFile);

        //File.separator constructor. File exist or not no problem.
        String workingDir = System.getProperty("user.dir");
        System.out.println("Working Dir:" + workingDir);
        String newFile = workingDir + File.separator + "hello.txt";
        System.out.println(newFile);
        System.out.println();

        File file2 =new File(newFile);
        System.out.println(file2);
        System.out.println();

        // Having file exist?
        Path path2 = Path.of("hello.txt");
        boolean exists = Files.exists(path2);
        boolean isDirectory = Files.isDirectory(path2); // Where path are file or directory???????
        System.out.println("Exists = " + exists);
        System.out.println("isDirectory = " + isDirectory);//Print
        // some method.
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path2,BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        System.out.println(creationTime);
        FileTime lastModification = basicFileAttributes.lastModifiedTime();
        System.out.println(lastModification);
        // create

        Path filePath6= Path.of("new file2.txt");
        Path file6 = Files.createFile(filePath6);
        System.out.println("file: " + file6);
        //another process of create file
        File newFile11= new File("firstProgram.java");
    }
}
