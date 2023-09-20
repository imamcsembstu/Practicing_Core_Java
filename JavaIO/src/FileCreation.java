import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("HelloWorld.java");

        Path file = Files.createFile(filePath);
        System.out.println("file: " + file);

        boolean exists = Files.exists(file);
        System.out.println("Exists: " + exists);

    }
}
