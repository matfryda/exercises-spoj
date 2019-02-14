package sredniaPredkosc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dataSet, v1, v2, averageSpeed;

        dataSet = scanner.nextInt();
        int[] table = new int[dataSet];
        if (dataSet < 1 || dataSet > 1000) {
            System.out.println("The data set must be between 1 and 1000");
            dataSet = scanner.nextInt();

        } else dataSet = dataSet;

        for (int i = 0; i < dataSet; i++) {
            v1 = scanner.nextInt();
            v2 = scanner.nextInt();
            averageSpeed = (v1 + v2) / 2;
            table[i] = averageSpeed;

        }
        for (int i = 0; i < dataSet; i++) {
            System.out.print(table[i] + " ");
        }
    }
}
