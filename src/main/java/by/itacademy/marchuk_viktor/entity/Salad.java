package by.itacademy.marchuk_viktor.entity;

public class Salad{
    private String saladName;
    private Cabbage cabbage;
    private Carrot carrot;
    private Pepper pepper;
    private Tomato tomato;
    private Cucumber cucumber;

    public Salad(String saladName, Tomato tomato, Cucumber cucumber){
        this.saladName = saladName;
        this.tomato = tomato;
        this.cucumber = cucumber;
    }

    public Salad(String saladName, Cabbage cabbage, Carrot carrot, Cucumber cucumber){
        this.saladName = saladName;
        this.cabbage = cabbage;
        this.carrot = carrot;
        this.cucumber = cucumber;
    }

    public Salad(String saladName, Pepper pepper, Cucumber cucumber, Tomato tomato){
        this.saladName = saladName;
        this.pepper = pepper;
        this.cucumber = cucumber;
        this.tomato = tomato;
    }

    public Cabbage getCabbage(){
        return cabbage;
    }

    public void setCabbage(Cabbage cabbage){
        this.cabbage = cabbage;
    }

    public Carrot getCarrot(){
        return carrot;
    }

    public void setCarrot(Carrot carrot){
        this.carrot = carrot;
    }

    public Pepper getPepper(){
        return pepper;
    }

    public void setPepper(Pepper pepper){
        this.pepper = pepper;
    }

    public Tomato getTomato(){
        return tomato;
    }

    public void setTomato(Tomato tomato){
        this.tomato = tomato;
    }

    public Cucumber getCucumber(){
        return cucumber;
    }

    public void setCucumber(Cucumber cucumber){
        this.cucumber = cucumber;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Salad)) return false;

        Salad salad = (Salad)o;

        if(getCabbage() != null ? !getCabbage().equals(salad.getCabbage()) : salad.getCabbage() != null) return false;
        if(getCarrot() != null ? !getCarrot().equals(salad.getCarrot()) : salad.getCarrot() != null) return false;
        if(getPepper() != null ? !getPepper().equals(salad.getPepper()) : salad.getPepper() != null) return false;
        if(getTomato() != null ? !getTomato().equals(salad.getTomato()) : salad.getTomato() != null) return false;
        return getCucumber() != null ? getCucumber().equals(salad.getCucumber()) : salad.getCucumber() == null;
    }

    @Override
    public int hashCode(){
        int result = getCabbage() != null ? getCabbage().hashCode() : 0;
        result = 31 * result + (getCarrot() != null ? getCarrot().hashCode() : 0);
        result = 31 * result + (getPepper() != null ? getPepper().hashCode() : 0);
        result = 31 * result + (getTomato() != null ? getTomato().hashCode() : 0);
        result = 31 * result + (getCucumber() != null ? getCucumber().hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Salad{");
        sb.append("cabbage=").append(cabbage);
        sb.append(", carrot=").append(carrot);
        sb.append(", pepper=").append(pepper);
        sb.append(", tomato=").append(tomato);
        sb.append(", cucumber=").append(cucumber);
        sb.append('}');
        return sb.toString();
    }
}
