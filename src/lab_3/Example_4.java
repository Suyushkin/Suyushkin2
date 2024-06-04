package lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа");

        int[] num = new int[] {in.nextInt(), in.nextInt()};
        Arrays.sort(num);

        for (int i = num[0]; i <= num[1]; i++) {
            System.out.printf("%d ", i);
        }

        in.close();
    }
}
