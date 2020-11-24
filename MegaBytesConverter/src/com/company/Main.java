package com.company;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }



    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int kiloBytesInMegaByte = 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainingKilobytes = kiloBytes % kiloBytesInMegaByte;
            int megabytes = (kiloBytes - remainingKilobytes) / kiloBytesInMegaByte;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        }

    }



}
