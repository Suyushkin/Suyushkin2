package lab_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        Integer[] nums = new Integer[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
        }

        Arrays.sort(nums, Collections.reverseOrder());

        for (int i : nums) {
            System.out.println(i);
        }

        in.close();
    }
}
