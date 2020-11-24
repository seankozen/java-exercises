package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(hasSharedDigit (19, 99));




    }  //End of void main

    public static boolean hasSharedDigit (int num1, int num2) {
        //Check for valid parameters
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)){
            return false;
        }

        boolean sameDigit = false;   //Return value
        int num2Copy = num2;


        //First loop to get digits from num1
        for (int i = 0; (i < 2); i++) {

            int num1Digit = num1 % 10;          //Get digit
            num1 /= 10;                         //Remove digit from num1

            num2 = num2Copy;
            for (int j = 0; num2 > 0; j++ ) {

                int num2Digit = num2 % 10;      //Get digit
                num2 /= 10;                     //Remove digit from num1

                if (num1Digit == num2Digit) {   //Compare digits from num1 & num2
                    sameDigit = true;
                    System.out.println(" First " + sameDigit);
                    System.out.println(" Number 1 = " + num1Digit);
                    System.out.println(" Number 2 = " + num2Digit);
                    break;
                } else {
                    sameDigit = false;
                    System.out.println(" Second " + sameDigit);
                    System.out.println(" Number 1 = " + num1Digit);
                    System.out.println(" Number 2 = " + num2Digit);
                }



            }
            if (sameDigit == true) {
                break;
            }



        }

        return sameDigit;
    }







} //End of Main
