package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, sum = 0;

        n = in.nextInt();
        if (n < 1) {
            while (n <= 1) {
                sum += n;
                n++;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}