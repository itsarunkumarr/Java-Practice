package practice;

import java.lang.String;

public class Abstract {

    public static void main(String[] args){

        Car11 c1 = new ElectricCars();
        c1.start();
        c1.accelerate();
        c1.brake();

        Car11 c2 = new FuelCars();
        c2.start();
        c2.accelerate();
        c2.brake();

    }
}

abstract class Car11{
    void start(){
        System.out.println("practice.Car Started");
    }
    abstract void accelerate();

    abstract void brake();
}

class FuelCars extends Car11 {

    @Override
    void accelerate() {
        System.out.println("Fuel car is Accelerating");
    }

    @Override
    void brake(){
        System.out.println("Fuel car is Stopping");
    }
}

class ElectricCars extends Car11{

    @Override
    void accelerate(){
        System.out.println("Electric car is Accelerating");
    }
    @Override
    void brake(){
        System.out.println("Electric car is Stopping");
    }
}
