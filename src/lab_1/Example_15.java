package lab_1;

import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();

        System.out.printf("Сумма = %d\nРазность = %d", a + b, a - b);
    }
}
