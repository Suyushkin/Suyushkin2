package timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long fib[] = new long[46];

        fib[1] = 2;
        fib[2] = 2;
        for (int i = 3; i <= N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(fib[N]);

        in.close();
    }
}
