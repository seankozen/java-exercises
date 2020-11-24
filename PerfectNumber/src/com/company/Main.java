package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));



    } //End of void main

    public static boolean isPerfectNumber (int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            int remainder = number % i;
            if (remainder == 0) {
                sum += i;
            }
        }
        return (sum == number);
    }











} // End of Main
