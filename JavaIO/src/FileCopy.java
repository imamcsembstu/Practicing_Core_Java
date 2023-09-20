import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopy {
    public static void main(String[] args) {
        Path copyFrom = Path.of("new file.txt");
        Path copyTO = Path.of("coppied.txt");

        try {
            Files.copy(copyFrom, copyTO, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
