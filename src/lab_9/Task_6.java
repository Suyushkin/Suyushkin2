package lab_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(0, "ноль");
        hashMap.put(1, "один");
        hashMap.put(2, "два");
        hashMap.put(3, "три");
        hashMap.put(4, "четыре");
        hashMap.put(5, "пять");
        hashMap.put(6, "шесть");
        hashMap.put(7, "семь");
        hashMap.put(8, "восемь");
        hashMap.put(9, "девять");


        int result = 1;
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            if (key == 0) {
                System.out.println( String.join(", ", hashMap.values()) + ", ");
            }
            if (key > 5) {
                System.out.println("Key: " + key + ", Value: " + value);
            }
            if (value.length() > 5) {
                result *= key;
            }
        }

        System.out.println("Произвежение 5: " + result);
    }
}
