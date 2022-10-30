package by.itacademy.kleschenkonataliya;

import java.util.ArrayList;

public class Clinic {
    private final ArrayList<Patient> patients;

    public Clinic(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void printPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public ArrayList<Patient> createPatientsListWithDiagnosis(ArrayList<Patient> patients, String targetDiagnosis) {
        ArrayList<Patient> patientsListWithDiagnosis = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equalsIgnoreCase(targetDiagnosis))
                patientsListWithDiagnosis.add(patient);
        }
        return patientsListWithDiagnosis;
    }

    public ArrayList<Patient> createPatientsListWithCardNumber(ArrayList<Patient> patients, int from, int to) {
        ArrayList<Patient> patientsWithTargetRange = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getCardNumber() >= from && patient.getCardNumber() <= to)
                patientsWithTargetRange.add(patient);
        }
        return patientsWithTargetRange;
    }
}
