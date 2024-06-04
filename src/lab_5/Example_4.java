package lab_5;

import java.util.Random;

public class Example_4 {
    public static void main(String[] args) {
        Random random = new Random();
        CharOfNumber object_1 = new CharOfNumber((char) (random.nextInt(89)+33), random.nextInt(100));
        CharOfNumber object_2 = new CharOfNumber(random.nextDouble(89)+33);

        object_1.printFields();
        object_2.printFields();
    }
}

class CharOfNumber {
    private char symbol;
    private int number;

    CharOfNumber(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    CharOfNumber(double value) {
        this.symbol = (char) (int) value;
        this.number = Integer.parseInt(String.format("%.2f", value).split(",")[1]);
    }

    public void printFields() {
        System.out.printf("Symbol: %c\nNumber: %d\n", this.symbol, this.number);
    }
}
