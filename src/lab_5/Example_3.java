package lab_5;

import java.util.Random;

public class Example_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Numbers numbers_1 = new Numbers(random.nextInt(100));
        Numbers numbers_2 = new Numbers(random.nextInt(100), random.nextInt(100));

        numbers_1.printFieldsValue();
        numbers_2.printFieldsValue();
    }
}

class Numbers {

    private int number_1;
    private int number_2;

    Numbers(int number) {
        this.number_1 = number;
    }

    Numbers(int number_1, int number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    public void printFieldsValue() {
        System.out.printf("Value_1: %d\nValue_2: %d\n", this.number_1, this.number_2);
    }
}
