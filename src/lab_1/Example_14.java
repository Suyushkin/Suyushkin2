package lab_1;

import java.util.Scanner;

public class Example_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();

        System.out.printf("Сумма = %d %d %d %.0f", a, a-1, a+1, Math.pow(a*3, 2));
    }
}
