package lab_2;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = in.nextInt();

        if (number % 3 == 0) {
            System.out.printf("Число %d делится на 3", number);
        } else {
            System.out.printf("Число %d не делится на 3", number);
        }

        in.close();
    }
}
