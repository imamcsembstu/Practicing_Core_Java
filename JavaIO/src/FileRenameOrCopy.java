import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileRenameOrCopy {
    public static void main(String[] args) throws IOException {
        Path oldPathName = Path.of("hello.txt");
        Path targetPath = Path.of("hello_rename.txt");

        Path movedOrRename = Files.move(oldPathName, targetPath);
        System.out.println(movedOrRename);

        Path replacePath = Files.move(oldPathName, targetPath, StandardCopyOption.REPLACE_EXISTING);
        Files.delete(movedOrRename);



    }
}
