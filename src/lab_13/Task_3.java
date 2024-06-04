package lab_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = in.nextInt();

            byte[] array = new byte[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = in.nextByte();
            }

            int sum = 0;
            for (byte value : array) {
                if (sum > Byte.MAX_VALUE - value) {
                    System.out.println("Сумма вышла за пределы диапазона типа byte.");
                    return;
                }
                sum += value;
            }

            System.out.println("Сумма элементов массива: " + sum);
        } catch (NegativeArraySizeException e) {
            System.err.println(e + ": Введено отрицательное значение.");
        } catch (InputMismatchException e) {
            System.err.println(e + ": Введен неверный тип данных.");
        } finally {
            in.close();
        }
    }
}
