package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 21.10.2016 г..
 */
public class Task5_1_SwapVariables {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] values = new int[2];
        values[0] = scn.nextInt();
        values[1] = scn.nextInt();

        System.out.println(values[1] + " " + values[0]);
    }
}
