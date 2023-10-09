import Animals.Animal;
import Animals.Doggo;
import Animals.Cat;
import Animals.AntEater;

public class Main {
    public static void main(String[] args) {

        Doggo szarik = new Doggo("Owczarek", "Szarik");
        useMakeNoise(szarik);

        Cat mruczek = new Cat("Dachowiec", "Mruczek");
        useMakeNoise(mruczek);

        AntEater kamil = new AntEater("Masz jakas mruwke?", "Kamil");
        useMakeNoise(kamil);


    }

    public static void useMakeNoise(Animal animal) {
        animal.makeNoise();
    }
}
