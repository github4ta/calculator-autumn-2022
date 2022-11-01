package by.itacademy.aponikpavel;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int dateOfBirth;
    private String address;
    private String telephoneNumber;
    private String faculty;
    private String course;
    private String group;

    public Student() {

    }

    public Student(int id, String name, String surname, String patronymic, int dateOfBirth, String address, String telephoneNumber, String faculty, String course, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    public Student(String name, String surname, int dateOfBirth,String faculty, String course, String group) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student {" +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getId() != student.getId()) return false;
        if (getDateOfBirth() != student.getDateOfBirth()) return false;
        if (!getName().equals(student.getName())) return false;
        if (!getSurname().equals(student.getSurname())) return false;
        if (!getPatronymic().equals(student.getPatronymic())) return false;
        if (!getAddress().equals(student.getAddress())) return false;
        if (!getTelephoneNumber().equals(student.getTelephoneNumber())) return false;
        if (!getFaculty().equals(student.getFaculty())) return false;
        if (!getCourse().equals(student.getCourse())) return false;
        return getGroup().equals(student.getGroup());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getPatronymic().hashCode();
        result = 31 * result + getDateOfBirth();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + getTelephoneNumber().hashCode();
        result = 31 * result + getFaculty().hashCode();
        result = 31 * result + getCourse().hashCode();
        result = 31 * result + getGroup().hashCode();
        return result;
    }
}
