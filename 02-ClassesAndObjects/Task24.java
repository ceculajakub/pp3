import java.time.LocalTime;

public class Task24 {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 27;
        LocalTime time = LocalTime.of(hours, minutes);
        displayTime(time);
        int minutesFromMidnight = calculateMinutesFromMidnight(hours, minutes);
        int secondsFromMidnight = calculateSecondsFromMidnight(hours, minutesFromMidnight);
        displayMinutes(minutesFromMidnight);
        displaySeconds(secondsFromMidnight);
    }


    public static void displayTime(LocalTime time)
    {
        System.out.println(time);
    }

    public static int calculateMinutesFromMidnight(int hours, int minutes)
    {
        return hours * 60 + minutes;
    }

    public static int calculateSecondsFromMidnight(int hours, int minutes)
    {
        return hours * 3600 + minutes * 60;
    }

    public static void displayMinutes(int minutes)
    {
        System.out.println(String.format("minutes from midnight: %s ", minutes));
    }

    public static void displaySeconds(int seconds)
    {
        System.out.println(String.format("seconds from midnight: %s", seconds));
    }
}
