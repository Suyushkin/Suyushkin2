package lab_6;

public class Example_2 {
    public static void main(String[] args) {
        StaticNumber.printNumber();
        StaticNumber.printNumber();
        StaticNumber.printNumber();
    }
}

class StaticNumber {
    private static int number = 0;

    public static void printNumber() {
        System.out.println(number++);
    }
}