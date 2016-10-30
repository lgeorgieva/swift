package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 22.10.2016 г..
 */
public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String number = scn.nextLine();


        for (int i = number.length() - 1; i >= 0; i--) {
            char digits = number.charAt(i);


            System.out.print(digits);
        }


    }
}






