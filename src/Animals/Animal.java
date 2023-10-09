package Animals;

public class Animal {
    String race;
    String name;

    public Animal(String race, String name) {
        this.race = race;
        this.name = name;
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
}
