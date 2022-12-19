package Inheritence_temp;

import Inheritance.Vehicle;

public class Truck extends Vehicle {
    int maxLoadingCapacity;
    public void print(){
        System.out.println("Truck" + " Color: "+getColor()+" maxloading Capacity: "+maxLoadingCapacity+" maxSpeed: "+getMaxSpeed( ));
    }

}
