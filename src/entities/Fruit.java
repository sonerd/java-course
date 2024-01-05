package entities;

import java.util.Objects;

public class Fruit {

    private String name;
    private boolean sweet;
    private String color;

    public Fruit(final String name, final boolean sweet, final String color) {
        this.name = name;
        this.sweet = sweet;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean isSweet() {
        return sweet;
    }

    public void setSweet(final boolean sweet) {
        this.sweet = sweet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" + "name='" + name + '\'' + ", sweet=" + sweet + ", color='" + color + '\'' + '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Fruit fruit = (Fruit) o;
        return this.sweet == fruit.sweet && Objects.equals(this.name, fruit.name) && Objects.equals(this.color, fruit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sweet, color);
    }
}
