package by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity;

public interface IHomeElectrodevice extends Comparable<IHomeElectrodevice> {
    boolean isOn();

    int getPower();

    @Override
    int compareTo(IHomeElectrodevice o);
}
