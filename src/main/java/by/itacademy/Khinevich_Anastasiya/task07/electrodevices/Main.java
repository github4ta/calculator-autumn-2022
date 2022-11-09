package by.itacademy.Khinevich_Anastasiya.task07.electrodevices;

import by.itacademy.Khinevich_Anastasiya.task07.electrodevices.actionsWithDevices.DevicesAction;
import by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity.IHomeElectrodevice;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DevicesAction devicesAction = new DevicesAction();
        List<IHomeElectrodevice> devices = devicesAction.createDevices();
        System.out.println("\nDevices at home: ");
        System.out.println(devicesAction.createDevices());
        System.out.println("\nTurned ON devices and their total power: ");
        Collections.sort(devices);
        System.out.println(devicesAction.calculatedPower(devices));
        System.out.println("\nsorted by Comparator SortByPower():");
        devicesAction.sortByPower(devices);
        System.out.println(devicesAction.calculatedPower(devices));
        System.out.println("\nsorted by Comparator SortByState():");
        devicesAction.sortByState(devices);
        System.out.println(devicesAction.calculatedPower(devices));
        System.out.println("\nFound [300 - 400]:");
        System.out.println(devicesAction.foundByPower(devices, 300, 400));
    }
}
