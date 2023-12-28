package entities;

public class Hero {

    private final String name;
    private final int powerRate;

    public Hero(final String name, final int powerRate) {
        this.name = name;
        this.powerRate = powerRate;
    }

    public String getName() {
        return name;
    }

    public int getPowerRate() {
        return powerRate;
    }

    @Override
    public String toString() {
        return "entities.Hero{" + "name='" + name + '\'' + ", powerRate=" + powerRate + '}';
    }
}
