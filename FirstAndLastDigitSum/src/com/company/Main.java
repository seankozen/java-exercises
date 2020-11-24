package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit (53653725));

        
    } //End of void main


    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {    //Check for negative number
            return -1;
        }

        int digit = 0;
        int firstDigit = 0;
        int lastDigit = 0;

        for (int i = 0; number != 0; i++) {
            digit = number % 10;    //Get a number from the end
            number /= 10;           //Remove the number
            if (i == 0) {
               lastDigit = digit;   //Save last digit
            }
            if (number == 0) {
                firstDigit = digit;  //Save first digit
            }
        }
       return firstDigit + lastDigit;  //Calculate and return sum
    }



} //End of Main
