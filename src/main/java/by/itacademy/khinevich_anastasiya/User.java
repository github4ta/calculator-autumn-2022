package by.itacademy.khinevich_anastasiya;

import java.util.Objects;

public class User implements Comparable<User> {
    private int id; // id
    private int numberCreditCard; // номер кредитной карты
    private String lastName; // фамилия
    private String name; // имя
    private String middleName; // отчество
    private String debitCard; // дебит
    private String creditCard; // кредит
    private int timeCallInsideCity; // время городских разговоров
    private int timeCallOutsideCity; // время междугородних разговоров


    public User(String lastName, int timeCallInsideCity, int timeCallOutsideCity) {
        this.lastName = lastName;
        this.timeCallInsideCity = timeCallInsideCity;
        this.timeCallOutsideCity = timeCallOutsideCity;
    }

    public User(int id, int numberCreditCard, String lastName, String name, String middleName) {
        this.id = id;
        this.numberCreditCard = numberCreditCard;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
    }

    public User(int id, int numberCreditCard, String lastName, String name, String middleName, String debitCard, String creditCard, int timeCallInsideCity, int timeCallOutsideCity) {
        this.id = id;
        this.numberCreditCard = numberCreditCard;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.debitCard = debitCard;
        this.creditCard = creditCard;
        this.timeCallInsideCity = timeCallInsideCity;
        this.timeCallOutsideCity = timeCallOutsideCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(int numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public int getTimeCallInsideCity() {
        return timeCallInsideCity;
    }

    public void setTimeCallInsideCity(int timeCallInsideCity) {
        this.timeCallInsideCity = timeCallInsideCity;
    }

    public int getTimeCallOutsideCity() {
        return timeCallOutsideCity;
    }

    public void setTimeCallOutsideCity(int timeCallOutsideCity) {
        this.timeCallOutsideCity = timeCallOutsideCity;
    }

/*
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", numberCreditCard=" + numberCreditCard +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\''  +
                '}';
    }
*/

    @Override
    public String toString() {
        return String.format("User{lastName=%s,timeCallInsideCity=%s,timeCallOutsideCity=%s}", lastName, timeCallInsideCity, timeCallOutsideCity);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;

        return id == user.id && numberCreditCard == user.numberCreditCard && timeCallInsideCity == user.timeCallInsideCity && timeCallOutsideCity == user.timeCallOutsideCity && Objects.equals(lastName, user.lastName) && Objects.equals(name, user.name) && Objects.equals(middleName, user.middleName) && Objects.equals(debitCard, user.debitCard) && Objects.equals(creditCard, user.creditCard);
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31*result + getLastName().hashCode();
        result = 31*result + getName().hashCode();
        result = 31*result + getMiddleName().hashCode();
        result = 31*result + getNumberCreditCard();
        result = 31*result + getDebitCard().hashCode();
        result = 31*result + getCreditCard().hashCode();
        result = 31*result + getTimeCallInsideCity();
        result = 31*result + timeCallOutsideCity;
        return result;
    }

    @Override
    public int compareTo(User user) {
        return this.lastName.compareTo(user.lastName);
    }
}
