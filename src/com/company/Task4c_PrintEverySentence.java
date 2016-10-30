package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 28.10.2016 г..
 */
public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();


        String[] words = input.split("\\W+");
        int count = 1;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '.' || input.charAt(i) == '.' || input.charAt(i) == '?') {

                String s =input.indexOf(i)+ "\\n";
                System.out.println(s);
            }

        }

    }


}