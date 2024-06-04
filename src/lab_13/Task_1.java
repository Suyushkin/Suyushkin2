package lab_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = 0;
        while (true) {
            try {
                size = in.nextInt();
                if (size <= 0) {
                    throw new IllegalArgumentException("Размер массива должен быть натуральным числом.");
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e);
                System.err.println("Повторите ввод.");
                in.nextLine();
                continue;
            } catch (InputMismatchException e) {
                in.nextLine();
                System.err.println(e + ": Введен неверный тип данных.");
                System.err.println("Повторите ввод.");
                continue;
            }
            break;
        }

        int[] array = new int[size];
        int positiveSum = 0;
        int positiveCount = 0;

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            try {
                array[i] = in.nextInt();
                if (array[i] > 0) {
                    positiveSum += array[i];
                    positiveCount++;
                }
            } catch (InputMismatchException e) {
                in.nextLine();
                System.err.println(e + ": Введен неверный тип данных.");
                System.err.println("Повторите ввод элемента.");
                i--;
            }
        }

        try {
            if (positiveCount == 0) {
                throw new IllegalArgumentException("В массиве отсутствуют положительные элементы.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e);
            return;
        }

        double average = (double) positiveSum / positiveCount;
        System.out.println("Среднее значение среди положительных элементов: " + average);
    }
}
