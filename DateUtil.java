import java.util.*;
import java.util.concurrent.TimeUnit;
public class MyClass {
    public static void main(String args[]) {
        Date startDate = new Date();
        Date endDate   = new Date(System.currentTimeMillis() - 3600 * 1000 * 6);
        
        long duration  = endDate.getTime() - startDate.getTime();
        
        long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
        long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
        long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);
        System.out.println("duration : " + duration);
        System.out.println("diffInSeconds : " + diffInSeconds);
        System.out.println("diffInMinutes : " + diffInMinutes);
        System.out.println("diffInHours : " + diffInHours);
        System.out.println("diffInDays : " + diffInDays);
    }
}
