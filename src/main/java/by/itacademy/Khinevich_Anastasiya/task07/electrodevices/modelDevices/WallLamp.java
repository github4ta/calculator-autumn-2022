package by.itacademy.Khinevich_Anastasiya.task07.electrodevices.modelDevices;

import by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity.ElectricLightingDevice;

public class WallLamp extends ElectricLightingDevice {
    private String name;

    public WallLamp(int power, int countLamp,boolean isTurnedOn) {
        super(power,countLamp, isTurnedOn);
        super.name = "WALL_LAMP";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
