package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage ();




    } //End of void main

    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;
        double sum = 0;
        int counter = 0;
        boolean first = true;


        for (double i = 0; continueCalc; i++) {

            boolean isAnInt = scanner.hasNextInt();


            if (first && !isAnInt) {
                System.out.println("SUM = 0 AVG = 0");
                break;
            }

            if (isAnInt) {
                first = false;
                int number = scanner.nextInt();
                sum += number;
                counter++;
            }
            if (!isAnInt) {

                int average = (int) Math.round(sum/counter);
                int finalSum = (int) sum;

                System.out.println("SUM = " + finalSum + " AVG = " + average);
                continueCalc = false;
            }
            scanner.nextLine();            //Handle next line character
        }





        scanner.close();
    }








} //End Main
