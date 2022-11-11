package by.itacademy.kleschenkonataliya.model;

public class BMW extends Car {
    public BMW(int id, String model, int maxSpeed, double fuelConsumption, int price) {
        super(id, model, maxSpeed, fuelConsumption, price);
    }

    @Override
    public String toString() {
        return String.format("BMW{id = %s, model = %s, maxSpeed = %s, fuelConsumption = %s, price = %s", id, model, maxSpeed, fuelConsumption, price);
    }
}
