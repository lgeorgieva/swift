package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 21.10.2016 г..
 */
public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long seconds = scn.nextLong();

        long d = seconds / (60 * 60 * 24);
        long h = seconds % (60 * 60 * 24) / 3600;
        long m = seconds % (60 * 60 * 24) % 3600 / 60;
        long s = seconds % (60 * 60 * 24) % 3600 % 60;
        System.out.println(d + " days," + h + " hours," + m + " minutes," + s + " seconds");
    }
}
