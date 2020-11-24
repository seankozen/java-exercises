package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));





    }  //end of void main

    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if ((!isValid(num1)) || (!isValid(num2)) ||(!isValid(num3))){
            return false;
        }

        boolean isSame = false;
        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;
        int lastNum3 = num3 % 10;

        if ((lastNum1 == lastNum2) || (lastNum1 == lastNum3) || (lastNum2 == lastNum3)){
            isSame = true;
        } else {
            isSame = false;
        }

        return isSame;
    }

    public static boolean isValid (int number) {
        return  ((number >= 10) && (number <= 1000));
    }

} //End of Main
