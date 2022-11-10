package by.itacademy.klimasheuskayahanna.entity;

public class Freesia extends Flower {
    private String nameOfFlower;

    public Freesia(int freshLevelInPercent, int stemLength, double flowerCost, String nameOfFlower) {
        super(freshLevelInPercent, stemLength, flowerCost);
        this.nameOfFlower = "Freesia";
    }

    public String getNameOfFlower() {
        return nameOfFlower;
    }

    public void setNameOfFlower(String nameOfFlower) {
        this.nameOfFlower = nameOfFlower;
    }

    @Override
    public String toString() {
        return "Freesia{" +
                "nameOfFlower='" + nameOfFlower + '\'' +
                '}';
    }
}
