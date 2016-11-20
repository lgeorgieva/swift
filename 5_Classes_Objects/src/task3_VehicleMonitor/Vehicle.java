package task3_VehicleMonitor;

/**
 * Created by ASUS on 4.11.2016 г..
 */
public class Vehicle {
    private String type;
    private String model;
    private int power;
    private double fuelConsumption;
    private int yearProduced;
    private double distance;
    private int weight;
    private String color;
    private int licenceNo;


    //private double insurancePrice;

    //private int carAge;
   // private double typeCoefficient;



    public Vehicle(String type, String model,
                   int power, double fuelConsumption,
                   int yearProduced, double distance, int
                           weight, String color) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.distance = distance;
        this.weight = weight;
        this.color = color;
    }

    public Vehicle(String type, String model,
                   int power, double fuelConsumption,
                   int yearProduced, double distance) {
        this(type,model,power,fuelConsumption,yearProduced,distance,-1,"N/A");
    }

    public Vehicle(String type, String model,
                   int power, double fuelConsumption,
                   int yearProduced, double distance, int weight) {
        this(type,model,power,fuelConsumption,yearProduced,distance,weight,"N/A");
    }

    public Vehicle(String type, String model,
                   int power, double fuelConsumption,
                   int yearProduced, double distance, String color) {
        this(type,model,power,fuelConsumption,yearProduced,distance,-1,color);
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {

        return String.format("%d, %s, %d, %s",licenceNo,model,yearProduced,color);
    }
}
