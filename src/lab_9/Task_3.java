package lab_9;

import java.util.Scanner;

public class Task_3 {
    public static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index < arr.length) {
            System.out.print("Введите элемент массива [" + index + "]: ");
            arr[index] = scanner.nextInt();
            inputArray(arr, index + 1, scanner);
        }
    }

    public static void outputArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println("Элемент массива [" + index + "]: " + arr[index]);
            outputArray(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        inputArray(array, 0, scanner);

        System.out.println("Введенный массив:");
        outputArray(array, 0);

        scanner.close();
    }
}
