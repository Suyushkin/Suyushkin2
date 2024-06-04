package lab_6;

import java.util.Arrays;
import java.util.Random;

public class Example_8 {
    public static void main(String[] args) {
        int[] array = Average.generateRandomArray(10);
        System.out.println(Arrays.toString(array));
        double average = Average.getAverage(array);
        System.out.println("Среднее значение: " + average);
    }
}

class Average {

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    public static double getAverage(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        } else {
            double sum = 0.0;
            for (int element : arr) {
                sum += element;
            }
            return sum / arr.length;
        }
    }
}