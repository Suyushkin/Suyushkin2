package lab_6;

import java.util.Arrays;

public class Example_6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] result1 = ArrayCopy.copyArray(array, 3);
        int[] result2 = ArrayCopy.copyArray(array, 6);
        int[] result3 = ArrayCopy.copyArray(array, 0);

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
        System.out.println(java.util.Arrays.toString(result3));
    }
}

class ArrayCopy {

    public static int[] copyArray(int[] array, int n) {
        if (n > array.length) {
            return Arrays.copyOf(array, array.length);
        }

        return Arrays.copyOfRange(array, 0, n);
    }
}