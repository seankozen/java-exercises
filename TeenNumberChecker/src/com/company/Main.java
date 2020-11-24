package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        //n
        //n

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));


    }

    public static boolean hasTeen (int num1, int num2, int num3) {
        return (num1 <= 19 && num1 >= 13) || (num2 <= 19 && num2 >= 13)  || (num3 <= 19 && num3 >= 13);
    }

    public static boolean isTeen (int num1) {
        return (num1 <= 19 && num1 >= 13);
    }



}
