package Inheritance;

public class VehicleUse {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle("red",120);
//        v.print();
//        Car frari= new Car(5);
//        frari.setColor("Black");
//        frari.setMaxSpeed(500);
//        frari.print();
//        Bicycle b = new Bicycle(56);
//        b.setColor("Grey");
//        b.setMaxSpeed(15);
//        b.size=24;
//        b.print();
//        Vehicle v2 = new Vehicle(120);
//        Car c2 = new Car(6);
//        c2.print();
        Vehicle v = new Car(4,500);
        Vehicle v2 = new Bicycle();
        v.maxSpeed=456;
        v.print();
        Car c = (Car) v;
        c.numDoors=333;
        c.print();



    }
}
