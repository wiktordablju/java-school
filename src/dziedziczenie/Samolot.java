package dziedziczenie;

import dziedziczenie.Pojazd;

public class Samolot extends Pojazd {
    public Samolot(String brand, String model) {
//        super wywoluje kontstruktor z dziedziczonego obiektu
        super(brand, model);
    }

    @Override
    public void makeNoise() {
        System.out.println("Wzium");
    }
}
