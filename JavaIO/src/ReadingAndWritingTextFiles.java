import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingAndWritingTextFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("new file.txt");
        String text = Files.readString(path);
        System.out.println(text);




        // writing
        Path path2 = Path.of("new file.txt");
        String code = """ 
                public class ReadingAndWritingTextFiles {
                    public static void main(String[] args) throws IOException {
                        Path path = Path.of("new file.txt");
                        String text = Files.readString(path);
                        System.out.println(text);
                    }
                }
                """;
        Files.writeString(path, code);
    }
}
