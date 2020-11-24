package com.company;

public class Main {

    public static void main(String[] args) {

        numberToWords (123);
        numberToWords (1010);
        numberToWords (1000);
        numberToWords (-12);

    } //end of void main

    public static void numberToWords (int number) {
        //Number validation
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        //Reverse the number to print words in correct order
        int reversedNumber = reverse(number);
        String numberString = "";
        int loopDigits = 0;

        //Go through the number from the last digit and turn it into a written word
        for (int i = 0; reversedNumber > 0; i++){
            String stringToAdd = "";
            int digit = reversedNumber % 10;
            reversedNumber /= 10;

            //Go through the number and add to the number's word to string
            switch (digit) {
                case 0:
                    stringToAdd = "Zero";
                    break;
                case 1:
                    stringToAdd = "One";
                    break;
                case 2:
                    stringToAdd = "Two";
                    break;
                case 3:
                    stringToAdd = "Three";
                    break;
                case 4:
                    stringToAdd = "Four";
                    break;
                case 5:
                    stringToAdd = "Five";
                    break;
                case 6:
                    stringToAdd = "Six";
                    break;
                case 7:
                    stringToAdd = "Seven";
                    break;
                case 8:
                    stringToAdd = "Eight";
                    break;
                case 9:
                    stringToAdd = "Nine";
                    break;
            } //End of switch

            numberString += stringToAdd + " ";
            loopDigits++;
        }//End of FOR loop

        //Add zeroes at the end of a number if needed
        int digitNumber = getDigitCount(number);
        if (loopDigits <  digitNumber){             //Compare amount of numbers output to text to actual digit count
            int zeroesToAdd = digitNumber - loopDigits; //Subtract the above two to get the number of trailing zeroes

            //Loop to add the zeroes
            for (int j = 0; j < zeroesToAdd; j++) {
                numberString += "Zero ";
            }
        }
        System.out.println(numberString);
    } //End of numberToWords


    public static int reverse (int number) {

        int reverse = 0;
        boolean negative = false;

        if (number < 0){
            number = number * -1;
            negative = true;
        }

        int startingNumber = number;
        while (number > 0) {
            int toAdd = number % 10;   //extract least significant digit
            number /= 10;              //drop least significant digit
            reverse = reverse + toAdd;          //Add digit to reversed number

            if (number != 0) {
                reverse = reverse * 10;  //Multiply by ten to make room for next digit
            }
        }
        if (negative) {
            reverse = reverse * -1;
        }

        return reverse;
    }

    //Method to count digits in the number provided
    public static int getDigitCount (int number) {
        //Number validation
        if (number < 0) {
            return -1;
        }

        int digitCount = 0;

        //Loop to remove digits and count them
        do {
        int digit = number % 10;  //Get digit
        number /= 10;             //Remove digit
        digitCount++;             //Count digits
        } while (number > 0);

        return digitCount;
    }

}  // end of Main
