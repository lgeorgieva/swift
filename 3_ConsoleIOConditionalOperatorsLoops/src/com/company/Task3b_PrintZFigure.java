package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 28.10.2016 г..
 */
public class Task3b_PrintZFigure {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i <n ; i++) {
            System.out.print("*");

        }
        System.out.println();

        for (int i = n-2; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }
        for (int i = 0; i <n ; i++) {
            System.out.print("*");

        }
    }
}
