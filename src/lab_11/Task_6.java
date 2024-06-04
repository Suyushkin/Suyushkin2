package lab_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        List<Integer> integers = new ArrayList<>();
        System.out.println("Введите делитель: ");
        int divisor = in.nextInt();
        if (divisor == 0) {
            System.out.println("Делить на 0 нельзя");
            return;
        }

        System.out.println("\nСписок до: \n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterDivision(integers, divisor);

        System.out.println("\nСписок после возведения в квадрат: \n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterDivision(List<Integer> list, int divisor) {
        return list.stream()
                .filter(num -> num % divisor == 0)
                .collect(Collectors.toList());
    }
}
