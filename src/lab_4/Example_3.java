package lab_4;

public class Example_3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = 2;
            }
        }

        for (int[] row : array) {
            for (int num : row) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}
