package task1_dateDifference;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ASUS on 31.10.2016 г..
 */
public class Task1_DateDifference {


    private boolean leapYear;
    private int day;
    private int year;
    private int month;
    private SwiftDate other;


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy mm dd");

        Date date = new Date();
        Date date1 = new Date();
        try {
            System.out.println("Date1:   " + date1);
            System.out.println("date" + date);

            date = simpleDateFormat.parse(scn.nextLine());
            date1 = simpleDateFormat.parse(scn.nextLine());

            System.out.println("Date1 is:" + date1);
            System.out.println("date" + date);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

        //System.out.println(date1);
        // System.out.println(date);


         public int getDaysDifference(SwiftDate other) {
             this.other = other;
             int dayDifference =(other.getDay() )/864000;
        return dayDifference;
    }



         public void printInfo(){
             if (isLeapYear()) {
                 int dayDifference=0;
                 System.out.println(dayDifference);
                 System.out.printf("%d %d %d - %d century. It is LEAP year.", year, month,day, Math.ceil(year / 100));
             } else {
                 System.out.printf("%d %d %d - %d century.", year, month, day, Math.ceil(year / 100));
             }
         }





    public boolean isLeapYear() {
        return leapYear;
    }



}


