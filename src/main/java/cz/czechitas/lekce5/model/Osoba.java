package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Osoba {
    private String jmeno;
    private String prijmeni;
    private String rodneCislo;
    private Telefon telefon;
    private Adresa adresa;
    private String pracovniEmail;
    private String soukromyEmail;

    public Osoba() {

    }

    public Osoba(String jmeno, String prijmeni, String rodneCislo, Telefon telefon, Adresa adresa,String pracovniEmail, String soukromyEmail) {
        setJmeno(jmeno);
        setPrijmeni(prijmeni);
        setRodneCislo(rodneCislo);
        setTelefon(telefon);
        setAdresa(adresa);
        setPracovniEmail(pracovniEmail);
        setSoukromyEmail(soukromyEmail);
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        Objects.requireNonNull(jmeno);
        if (jmeno.isBlank()) {
            System.err.println("Jméno nemůže být prázdné.");
            return;
        }
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        Objects.requireNonNull(prijmeni);
        if (prijmeni.isBlank()) {
            System.err.println("Příjmení nemůže být prázdné.");
            return;
        }
        this.prijmeni = prijmeni;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        Objects.requireNonNull(rodneCislo);
        if (rodneCislo.isBlank()) {
            System.err.println("Rodné číslo nemůže být prázdné.");
            return;
        }
        if (!rodneCislo.contains("/")) {
            System.err.println("Rodné číslo musí obsahovat lomítko.");
            return;
        }
        this.rodneCislo = rodneCislo;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public String getPracovniEmail() {
        return pracovniEmail;
    }

    public void setPracovniEmail(String pracovniEmail) {
        Objects.requireNonNull(pracovniEmail);
        if (pracovniEmail.isBlank()) {
            System.err.println("Soukromý email nemůže být prázdné.");
            return;
        }
        if (!pracovniEmail.contains("@")) {
            System.err.println("Pracovní email musí obsahovat zavináč.");
            return;
        }
        this.pracovniEmail = pracovniEmail;
    }

    public String getSoukromyEmail() {
        return soukromyEmail;
    }

    public void setSoukromyEmail(String soukromyEmail) {
        Objects.requireNonNull(soukromyEmail);
        if (soukromyEmail.isBlank()) {
            System.err.println("Soukromý email nemůže být prázdné.");
            return;
        }
        if (!soukromyEmail.contains("@")) {
            System.err.println("Soukromý email musí obsahovat zavináč.");
            return;
        }
        this.soukromyEmail = soukromyEmail;
    }

    @Override
    public String toString() {
        return "Osoba{\n" +
                "jmeno='" + jmeno + '\'' + "\n" +
                "prijmeni='" + prijmeni + '\'' + "\n" +
                "rodneCislo='" + rodneCislo + '\'' + "\n" +
                "telefon=" + telefon + "\n" +
                "adresa=\n" + adresa +  // Zavolání toString() metody na adrese
                ", pracovniEmail='" + pracovniEmail + '\'' + "\n" +
                ", soukromyEmail='" + soukromyEmail + '\'' + "\n" +
                '}';
    }

}
