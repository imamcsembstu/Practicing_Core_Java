import java.time.LocalDate;
import java.time.Period;

public class PeriodUntil {
    public static void main(String[] args) {
        LocalDate victoryDay = LocalDate.of(2023,12,16);

        LocalDate today  = LocalDate.now();

        Period until = today.until(victoryDay);
        int days = until.getDays();
        int month = until.getMonths();
        System.out.println("Victory Day left until. Month: "+ month+ "\n Days: "+ days );


        // is before and is after

        LocalDate tomorrow = today.plusDays(1);

        boolean todayIsBeforeTomorrow = today.isBefore (tomorrow);

        boolean tomorrowIsAfterToday = tomorrow.isAfter (today);

        System.out.println("tomorrow Is AfterToday = "+ tomorrowIsAfterToday);

        System.out.println("today Is Before Tomorrow = "+ todayIsBeforeTomorrow);

        // LeapYear

        boolean leapYear = today.isLeapYear();
        System.out.println(today+" Is LeapYear: " + leapYear);
    }
}
