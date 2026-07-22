public class Abstract {

    public static void main(String[] args){

        Car c1 = new ElectricCar();
        c1.start();
        c1.accelerate();
        c1.brake();

        Car c2 = new FuelCar();
        c2.start();
        c2.accelerate();
        c2.brake();

    }
}

abstract class Car{
    void start(){
        System.out.println("Car Started");
    }
    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car {

    @Override
    void accelerate() {
        System.out.println("Fuel car is Accelerating");
    }

    @Override
    void brake(){
        System.out.println("Fuel car is Stopping");
    }
}

class ElectricCar extends Car{

    @Override
    void accelerate(){
        System.out.println("Electric car is Accelerating");
    }
    @Override
    void brake(){
        System.out.println("Electric car is Stopping");
    }
}
