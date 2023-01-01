package Inheritance;

import java.sql.SQLOutput;

public class Vehicle {

    private String color ;
    protected   int maxSpeed;
    public void print(){
        System.out.print("Vehicle"+" Color: "+color+" Maxspeed:"+maxSpeed );
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
//    Constructor:
    Vehicle(String color, int maxSpeed){
        this.color=color;
        this.maxSpeed=maxSpeed;

    }
    public Vehicle(int maxSpeed){
        maxSpeed=this.maxSpeed;
        System.out.println("\n Vehicle's Constructor");

    }
}
