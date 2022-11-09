package by.itacademy.Khinevich_Anastasiya.task07.electrodevices.actionsWithDevices;

import by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity.IHomeElectrodevice;

import java.util.Comparator;

public class ComparatorSortByPower implements Comparator<IHomeElectrodevice> {
    @Override
    public int compare(IHomeElectrodevice o1, IHomeElectrodevice o2) {
        if (o1.getPower() > o2.getPower()) {
            return 1;
        } else if (o1.getPower() < o2.getPower()) {
            return -1;
        } else return 0;
    }
}
