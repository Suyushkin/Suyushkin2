package lab_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String inputText = in.nextLine();

        System.out.println("Введите ключ:");
        int key = in.nextInt();

        String customAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Map<Character, Integer> charToIndex = new HashMap<>();
        for (int i = 0; i < customAlphabet.length(); i++) {
            charToIndex.put(customAlphabet.charAt(i), i);
        }

        String encryptedText = encrypt(inputText, key, customAlphabet, charToIndex);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        in.nextLine();
        String response = in.nextLine();

        if (response.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key, customAlphabet, charToIndex);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        in.close();
    }

    private static String encrypt(String text, int key, String customAlphabet, Map<Character, Integer> charToIndex) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (charToIndex.containsKey(ch)) {
                int index = (charToIndex.get(ch) + key) % customAlphabet.length();
                result.append(customAlphabet.charAt(index));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private static String decrypt(String text, int key, String customAlphabet, Map<Character, Integer> charToIndex) {
        int reversedKey = customAlphabet.length() - key;
        return encrypt(text, reversedKey, customAlphabet, charToIndex);
    }
}
