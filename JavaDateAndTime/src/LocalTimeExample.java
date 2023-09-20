import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Now time: "+now);
        LocalTime eightOClock= LocalTime.of(8,23);
        System.out.println("EightOClock: "+eightOClock);
        int hour = eightOClock.getHour();
        System.out.println(hour);

    }
}
