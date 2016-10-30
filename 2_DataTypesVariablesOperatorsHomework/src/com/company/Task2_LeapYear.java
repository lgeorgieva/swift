package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 21.10.2016 г..
 */
public class Task2_LeapYear {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        System.out.println(isLeapYear);
    }
}
