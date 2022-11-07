package by.itacademy.marchuk_viktor.entity;

public class Tomato extends Vegetable{
    private String name="Tomato";
    public Tomato(double calories, double fats, double proteins, double carbohydrates){
        super(calories, fats, proteins, carbohydrates);
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Tomato{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
