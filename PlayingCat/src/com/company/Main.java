package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        boolean playing;
        if ((temperature >= 25) && (temperature <= 35) && (!summer)){
            playing = true;
        } else if ((temperature >= 25) && (temperature <= 45) && (summer)){
            playing = true;
        } else {
            playing = false;
        }
        return playing;

    }






}
