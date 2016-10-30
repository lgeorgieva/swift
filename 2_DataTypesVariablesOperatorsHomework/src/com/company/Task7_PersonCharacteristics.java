package com.company;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by ASUS on 21.10.2016 г..
 */
public class Task7_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String firstName = scn.nextLine();
        String lastName = scn.nextLine();
        int yearOfBirth = scn.nextInt();
        double weight = scn.nextDouble();
        int height = scn.nextInt();
        String occupation = scn.next();
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int age = year - yearOfBirth;

        System.out.println(firstName + " " + lastName + " is " + age + " years old. His weight is " + weight + " and he is " +
                height + " cm tall. He is a " + occupation + ".");


    }
}
