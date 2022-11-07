package by.itacademy.marchuk_viktor.entity;

public class Cucumber extends Vegetable{
    private String name="Cucumber";
    public Cucumber(double calories, double fats, double proteins, double carbohydrates){
        super(calories, fats, proteins, carbohydrates);
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Cucumber{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
