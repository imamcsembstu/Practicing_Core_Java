import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        // In Time Date
        Date now = new Date();
        System.out.println("Today Date And Time Is: " + now);


        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/YYYY");
        String formattedDateTime = sdf.format(now);
        System.out.println("FormattedDateTime : " + formattedDateTime);

    }
}
