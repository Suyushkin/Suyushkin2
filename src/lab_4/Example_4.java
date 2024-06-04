package lab_4;

import java.util.Arrays;

public class Example_4 {
    public static void main(String[] args) {
        int size = 8;
        int[][] result = new int[size][];
        for (int i = 0; i < size; i++) {
            int len = size - i;
            int[] row = new int[len];
            for (int j = 0, k = i - 1; j < len; j++, k--) {
                row[j] = k + 1;
            }
            result[i] = row;
        }

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

}
