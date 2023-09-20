import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreationSecondProcess {
    public static void main(String[] args) throws IOException {
        File myFile = new File("HelloJava.java");

        boolean hasFileCreation = myFile.createNewFile();// file is created once then result is false.So use if-else Statement.
        System.out.println("Has File Creation=  " + hasFileCreation);

        // If-else Statement.
        Path newFilePath = Path.of("Test.java");
        if (!Files.exists(newFilePath)){
            Path testFile = Files.createFile(newFilePath);
            System.out.println("The file is: " + testFile);
        }else {
            System.out.println("File is already exists. "); // It is also valid in try catch.
        }
        // nested folder created
        Path myFolder = Path.of("myFolder/anotherFolder/mainFolder");
        Path createdPath = Files.createDirectories(myFolder);
        System.out.println(createdPath);


        // Create dir used in file.mkdir()
        File file = new File("mkdir");
        file.mkdir();
        boolean ifExists = file.exists();
        System.out.println("Is Exists: " + ifExists);

    }
}
