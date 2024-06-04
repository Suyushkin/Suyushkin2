package lab_6;

import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println(PowSum.powSum(num));
        System.out.println(PowSum.check(num));
        in.close();
    }
}

class PowSum {
    public static int powSum(int n) {
        if (n <= 1)
            return 1;
        return (int) Math.pow(n, 2) + powSum(n - 1);
    }

    public static boolean check(int n) {
        return powSum(n) == (n + 1) * (2 * n + 1) / 6;
    }
}
