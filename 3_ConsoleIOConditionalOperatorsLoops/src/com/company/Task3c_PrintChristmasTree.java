package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 28.10.2016 г..
 */
public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        for (int i = 0; i < n; i++) {

            for (int j = n; j>0; j--) {

--i;
                System.out.print("?");


            }

            System.out.print("*");
            System.out.println();
        }

        System.out.println();
    }

}




