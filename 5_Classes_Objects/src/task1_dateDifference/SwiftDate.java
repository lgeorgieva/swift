package task1_dateDifference;

/**
 * Created by ASUS on 31.10.2016 г..
 */
public class SwiftDate {


    private int year;
    private int month;
    private int day;
    private SwiftDate other;


    public SwiftDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;


    }

    boolean isLeapYear() {

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ;
        return isLeapYear();
    }

    int getCentury() {
        return (int) Math.ceil(year / 100);
    }

    int getDaysDifference
            (SwiftDate other) {

        int daysDifference = 0;
        return daysDifference;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    void printInfo() {

    }

//public swiftDate boolean isLeapYear() {
    //return swiftDate;


}


