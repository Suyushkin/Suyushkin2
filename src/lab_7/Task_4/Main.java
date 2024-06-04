package lab_7.Task_4;

public class Main {
    public static void main(String[] args) {
        ThirdClass obj1 = new ThirdClass('A', "Hello", 10);
        ThirdClass obj2 = new ThirdClass(obj1);

        System.out.println("obj1: charField = " + obj1.symbol + ", textField = " + obj1.text + ", intField = " + obj1.value);
        System.out.println("obj2: charField = " + obj2.symbol + ", textField = " + obj2.text + ", intField = " + obj2.value);
    }
}
