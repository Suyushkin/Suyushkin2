package lab_6;

import java.util.Arrays;
import java.util.Random;

public class Example_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt(99) + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array:");
        MinMaxAverage.print(array);

        System.out.println("\nSequence:");
        MinMaxAverage.print(
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        );
    }
}

class MinMaxAverage {
    public static void print(int... num) {
        System.out.println(Min(0, num));
        System.out.println(Max(0, num));
        System.out.println(Mean(num));
    }

    private static int Min(int index, int... a) {
        if (index == a.length - 1)
            return a[index];
        return Math.min(a[index], Min(index + 1, a));
    }

    private static int Max(int index, int... a) {
        if (index == a.length - 1)
            return a[index];
        return Math.max(a[index], Max(index + 1, a));
    }

    private static float Mean(int... a) {
        return (float) Arrays.stream(a).sum() / a.length;
    }
}