package by.itacademy.kleschenkonataliya.model;

public class Renault extends Car {
    public Renault(int id, String model, int maxSpeed, double fuelConsumption, int price) {
        super(id, model, maxSpeed, fuelConsumption, price);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Renault{");
        sb.append("id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
