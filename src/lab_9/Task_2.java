package lab_9;

import java.util.Scanner;

public class Task_2 {
    public static String decimalToBinary(int n) {
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int decimal = scanner.nextInt();

        if (decimal < 0) {
            System.out.println("Отрицательные числа не поддерживаются.");
        } else {
            String binary = decimalToBinary(decimal);
            System.out.println("Двоичное представление числа " + decimal + ": " + binary);
        }
        scanner.close();
    }
}
