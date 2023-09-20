import javax.crypto.interfaces.DHKey;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class OffsetDateTime {
    public static void main(String[] args) {
        //ZoneOffset zoneOffset = ZoneOffset.of("+6:00");

        
        //OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffset);
        //System.out.println(offsetDateTime);

        ZoneId dhaka = ZoneId.of("Asia/Dhaka");
        ZonedDateTime dhakaTime = ZonedDateTime.now(dhaka);
        System.out.println("dhakaTime" + dhakaTime);
    }
}
