package by.itacademy.klimasheuskaya_hanna;

import java.util.Arrays;
import java.util.Objects;

public class Abiturient {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;
    private String address;
    private int[] subjectGrades;

    public Abiturient(int id, String surname, String name, String patronymic,
                      String phoneNumber, String address, int[] subjectGrades) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.subjectGrades = subjectGrades;
    }

    public Abiturient(int id, String surname, String name, String patronymic, int[] subjectGrades) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.subjectGrades = subjectGrades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int[] getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(int[] subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", subjectGrades=" + Arrays.toString(subjectGrades) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abiturient that = (Abiturient) o;
        return id == that.id && surname.equals(that.surname) && name.equals(that.name) && patronymic.equals(that.patronymic) && phoneNumber.equals(that.phoneNumber) && address.equals(that.address) && Arrays.equals(subjectGrades, that.subjectGrades);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, surname, name, patronymic, phoneNumber, address);
        result = 31 * result + Arrays.hashCode(subjectGrades);
        return result;
    }
}
