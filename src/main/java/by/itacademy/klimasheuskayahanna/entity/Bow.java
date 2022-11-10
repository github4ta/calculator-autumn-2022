package by.itacademy.klimasheuskayahanna.entity;

import java.util.Objects;

public class Bow {
    private String nameOfAccessory = "Bow";
    private int bowCost;

    public Bow(String nameOfAccessory, int bowCost) {
        this.nameOfAccessory = nameOfAccessory;
        this.bowCost = bowCost;
    }

    public String getNameOfAccessory() {
        return nameOfAccessory;
    }

    public void setNameOfAccessory(String nameOfAccessory) {
        this.nameOfAccessory = nameOfAccessory;
    }

    public int getBowCost() {
        return bowCost;
    }

    public void setBowCost(int bowCost) {
        this.bowCost = bowCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bow)) return false;
        Bow bow = (Bow) o;
        return getBowCost() == bow.getBowCost() && getNameOfAccessory().equals(bow.getNameOfAccessory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfAccessory(), getBowCost());
    }

    @Override
    public String toString() {
        return "Bow{" +
                "nameOfAccessory='" + nameOfAccessory + '\'' +
                ", bowCost=" + bowCost +
                '}';
    }
}
