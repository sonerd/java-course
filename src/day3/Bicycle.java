package day3;

public class Bicycle extends Vehicle {

    private boolean hasBasket;

    public Bicycle(final int tires, final int capacity, final String model,
                   final FuelType fuelType,
                   final int horsePower,
                   final boolean hasBasket) {

        super(tires, capacity, model, 0, fuelType, horsePower);

        this.hasBasket = hasBasket;
    }

    public boolean isHasBasket() {
        return hasBasket;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "hasBasket=" + hasBasket + ", model=" + super.getModel() + "}";
    }

    @Override
    public String horn() {
        return "ring ring ring";
    }
}
