package by.itacademy.marchuk_viktor.entity;

public class Carrot extends Vegetable{
    private String name = "Carrot";

    public Carrot(double calories, double fats, double proteins, double carbohydrates){
        super(calories, fats, proteins, carbohydrates);
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Carrot{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
