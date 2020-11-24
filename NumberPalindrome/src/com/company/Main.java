package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(7464536));






    }

    public static boolean isPalindrome (int number) {

        int reverse = 0;

        if (number < 0){
            number = number * -1;
        }

        int startingNumber = number;
        while (number > 0) {
            int toAdd = number % 10;   //extract least significant digit
            number /= 10;              //drop least significant digit
            reverse = reverse + toAdd;          //Add digit to reversed number

            if (number != 0) {
                reverse = reverse * 10;  //Multiply by ten to make room for next digit
            }
        }

        return (reverse == startingNumber);

    }





}
