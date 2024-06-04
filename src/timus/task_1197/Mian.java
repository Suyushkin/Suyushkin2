package timus.task_1197;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[] moves = new int[count];
        for (int i = 0; i < count; i++) {
            String input = in.next();
            int row = input.charAt(1) - '0';
            int col = input.charAt(0) - 'a' + 1;

            if (!isValidMove(row, col)) {
                return;
            }

            moves[i] = countKnightMoves(row, col);
        }

        for (int move : moves) {
            System.out.println(move);
        }

        in.close();
    }

    private static int countKnightMoves(int row, int col) {
        int moves = 0;

        int[][] movesOffsets = {
                {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
                {1, -2}, {1, 2}, {2, -1}, {2, 1}
        };

        for (int[] offset : movesOffsets) {
            int newRow = row + offset[0];
            int newCol = col + offset[1];

            if (isValidMove(newRow, newCol)) {
                moves++;
            }
        }

        return moves;
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 1 && row <= 8 && col >= 1 && col <= 8;
    }
}
