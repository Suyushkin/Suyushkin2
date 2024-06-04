package timus.task_2100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        if (count < 1 || count > 20)
            return;

        int total = count + 2;
        for (int i = 1; i <= count; i++) {
            String input = in.next();
            if (input.split("\\+").length > 1)
                total += 1;
        }

        if (total == 13)
            total += 1;

        System.out.println(total * 100);

        in.close();
    }
}
