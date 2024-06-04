/*
* Напишите программу, в которой Пользователь вводит сначала фамилию,
* затем имя, затем отчество. После ввода программа выводит сообщение «Hello
* <фамилия, имя, отчество>».
*/

package lab_1;

import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input firstName: ");
        String firstName = in.nextLine();
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input secondName: ");
        String secondName = in.nextLine();
        System.out.println(String.join(" ", "Hello", firstName, name, secondName));
        in.close();
    }
}
