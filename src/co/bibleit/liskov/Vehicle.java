package co.bibleit.liskov;

public class Vehicle {

    abstract int getSpeed();
    abstract int getCubicCapacity();

}

public class Car extends Vehicle {
    int getSpeed() {}
    int getCubicCapacity() {}
    boolean sHatback() {}
}

public class Bus extends Vehicle {
    int getSpeed(){}
    int getCubicCapacity(){}
    String getEmergencyExitLocation(){}
}

public class Main {

    public static void main(String[] args) { 
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();

        vehicle = new Car();
        vehicle.getCubicCapacity();
    }

}
