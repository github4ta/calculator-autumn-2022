package by.itacademy.aponikpavel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("A","P", 2000, "биологический","2", "A");
        Student student2 = new Student("B","U", 2003, "математический","3", "B");
        Student student3 = new Student("C","T", 2003, "физический","4", "C");
        Student student4 = new Student("D","E", 2001, "юридический","2", "D");
        Student student5 = new Student("I","Q", 2002, "биологический","2", "A");
        Student student6 = new Student("F","V", 2002, "биологический","4", "A");
        Student student7 = new Student("J","L", 2004, "юридический","5", "C");
        Student student8 = new Student("H","X", 2004, "математический","3", "D");
        Student student9 = new Student("K","Y", 2003, "биологический","2", "D");
        Student student10 = new Student("M","W", 2001, "математический","3", "C");

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
        //System.out.println(listOfStudents);

        University university = new University();

        System.out.println(university.createStudentsListWithFaculty(listOfStudents, "биологический"));
        System.out.println(university.createStudentsListWithFacultyAndCourse(listOfStudents, "биологический", "2"));
        System.out.println(university.createStudentsListWithDateOfBirthAfter(listOfStudents, 2002));
        System.out.println(university.createStudentsListWithGroup(listOfStudents, "D"));

    }
}
