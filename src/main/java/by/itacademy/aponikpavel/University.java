package by.itacademy.aponikpavel;

import java.util.ArrayList;

public class University {

    public ArrayList<Student> createStudentsListWithFaculty(ArrayList<Student> students, String givenFaculty) {
        ArrayList<Student> studentsListWithFaculty = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(givenFaculty))
                studentsListWithFaculty.add(student);
        }
        return studentsListWithFaculty;
    }

    public ArrayList<Student> createStudentsListWithFacultyAndCourse(ArrayList<Student> students, String givenFaculty, String givenCourse) {
        ArrayList<Student> studentsListWithFacultyAndCourse = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(givenFaculty) && student.getCourse().equalsIgnoreCase(givenCourse))
                studentsListWithFacultyAndCourse.add(student);
        }
        return studentsListWithFacultyAndCourse;
    }

    public ArrayList<Student> createStudentsListWithDateOfBirthAfter(ArrayList<Student> students, int givenDateOfBirth) {
        ArrayList<Student> studentsListWithDateOfBirthAfter = new ArrayList<>();
        for (Student student : students) {
            if (student.getDateOfBirth() > (givenDateOfBirth))
                studentsListWithDateOfBirthAfter.add(student);
        }
        return studentsListWithDateOfBirthAfter;
    }

    public ArrayList<Student> createStudentsListWithGroup(ArrayList<Student> students, String givenGroup) {
        ArrayList<Student> studentsListWithGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equalsIgnoreCase(givenGroup))
                studentsListWithGroup.add(student);
        }
        return studentsListWithGroup;
    }


}
