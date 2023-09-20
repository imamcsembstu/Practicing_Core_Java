import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileCreateTimeAndLastModifiedTime {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("hello.txt");

        BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class); //first read
        FileTime creationTime = attr.creationTime(); //
        System.out.println(creationTime);

        FileTime lastModification = attr.lastModifiedTime();
        System.out.println(lastModification);

        Long size = attr.size();
        System.out.println(size);
    }
}
