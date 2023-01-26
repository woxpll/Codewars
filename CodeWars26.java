package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CodeWars26 {
    public static void main(String[] args) {

        KataAhaha kataAhaha = new KataAhaha();
        System.out.println(kataAhaha.mostFrequentDays(2812));


    }
}

class KataAhaha {
    public static String mostFrequentDays(int year) {

        List<String> day = new ArrayList<>();

        LocalDate first = LocalDate.of(year,1,1);
        LocalDate end = LocalDate.of(year,12,31);
        int dayOfWeekFirst = first.getDayOfWeek().getValue();
        int dayOfWeekEnd = end.getDayOfWeek().getValue();

        if(dayOfWeekFirst == dayOfWeekEnd){
            day.add(days(dayOfWeekFirst));
        }else{
            if(dayOfWeekFirst == 7){
                int tmp = dayOfWeekFirst;
                dayOfWeekFirst = dayOfWeekEnd;
                dayOfWeekEnd = tmp;
                day.add(days(dayOfWeekFirst));
                day.add(days(dayOfWeekEnd));
            }else {
                day.add(days(dayOfWeekFirst));
                day.add(days(dayOfWeekEnd));
            }


        }

        String str = day.toString();
        return str;

//        String[] dayOk = day.toArray(new String[day.size()]);
//        return dayOk;
    }

    public static String days(int i){
        if (i == 1){
            return "Monday";
        }else if(i == 2){
            return "Tuesday";
        }else if(i == 3){
            return "Wednesday";
        }else if(i == 4){
            return "Thursday";
        }else if(i == 5){
            return "Friday";
        }else if(i == 6){
            return "Saturday";
        }else if(i == 7){
            return "Sunday";
        }else {
            return "";
        }


    }
}
