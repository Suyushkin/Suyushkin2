package lab_6;

import java.util.Arrays;

public class Example_10 {
    public static void main(String[] args) {
        int[] array = Average.generateRandomArray(10);
        System.out.println(Arrays.toString(array));
        int[] result = ArrayMinMax.minMax(array);
        System.out.printf("Min: %d\nMax: %d", result[0], result[1]);
    }
}

class ArrayMinMax {

    public static int[] minMax(int... args) {
        int min = args[0];
        int max = args[0];

        for (int arg : args) {
            if (arg < min) {
                min = arg;
            }
            if (arg > max) {
                max = arg;
            }
        }

        return new int[]{min, max};
    }
}