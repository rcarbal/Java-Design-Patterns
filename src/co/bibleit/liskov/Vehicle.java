package co.bibleit.liskov;

public abstract class Vehicle {

    abstract void getSpeed();
    abstract void getCubicCapacity();

}

class Car extends Vehicle {
    void getSpeed() {}
    void getCubicCapacity() {}
    void sHatback() {}
}

class Bus extends Vehicle {
    void getSpeed(){}
    void getCubicCapacity(){}
    void getEmergencyExitLocation(){}
}

class Main {

    public static void main(String[] args) { 
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();

        vehicle = new Car();
        vehicle.getCubicCapacity();
    }

}
