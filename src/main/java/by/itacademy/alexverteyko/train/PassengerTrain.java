package by.itacademy.alexverteyko.train;

import java.util.List;

public class PassengerTrain {
    List<Wagon> wagonArrayList;

    public PassengerTrain(List<Wagon> wagonArrayList) {
        this.wagonArrayList = wagonArrayList;
    }

    public List<Wagon> getWagonArrayList() {
        return wagonArrayList;
    }

    public void setWagonArrayList(List<Wagon> wagonArrayList) {
        this.wagonArrayList = wagonArrayList;
    }
}
