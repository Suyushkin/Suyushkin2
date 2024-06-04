package timus.task_1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int code1 = in.nextInt();
        int code2 = in.nextInt();

        if (code1 > 9999 || code1 < 0 || code2 > 9999 || code2 < 0) {
            return;
        }

        for (int i = 0; i <= 9999; i++) {
            if (i % 2 == 0) {
                if (i == code1) {
                    System.out.println("yes");
                    return;
                }
            } else {
                if (i == code2) {
                    System.out.println("yes");
                    return;
                }
            }
        }
        System.out.println("no");

        in.close();
    }
}
