package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth (1, 2020));
        System.out.println(getDaysInMonth (2, 2020));
        System.out.println(getDaysInMonth (2, 2018));
        System.out.println(getDaysInMonth (-1, 2020));
        System.out.println(getDaysInMonth (1, -2020));



    }

    public static boolean isLeapYear (int year) {

        boolean leapYear = false;
        if (year < 1 || year > 9999) {
            leapYear = false;
        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                leapYear = true;
            } else leapYear = year % 400 == 0;
        }
        return leapYear;
    }

    public static int getDaysInMonth (int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        } else {
            boolean leapYear = isLeapYear (year);
            int days;

            if ((month == 1) || ( month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12) ) {
                days = 31;
            } else if (month == 2 && leapYear) {
                days = 29;
            } else if (month == 2 && !leapYear) {
                days = 28;
            } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                days = 30;
            } else {
                return -1;
            }
            return days;
        }


    }






}
