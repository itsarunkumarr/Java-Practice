package practice;

public class Interfaces {
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

interface Car{
    void start();
    void accelerate();
    void brake();
}

class ElectricCar implements Car{

    @Override
    public void start(){
        System.out.println("Electric car is Started");
    }

    @Override
    public void accelerate(){
        System.out.println("Electric car is Accelerated");
    }

    @Override
    public void brake(){
        System.out.println("Electric car is Stopped");
    }

}

class FuelCar implements Car{

    @Override
    public void start(){
        System.out.println("Fuel car is Started");
    }

    @Override
    public void accelerate(){
        System.out.println("Fuel car is Accelerated");
    }

    @Override
    public void brake(){
        System.out.println("Fuel car is Stopped");
    }
}