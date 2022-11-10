package by.itacademy.klimasheuskayahanna.entity;

public class Rose extends Flower {
    private String nameOfFlower;

    public Rose(int freshLevelInPercent, int stemLength, double flowerCost, String nameOfFlower) {
        super(freshLevelInPercent, stemLength, flowerCost);
        this.nameOfFlower = "Rose";
    }

    public String getNameOfFlower() {
        return nameOfFlower;
    }

    public void setNameOfFlower(String nameOfFlower) {
        this.nameOfFlower = nameOfFlower;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "nameOfFlower='" + nameOfFlower + '\'' +
                '}';
    }
}
