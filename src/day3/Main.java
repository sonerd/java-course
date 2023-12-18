package day3;

public class Main {

    public static void main(String[] args) {

        System.out.println("================ World of Vehicles ===================");
        Vehicle vehicle = new Vehicle(4, 4, "Honda", 50, FuelType.DIESEL, 200);

        System.out.println("Count of tires: " + vehicle.getTires());

        vehicle.drive();
        vehicle.stop();
        System.out.println("Tell me about the vehicle: " + vehicle);


        Truck truck = new Truck(6, 3, "Mercedes", 200, FuelType.DIESEL, 500, 10000);

        truck.drive();
        System.out.println(truck.horn());
        System.out.println("=======================================================");

        Bicycle bicycle = new Bicycle(2, 2, "Cube", FuelType.MANPOWER, 0, false);
        System.out.println("Bike: " + bicycle);
        System.out.println(bicycle.horn());
    }
}
