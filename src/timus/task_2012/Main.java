package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        if (count < 1 || count > 11) {
            return;
        }

        // Если кол. минут для решения оставшихся задач будет больше или равно 0 от кол. минут в 4-х часах, то YES
        if (4 * 60 - (12 - count) * 45 >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        in.close();
    }
}
