package com.company;

public class CodeWars54 {
    public static void main(String[] args) {

        TimeFormatter.formatDuration(31536000);

    }

}

class TimeFormatter {
    public static String formatDuration(int seconds) {
        int minute = 0;
        int hour = 0;
        int day = 0;
        int year = 0;

        System.out.println("check");

        while (seconds > 60){
            seconds -= 60;
            minute++;
            if(minute == 60){
                hour++;
                minute = 0;
            }
            if(hour == 24){
                day++;
                hour = 0;
            }
            if(day == 365){
                year++;
                day = 0;
            }
        }



        System.out.println(seconds + " " + minute + " " + hour + " " + day + " " + year);



        return "";
    }
}