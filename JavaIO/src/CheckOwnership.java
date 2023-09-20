import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.UserPrincipal;

public class CheckOwnership {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("hello.txt");

        UserPrincipal owner = Files.getOwner(path);
        System.out.println("Owner: " + owner.getName());
    }
}
