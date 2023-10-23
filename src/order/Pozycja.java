package order;

public class Pozycja {
    String nazwaTowaru;
    int ileSztuk;
    double cena;
    double wartoscPozycji;

    public double rabat;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
        this.wartoscPozycji = ileSztuk * cena;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double obliczWartosc() {
        double rabat = obliczWartoscZRabatem();
        return wartoscPozycji * (1 - rabat / 100.0);
    }

    public double obliczWartoscZRabatem() {
        if (ileSztuk > 4 && ileSztuk < 10) {
            rabat = 5;
        } else if (ileSztuk >= 10 && ileSztuk < 20) {
            rabat = 10;
        } else if (ileSztuk >= 20) {
            rabat = 15;
        } else {
            rabat = 0;
        }
        return rabat;
    }

    @Override
    public String toString() {
        return nazwaTowaru + " " + cena +
                "zł " + ileSztuk + "szt. " + obliczWartosc() + "zł"    ;
    }
}
