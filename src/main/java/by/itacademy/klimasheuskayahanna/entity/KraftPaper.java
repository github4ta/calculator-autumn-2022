package by.itacademy.klimasheuskayahanna.entity;

import java.util.Objects;

public class KraftPaper {
    private String nameOfAccessory;
    private int kraftPaperCost;

    public KraftPaper(String nameOfAccessory, int kraftPaperCost) {
        this.nameOfAccessory = nameOfAccessory;
        this.kraftPaperCost = kraftPaperCost;
    }

    public String getNameOfAccessory() {
        return nameOfAccessory;
    }

    public void setNameOfAccessory(String nameOfAccessory) {
        this.nameOfAccessory = nameOfAccessory;
    }

    public int getKraftPaperCost() {
        return kraftPaperCost;
    }

    public void setKraftPaperCost(int kraftPaperCost) {
        this.kraftPaperCost = kraftPaperCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KraftPaper)) return false;
        KraftPaper that = (KraftPaper) o;
        return getKraftPaperCost() == that.getKraftPaperCost() && getNameOfAccessory().equals(that.getNameOfAccessory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfAccessory(), getKraftPaperCost());
    }

    @Override
    public String toString() {
        return "KraftPaper{" +
                "nameOfAccessory='" + nameOfAccessory + '\'' +
                ", kraftPaperCost=" + kraftPaperCost +
                '}';
    }
}
