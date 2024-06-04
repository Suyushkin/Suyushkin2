package timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int count = 1;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            int curJ = n - i - 1;
            for (int j = 0; j <= i; j++)
                result[j][curJ++] = count++;
        }

        for (int i = 1; i < n; i++) {
            int curI = i;
            for (int j = n - 1; j >= i; j--)
                result[curI++][n - j - 1] = count++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(result[i][j] + " ");

            System.out.println();
        }
    }
}
