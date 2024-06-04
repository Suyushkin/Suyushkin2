package lab_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату вашего рожения");

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate birthDate = LocalDate.parse(in.nextLine(), dateFormat);
        LocalDate nowDate = LocalDate.now();
        Period diff = Period.between(birthDate, nowDate);
        System.out.printf("Вам %d лет.", diff.getYears());
    }
}
