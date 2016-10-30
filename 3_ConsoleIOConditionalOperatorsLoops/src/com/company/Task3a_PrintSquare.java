package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 27.10.2016 г..
 */
public class Task3a_PrintSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String a = "*";
        String b = " ";

        for (int i = 0; i < n; i++) {
            System.out.print("*");

        }
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");


        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");

        }


    }


}










