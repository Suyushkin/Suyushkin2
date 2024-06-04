/*
* Напишите программу, в которой Пользователь вводит имя и возраст.
* Программа отображает сообщение об имени и возрасте пользователя.
*/

package lab_1;

import java.util.Scanner;

public class Example_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input age: ");
        int age = in.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        in.close();
    }
}
