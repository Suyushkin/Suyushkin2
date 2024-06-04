package lab_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int rows = in.nextInt();
        System.out.println("Введите количество столбцов:");
        int cols = in.nextInt();

        int[][] originalArray = new int[rows][cols];
        fillArray(originalArray);

        System.out.println("Исходный массив:");
        printArray(originalArray);

        int[][] transposedArray = transposeArray(originalArray);

        System.out.println("\nТранспонированный массив:");
        printArray(transposedArray);
    }

    private static void fillArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(200);
            }
        }
    }

    private static int[][] transposeArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        int[][] transposedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        return transposedArray;
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
