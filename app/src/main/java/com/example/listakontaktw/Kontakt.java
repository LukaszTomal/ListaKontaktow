package com.example.listakontaktw;

public class Kontakt {
    private long nr;
    private String Imie;
    private String Nazwisko;
    private String Telefon;

    public Kontakt(String Imie, String Nazwisko, String Telefon) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Telefon = Telefon;
    }

    @Override
    public String toString() {
        return "Kontakt{" +
                "name='" + Imie + '\'' +
                ", surname='" + Nazwisko + '\'' +
                ", phone='" + Telefon + '\'' +
                '}';
    }

    public Kontakt() {

    }

    public long getNr() {
        return nr;
    }

    public void setNr(long nr) {
        this.nr = nr;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        this.Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.Nazwisko = nazwisko;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String telefon) {
        this.Telefon = telefon;
    }


}
