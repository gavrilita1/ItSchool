package session10;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getDetails() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

class Car extends Vehicle{

    private int nrDoors;

    public Car(String brand, String model, int year, int nrDoors){
        super(brand,model,year);
        this.nrDoors = nrDoors;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nrDoors=" + nrDoors +
                '}';
    }
}

class ElectricCar extends Car {
    private int improvedBatery;

    public ElectricCar(String brand, String model, int year, int nrDoors, int improvedBatery){
        super(brand,model,year,nrDoors);
        this.improvedBatery = improvedBatery;
    }

    public int getImprovedBatery() {
        return improvedBatery;
    }

    public void setImprovedBatery(int improvedBatery) {
        this.improvedBatery = improvedBatery;
    }

    @Override
    public String toString() {
        String electric =  "ElectricCar{" +
                "improvedBatery=" + improvedBatery +
                '}';
        return super.toString() + electric;
    }
}

class Truck extends Vehicle{
    private int improvedCapacity;

    public Truck(String brand, String model, int year, int improvedCapacity) {
        super(brand, model, year);
        this.improvedCapacity = improvedCapacity;
    }

    public int getImprovedCapacity() {
        return improvedCapacity;
    }

    public void setImprovedCapacity(int improvedCapacity) {
        this.improvedCapacity = improvedCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "improvedCapacity=" + improvedCapacity +
                '}';
    }
}

class MainVehicles{
    public static void main(String[] args) {

        Car c1 = new Car("BMW", "e39", 2001, 4);
        System.out.println(c1.getBrand());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());
        System.out.println(c1.getNrDoors());

        System.out.println(c1.getDetails());
        System.out.println(c1.toString());

        ElectricCar ec1 = new ElectricCar("Tesla", "x", 2018, 4, 2000);
        System.out.println(ec1.toString());
        System.out.println(ec1.getDetails());

    }
}
