import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class SubDirectory {
    public static void main(String[] args) throws IOException {
        Path myDir = Path.of("D:\\PRACTCE_JAVA\\Example Of Book by Bozlur Rohman Rokon\\JavaIO\\myFolder");
        Stream<Path>walk = Files.walk(myDir);
        walk.forEach(file->{
            System.out.println(file);
        });

    }
}
