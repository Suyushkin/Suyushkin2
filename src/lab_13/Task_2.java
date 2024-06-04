package lab_13;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int rows = random.nextInt(7) + 3;
        int cols = random.nextInt(7) + 3;

        int[][] matrix = generateMatrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        try {
            System.out.print("Введите номер столбца для вывода: ");
            int columnNumber = in.nextInt();
            if (columnNumber < 1 || columnNumber > cols) {
                throw new IllegalArgumentException("Столбца с таким номером не существует.");
            }

            System.out.println("Столбец " + columnNumber + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnNumber - 1]);
            }

        } catch (InputMismatchException e) {
            in.nextLine();
            System.err.println(e + ": Введен неверный тип данных.");
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            in.close();
        }
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        return matrix;
    }
}
