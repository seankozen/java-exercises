package com.company;

public class Main {

    public static void main(String[] args) {

        printFactors (6);
        printFactors (32);
        printFactors (10);
        printFactors (-1);

    } // End of void main

    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            int remainder = number % i;
            if (remainder == 0) {
                System.out.println(i);
            }

        }
    }


} // End of Main
