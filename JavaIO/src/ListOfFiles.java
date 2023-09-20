import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ListOfFiles {
    public static void main(String[] args) throws IOException {  // Not to use relative path.
        Path myWorkingDir = Path.of("D:\\PRACTCE_JAVA\\Example Of Book by Bozlur Rohman Rokon\\JavaIO");

        Stream<Path>list = Files.list(myWorkingDir);
        list.forEach(fileOrFolder -> {
            System.out.println(fileOrFolder);
        });
        System.out.println("\n\nor Files method");
        // Or
        Path mydirectory = Path.of("D:\\PRACTCE_JAVA");
        File directory = mydirectory.toFile();
        File[] allFiles = directory.listFiles();
        for (File dir: allFiles){
            System.out.println(dir.toPath());
        }

    }
}
