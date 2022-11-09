package by.itacademy.Khinevich_Anastasiya.task07.electrodevices.modelDevices;

import by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity.ElectromechanicalDevices;

public class Microwave extends ElectromechanicalDevices {
    private String name;

    public Microwave(int power, int percentOfPower, boolean isTurnedOn) {
        super(power, percentOfPower, isTurnedOn);
        super.name = "MICROWAVE";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
