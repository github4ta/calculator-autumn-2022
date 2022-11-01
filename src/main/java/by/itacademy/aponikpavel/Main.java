package by.itacademy.aponikpavel;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();

        Student student1 = new Student(faker.name().firstName(), faker.name().lastName(), 2001, "биологический", "2", "A");
        Student student2 = new Student(faker.name().firstName(), faker.name().lastName(), 2003, "математический", "3", "B");
        Student student3 = new Student(faker.name().firstName(), faker.name().lastName(), 2003, "физический", "4", "C");
        Student student4 = new Student(faker.name().firstName(), faker.name().lastName(), 2001, "юридический", "2", "D");
        Student student5 = new Student(faker.name().firstName(), faker.name().lastName(), 2002, "биологический", "2", "A");
        Student student6 = new Student(faker.name().firstName(), faker.name().lastName(), 2002, "биологический", "4", "A");
        Student student7 = new Student(faker.name().firstName(), faker.name().lastName(), 2004, "юридический", "5", "C");
        Student student8 = new Student(faker.name().firstName(), faker.name().lastName(), 2004, "математический", "2", "D");
        Student student9 = new Student(faker.name().firstName(), faker.name().lastName(), 2003, "биологический", "2", "D");
        Student student10 = new Student(faker.name().firstName(), faker.name().lastName(), 2001, "математический", "2", "C");

        ArrayList <Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        listOfStudents.add(student5);
        listOfStudents.add(student6);
        listOfStudents.add(student7);
        listOfStudents.add(student8);
        listOfStudents.add(student9);
        listOfStudents.add(student10);

        University university = new University();

        System.out.println(university.createStudentsListWithFaculty(listOfStudents, "биологический"));
        System.out.println(university.createStudentsListWithFacultyAndCourse(listOfStudents, "биологический", "2"));
        System.out.println(university.createStudentsListWithDateOfBirthAfter(listOfStudents, 2002));
        System.out.println(university.createStudentsListWithGroup(listOfStudents, "D"));

    }
}
