package by.itacademy.khilko;

import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.List;
import java.util.ArrayList;
/*
House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип
здания, Срок эксплуатации.

Создать массив объектов. Вывести:
a) список квартир, имеющих заданное число комнат;
b) список квартир, имеющих заданное число комнат и расположенных на
этаже, который находится в заданном промежутке;
c) список квартир, имеющих площадь, превосходящую заданную.
 */
public class House {
    private int id;
    private int apartmentNumber;
    private double area;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String buildingType;
    private int serviceLife;



    public House(int id, int apartmentNumber, double area, int floor, int numberOfRooms, String street, String buildingType, GregorianCalendar serviceLife) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.serviceLife = serviceLife.get(Calendar.YEAR);;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        if(apartmentNumber >=1) {
            this.apartmentNumber = apartmentNumber;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if(area >= 0) {
            this.area = area;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if(floor > 0 ) {
            this.floor = floor;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        if(numberOfRooms >=1) {
            this.numberOfRooms = numberOfRooms;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(GregorianCalendar serviceLife) {
        GregorianCalendar currentTime = new GregorianCalendar();
        if(serviceLife.get(Calendar.YEAR) < currentTime.get(Calendar.YEAR)) {
            this.serviceLife = serviceLife.get(Calendar.YEAR);
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", serviceLife=" + serviceLife +
                '}';
    }
}
