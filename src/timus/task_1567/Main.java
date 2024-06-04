package timus.task_1567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] table = {".,!", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", " "};
        String string;
        int sum = 0;
        string = in.nextLine();

        for (char c : string.toCharArray()) {
            for (String s : table) {
                if (s.contains(String.valueOf(c))) {
                    sum += s.indexOf(c) + 1;
                }
            }
        }
        System.out.print(sum);
    }
}
