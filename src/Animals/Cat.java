package Animals;

public class Cat extends Animal{
    public Cat(String race, String name) {
        super(race, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
