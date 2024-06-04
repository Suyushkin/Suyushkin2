package lab_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 10;
        ArrayList<Character> charArray = new ArrayList<>();
        Character[] omitArray = new Character[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';

        while (charArray.size() < n) {
            if (!Arrays.asList(omitArray).contains(b)) {
                charArray.add(b);
            }
            b += 1;
        }
        System.out.print(charArray);

        in.close();
    }
}
