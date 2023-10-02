public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");

//        System.out.print("Nasza lekcja");
//
//        System.out.println("Siema essa");

//        Liczbowe
        int i = 9;
        Integer integer = 9;


        Long l = 9L;
        long l2 = 9L;

        Double d = 2.0;
        double d2 = 2.0;

//        Booleanowskie
        Boolean bol = true;
        boolean bol2 = false;


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


        String txt = "RazDwaTrzy";
        String txt2 = "";
        String txt3 = null;


        if (txt != null && txt.isEmpty() != true) {
            System.out.println(txt.toUpperCase());
        }  else {
            System.out.println("Zmienna jest pusta/nullem");
        }

        if (txt != null && txt2.isEmpty() != true) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println("Zmienna jest nullem");
        }

        if (txt != null && txt3.isEmpty() != true) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println("Zmienna jest pusta");
        }




    }
}
