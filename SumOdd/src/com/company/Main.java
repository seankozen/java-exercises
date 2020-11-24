package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(" The sum is " + sumOdd(1, 100));
        System.out.println(" The sum is " + sumOdd(-1, 100));



    }//End of void main



    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }


    public static int sumOdd (int start, int end) {
        int sum = 0;
        if ((end < start) || (start <= 0 ) || (end <= 0)) {
            sum = -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            } // End of loop
        }
        return sum;
    }










} //End of Main
