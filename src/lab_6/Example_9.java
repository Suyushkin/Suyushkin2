package lab_6;

import java.util.Scanner;

public class Example_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        char[] text = in.nextLine().toCharArray();
        Swap.swapPairs(text);
        System.out.println(text);
        in.close();
    }
}

class Swap {
    static void swapPairs (char[] array) {
        if (array.length <= 1) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
