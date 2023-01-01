package Inheritence_temp;

import Inheritance.Vehicle;

public class Truck extends Vehicle {
    private int maxLoadingCapacity;

    public Truck(int maxSpeed) {
        super(maxSpeed);
    }

    public void print(){
        super.print();
        System.out.print(" Vehicle Type: Truck maxLoadingCapacity: "+maxLoadingCapacity+" ton(s)");
    }

    public void setMaxLoadingCapacity(int maxLoadingCapacity) {
        this.maxLoadingCapacity = maxLoadingCapacity;
    }

}
