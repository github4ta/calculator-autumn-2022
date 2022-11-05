package by.itacademy.stones;

public class SemipreciousStone extends Stone {
    public SemipreciousStone() {
    }

    public SemipreciousStone(Stone stone) {
        super(stone.name, stone.weight, stone.transparency, stone.cost);
    }

    @Override
    public String toString() {
        return super.toString() + " (semiprecious)";
    }
}
