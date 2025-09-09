package FunctionalInterfaces;

interface Vehicle1 {
    void rent();
    void returnVehicle();
}

class Car1 implements Vehicle1 {
    public void rent() { System.out.println("Car rented."); }
    public void returnVehicle() { System.out.println("Car returned."); }
}

class Bike implements Vehicle1 {
    public void rent() { System.out.println("Bike rented."); }
    public void returnVehicle() { System.out.println("Bike returned."); }
}

class Bus implements Vehicle1 {
    public void rent() { System.out.println("Bus rented."); }
    public void returnVehicle() { System.out.println("Bus returned."); }
}

class MultiVehicleRentalSystem{
    public static void main(String[] args) {
        Vehicle1 car = new Car1();
        Vehicle1 bike = new Bike();
        Vehicle1 bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}