package cz.czechitas.lekce5;
import cz.czechitas.lekce5.model.Telefon;
import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");
        Adresa adresa = new Adresa();
        adresa.setUlice("Havranova 22");
        adresa.setCastObce("Nové Město");
        adresa.setObec("Praha 1");
        adresa.setPsc("11100");
        System.out.println(adresa);

        Osoba osoba = new Osoba("Šárka", "Klauberová", "987454/1654", new Telefon("420", "123456789"), adresa,"123456789@gmail.com", "123456789@gmail.com");
        System.out.println(osoba);
    }
}
