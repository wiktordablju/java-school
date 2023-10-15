// 1. Roznice miedzy arrayami, listami, setami a mapami
// 2. pies pies = new pies()
// 3. usemakenoise
// 4. DisplayName wszystkich zwierzakow (w forze)

import Animals.Animal;
import Animals.Doggo;
import Animals.Cat;
import Animals.AntEater;

public class Main {
    public static void main(String[] args) {

        Doggo szarik = new Doggo("Owczarek", "Szarik");
        Cat mruczek = new Cat("Dachowiec", "Mruczek");
        AntEater kamil = new AntEater("Masz jakas mruwke?", "Kamil");

//      Pierwszy Animal odnosi sie do typu zmiennych(moze byc tez String, whatever)
        for (Animal animal : Animal.animalsList) {
            useDisplayName(animal);
            useMakeNoise(animal);
        }
    }

    public static void useMakeNoise(Animal animal) {
        animal.makeNoise();
    }

    public static void useDisplayName(Animal animal) {
        animal.displayName();
    }
}
