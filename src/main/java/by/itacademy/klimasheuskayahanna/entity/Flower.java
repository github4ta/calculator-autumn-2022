package by.itacademy.klimasheuskayahanna.entity;

import java.util.Objects;

public class Flower {
    private int freshLevelInPercent;
    private int stemLength;
    private double flowerCost;

    public Flower(){}

    public Flower(int freshLevelInPercent, int stemLength, double flowerCost) {
        this.freshLevelInPercent = freshLevelInPercent;
        this.stemLength = stemLength;
        this.flowerCost = flowerCost;
    }

    public int getFreshLevelInPercent() {
        return freshLevelInPercent;
    }

    public void setFreshLevelInPercent(int freshLevelInPercent) {
        this.freshLevelInPercent = freshLevelInPercent;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public double getFlowerCost() {
        return flowerCost;
    }

    public void setFlowerCost(double flowerCost) {
        this.flowerCost = flowerCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return getFreshLevelInPercent() == flower.getFreshLevelInPercent() && getStemLength() == flower.getStemLength() && Double.compare(flower.getFlowerCost(), getFlowerCost()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFreshLevelInPercent(), getStemLength(), getFlowerCost());
    }

    @Override
    public String toString() {
        return "Flower{" +
                "freshLevelInPercent=" + freshLevelInPercent +
                ", stemLength=" + stemLength +
                ", flowerCost=" + flowerCost +
                '}';
    }
}
