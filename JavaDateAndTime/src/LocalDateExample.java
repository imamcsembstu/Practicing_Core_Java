import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: "+today);

        LocalDate salaryDate = LocalDate.of(2017, Month.JANUARY, 14);
        System.out.println(salaryDate);
        int m = 3;
        int year =2023;
        int day = 5;
       LocalDate dateOFSalary =  LocalDate.of(year,m,day);
        System.out.println(dateOFSalary);

        LocalDate afterSalary = dateOFSalary.plusDays(20);
        System.out.println("after salary: " + afterSalary);
    }
}
