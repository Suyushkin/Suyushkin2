package timus.task_1880;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = (int) Math.pow(10, 9);
        HashMap<Integer, Integer> psychUp = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            int length = in.nextInt();
            if (length < 1 || length > 4000)
                return;

            in.nextLine();
            String[] input = in.nextLine().split(" ");
            int[] array = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                int num = Integer.parseInt(input[j]);
                if (num < 0 || num > limit)
                    return;
                array[j] = num;
            }

            int uniqueCount = Arrays.stream(array).distinct().toArray().length;
            if (uniqueCount != length)
                return;

            for (int num : array) {
                if (psychUp.containsKey(num))
                    psychUp.put(num, psychUp.get(num) + 1);
                else
                    psychUp.put(num, 1);
            }
        }

        int count = 0;
        for (int key : psychUp.keySet()) {
            if (psychUp.get(key) == 3)
                count += 1;
        }
        System.out.println(count);

        in.close();
    }
}
