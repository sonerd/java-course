package day3;

public class Vehicle extends Transporter {

    private final String model;

    private final int fuelCapacityInLiters;

    private final FuelType fuelType;

    private final int horsePower;

    public Vehicle(final int tires, final int capacity, final String model, final int fuelCapacityInLiters, final FuelType fuelType, final int horsePower) {
        super(tires, capacity);

        this.model = model;
        this.fuelCapacityInLiters = fuelCapacityInLiters;
        this.fuelType = fuelType;
        this.horsePower = horsePower;
    }

    @Override
    public void drive() {
        System.out.println("Started driving by using fuel type " + this.fuelType);
    }

    public String getModel() {
        return model;
    }

    public int getFuelCapacityInLiters() {
        return fuelCapacityInLiters;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model='" + model + '\'' + ", fuelCapacity=" + fuelCapacityInLiters + ", fuelType=" + fuelType + ", horsePower=" + horsePower + '}';
    }
}
