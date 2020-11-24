package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 18, 19));
        System.out.println(canPack(5, 3, 24));


    } //End of void main

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean packable = true;
        int bigWeight = 5;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            packable = false;
        }
        
        for (int i = 0; i <= bigCount; i++) {
            int fiveKiloWeight = bigWeight * i;

            int difference = goal - fiveKiloWeight;
            if ((difference > smallCount) || (difference < 0)) {
                packable = false;
            } else if (difference <= smallCount) {
                packable = true;
                break;
            } else {
                packable = false;
            }
        }

        return packable;
    }


} //End of Main
