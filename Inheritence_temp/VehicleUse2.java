package Inheritence_temp;

import Inheritance.Car;
import Inheritance.Vehicle;

public class VehicleUse2 {
    public static void main(String[] args) {
        Car c = new Car(5,1567);
        Truck t = new Truck(60);
        c.setColor("Blue");
        c.print();
        c.setMaxSpeed(400);
        t.setMaxSpeed(80);
        t.setColor("Black");
        t.setMaxLoadingCapacity( 1);
        t.print();
        Vehicle v = new Vehicle(50);


    }



}
