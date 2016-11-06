package task3_VehicleMonitor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by ASUS on 4.11.2016 г..
 */
public class Task3_VehicleMonitor {




    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        TreeMap<Integer, Vehicle> uniqueLicenceNumber = new TreeMap<>();
        int n = Integer.parseInt(scn.nextLine());

        double fuelPrice = Double.parseDouble(scn.nextLine());


        for (int i = 0; i <= n; i++) {
            String[] input = scn.nextLine().split(", ");
            String type = input[0];
            double typeCoefficient = 0.0;

            int currentYear = Integer.parseInt(String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy"))));
            int yearProduced = 0;
            int carAge = currentYear - yearProduced;


            String model = input[1];
            int power = Integer.parseInt(input[2]);
            double fuelConsumption = Double.parseDouble(input[3]);


            double tripPrice;

            switch (type) {

                case "car":


                        typeCoefficient = 1.00;


                        break;

                case "suv":

                        typeCoefficient = 1.12;


                        break;

                case "truck":

                        typeCoefficient = 1.20;


                        break;

                case "motorcycle":


                        typeCoefficient = 1.50;



                    break;
            }
           double insurancePrice = (0.16 * power) * (1.25 * carAge) * (0.05 * fuelConsumption) * typeCoefficient;
                yearProduced = Integer.parseInt(input[4]);
                double distance = Integer.parseInt(input[5]);
               // insurancePrice = (0.16 * power) * (1.25 * carAge) * (0.05 * fuelConsumption) * typeCoefficient;
                tripPrice = fuelPrice * fuelConsumption * (distance / 100);
                Vehicle vehicle = null;
                if (input.length == 6) {
                    vehicle = new Vehicle(type, model, power, fuelConsumption, yearProduced, distance);


                } else if (input.length == 7) {
                    if (isNumber(input[6])) {
                        int weight = Integer.parseInt(input[6]);
                        vehicle = new Vehicle(type, model, power, fuelConsumption, yearProduced, distance, weight);
                    } else {
                        String color = input[6];
                        vehicle = new Vehicle(type, model, power, fuelConsumption, yearProduced, distance, color);
                    }
                } else {
                    int weight = Integer.parseInt(input[6]);
                    String color = input[7];
                    vehicle = new Vehicle(type, model, power, fuelConsumption, yearProduced, distance, weight, color);
                    System.out.printf(" - %s, %d, %s", model, yearProduced, color);
                    System.out.println();
                    System.out.printf("Insurance cost: %.2f - Travel cost: %.2f", insurancePrice, tripPrice);
                    System.out.println();
                }

//int count = 0;

                String licenceNo = "0000";
                for (Vehicle v : uniqueLicenceNumber.values()) {
                    for (int j = licenceNo.length() - 1; j >= 0; j--) {


                        for (int k = 0; k < 9999; k++) {
                            j += k;
                            uniqueLicenceNumber.put(Integer.valueOf(licenceNo), v);


                            uniqueLicenceNumber.put(Integer.valueOf(licenceNo), vehicle);


                        }

                      //  System.out.print(uniqueLicenceNumber);
                    }

                }


            }
        }












    //System.out.println(uniqueLicenceNumber);



    private static boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
