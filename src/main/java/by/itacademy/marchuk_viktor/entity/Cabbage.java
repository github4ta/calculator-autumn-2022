package by.itacademy.marchuk_viktor.entity;

public class Cabbage extends Vegetable{
    String name="Cabbage";
    public Cabbage(double calories, double fats, double proteins, double carbohydrates){
        super(calories, fats, proteins, carbohydrates);
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Cabbage{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
