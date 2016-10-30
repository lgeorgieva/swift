package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 27.10.2016 г..
 */
public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] sequence = new int[n];

        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = scn.nextInt();
        }

        for (int i = sequence.length - 1; i >= 0; i--) {
            System.out.printf("%d ", sequence[i]);

        }

    }


}


