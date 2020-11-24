package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum (int number1, int number2, int total) {
        return (number1 + number2) == total;

    }



}
