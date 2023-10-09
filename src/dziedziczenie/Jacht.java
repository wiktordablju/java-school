package dziedziczenie;

public class Jacht extends Pojazd {
    public Jacht(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeNoise() {
        System.out.println("Plynie se essa");
    }
}
