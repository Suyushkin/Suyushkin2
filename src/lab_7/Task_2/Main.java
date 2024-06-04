package lab_7.Task_2;

import lab_7.Task_1.SuperClassTest;

public class Main {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass("передал в конструктор суперкласса");
        System.out.println("Super:");
        System.out.println("\tТекст: " + superClassObject.getText());
        System.out.println("\tДлина текста: " + superClassObject.getLength());
        System.out.println();

        superClassObject.setFields("изменил текст суперкласса");
        System.out.println("\tТекст: " + superClassObject.getText());
        System.out.println("\tДлина текста: " + superClassObject.getLength());
        System.out.println();

        superClassObject.setFields();
        System.out.println("\tТекст: " + superClassObject.getText());
        System.out.println("\tДлина текста: " + superClassObject.getLength());
        System.out.println();

        System.out.println("Sub:");
        SubClass subClassObject = new SubClass(10, "передал в конструктор подкласса");
        System.out.println("\tТекст: " + subClassObject.getText());
        System.out.println("\tДлина текста: " + subClassObject.getLength());
        System.out.println("\tЦелочисленное значение: " + subClassObject.value);
        System.out.println();

        subClassObject.setFields("изменил текст подкласса");
        System.out.println("\tТекст: " + subClassObject.getText());
        System.out.println("\tДлина текста: " + subClassObject.getLength());
        System.out.println("\tЦелочисленное значение: " + subClassObject.value);
        System.out.println();

        subClassObject.setFields(20);
        System.out.println("\tТекст: " + subClassObject.getText());
        System.out.println("\tДлина текста: " + subClassObject.getLength());
        System.out.println("\tЦелочисленное значение: " + subClassObject.value);
        System.out.println();

        subClassObject.setFields();
        System.out.println("\tТекст: " + subClassObject.getText());
        System.out.println("\tДлина текста: " + subClassObject.getLength());
        System.out.println("\tЦелочисленное значение: " + subClassObject.value);
        System.out.println();
    }
}