package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 21.10.2016 г..
 */
public class Task4_InchToCm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double cm = scn.nextDouble();
        double inch = 2.54 * cm;

        System.out.println(inch);
    }
}
