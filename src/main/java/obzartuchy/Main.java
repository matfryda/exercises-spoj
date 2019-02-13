package obzartuchy;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Podaj liczbę testów");
        int iloscZestawowTestowych = scanner.nextInt();
        final int sekundyWDobie = 86400;


        for (int i = 0; i < iloscZestawowTestowych; i++) {
            // System.out.println("Podaj liczbę uczestników");
            int n = scanner.nextInt();
            int[] tab = new int[n];
            int czasJedzeniaWSekundach;
            System.out.println("Podaj liczbę ciastek w jednym pudełku");
            int m = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                //System.out.println("podaj czas jedzenia "+(j+1)+" zawodnika");
                tab[j] = czasJedzeniaWSekundach = scanner.nextInt();
                // System.out.println(tab[j]);

            }
            int[] tab2 = new int[n];
            for (int j = 0; j < n; j++) {
                int iloscZjedzonychCiastek = sekundyWDobie / tab[j];
                tab2[j] = iloscZjedzonychCiastek;
                // System.out.println(tab2[j]);


                // System.out.println(iloscZjedzonychCiastek);
            }
            int suma = 0;
            for (int j = 0; j < tab2.length; j++) {
                suma += tab2[j];
            }
            if (suma % m == 0) {
                System.out.println((suma / m));
            }
            if (suma % m != 0) {
                System.out.println((suma / m + 1));
            }
        }
    }
}