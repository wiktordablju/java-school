import dziedziczenie.Auto;
import dziedziczenie.Jacht;
import dziedziczenie.Pojazd;
import dziedziczenie.Samolot;

public class stare_lekcje {
    public static void main(String[] args) {
        //        System.out.println("Hello world!");

//        System.out.print("Nasza lekcja");
//
//        System.out.println("Siema essa");

//        Liczbowe
//        int i = 9;
//
//
//        Long l = 9L;
//        long l2 = 9L;
//
//        Double d = 2.0;
//        double d2 = 2.0;
//
////        Booleanowskie
//        Boolean bol = true;
//        boolean bol2 = false;


//        Tekstowe
//        String s = "Hello World";
//        System.out.println(s);
//
//        String test = "Test test 123";
//        System.out.println(test);

//        DODAWANIE
//        int first = 2;
//        int second = 4;
//        int add =  first + second;
//
//        System.out.println(first + "+" + second + "=" +add);

//        ODEJMOWANIE
//        double first = 7.5;
//        double second = 2.5;
//        double sub = first - second;
//        System.out.println(first + " - " + second + " = " + sub);

//      POTĘGOWANIE
//        double first = 3;
//        double second = 2;
//        double pwr = Math.pow(first, second);
//        System.out.println(first + " do potęgi " + second + " = " + pwr);

//       STRINGI
//        String txt = "SiemaEssaRazDwaTrzy";
//        System.out.println("Zdanie w wielkich literach: " + txt.toUpperCase());
//        System.out.println("Zdanie w małych literach: " + txt.toLowerCase());

//        String empty = "";
//        System.out.println(empty.isEmpty());

//        String e2 = null;
////      Wyskoczy blad, odwolujemy sie do obiektu ktory jeszcze nie jest zainicjalizowany
////        System.out.println(e2.isEmpty());
//        if (e2 != null) {
//            System.out.println(e2.isEmpty());
//        } else {
//            System.out.println("Obiekt jest nullem");
//        }


//        String txt = "RazDwaTrzy";
//        String txt2 = "";
//        String txt3 = null;
//
//
//        if (txt != null && txt.isEmpty() != true) {
//            System.out.println(txt.toUpperCase());
//        }  else {
//            System.out.println("Zmienna jest pusta/nullem");
//        }
//
//        if (txt != null && txt2.isEmpty() != true) {
//            System.out.println(txt.toUpperCase());
//        } else {
//            System.out.println("Zmienna jest nullem");
//        }
//
//        if (txt != null && txt3.isEmpty() != true) {
//            System.out.println(txt.toUpperCase());
//        } else {
//            System.out.println("Zmienna jest pusta");
//        }


// Void - głównie dzialanie na obiektach bez zwracania

        //// Lekcja 02.10
//// 1. Stworzyć kalkulator z funkcjami liczenia
//// 2. Nie dzielić przez zero
//// 3. Handlowac w jakis sposob jesli uzytkownik poda zly typ danych (np. litere zamiast liczby)
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Lekcja2 {
//    public static void add(float a, float b) {
//        float output = a + b;
//        System.out.println(output);
//    }
//
//    public static void sub(float a, float b) {
//        float output = a - b;
//        System.out.println(output);
//    }
//
//    public static void mn(float a, float b) {
//        float output = a * b;
//        System.out.println(output);
//
//    }
//
//    public static void div(float a, float b) {
//        float output = a / b;
//        if (b != 0) {
//            System.out.println(output);
//        } else {
//            System.out.println("Nie dzieli się przez zero");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        // scanner - biblioteka do łatwiejszego przechwytywania danych
//        Scanner scan = new Scanner(System.in);
//
//        try {
//            System.out.println("Podaj pierwszą liczbę");
//            float a = scan.nextFloat();
//            System.out.println("Podaj drugą liczbę liczbę");
//            float b = scan.nextFloat();
//
//            System.out.println("Jakie działanie chcesz wykonać (1 - dodawanie, 2 - odejmowanie, 3 - mnozenie, 4 - dzielenie)");
//            int choice = scan.nextInt();
//
//            switch (choice) {
//                case 1:
//                    add(a, b);
//                    break;
//                case 2:
//                    sub(a, b);
//                    break;
//                case 3:
//                    mn(a, b);
//                    break;
//                case 4:
//                    div(a, b);
//                    break;
//                default:
//                    System.out.println("Nie wybrano dzialania");
//            }
//            // catch(nazwa bledu, e - error )
//            // momencie gdy podamy mu nie taki typ zmiennej jaki zadeklarowalismy, wyrzuca zawsze blad InputMismatchException dzieki importnietej bibliotece
//        } catch (InputMismatchException e) {
//            // err pokazuje tekst na czerwono, jako blad
//            System.err.println("Nie podano liczby");
//        }
//    }
//}


//        LEKCJA 3 OBIEKTOWOSC, DZIEDZICZENIE, POLIMORFIZM
//        import dziedziczenie.Auto;
//import dziedziczenie.Jacht;
//import dziedziczenie.Pojazd;
//import dziedziczenie.Samolot;
//
//        public class Main {
//            public static void main(String[] args) {
////        String name = "Name";
////        String name2 = new String(name);
////        String name3 = name;
////
//////        == porownuje miejsce w pamieci
////        System.out.println(name == name2);
////
//////        oba stringi maja ta sama wartosc ale to inne obiekty
////        System.out.println(name2.equals(name));
////
//////        True, nie tworzymy nowego obiektu tylko dzialamy na tej samej pamieci
////        System.out.println(name == name3);
//
//
////        dziedziczenie.Auto obiektowosc
////        dziedziczenie.Auto newAuto = new dziedziczenie.Auto();
////
////        newAuto.setBrand("Mercedes");
////        newAuto.setColor("Czarny");
////        newAuto.setModel("E klasa xd");
////
////        String brand = newAuto.getBrand();
////        System.out.println(brand);
////
////
////        System.out.println(newAuto);
////
////        newAuto.getInfo();
//
//                Auto newAuto = new Auto("Honda", "Civic");
//                useMakeNoise(newAuto);
//
//                Samolot newSamolot = new Samolot("Boeing", "XXX");
//                useMakeNoise(newSamolot);
//
//
//                Jacht newJacht = new Jacht("xxx", "yyyy");
//                useMakeNoise(newJacht);
//
//            }
//
//            public static void useMakeNoise(Pojazd pojazd) {
//                pojazd.makeNoise();
//            }
//        }


    }
}
