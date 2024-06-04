package lab_11;

import java.util.List;
import java.util.stream.Collectors;

public class Task_9 {
    public static void main(String[] args) {
        String string = "Напишите функцию, к0т0рая принимает на 8х0д спис0к " +
                "стр0к и 8о3вращает н08ый спис0к, с0держащий т0льк0 те стр0ки, " +
                "к0т0рые с0держат т0льк0 бук8ы (без 4ифр и симв0л0в).";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> filteredList = filterLetterStrings(strings);

        System.out.println("\nСтрока после преобразования: \n");
        for (String e : filteredList) {
            System.out.println(e);
        }
    }

    public static List<String> filterLetterStrings(List<String> strings) {
        return strings.stream()
                .filter(str -> str.matches("[а-яА-Я]+"))
                .collect(Collectors.toList());
    }
}
