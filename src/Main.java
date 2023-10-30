import zamowienie.Pozycja;
import zamowienie.Zamowienie;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.print(p2);

        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);

//      Sprawdzenie 2.1
        z.usunPozycje(0);

//      Sprawdzenie 2.2
        z.edytujPozycje(0);

//      Sprawdzenie 2.3 i  3
        Pozycja p3 = new Pozycja("Cukier", 21, 4);
        z.dodajPozycje(p3);

//        Sprawdzenie zapisywania
        z.zapiszZamowienie(z, "zamowienie.txt");

//        Sprawdzenie wczytywania
        z.wczytajZamowienie("test.txt");

        System.out.println(z);

    }
}
