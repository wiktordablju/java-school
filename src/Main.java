import order.Pozycja;
import order.Zamowienie;
import java.io.IOException;

//todo: tostring format lepszy, 4. 5. 6.

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
//        z.edytujPozycje(0);


//      Sprawdzenie 2.3
//        Pozycja p3 = new Pozycja("Cukier", 2, 4);
//        z.dodajPozycje(p3);

//      Sprawdzenie 3
        Pozycja p3 = new Pozycja("Cukier", 21, 4);
        z.dodajPozycje(p3);


        System.out.println(z);
//        Sprawdzenie zapisywania
        z.zapiszZamowienie(z, "zamowienie.txt");

//        Sprawdzenie wczytywania
        z.wczytajZamowienie("test.txt");
    }
}
