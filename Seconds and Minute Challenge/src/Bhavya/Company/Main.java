package Bhavya.Company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(123,30));
        System.out.println(getDurationString(400));
        System.out.println(getDurationString(7000000));
    }

   private static String getDurationString(long minutes, long seconds){

        if(minutes < 0  || seconds<0 || seconds>59)
           return ("Invalid Value");
        long hours = minutes/60;
        String hour;
        String minute;
        String second;
        if(minutes/60<10)
         hour="0" + minutes/60;
        else
            hour = String.valueOf(minutes/60);

        if (minutes%60<10)
            minute="0" + minutes%60;
        else
            minute = String.valueOf(minutes%60);

       if (seconds<10)
           second="0" + seconds;
       else
           second = String.valueOf(seconds);

       return (hour + "h " + minute + "m " + second + "s");

   }

    private static String getDurationString(long seconds){

        if(seconds<0)
            return ("Invalid Value");

       long minute = seconds/60;
        seconds = seconds%60;

        return getDurationString(minute,seconds);

    }
}
