package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printSquareStar (8);


    } // End of void main

    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int r = 1; r <= number; r++) {

                for (int c = 1; c <= number; c++) {
                    if (r == 1 || r == number) {
                        System.out.print("*");
                    } else if ((c == 1) || (c == number)) {
                        System.out.print("*");
                    } else if (r == c) {
                        System.out.print("*");
                    } else if ((c + r - 2) == (number - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


    }



} //End of Main
