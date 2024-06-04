package lab_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        List<Integer> integers = new ArrayList<>();
        System.out.println("Введите значение: ");
        int value = in.nextInt();

        System.out.println("\nСписок до: \n");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterLarger(integers, value);

        System.out.println("\nСписок после: \n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterLarger(List<Integer> list, int value) {
        return list.stream()
                .filter(num -> num > value)
                .collect(Collectors.toList());
    }
}
