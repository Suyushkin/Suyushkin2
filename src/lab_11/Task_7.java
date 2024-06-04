package lab_11;

import java.util.List;
import java.util.stream.Collectors;

public class Task_7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список " +
                "строк и возвращает новый список, содержащий только те строки, " +
                "которые имеют длину больше заданного значения.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for (String e : strings) {
            System.out.println(e);
        }

        int length = 9;
        List<String> filteredList = filterByLength(strings, length);

        System.out.println("\nСтрока после преобразования: \n");
        for (String e : filteredList) {
            System.out.println(e);
        }
    }

    public static List<String> filterByLength(List<String> strings, int length) {
        return strings.stream()
                .filter(str -> str.length() > length)
                .collect(Collectors.toList());
    }
}
