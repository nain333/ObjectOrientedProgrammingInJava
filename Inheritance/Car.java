package Inheritance;

public class Car extends Vehicle {
    public  Car(int numDoors , int maxSpeed){
        super(maxSpeed);
        System.out.println("Car's constructor");
        this.numDoors=numDoors;
    }
    int numDoors;
    String name;
    public void print(){
    super.print();
        System.out.print(" Vehicle Type: Car NumDoors: "+numDoors);

    }
    public void printMxSpeed(){
        super.maxSpeed=100;
        System.out.println(maxSpeed+" "+super.maxSpeed);
    }


}
