package day3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("================ World of Vehicles ===================");
        Vehicle vehicle = new Vehicle(4, 4, "Honda", 50, FuelType.DIESEL, 200);

        System.out.println("Count of tires: " + vehicle.getTires());

        vehicle.drive();
        vehicle.stop();
        System.out.println("Tell me about the vehicle: " + vehicle);


        Truck truck = new Truck(6, 3, "Mercedes", 200, FuelType.DIESEL, 500, 10000);
        truck.startEngine();
        truck.drive();
        System.out.println(truck.horn());
        truck.setCylindersInVehicle(6);
        System.out.println("Cylinder count: " + truck.amountOfCylinders());

        System.out.println("=======================================================");

        Bicycle bicycle = new Bicycle(2, 2, "Cube", FuelType.MANPOWER, 0, false);
        System.out.println("Bike: " + bicycle);
        System.out.println(bicycle.horn());

        Vehicle vehicleTruck = new Truck(6, 3, "Mercedes", 200, FuelType.DIESEL, 500, 10000);

        vehicleTruck.drive();

        storeInFile(vehicleTruck);
        storeInFile(truck);
        storeInFile(vehicle);

        System.out.println(truck.getModel());
    }

    private static void storeInFile(Vehicle vehicle) {
        vehicles.add(vehicle);
        // writing to a file
    }

}
