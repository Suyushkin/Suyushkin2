package lab_6;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long factorial = DoubleFactorial.doubleFactorial(in.nextInt());
        System.out.println(factorial);

        in.close();
    }
}

class DoubleFactorial {

    public static long doubleFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * doubleFactorial(n - 2);
    }
}