package lab_8;

import java.io.File;

public class Example_1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("src/lab_8/file1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Created!!!!");
                System.out.println("Absolute path 1: " + f1.getAbsolutePath());
            }

            File f2 = new File("D:\\Dev\\Java\\JavaEducation\\src\\lab_8\\folder1\\folder2\\folder3");
            f2.mkdirs();
            System.out.println("Absolute path 2: " + f2.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Ошибка!!! "+e);
        }
    }
}
