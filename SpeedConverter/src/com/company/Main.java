package com.company;

public class Main {


    public static void main(String[] args) {
        // 1 mile per hour is 1.609 kilometers per hour

        long convertedSpeed = toMilesPerHour (75.114);
        System.out.println(convertedSpeed);

        printConversion (75.114);


    }


    public static long toMilesPerHour (double kilometersPerHour) {
        double conversionRate = 1.609;
        long milesPerHour = 0;

        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour > 0) {
            milesPerHour = Math.round(kilometersPerHour / conversionRate);

        }
        return milesPerHour;
    }

    public static void printConversion (double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long mileConversion = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + mileConversion + " mi/h");
        }

    }






}
