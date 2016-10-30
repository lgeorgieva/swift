package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 27.10.2016 г..
 */
public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] digits = scn.next().split("");
        int sumOfDigits = 0;
        for (String digit : digits) {
            sumOfDigits += Integer.parseInt(digit);
        }
        System.out.print(sumOfDigits);


        }
    }

