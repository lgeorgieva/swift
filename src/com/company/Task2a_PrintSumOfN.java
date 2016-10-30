package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 27.10.2016 г..
 */
public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
            count += array[i];


        }
        System.out.println(count);

    }
}
