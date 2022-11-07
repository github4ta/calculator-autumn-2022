package by.itacademy.marchuk_viktor.entity;

public abstract class Vegetable{
    private double calories;
    private double fats;
    private double proteins;
    private double carbohydrates;

    public Vegetable(){

    }

    public Vegetable(double calories, double fats, double proteins, double carbohydrates){
        this.calories = calories;
        this.fats = fats;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
    }

    public double getCalories(){
        return calories;
    }

    public void setCalories(double calories){
        this.calories = calories;
    }

    public double getFats(){
        return fats;
    }

    public void setFats(double fats){
        this.fats = fats;
    }

    public double getProteins(){
        return proteins;
    }

    public void setProteins(double proteins){
        this.proteins = proteins;
    }

    public double getCarbohydrates(){
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates){
        this.carbohydrates = carbohydrates;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Vegetable)) return false;

        Vegetable vegetable = (Vegetable)o;

        if(Double.compare(vegetable.getCalories(), getCalories()) != 0) return false;
        if(Double.compare(vegetable.getFats(), getFats()) != 0) return false;
        if(Double.compare(vegetable.getProteins(), getProteins()) != 0) return false;
        return Double.compare(vegetable.getCarbohydrates(), getCarbohydrates()) == 0;
    }

    @Override
    public int hashCode(){
        int result;
        long temp;
        temp = Double.doubleToLongBits(getCalories());
        result = (int)(temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getFats());
        result = 31 * result + (int)(temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getProteins());
        result = 31 * result + (int)(temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCarbohydrates());
        result = 31 * result + (int)(temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Vegetable{");
        sb.append("calories=").append(calories);
        sb.append(", fats=").append(fats);
        sb.append(", proteins=").append(proteins);
        sb.append(", carbohydrates=").append(carbohydrates);
        sb.append('}');
        return sb.toString();
    }
}
