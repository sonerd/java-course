package day3;

public class Transporter {

    private int tires;
    private int capacity;

    public Transporter(final int tires, final int capacity) {
        this.tires = tires;
        this.capacity = capacity;
    }


    public Transporter(){

    }

    public int getTires() {
        return tires;
    }

    public void setTires(final int tires) {
        this.tires = tires;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(final int capacity) {
        this.capacity = capacity;
    }

    public void drive(){
        System.out.println("Started drive");
    }

    public void stop(){
        System.out.println("Stopped drive");
    }
}
