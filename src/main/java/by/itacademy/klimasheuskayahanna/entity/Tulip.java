package by.itacademy.klimasheuskayahanna.entity;

public class Tulip extends Flower {
    private String nameOfFlower;

    public Tulip(int freshLevelInPercent, int stemLength, double flowerCost, String nameOfFlower) {
        super(freshLevelInPercent, stemLength, flowerCost);
        this.nameOfFlower = "Tulip";
    }

    public String getNameOfFlower() {
        return nameOfFlower;
    }

    public void setNameOfFlower(String nameOfFlower) {
        this.nameOfFlower = nameOfFlower;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "nameOfFlower='" + nameOfFlower + '\'' +
                '}';
    }
}
