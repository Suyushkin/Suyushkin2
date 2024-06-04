package lab_4;

import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String inputText = in.nextLine();

        System.out.println("Введите ключ:");
        int key = in.nextInt();

        String encryptedText = encrypt(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        in.nextLine();
        String response = in.nextLine();

        if (response.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        in.close();
    }

    private static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'А' : 'а';
                result.append((char) ((ch - base + key) % 32 + base));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private static String decrypt(String text, int key) {
        int reversedKey = 32 - key;
        return encrypt(text, reversedKey);
    }
}
