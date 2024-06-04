package lab_3;

import java.util.Scanner;

public class Example_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 10;
        char[] charArray = new char[n];
        char b = 'a';

        for (int i = 0; i < charArray.length; i++){
            charArray[i] = b;
            b+=2;
            System.out.print(charArray[i] + "\t");
        }

        System.out.println();
        for (int i = charArray.length - 1 ; i >= 0; i--){
            System.out.print(charArray[i] + "\t");
        }

        in.close();
    }
}
