package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));


    } //End void main


    public static int getGreatestCommonDivisor (int num1, int num2) {
        if ((num1 < 10 ) || (num2 < 10)) {
            return -1;
        }

        int numerator = 0;
        int denominator = 0;
        int remainder1 = 0;
        int remainder2 = 0;
        int gCDenominator = 0;
        boolean same = false;

        if (num1 >= num2){
            denominator = num2;
        } else {
            denominator = num1;
        }

        do{
            remainder1 = num1 % denominator;
            remainder2 = num2 % denominator;

            if ((remainder1 == 0) && (remainder2 == 0)) {
                gCDenominator = denominator;
                same = true;
            }
            denominator--;
        } while (!same);
        return gCDenominator;
    }



} //End of Main
