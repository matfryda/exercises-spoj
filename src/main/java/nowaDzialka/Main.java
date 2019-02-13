package nowaDzialka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dataSet = 0;
        int numberOfSteps = 0;
        int square = 0;
        System.out.println("Data set: ");
        dataSet = scanner.nextInt();
        while (true) {
            if (dataSet < 1 || dataSet < 500) {
                System.out.println("The number of tests must be between 1 and 500");
            }
            if (dataSet >= 1 || dataSet <= 500) {
                break;
            }
        }

        for (int i = 0; i < dataSet; i++) {
            System.out.println("Number of steps: ");
            numberOfSteps = scanner.nextInt();
            if (numberOfSteps < 1 || numberOfSteps > 1000) {
                i--;
                System.out.println("The number of steps must be between 1 and 1000");
            }
            square = numberOfSteps * numberOfSteps;
            System.out.println("The square: " + square);
        }

    }
}
