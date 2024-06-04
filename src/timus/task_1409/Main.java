package timus.task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int garry = in.nextInt();
        int larry = in.nextInt();

        if (garry + larry - 1 > 10) {
            return;
        }

        System.out.printf("%d %d", --larry, --garry);

        in.close();
    }
}
