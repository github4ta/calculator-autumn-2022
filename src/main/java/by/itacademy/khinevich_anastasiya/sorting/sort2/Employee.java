package by.itacademy.khinevich_anastasiya.sorting.sort2;

public class Employee {

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    // переопределим метод toString() для печати
    // информации об объекте Employee в читабельном виде
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name +
                ", age=" + this.age + ", salary=" + this.salary + "]";
    }
}
