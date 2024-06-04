package timus.task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        if (n < 1 || n > 1000 || k < 1 || k > 1000) {
            return;
        }

        int minutes = 0;

        if (n <= k) {
            minutes = 2;
        } else {
            minutes =  (int) Math.ceil((float) n / k * 2);
        }
        System.out.println(minutes);

        in.close();
    }
}
