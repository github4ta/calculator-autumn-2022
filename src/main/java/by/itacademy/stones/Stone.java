package by.itacademy.stones;

public class Stone implements Comparable  {
    String name;
    double weight;
    float transparency;
    float cost;

    public Stone() {
    }

    public Stone(String name, double weight, float transparency, float cost) {
        this.name = name;
        this.weight = weight;
        this.transparency = transparency;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getTransparency() {
        return transparency;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "{Stone: " + name + ", Transparency: " + transparency + ", Weight: " + weight + ", Cost: " + cost + "}";
    }

    public int compareTo(Object obj) {
        Stone tmp = (Stone) obj;
        if (this.cost < tmp.cost) {
            return -1;
        } else if (this.cost > tmp.cost) {
            return 1;
        }
        return 0;
    }
}
