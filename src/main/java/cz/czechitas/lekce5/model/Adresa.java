package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Adresa {
    private String ulice;
    private String castObce;
    private String obec;
    private String psc;

    public Adresa() {
    }

    public Adresa(String ulice, String castObce, String obec, String psc) {
        setUlice(ulice);
        setCastObce(castObce);
        setObec(obec);
       setPsc(psc);
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        Objects.requireNonNull(ulice);
        if (ulice.isBlank()) {
            System.err.println("Ulice nemůže být prázdná.");
            return;
        }

        this.ulice = ulice;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        Objects.requireNonNull(castObce);
        if (castObce.isBlank()) {
            System.err.println("Část obce nemůže být prázdné.");
            return;
        }

        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        Objects.requireNonNull(obec);
        if (obec.isBlank()) {
            System.err.println("Obec nemůže být prázdné.");
            return;
        }
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        Objects.requireNonNull(psc);
        boolean isCorrect = psc.length() == 5;
        if (psc.isBlank()) {
            System.err.println("PSČ nemůže být prázdné.");
            return;
        }
        if (!isCorrect) {
            System.err.println("PSČ musí obsahovat 5 znaků");
            return;
        }
        this.psc = psc;
    }

    @Override
    public String toString() {
        return "Adresa{\n" +
                "ulice='" + ulice + '\'' + "\n" +
                "castObce='" + castObce + '\'' + "\n" +
                "obec='" + obec + '\'' + "\n" +
                "psc='" + psc + '\'' + "\n" +
                '}';
    }

}
