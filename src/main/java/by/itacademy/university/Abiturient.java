package by.itacademy.university;

import java.util.Map;
import java.util.Objects;
import com.github.javafaker.Faker;


public class Abiturient {
    private String name;
    private Map<String, Integer> subjectAndMark;

    public Abiturient(String name, Map<String, Integer> subjectAndMark) {
        this.name = name;
        this.subjectAndMark = subjectAndMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getSubjectAndMark() {
        return subjectAndMark;
    }

    public void setSubjectAndMark(Map<String, Integer> subjectAndMark) {
        this.subjectAndMark = subjectAndMark;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "name='" + name + '\'' +
                ", subjectAndMark=" + subjectAndMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abiturient that = (Abiturient) o;
        return name.equals(that.name) && subjectAndMark.equals(that.subjectAndMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjectAndMark);
    }
}
