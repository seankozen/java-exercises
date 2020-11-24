package com.company;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays (525600);
        printYearsAndDays (1051200);
        printYearsAndDays (561600);
        printYearsAndDays (-561600);
        printYearsAndDays (0);



    }


    public static void printYearsAndDays (long minutes) {
        long minutesInHour = 60;
        long hoursInDay = 24;
        long daysInYear = 365;
        
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long days = (minutes / minutesInHour) / hoursInDay;
            long years = days / daysInYear;
            long remainingDays = days % daysInYear;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }





}
