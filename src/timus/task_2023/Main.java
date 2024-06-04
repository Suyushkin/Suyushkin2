package timus.task_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        in.nextLine();
        int prev=0;
        int steps=0;
        for (int i = 0; i < n; i++) {
            String s=in.nextLine();
            int b;
            if(s.startsWith("A") || s.startsWith("P") || s.startsWith("O") || s.startsWith("R"))
                b = 0;
            else if(s.startsWith("B") || s.startsWith("M") || s.startsWith("S"))
                b = 1;
            else
                b = 2;
            steps+=(Math.abs(prev-b));
            prev=b;
        }
        System.out.println(steps);
    }
}
