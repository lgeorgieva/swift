package com.company;

import java.util.Scanner;

/**
 * Created by ASUS on 27.10.2016 г..
 */
public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        char[] letters = new char[]{'a', 'e', 'o', 'i', 'u'};
        String result = new String(letters);
        String[] vowels ={"a","e","o","i","u"};
        for (int i = 0; i < input.length(); i++) {

            String ch = String.valueOf((input.charAt(i)));




                String s = null;
                if (ch == "e") {

                    System.out.println(input.replace(ch, ""));


                }

            }
            }

        }






