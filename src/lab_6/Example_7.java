package lab_6;

import java.util.Arrays;
import java.util.Scanner;

public class Example_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст: ");
        int[] charCodeArray = CharArray.getCharCodes(in.nextLine().toCharArray());
        System.out.println(Arrays.toString(charCodeArray));

        in.close();
    }
}

class CharArray {

    public static int[] getCharCodes(char[] charArray) {
        int length = charArray.length;
        int[] charCodes = new int[length];
        for (int i = 0; i < length; i++) {
            charCodes[i] = charArray[i];
        }
        return charCodes;
    }
}