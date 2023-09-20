import java.time.ZoneId;
import java.time.ZoneOffset;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        ZoneOffset easternTimeZone = ZoneOffset.of("-05:00");//0 must be before 5
        System.out.println("easternTimeZone"+ easternTimeZone );
        ZoneOffset utc = ZoneOffset.of("+0");
        System.out.println("utc = "+ utc);


        ZoneOffset utcOffset = ZoneOffset.of("Z");
        System.out.println("utcOffset = "+ utcOffset);

        ZoneId dhaka = ZoneId.of("Asia/Dhaka");
        System.out.println(" ZoneId Dhaka = "+ dhaka);


        //System ZoneId

        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("DefaultZoneId:  " + defaultZoneId);

    }
}
