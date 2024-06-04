package lab_7.Task_5;

public class Main {
    public static void main(String[] args) {
        SuperClass superClassObject1 = new SuperClass("Hello");
        SubClass1 subClass1Object1 = new SubClass1("World", 10);
        SubClass2 subClass2Object1 = new SubClass2("Java", 'A');
        superClassObject1.displayInfo();
        subClass1Object1.displayInfo();
        subClass2Object1.displayInfo();
        System.out.println();

        SuperClass superClassObject2 = new SuperClass("Hello");
        SuperClass subClass1Object2 = new SubClass1("World", 20);
        SuperClass subClass2Object2 = new SubClass2("Java", 'A');
        superClassObject2.displayInfo();
        subClass1Object2.displayInfo();
        subClass2Object2.displayInfo();
        System.out.println();
    }

}
