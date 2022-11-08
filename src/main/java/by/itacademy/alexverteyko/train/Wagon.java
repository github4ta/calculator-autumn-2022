package by.itacademy.alexverteyko.train;

import by.itacademy.alexverteyko.wagontype.WagonType;

public class Wagon {
    private WagonType type;
    private int number;
    private int wagonAmount;
    private int maxPassengerValue;
    private int maxLuggageCapacity;
    private int comfortLevel;

    @Override
    public String toString() {
        return "Wagon{" +
                "type=" + type +
                ", number=" + number +
                ", wagonAmount=" + wagonAmount +
                ", maxPassengerValue=" + maxPassengerValue +
                ", maxLuggageCapacity=" + maxLuggageCapacity +
                ", comfortLevel=" + comfortLevel +
                '}';
    }

    public Wagon(WagonType type, int number, int wagonAmount, int maxPassengerValue, int maxLuggageCapacity, int comfortLevel) {
        this.type = type;
        this.number = number;
        this.wagonAmount = wagonAmount;
        this.maxPassengerValue = maxPassengerValue;
        this.maxLuggageCapacity = maxLuggageCapacity;
        this.comfortLevel = comfortLevel;
    }

    public WagonType getType() {
        return type;
    }

    public void setType(WagonType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWagonAmount() {
        return wagonAmount;
    }

    public void setWagonAmount(int wagonAmount) {
        this.wagonAmount = wagonAmount;
    }

    public int getMaxPassengerValue() {
        return maxPassengerValue;
    }

    public void setMaxPassengerValue(int maxPassengerValue) {
        this.maxPassengerValue = maxPassengerValue;
    }

    public int getMaxLuggageCapacity() {
        return maxLuggageCapacity;
    }

    public void setMaxLuggageCapacity(int maxLuggageCapacity) {
        this.maxLuggageCapacity = maxLuggageCapacity;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = comfortLevel;
    }
}
