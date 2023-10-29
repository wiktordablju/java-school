package order;

import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Zamowienie implements Interfejs{
    public List<Pozycja> pozycje = new ArrayList<>();
    public static List<String> nazwyPozycji = new ArrayList<>();
    int ileDodanych;
    int maksRozmiar;


    public Zamowienie() {
        this.maksRozmiar = 10;
    }

    public Zamowienie(int ileDodanych) {
        this.ileDodanych = ileDodanych;
    }

    public void dodajPozycje(Pozycja p) {
        int istnieje = 0;
        for (Pozycja q : pozycje) {
            if (q.nazwaTowaru.equals(p.nazwaTowaru)) {
                q.ileSztuk += p.ileSztuk;
                q.wartoscPozycji = q.ileSztuk * q.cena;  // Tutaj obliczamy wartość pozycji
                istnieje = 1;
                break;
            }
        }
        if(istnieje == 0) {
            pozycje.add(p);
        }
    }

    double obliczWartosc() {
        double wartosc = 0;
        double rabaty = 0;
        for(Pozycja p : pozycje) {
            wartosc += p.obliczWartosc();
            rabaty += p.wartoscPozycji * (p.rabat / 100.0);
        }


        System.out.println("\nŁączna wartość rabatów: " + rabaty + " zł");
        System.out.println("Łączna wartość zamówienia po uwzględnieniu rabatów: " + (wartosc - rabaty) + " zł");

        return wartosc - rabaty;
    }

    public void usunPozycje(int indeks) {
        pozycje.remove(indeks);
    }

    public void edytujPozycje(int indeks) {
        System.out.println("\nWybierz jakie pole chcesz zmienić \n " +
                "1. Nazwa Towaru \n " +
                "2. Cena \n " +
                "3. Liczba sztuk");
        Scanner scan = new Scanner(System.in);
        int wybor = scan.nextInt();
        scan.nextLine();
        Pozycja p = pozycje.get(indeks);

        switch(wybor) {
            case 1:
                System.out.println("Wprowadź nową nazwę");
                String nowaNazwa = scan.nextLine();
                p.setNazwaTowaru(nowaNazwa);
                break;
            case 2:
                System.out.println("Wprowadź nową cenę");
                double nowaCena = scan.nextDouble();
                p.setCena(nowaCena);
                break;
            case 3:
                System.out.println("Wprowadź nową ilość sztuk");
                int noweIleSztuk = scan.nextInt();
                p.setIleSztuk(noweIleSztuk );
                break;
            default:
                System.out.println("Nie wybrano liczby od 1 do 3");
        }
    }

    @Override
    public String toString() {
        String result = "\n\nZamówienie: \n";

        for (Pozycja p : pozycje) {
            result += p + "\n";  // Nie obliczamy tu wartości pozycji, ponieważ jest to już robione w klasie Pozycja
        }

        result += "\nRazem: " + obliczWartosc() + "zł";
        return result;
    }

    @Override
    public void zapiszZamowienie(Zamowienie z, String nazwaPliku) throws IOException {
        try (FileWriter writer = new FileWriter(nazwaPliku)) {
            writer.write(z.toString());
        } catch (IOException e) {
            throw e;
        }
    }


    public void wczytajZamowienie(String nazwaPliku) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String line;
            System.out.println("Zawartość pliku:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
