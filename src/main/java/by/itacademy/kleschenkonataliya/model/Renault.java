package by.itacademy.kleschenkonataliya.model;

public class Renault extends Car {
    public Renault(int id, String model, int maxSpeed, double fuelConsumption, int price) {
        super(id, model, maxSpeed, fuelConsumption, price);
    }

    @Override
    public String toString() {
        return String.format("Renault{id = %s, model = %s, maxSpeed = %s, fuelConsumption = %s, price = %s", id, model, maxSpeed, fuelConsumption, price);
    }
}
