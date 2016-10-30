package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 28.10.2016 г..
 */
public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String[] words = input.split("\\W+");
        int itemCount = words.length;


            System.out.println(itemCount);
        }
    }



