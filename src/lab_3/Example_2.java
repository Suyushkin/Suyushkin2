package lab_3;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели:");
        String weekDay = in.nextLine().toLowerCase();

        if (weekDay.equals("понедельник")) {
            System.out.println(1);
        } else if (weekDay.equals("вторник")) {
            System.out.println(2);
        } else if (weekDay.equals("среда")) {
            System.out.println(3);
        } else if (weekDay.equals("четверг")) {
            System.out.println(4);
        } else if (weekDay.equals("пятница")) {
            System.out.println(5);
        } else if (weekDay.equals("суббота")) {
            System.out.println(6);
        } else if (weekDay.equals("воскресенье")) {
            System.out.println(7);
        } else {
            System.out.println("Такого дня нет");
        }


        switch (weekDay) {
            case "понедельник":
                System.out.println(1);
                break;
            case "вторник":
                System.out.println(2);
                break;
            case "среда":
                System.out.println(3);
                break;
            case "четверг":
                System.out.println(4);
                break;
            case "пятница":
                System.out.println(5);
                break;
            case "суббота":
                System.out.println(6);
                break;
            case "воскресенье":
                System.out.println(7);
                break;
            default:
                System.out.println("Такого дня нет");
                break;
        }

        in.close();
    }
}
