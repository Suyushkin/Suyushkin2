package lab_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Example_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько вам лет");

        int years = in.nextInt();
        LocalDate nowDate = LocalDate.now();
        System.out.printf("Вы родились в %d году.", nowDate.minusYears(years).getYear());

    }
}