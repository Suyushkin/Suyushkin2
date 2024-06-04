package lab_11;

import java.util.List;
import java.util.stream.Collectors;

public class Task_5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк" +
                "и возвращает новый список, содержащий только те строки, " +
                "которые содержат заданную подстроку.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for (String e : strings) {
            System.out.println(e);
        }

        String substring = "ок";
        List<String> filteredList = filterStringsBySubstring(strings, substring);
        System.out.println("\nСтрока после преобразования: \n");
        for (String e : filteredList) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsBySubstring(List<String> list, String substring) {
        return list.stream()
                .filter(str -> str.contains(substring))
                .collect(Collectors.toList());
    }
}
