package lab_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int count = in.nextInt();
        int sum = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 1; i <= count; i++) {
            System.out.printf("Введите число №%d: ", i);
            nums.add(in.nextInt());
        }
        ////////////////////////
        for (int i : nums) {
            sum += i;
        }
        System.out.printf("Сумма введенных чисел равна: %d\n", sum);
        ////////////////////////
        sum = 0;
        for (int i = 0; i < count; i++) {
            sum += nums.get(i);
        }
        System.out.printf("Сумма введенных чисел равна: %d\n", sum);
        ////////////////////////
        sum = 0;
        int i = 0;
        while (i < nums.size()) {
            sum += nums.get(i);
            i++;
        }
        System.out.printf("Сумма введенных чисел равна: %d\n", sum);
        ////////////////////////
        sum = 0;
        i = 0;
        do {
            sum += nums.get(i);
            i++;
        } while (i < nums.size());
        System.out.printf("Сумма введенных чисел равна: %d\n", sum);

        in.close();
    }
}
