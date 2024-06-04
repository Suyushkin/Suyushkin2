package lab_7.Task_3;

public class Main {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass(10);
        SubClass1 obj2 = new SubClass1(20, 'A');
        SubClass2 obj3 = new SubClass2(30, 'B', "Hello");

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}
