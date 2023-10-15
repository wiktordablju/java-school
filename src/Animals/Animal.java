package Animals;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    String race;
    String name;

//   Musi byc public static zeby wywolac w mainie
    public static List<Animal> animalsList = new ArrayList<>();
//  List<Co dodajemy (String, Int, dany obiekt)> nazwaListy = new ArrayList<>();


    public Animal(String race, String name) {
        this.race = race;
        this.name = name;
//      this odnosi sie do obiektu ktorego wywolujemy, dodaje go z automatu do listy animalsow
        animalsList.add(this);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Wydaje odglos");
    }

    public void displayName() {
        System.out.println("Moje imie to: " + name);
    }
}
