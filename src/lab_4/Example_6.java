package lab_4;

import java.util.Arrays;
import java.util.Random;

public class Example_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Исходный массив:");
        printArray(array);

        int row = random.nextInt(5);
        int col = random.nextInt(5);
        System.out.printf("\nУдаляемый столбец: %d\n", col + 1);
        System.out.printf("Удаляемая строка: %d\n", row + 1);

        int[][] newArray = delColRow(array, row, col);

        System.out.println("\nНовый массив:");
        printArray(newArray);
    }

    private static int[][] delColRow(int[][] array, int rowIndex, int colIndex) {
        int rows = array.length - 1;
        int cols = array[0].length - 1;

        int[][] newArray = new int[cols][rows];

        for (int i = 0, k = 0; k < newArray.length; i++, k = i) {
            if (i >= rowIndex)
                k++;
            for (int j = 0, p = 0; p < newArray[0].length; j++, p = j) {
                if (j >= colIndex)
                    p++;
                newArray[i][j] = array[k][p];
            }
        }

        return newArray;
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
