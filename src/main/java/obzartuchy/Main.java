package obzartuchy;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         System.out.println("How many tests?");
        int numberOfTests = scanner.nextInt();
        final int secondsInADay = 86400;


        for (int i = 0; i < numberOfTests; i++) {
             System.out.println("enter the number of participants");
            int n = scanner.nextInt();
            int[] tab = new int[n];
            int eatingTimeInSeconds;
            System.out.println("Enter the number of cookies in one box");
            int m = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.println("enter the player's eating time " + (j + 1));
                tab[j] = eatingTimeInSeconds = scanner.nextInt();
                 System.out.println(tab[j]);

            }
            int[] tab2 = new int[n];
            for (int j = 0; j < n; j++) {
                int theAmountOfCookiesEaten = secondsInADay / tab[j];
                tab2[j] = theAmountOfCookiesEaten;
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