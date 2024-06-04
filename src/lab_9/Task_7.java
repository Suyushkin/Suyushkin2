package lab_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во человек: ");
        int n = in.nextInt();

        long startTimeArray = System.nanoTime();
        ArrayList<Integer> listArray = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            listArray.add(i);
        }

        int indexArray = 0;
        while (listArray.size() > 1) {
            indexArray = (indexArray + 1) % listArray.size();
            listArray.remove(indexArray);
        }

        int winnerArray = listArray.get(0);
        System.out.println("Победитель: " + winnerArray);
        long endTimeArray = System.nanoTime();
        long durationArray = (endTimeArray - startTimeArray) / 1000000;
        System.out.println("Время выполнения: " + durationArray + " мс");



        long startTimeLinked = System.nanoTime();
        LinkedList<Integer> listLinked = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            listLinked.add(i);
        }

        int indexLinked = 0;
        while (listLinked.size() > 1) {
            indexLinked = (indexLinked + 1) % listLinked.size();
            listLinked.remove(indexLinked);
        }

        int winnerLinked = listLinked.get(0);
        System.out.println("Победитель: " + winnerLinked);
        long endTimeLinked = System.nanoTime();
        long durationLinked = (endTimeLinked - startTimeLinked) / 1000000;
        System.out.println("Время выполнения: " + durationLinked + " мс");
        in.close();
    }
}
