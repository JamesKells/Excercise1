package com.kells.helloworld;
// James Kells 1/18/2018 assignment

public class Main {

    public static void main(String[] args) {
        // write your code here
        String cityName = "Columbus";

        int[] avgHigh = {32, 25, 27, 40, 45};

        int i, Zipcode = 43215;

        double avg = 0;

        for (i = 0; i < 5; i++) {

            avg += avgHigh[i];
        }
        System.out.println(cityName + " " + Zipcode);
        System.out.println(avg / 5);

    }
}