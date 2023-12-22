package day3;

public class Truck extends Vehicle implements TransporterWithEngine {

    private int maxTransportWeightInKg;
    private int cylindersInVehicle;

    public Truck(final int tires, final int capacity, final String model, final int fuelCapacity, final FuelType fuelType,
                 final int horsePower,
                 int maxTransportWeightInKg) {
        
        super(tires, capacity, model, fuelCapacity, fuelType, horsePower);
        this.maxTransportWeightInKg = maxTransportWeightInKg;
    }

    public int getMaxTransportWeightInKg() {
        return maxTransportWeightInKg;
    }
    public int getCylindersInVehicle(){
        return cylindersInVehicle;
    }
    public void setCylindersInVehicle(int cylindersInVehicle){
         this.cylindersInVehicle = cylindersInVehicle;
    };
    @Override
    public void drive() {
        System.out.println("Started driving to transport weight of " + maxTransportWeightInKg + " kilograms");
    }

    @Override
    public void startEngine() {
        System.out.println("The engine is on");
    }

    @Override
    public int amountOfCylinders() {

        return cylindersInVehicle;
    }
}
