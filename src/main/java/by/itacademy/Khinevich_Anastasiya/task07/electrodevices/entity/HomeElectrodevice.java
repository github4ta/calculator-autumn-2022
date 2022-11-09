package by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity;

import java.util.Objects;

public abstract class HomeElectrodevice implements IHomeElectrodevice {
    protected String name;
    protected int power;
    private boolean isTurnedOn;

    public HomeElectrodevice(int power, boolean isTurnedOn) {
        this.power = power;
        this.isTurnedOn = isTurnedOn;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.isTurnedOn = turnedOn;
    }

    @Override
    public boolean isOn() {
        return isTurnedOn;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeElectrodevice that = (HomeElectrodevice) o;
        return power == that.power && isTurnedOn == that.isTurnedOn && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, name, isTurnedOn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(this.name).append(" : ").append(this.power).append(" : ").append(this.isOn() ? "on" : "off").append(")");
        return sb.toString();

    }

    @Override
    public int compareTo(IHomeElectrodevice devToCompare) {
        int result;
        result = Boolean.compare(isOn(), devToCompare.isOn());
        if (result != 0) return result;
        result = Integer.compare(getPower(), devToCompare.getPower());
        return result;
    }
}
