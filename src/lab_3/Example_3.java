package lab_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в последовательности");
        int count = in.nextInt();
        if (count < 2)
            return;

        // For
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        sequence.add(1);
        sequence.add(1);

        for (int i = 2; i < count; i++) {
            sequence.add(sequence.get(i-1) + sequence.get(i-2));
        }

        System.out.println("Последовательность Фибоначчи полученная циклом For равна:");
        for (int i : sequence) {
            System.out.printf("%d ", i);
        }

        // While
        sequence.clear();
        sequence.add(1);
        sequence.add(1);

        while (sequence.size() < count) {
            int size = sequence.size();
            sequence.add(sequence.get(size-1) + sequence.get(size-2));
        }

        System.out.println("\nПоследовательность Фибоначчи полученная циклом While равна:");
        for (int i : sequence) {
            System.out.printf("%d ", i);
        }

        // Do While
        sequence.clear();
        sequence.add(1);
        sequence.add(1);

        do {
            int size = sequence.size();
            sequence.add(sequence.get(size-1) + sequence.get(size-2));
        } while (sequence.size() < count);

        System.out.println("\nПоследовательность Фибоначчи полученная циклом Do While равна:");
        for (int i : sequence) {
            System.out.printf("%d ", i);
        }

        in.close();
    }
}
