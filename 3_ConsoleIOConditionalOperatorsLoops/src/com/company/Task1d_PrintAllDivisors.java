package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 27.10.2016 г..
 */
public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n ; i++) {
            if(n % i == 0){
                System.out.printf("%d ",i);
            }

        }
    }
}
