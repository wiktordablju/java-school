package Animals;

public class Doggo extends Animal{
    public Doggo(String race, String name) {
        super(race, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof, Woof");
    }
}
