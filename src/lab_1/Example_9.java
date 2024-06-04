package lab_1;

import java.util.Scanner;

public class Example_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int month = in.nextInt();
        System.out.println("Введите количество дней: ");
        int days = in.nextInt();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (days <= daysInMonth[month]) {
            System.out.printf("Указанный месяц содержит %d дней.\n", days);
        } else {
            System.out.printf("В указанном месяце нет %d дней.\n", days);
        }
    }
}
