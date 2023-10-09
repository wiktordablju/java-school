package dziedziczenie;

public class Auto extends Pojazd {
    public Auto(String brand, String model) {
        super(brand, model);
    }
//    kolor marka model
    private String Color;



    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }


    private String Model;

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }


    private String Brand;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void getInfo() {
        System.out.println("Info o twoim samochodzie:");
        System.out.println(Brand);
        System.out.println(Color);
        System.out.println(Model);
    }
//    bez tego system outowanie pokazuje id danego obiektu, dajac tostringa outuje jego przypisane wartosci
    @Override
    public String toString() {
        return "dziedziczenie.Auto{" +
                "Color='" + Color + '\'' +
                ", Model='" + Model + '\'' +
                ", Brand='" + Brand + '\'' +
                '}';
    }
}
