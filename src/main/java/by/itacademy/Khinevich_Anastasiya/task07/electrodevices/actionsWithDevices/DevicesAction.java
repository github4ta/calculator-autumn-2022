package by.itacademy.Khinevich_Anastasiya.task07.electrodevices.actionsWithDevices;

import by.itacademy.Khinevich_Anastasiya.task07.electrodevices.entity.*;
import by.itacademy.Khinevich_Anastasiya.task07.electrodevices.modelDevices.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DevicesAction {


    public List<IHomeElectrodevice> createDevices() {
        List<IHomeElectrodevice> homeElectrodevices = new ArrayList<>();
        homeElectrodevices.add(new Lamp(100, 4, true));
        homeElectrodevices.add(new Laptop(200, 20, true));
        homeElectrodevices.add(new Microwave(150, 10, false));
        homeElectrodevices.add(new TableLamp(60,1,false));
        homeElectrodevices.add(new TV(80,30,false));
        homeElectrodevices.add(new VacuumCleaner(310,40,true));
        homeElectrodevices.add(new WallLamp(50,2,true));
        homeElectrodevices.add(new Washer(600,60,false));
        return homeElectrodevices;
    }

    public String calculatedPower(List<IHomeElectrodevice> homeElectrodevices) {
        StringBuilder sb = new StringBuilder();
        int totalOnPower = 0;
        int countOnPower = 0;
        for (IHomeElectrodevice homeElectrodevice : homeElectrodevices) {
            sb.append(homeElectrodevice).append("\n");
            if (homeElectrodevice.isOn()) {
                totalOnPower += homeElectrodevice.getPower();
                countOnPower++;
            }
        }
        sb.append("\nTotal ON count ").append(countOnPower)
                .append("\nTotal ON power: ").append(totalOnPower);
        return sb.toString();
    }

    // здесь не происходит сортировка по мощности, хотя метод compare переопределен
    public void sortByPower(List<IHomeElectrodevice> dev) {
        Collections.sort(dev, new ComparatorSortByPower());
    }

    public void sortByState(List<IHomeElectrodevice> dev) {
        Collections.sort(dev, new ComparatorSortByState());
    }

    public String foundByPower(List<IHomeElectrodevice> devices, int startPower, int endPower) {
        List<IHomeElectrodevice> sortedDevices = new ArrayList<>();
        for (int i = 0; i < devices.size(); i++) {
            if (devices.get(i).getPower() >= startPower
                    && devices.get(i).getPower() <= endPower) {
                sortedDevices.add(devices.get(i));
            }
        }
        return sortedDevices.toString();
    }
}
