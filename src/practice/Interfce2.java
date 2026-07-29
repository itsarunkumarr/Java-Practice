package practice;

public class Interfce2 {

    public static void main(String[] args){
//
//        A a = new C();
//        a.fun();
//
//        B  b = new C();
//        b.fun2();
//
//        C c = new C();
//        c.fun();
//        c.fun2();

//        StreetDog Dog = new StreetDog();
//        Dog.eat();
//        Dog.bark();

        Car1 car = new Car1();
        car.drive();

        Vehicle.brake();
    }
}

    // Multiple Inheritance -->> Interface

interface A{
    void fun();
}

interface B{
    void fun2();
}

class C implements A,B{

    @Override
    public void fun(){
        System.out.println("Override Interface A");
    }

    @Override
    public void fun2(){
        System.out.println("Override Interface B");
    }
}

    // Interface Inheritance

interface Animal{
    void eat();
}

interface Dog extends Animal{
    void bark();
}

class StreetDog implements Dog{

    @Override
    public void eat(){
        System.out.println("Street Dog is Eating");
    }

    @Override
    public void bark(){
        System.out.println("Street dog is barking");
    }
}

    // After JAVA 8 -->> Default Methods and Static Methods

interface Vehicle{
   default void drive(){
       System.out.println("Vehicle is Driving");
    }
    static void brake(){
        System.out.println("Vehical is applying BRAKE");
    }
}
class Car1 implements Vehicle{

    @Override
    public void drive(){
        System.out.println("Car is Driving");
    }
}