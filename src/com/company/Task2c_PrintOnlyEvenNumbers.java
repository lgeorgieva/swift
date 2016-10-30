package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 27.10.2016 г..
 */
public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = scn.nextInt();
            if(numbers[i] % 2 == 0){
                System.out.printf("%d ",numbers[i]);
            }else{
                System.out.print("");
            }

        }
    }
}
