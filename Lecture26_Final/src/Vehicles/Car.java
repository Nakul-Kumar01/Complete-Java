package Vehicles;

public class Car extends Vehicle {

//    private final int speedLimit = 200;
    private final int speedLimit;  // initialised in constructor // this is not static field therefore we hv not used static block

    public Car(){
        speedLimit = 200;
    }

    public static int a;  // by default get initialised with 0

    @Override
    public void accelerate(){

    }

    @Override
    public void decelerate(){

    }


    public final void airBags(){  // now this method cannot be override
        System.out.println("4 Air Bags");
    }


}
