package order;

import java.io.IOException;

public interface Interfejs {

    void zapiszZamowienie(Zamowienie z, String nazwaPliku) throws IOException;

    void wczytajZamowienie(String nazwaPliku);
}
