package podzielnosc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t, x, y, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        t = scanner.nextInt();

        n = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();


        for (int j = 1; j < n; j++) {
            if (j % x == 0 && j % y != 0) {
                System.out.print(j + " ");
            }
        }
    }
}
