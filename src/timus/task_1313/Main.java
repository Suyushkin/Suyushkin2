package timus.task_1313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                arr[i][j] = in.nextInt();
            }
        }

        for(int c = 0; c < 2 * n; ++c){
            for(int i = n - 1; i >= 0; --i){
                int j = c - i;
                if(0 <= j && j < n)
                    System.out.print(arr[i][j] + " ");;
            }
        }
    }
}
