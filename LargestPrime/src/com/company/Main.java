package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (-1));
        System.out.println(getLargestPrime (7));
        
    } //End of void main

    public static int getLargestPrime (int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = 0;
        int factor = 0;
        boolean isPrime = true;

        for (int i = 2; i <= number; i++) {
            int remainder = number % i;
            if (remainder == 0) {
                factor = i;

                for (int j = 2; j < factor; j++) {
                    if (factor % j == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
                if (isPrime) {
                    largestPrime = factor;
                }
            }
        }
        return largestPrime;
    }




} // end of Main
