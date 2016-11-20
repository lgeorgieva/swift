package task1_CalculatorClient;

import java.util.Scanner;

import static java.lang.Integer.sum;

/**
 * Created by ASUS on 6.11.2016 г..
 */
public class Task1_CalculatorClient {
    private static int sum;
    private static int subtract;
    private static double multiply;
    private static double divide;
    private static double percentage;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        String[] input = line.split(" ");
        String command = input[0];
        int[] numbers = new int[2];
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);


        while (!line.equals("END")) {
            switch (command) {

                case "SUM":

                    sum(a, b);
                    // int sum = numbers[0] + numbers[1];

                    System.out.printf("%d%n", getSum());

                    break;

                case "SUB":


                    subtract(a, b);
                    System.out.printf("%d%n", getSubstract());
                    break;
                case "MUL":

                    multiply(a, b);
                   
                    System.out.printf("%.3f%n", multiply);
                    break;
                case "DIV":

                    divide(a, b);
                   // double divideNum = numbers[0] / numbers[1];
                    System.out.printf("%.3f%n", divide);
                    break;
                case "PER":

                    percentage(a, b);
                    //double per = numbers[1] * 0.01 * numbers[0];
                    System.out.printf("%.3f", percentage);
                    break;
            }
            
        }

    }

    private static void percentage(int a, int b) {
    }

    private static void divide(int a, int b) {
    }

    private static void multiply(int a, int b) {
    }

    private static void subtract(int a, int b) {
       
    }

    public static int getSum() {
        return sum;
    }

    public static void setSum(int sum) {
        Task1_CalculatorClient.sum = sum;
    }

    public static int getSubstract() {
        return substract;
    }
}
