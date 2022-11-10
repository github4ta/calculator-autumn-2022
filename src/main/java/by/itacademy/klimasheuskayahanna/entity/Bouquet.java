package by.itacademy.klimasheuskayahanna.entity;

import java.util.Objects;

public class Bouquet {
    private String nameOfBouquet;
    private Rose rose;
    private Tulip tulip;
    private Freesia freesia;
    private Bow bow;
    private KraftPaper kraftPaper;

    public Bouquet(String nameOfBouquet, Rose rose, Tulip tulip, Freesia freesia, Bow bow, KraftPaper kraftPaper) {
        this.nameOfBouquet = nameOfBouquet;
        this.rose = rose;
        this.tulip = tulip;
        this.freesia = freesia;
        this.bow = bow;
        this.kraftPaper = kraftPaper;
    }

    public String getNameOfBouquet() {
        return nameOfBouquet;
    }

    public void setNameOfBouquet(String nameOfBouquet) {
        this.nameOfBouquet = nameOfBouquet;
    }

    public Rose getRose() {
        return rose;
    }

    public void setRose(Rose rose) {
        this.rose = rose;
    }

    public Tulip getTulip() {
        return tulip;
    }

    public void setTulip(Tulip tulip) {
        this.tulip = tulip;
    }

    public Freesia getFreesia() {
        return freesia;
    }

    public void setFreesia(Freesia freesia) {
        this.freesia = freesia;
    }

    public Bow getBow() {
        return bow;
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public KraftPaper getKraftPaper() {
        return kraftPaper;
    }

    public void setKraftPaper(KraftPaper kraftPaper) {
        this.kraftPaper = kraftPaper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bouquet)) return false;
        Bouquet bouquet = (Bouquet) o;
        return getNameOfBouquet().equals(bouquet.getNameOfBouquet()) && getRose().equals(bouquet.getRose()) && getTulip().equals(bouquet.getTulip()) && getFreesia().equals(bouquet.getFreesia()) && getBow().equals(bouquet.getBow()) && getKraftPaper().equals(bouquet.getKraftPaper());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBouquet(), getRose(), getTulip(), getFreesia(), getBow(), getKraftPaper());
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "nameOfBouquet='" + nameOfBouquet + '\'' +
                ", rose=" + rose +
                ", tulip=" + tulip +
                ", freesia=" + freesia +
                ", bow=" + bow +
                ", kraftPaper=" + kraftPaper +
                '}';
    }
}
