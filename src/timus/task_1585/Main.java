package timus.task_1585;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string;
        int N = in.nextInt();
        in.nextLine();
        int E = 0, M = 0, L = 0;

        for (int i = 0; i < N; i++) {
            string = in.nextLine();
            if (Objects.equals(string, "Emperor Penguin"))
                E++;
            if (Objects.equals(string, "Macaroni Penguin"))
                M++;
            if (Objects.equals(string, "Little Penguin"))
                L++;
        }
        int MAX = Math.max(E, Math.max(M, L));
        if (MAX == E)
            System.out.print("Emperor Penguin");
        else if (MAX == M)
            System.out.print("Macaroni Penguin");
        else
            System.out.print("Little Penguin");
    }
}
