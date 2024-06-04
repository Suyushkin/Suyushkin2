package lab_9.Task_1;

public class Example_5 {
    public static void main(String[] args) {
        System.out.println(fact(5, ""));
    }

    public static int fact(int n, String indent) {
        System.out.println(indent + " " + n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n - 1, indent + "  ") + fact(n - 2, indent + "  ");
        }
    }
}
