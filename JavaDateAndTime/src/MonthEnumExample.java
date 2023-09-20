import java.time.Month;
import java.util.Date;

public class MonthEnumExample {
    public static void main(String[] args) {
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println(month);
        }
    }
}
