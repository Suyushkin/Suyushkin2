package timus.task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        if (count < 1 || count > 2000) {
            return;
        }

        int[] intervals = {0, 4, 9, 19, 49, 99, 249, 499, 999};
        String[] localizations = {"few", "several", "pack", "lots", "horde", "throng", "swarm", "zounds", "legion"};

        for (int i = intervals.length - 1; i >= 0; i--) {
            if (count > intervals[i]) {
                System.out.println(localizations[i]);
                return;
            }
        }

        in.close();
    }
}
