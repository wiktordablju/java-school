package order;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    public static List<Pozycja> pozycje = new ArrayList<>();
    int ileDodanych;
    int maksRozmiar;

    public Zamowienie() {
        this.maksRozmiar = 10;
    }

    public Zamowienie(int ileDodanych) {
        this.ileDodanych = ileDodanych;
    }

    public void dodajPozycje(Pozycja p) {
        pozycje.add(p);
    }

    double obliczWartosc() {
        double wartosc = 0;
        for(Pozycja p : pozycje) {
            wartosc += p.obliczWartosc();
        }
        return wartosc;
    }

    void usunPozycje(int indeks) {
        pozycje.remove(indeks);
    }

    void edytujPozycje(int indeks) {
        System.out.println("edytujpozycje");
    }



    @Override
    public String toString() {
        String result = "\n\nZamówienie: \n";

        for(Pozycja p : pozycje) {
            result += p + "\n";
        }

        result += "\nRazem: " + obliczWartosc() + "zł";
        return result;
    }
}
