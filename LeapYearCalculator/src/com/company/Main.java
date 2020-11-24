package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(9999));
        System.out.println(isLeapYear(1924));

    }



    public static boolean isLeapYear (int year) {

        boolean leapYear = false;
        if (year < 1 || year > 9999) {
            leapYear = false;
        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                leapYear = true;
            } else if (year % 400 == 0) {
                leapYear = true;
            } else {
                leapYear = false;
            }
        }
        return leapYear;
    }


}
