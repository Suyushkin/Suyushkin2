package lab_3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count;
        ArrayList<Integer> div = new ArrayList<Integer>();
        try {
            System.out.println("Введите размер массива: ");
            count = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение.");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (i % 5 == 2) {
                div.add(i);
            }
        }

        System.out.println(div);

        in.close();
    }
}
