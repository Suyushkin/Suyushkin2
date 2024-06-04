package timus.task_2066;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int[] res = new int[3];

        if (a >= 0 && b >= a && c >= b && c <= 100) {
            res[0] = a - b - c;
            res[1] = a - b * c;
            res[2] = a * b - c;
            Arrays.sort(res);
            System.out.println(res[0]);
        }

        in.close();
    }
}
