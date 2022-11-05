package by.itacademy.stones;

public class PreciousStone extends Stone {
    public PreciousStone() {
    }

    public PreciousStone(Stone stone) {
        super(stone.name, stone.weight, stone.transparency, stone.cost);
    }

    @Override
    public String toString() {
        return super.toString() + " (precious)";
    }
}
