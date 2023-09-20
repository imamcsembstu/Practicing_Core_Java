
import java.io.File;
import java.io.FileFilter;
import java.nio.file.Path;

public class FileFilterExample {
    public static void main(String[] args) {
        Path pictureDir = Path.of("D:\\PRACTCE_JAVA\\Example Of Book by Bozlur Rohman Rokon\\JavaIO\\piture");
        FileFilter pngFilter = new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                String fileName = pathname.getName();
                return fileName.endsWith(".png");
            }

        };
        File pictureDirFile = pictureDir.toFile();
        File[] listRoots = pictureDirFile.listFiles(pngFilter);
        for (File file : listRoots) {
            System.out.println(file.getPath());
        }
    }

}
