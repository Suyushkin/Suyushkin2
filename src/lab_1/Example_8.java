/*
* Напишите программу, в которой Пользователь последовательно вводит
* название текущего дня недели, название месяца и дату (номер дня в месяце).
* Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).
*/

package lab_1;

import java.util.Locale;
import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String weekDay = in.nextLine();
        System.out.println("Введите название месяца: ");
        String monthName = in.nextLine();
        System.out.println("Введите номер дня: ");
        int monthDay = in.nextInt();

        System.out.println(String.join(" ", "Сегодня", weekDay.toLowerCase(), Integer.toString(monthDay), monthName.toLowerCase()));
    }
}
