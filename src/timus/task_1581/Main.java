package timus.task_1581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt() - 1;
            int num = in.nextInt();
            int count = 1;
            if (N == 0) {
                System.out.println(count + " " + num);
                continue;
            }
            int nextNum = in.nextInt();
            while (N >= 0) {
                if (N != 0) {
                    if (num == nextNum) {
                        ++count;
                    } else {
                        System.out.print(count + " " + num + " ");
                        num = nextNum;
                        count = 1;
                    }
                } else {
                    System.out.print(count + " " + num + " ");
                }
                --N;
                if (N > 0) {
                    nextNum = in.nextInt();
                }
            }
            System.out.println();
        }
    }
}
