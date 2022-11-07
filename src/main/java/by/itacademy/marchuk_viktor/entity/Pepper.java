package by.itacademy.marchuk_viktor.entity;

public class Pepper extends Vegetable{
    private String name = "Pepper";

    public Pepper(double calories, double fats, double proteins, double carbohydrates){
        super(calories, fats, proteins, carbohydrates);
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Pepper{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
