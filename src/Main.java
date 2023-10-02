// Lekcja 02.10
// 1. Stworzyć kalkulator z funkcjami liczenia
// 2. Nie dzielić przez zero
// 3. Handlowac w jakis sposob jesli uzytkownik poda zly typ danych (np. litere zamiast liczby)

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void add(float a, float b) {
        float output = a + b;
        System.out.println(output);
    }

    public static void sub(float a, float b) {
        float output = a - b;
        System.out.println(output);
    }

    public static void mn(float a, float b) {
        float output = a * b;
        System.out.println(output);

    }

    public static void div(float a, float b) {
        float output = a / b;
        if (b != 0) {
            System.out.println(output);
        } else {
            System.out.println("Nie dzieli się przez zero");
        }

    }

    public static void main(String[] args) {
        // scanner - biblioteka do łatwiejszego przechwytywania danych
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Podaj pierwszą liczbę");
            float a = scan.nextFloat();
            System.out.println("Podaj drugą liczbę liczbę");
            float b = scan.nextFloat();

            System.out.println("Jakie działanie chcesz wykonać (1 - dodawanie, 2 - odejmowanie, 3 - mnozenie, 4 - dzielenie)");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    add(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mn(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                default:
                    System.out.println("Nie wybrano dzialania");
            }
            // catch(nazwa bledu, e - error )
            // momencie gdy podamy mu nie taki typ zmiennej jaki zadeklarowalismy, wyrzuca zawsze blad InputMismatchException dzieki importnietej bibliotece
        } catch (InputMismatchException e) {
            // err pokazuje tekst na czerwono, jako blad
            System.err.println("Nie podano liczby");
        }
    }
}