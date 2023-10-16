// LIST:
// - Interfejs, on jest tylko baselinem i potem mozna go uzyc jako arraylista itp
// - Dynamiczny, moze na biezaco zmieniac swoja wielkosc
// ArrayList - dynamiczny, szybki dostep ale wolniejsza modyfikacja (wszyskto musi sie w pamieci przesunac)
// LInkedList - dynamiczny, kazdy element ma referencje do tego przed nim i za nim, wolniejszy dostep

// ARRAY:
// - Szybki dostep do elementow, elementy sa przechowywane w jednym miejscu w pamieci
// - Jeden typ zmiennych
// - Deklaruje sie ilosc elementow ktorej potem nie mozna zmienic
// - Array to cos innego niz ArrayList

// SET
// - Nie akceptuje duplikatow
// - Nie musi zachowywac kolejnosci elementow

// MAP
// - cos jak dictionary, klucz-wartosc
// - klucze sa unikalne

import Animals.Animal;
import Animals.Doggo;
import Animals.Cat;
import Animals.AntEater;

public class Main {
    public static void main(String[] args) {

        Doggo szarik = new Doggo("Owczarek", "Szarik");
        Cat mruczek = new Cat("Dachowiec", " Mruczek");
        AntEater kamil = new AntEater("Masz jakas mruwke?", "Kamil");
        Doggo wilczur = new Doggo("Yorkshire terrier", "Wilczur");


//      for (TypObiektu nazwaZmiennejDlaPetli : list )
//      jest to jak foreach
        for (Animal animal : Animal.animalsList) {
            useDisplayName(animal);
            useMakeNoise(animal);
        }

//        List<String> test = new ArrayList<>();
//        test.add("essa");
//        for (String q : test) {
//            System.out.println(q);
//        }
    }

    public static void useMakeNoise(Animal animal) {
        animal.makeNoise();
    }

    public static void useDisplayName(Animal animal) {
        animal.displayName();
    }
}
