package by.itacademy.Khinevich_Anastasiya.task07.electrodevices.modelDevices;

import by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity.ElectricLightingDevice;

public class Lamp extends ElectricLightingDevice {
    private String name;


    public Lamp(int power, int countLamp,boolean isTurnedOn) {
        super(power,countLamp, isTurnedOn);
        super.name = "LAMP";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
