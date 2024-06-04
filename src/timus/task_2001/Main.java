package timus.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] nums = new int[3][2];
        String[][] lines = new String[3][2];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = in.nextLine().split(" ");
            int a = Integer.parseInt(lines[i][0]);
            int b = Integer.parseInt(lines[i][1]);
            if (a < 0 || a > 10000 || b < 0 || b > 10000) {
                return;
            } else {
                nums[i] = new int[]{a, b};
            }
        }

        System.out.printf("%d %d", nums[0][0] - nums[2][0], nums[0][1] - nums[1][1]);

        in.close();
    }
}
