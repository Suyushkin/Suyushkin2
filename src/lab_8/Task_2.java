package lab_8;

import java.io.*;

public class Task_2 {
    public static void main(String[] args) {
        String sourceFilePath = "src/lab_8/file1.txt";
        String destinationFilePath = "src/lab_8/file2.txt";

        try {
            FileReader fileReader = new FileReader(sourceFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(destinationFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String firstLine = bufferedReader.readLine();
            bufferedWriter.write(firstLine);
            bufferedWriter.newLine();

            String secondLine = bufferedReader.readLine();

            String[] numbers = secondLine.split("\\s+");

            for (String number : numbers) {
                try {
                    double num = Double.parseDouble(number);
                    if (num > 0) {
                        bufferedWriter.write(Double.toString(num));
                        bufferedWriter.newLine();
                    }
                } catch (NumberFormatException e) {
                }
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Данные успешно переписаны в результирующий файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
