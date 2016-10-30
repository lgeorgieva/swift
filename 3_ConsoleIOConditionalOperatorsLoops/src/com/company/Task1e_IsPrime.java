package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 27.10.2016 г..
 */
public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n % 2 == 0){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
