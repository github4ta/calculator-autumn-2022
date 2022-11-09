package by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity;

public  class ElectromechanicalDevices extends HomeElectrodevice {

    private int percentOfPower;

    public ElectromechanicalDevices(int power, int percentOfPower, boolean isTurnedOn) {
        super(power, isTurnedOn);
        this.percentOfPower = percentOfPower;
    }

    public int getPercentOfPower() {
        return percentOfPower;
    }

    public void setPercentOfPower(int percentOfPower) {
        this.percentOfPower = percentOfPower;
    }

    @Override
    public int getPower() {

        return this.percentOfPower  * super.power / 100;
    }
}
