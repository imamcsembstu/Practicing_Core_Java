import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class WriterExample {
    public static void main(String[] args) {
        String text = """
                একটি ভুল মাসআলা
                অমুসলিমের পান করা অবশিষ্ট পানি কি নাপাক?
                """;
        try(Writer writer = new FileWriter("output.txt")){
            writer.write(text);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
