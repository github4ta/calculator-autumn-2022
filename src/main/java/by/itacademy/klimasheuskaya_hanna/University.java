package by.itacademy.klimasheuskaya_hanna;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final List<Abiturient> abiturients;
    private int sumOfGrades;
    public University(List<Abiturient> abiturients){
        this.abiturients = abiturients;
    }

    public University(List<Abiturient> abiturients, int sumOfGrades) {
        this.abiturients = abiturients;
        this.sumOfGrades = sumOfGrades;
    }

    public void printAbiturients() {
        for (Abiturient abiturient : abiturients) {
            System.out.println(abiturient);
        }
    }

   public List<Abiturient> createAbiturientsListWithFailedGrade(List<Abiturient> abiturients, int failedGrade) {
        List<Abiturient> abiturientsListWithFailedGrade = new ArrayList<>();
        for(Abiturient abiturient : abiturients) {
            if(getAbituriensWithFailedGrades(failedGrade)){
                abiturientsListWithFailedGrade.add(abiturient);
            }
        }
        return abiturientsListWithFailedGrade;
    }

    public List<Abiturient> createAbiturientsListWithSumOfGradelLevel(List<Abiturient> abiturients, int sumOfGradelLevel) {
        List<Abiturient> abiturientsListWithSumOfGradelLevel = new ArrayList<>();
        for(Abiturient abiturient : abiturients) {
            if(getSumOfGrades() > sumOfGradelLevel){
                abiturientsListWithSumOfGradelLevel.add(abiturient);
            }
        }
        return abiturientsListWithSumOfGradelLevel;
    }
    public List<Abiturient> createAbiturientsListWithSemiPassingSumOfGradel(List<Abiturient> abiturients,
                                                                            int minLimitSemiPassingSumOfGrade, int maxLimitSemiPassingSumOfGrade) {
        List<Abiturient> abiturientsListWithSemiPassingSumOfGradel = new ArrayList<>();
        for(Abiturient abiturient : abiturients) {
            if((getSumOfGrades() > minLimitSemiPassingSumOfGrade) && (getSumOfGrades() < maxLimitSemiPassingSumOfGrade)){
                abiturientsListWithSemiPassingSumOfGradel.add(abiturient);
            }
        }
        return abiturientsListWithSemiPassingSumOfGradel;
    }
    public int getSumOfGrades() {
        for(Abiturient a: abiturients){
            sumOfGrades = 0;
            int[] arrayGrades = a.getSubjectGrades();
            for(int i=0; i< arrayGrades.length; i++) {
                sumOfGrades = sumOfGrades + arrayGrades[i];
            }
        }
        return sumOfGrades;
    }

    public boolean getAbituriensWithFailedGrades(int badGrade) {
        for(Abiturient a: abiturients){
            int[] arrayGrades = a.getSubjectGrades();
            for(int i=0; i< arrayGrades.length; i++) {
                if(arrayGrades[i] < badGrade) {
                    return true;
                }
            }
        }
        return false;
    }
}