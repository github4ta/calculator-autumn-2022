package by.itacademy.kleschenkonataliya.model;

public abstract class Car {
    protected int id;
    protected String model;
    protected int maxSpeed;
    protected double fuelConsumption;
    protected int price;

    public Car(int id, String model, int maxSpeed, double fuelConsumption, int price) {
        this.id = id;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        if (getId() != car.getId()) return false;
        if (getMaxSpeed() != car.getMaxSpeed()) return false;
        if (getFuelConsumption() != car.getFuelConsumption()) return false;
        if (getPrice() != car.getPrice()) return false;
        return getModel() != null ? getModel().equals(car.getModel()) : car.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + getMaxSpeed();
        result = (int) (31 * result + getFuelConsumption());
        result = 31 * result + getPrice();
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

}
