package lab_2;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = in.nextInt();

        if (number >= 5 && number <= 10) {
            System.out.println("Число входит в диапазон 5-10");
        } else {
            System.out.println("Число не входит в диапазон 5-10");
        }

        in.close();
    }
}
