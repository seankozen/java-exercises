package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));


    }

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
        return (int)(number1 * 1000) == (int) (number2 * 1000);

    }



}
