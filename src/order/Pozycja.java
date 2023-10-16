package order;

public class Pozycja {
    String nazwaTowaru;
    int ileSztuk;
    double cena;
    double wartoscPozycji;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
        this.wartoscPozycji = ileSztuk * cena;
    }

    public double obliczWartosc() {
        return wartoscPozycji;
    }

    @Override
    public String toString() {
        return nazwaTowaru + " " + cena + "zł " + ileSztuk + "szt. " + obliczWartosc() + "zł";
    }
}
