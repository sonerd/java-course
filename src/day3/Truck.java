package day3;

public class Truck extends Vehicle {

    private int maxTransportWeightInKg;

    public Truck(final int tires, final int capacity, final String model, final int fuelCapacity, final FuelType fuelType,
                 final int horsePower,
                 int maxTransportWeightInKg) {
        super(tires, capacity, model, fuelCapacity, fuelType, horsePower);
        this.maxTransportWeightInKg = maxTransportWeightInKg;
    }

    public int getMaxTransportWeightInKg() {
        return maxTransportWeightInKg;
    }

    @Override
    public void drive() {
        System.out.println("Started driving to transport weight of " + maxTransportWeightInKg + " kilograms");
    }
}
