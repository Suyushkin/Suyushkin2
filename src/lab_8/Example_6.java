package lab_8;

import java.io.*;

public class Example_6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("src/lab_8/file1.txt");
            out = new FileWriter("src/lab_8/file2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (
                IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}

