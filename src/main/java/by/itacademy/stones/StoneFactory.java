package by.itacademy.stones;

import java.util.Arrays;
import java.util.List;

public class StoneFactory {

    public static Stone getStone(Stone stone) {
        if (PreciousStonesNames.getNames().contains(stone.name))
            return new PreciousStone(stone);
        if (SemipreciousStonesNames.getNames().contains(stone.name))
            return new SemipreciousStone(stone);
        return null;

    }

    enum PreciousStonesNames {
        Diamond("Diamond"), Sapphire("Sapphire");
        private String name;

        PreciousStonesNames(String name) {
            this.name = name;
        }

        public static List<String> getNames() {
            return Arrays.asList(Diamond.getName(), Sapphire.getName());
        }

        public String getName() {
            return name;
        }
    }

    enum SemipreciousStonesNames {
        Amber("Amber"), Turquoise("Turquoise");
        private String name;

        SemipreciousStonesNames(String name) {
            this.name = name;
        }

        public static List<String> getNames() {
            return Arrays.asList(Amber.getName(), Turquoise.getName());
        }

        public String getName() {
            return name;
        }
    }
}
