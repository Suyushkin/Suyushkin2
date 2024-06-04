package lab_2;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = in.nextInt();

        if (number % 5 == 2 && number % 7 == 1) {
            System.out.printf("Число %d делится на 5 с остатком 2 и на 7 с остатком 1", number);
        } else {
            System.out.printf("Число %d не делится на 5 с остатком 2 и на 7 с остатком 1", number);
        }

        in.close();
    }
}
