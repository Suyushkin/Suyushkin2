package lab_2;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = in.nextInt();

        if (number % 4 == 0 && number >= 10) {
            System.out.printf("Число %d удовлетворяет условию: N >= 10 и N делится на 4", number);
        } else {
            System.out.printf("Число %d не удовлетворяет условию: N >= 10 и N делится на 4", number);
        }

        in.close();
    }
}
