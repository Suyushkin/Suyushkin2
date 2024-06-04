package lab_4;

import java.util.Arrays;

public class Example_7 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        fillArrayBySnake(array);

        System.out.println("Исходный массив:");
        printArray(array);
    }

    private static void fillArrayBySnake(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if ((i+1) % 2 == 0) {
                for (int j = array[0].length - 1; j >= 0; j--) {
                    array[i][j] = i * array[0].length + array[0].length - j;
                }
            } else {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = i * array[0].length + j + 1;
                }
            }
        }
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
