package timus.task_1910;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] magicFields = new int[n];
        for (int i = 0; i < n; i++) {
            magicFields[i] = in.nextInt();
        }

        int maxSum = 0;
        int midSection = 0;

        for (int i = 0; i < n - 2; i++) {
            int currentSum = magicFields[i] + magicFields[i + 1] + magicFields[i + 2];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                midSection = i + 2;
            }
        }

        System.out.println(maxSum + " " + midSection);

        in.close();
    }
}
