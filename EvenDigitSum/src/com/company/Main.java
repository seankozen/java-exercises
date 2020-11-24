package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum (123456789));
        System.out.println(getEvenDigitSum (252));
        System.out.println(getEvenDigitSum (-22));




    } //End of void main

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }

        int digit = 0;  //To store even number
        int evenSum = 0;    //Sum of even numbers

        do {
            digit = number % 10;     //Get digit from numbet
            if ((digit % 2) == 0) {  //Check to see if it's even and then add
               evenSum += digit;
            }
            number /= 10;            //Remove digit from original number

        } while (number != 0);

        return evenSum;
    }


} //End of Main
