import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileFilterExampleForStream {
    public static void main(String[] args) throws IOException {
        Path picDirectory = Path.of("D:\\PRACTCE_JAVA\\Example Of Book by Bozlur Rohman Rokon\\JavaIO\\piture");

        Stream<Path>filteredPath = Files.list(picDirectory).filter(file->file.toString().endsWith(".png"));
        filteredPath.forEach(filePath->{
            System.out.println(filePath);
        });
    }
}
