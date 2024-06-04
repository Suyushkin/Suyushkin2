package lab_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        System.out.printf("Размер массива равен %d", size);

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.printf("Элемент массива [%d] = %d\n", i, nums[i]);
        }

        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Элемент массива [%d] после сортировки = %d\n", i, nums[i]);
        }

        System.out.printf("Минимальный элемент массива = %d\n", nums[0]);
        System.out.print("Индексы элемента с минимальным знаачением: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[0]) {
                System.out.printf("%d ", i);
            }
        }

        in.close();
    }
}
