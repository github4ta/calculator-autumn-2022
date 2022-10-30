package by.itacademy.kleschenkonataliya;

public class Patient {
    private int id;
    private String name;
    private String patronymic;
    private String surname;
    private String address;
    private String phoneNumber;
    private int cardNumber;

    private String diagnosis;

    public Patient() {
    }

    public Patient(String name, String surname, int cardNumber, String diagnosis) {
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.diagnosis = diagnosis;
    }

    public Patient(int id, String name, String patronymic, String surname, String address, String phoneNumber, int cardNumber, String diagnosis) {
        this(name, surname, cardNumber, diagnosis);
        this.id = id;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return ("Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cardNumber=" + cardNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (getId() != patient.getId()) return false;
        if (getCardNumber() != patient.getCardNumber()) return false;
        if (!getName().equals(patient.getName())) return false;
        if (!getSurname().equals(patient.getSurname())) return false;
        if (!getPatronymic().equals(patient.getPatronymic())) return false;
        if (!getAddress().equals(patient.getAddress())) return false;
        if (!getPhoneNumber().equals(patient.getPhoneNumber())) return false;
        return getDiagnosis().equals(patient.getDiagnosis());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getPatronymic().hashCode();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + getPhoneNumber().hashCode();
        result = 31 * result + getCardNumber();
        result = 31 * result + getDiagnosis().hashCode();
        return result;
    }

}
