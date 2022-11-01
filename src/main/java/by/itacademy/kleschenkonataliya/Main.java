package by.itacademy.kleschenkonataliya;

import java.util.ArrayList;

public class Main {
    //Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
    //Создать массив объектов. Вывести:
    //a) список пациентов, имеющих данный диагноз;
    //b) список пациентов, номер медицинской карты которых находится в заданном интервале.

    public static void main(String[] args) {
        Patients patients = new Patients();
        ArrayList<Patient> listOfPatients = patients.createPatientsList(10);
        Clinic clinic = new Clinic(listOfPatients);
        System.out.println("Список всех пациентов клиники: ");
        System.out.println();
        clinic.printPatients();
        String diagnosis = "ОРВИ";
        System.out.println();
        System.out.println("Список пациентов с диагнозом \"" + diagnosis + "\":");
        System.out.println(clinic.createPatientsListWithDiagnosis(listOfPatients, diagnosis));
        System.out.println();
        int cardNumberFrom = 30;
        int cardNumberTo = 60;
        System.out.println("Список пациентов с номером медкарты от " + cardNumberFrom + " до " + cardNumberTo);
        System.out.println(clinic.createPatientsListWithCardNumber(listOfPatients, cardNumberFrom, cardNumberTo));
    }
}
