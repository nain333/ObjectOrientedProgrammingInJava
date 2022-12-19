package Inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("red",120);
        v.print();
        Car frari= new Car();
        frari.setColor("Black");
        frari.print();
        Bicycle b = new Bicycle();
        b.setColor("Grey");
        b.setMaxSpeed(15);
        b.size=24;
        b.print();
    }
}
