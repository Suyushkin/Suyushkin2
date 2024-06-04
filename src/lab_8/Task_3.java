package lab_8;

import java.io.*;

public class Task_3 {
    public static void main(String[] args) {
        String sourceFilePath = "src/lab_8/file1.txt";
        String destinationFilePath = "src/lab_8/file2.txt";

        try {
            FileReader fileReader = new FileReader(sourceFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(destinationFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            int lineNumber = 1;

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                int consonantWordCount = 0;

                for (String word : words) {
                    if (word.length() <= 1)
                        continue;
                    if (startsWithConsonant(word)) {
                        bufferedWriter.write("Строка " + lineNumber + ": " + word);
                        bufferedWriter.newLine();
                        consonantWordCount++;
                    }
                }
                bufferedWriter.write("Количество выбранных слов: " + consonantWordCount);
                bufferedWriter.newLine();
                bufferedWriter.newLine();

                lineNumber++;
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Извлечение слов успешно завершено.");
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }

    }

    private static boolean startsWithConsonant(String word) {
        String consonant = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
        for (int i = 0; i < consonant.length(); i++) {
            if (word.charAt(0) == consonant.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
