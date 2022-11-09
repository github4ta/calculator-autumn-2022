package by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity;

public  class ElectricLightingDevice extends HomeElectrodevice {

    private int countLamp;

    public ElectricLightingDevice(int power, int countLamp, boolean isTurnedOn) {
        super(power, isTurnedOn);
        this.countLamp = countLamp;
    }

    public int getCountLamp() {
        return countLamp;
    }

    public void setCountLamp(int countLamp) {
        this.countLamp = countLamp;
    }

    @Override
    public int getPower() {
        return this.countLamp * super.power;
    }
}
