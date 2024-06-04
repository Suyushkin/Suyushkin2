package timus.task_1209;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();

        for (long i = 0; i < n; i++) {
            long x = in.nextInt() - 1;
            long y = (long) Math.sqrt(8 * x + 1);

            if (y * y == (8 * x + 1)) {
                System.out.print("1 ");
            } else{
                System.out.print("0 ");
            }
        }
    }
}
