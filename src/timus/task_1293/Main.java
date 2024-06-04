package timus.task_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите через пробел кол-во пластин, ширину и длину");
        String[] input = in.nextLine().split(" ");

        for (String i: input) {
            if (Integer.parseInt(i) < 1 || Integer.parseInt(i) > 100) {
                System.out.printf("Введенное число выходит за диапазон 1-100: %d\n", Integer.parseInt(i));
                return;
            }
        }

        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);

        System.out.printf("Вес необходимого для обработки сульфида тория: %d нанограмм\n", N * A *B * 2);
    }
}
