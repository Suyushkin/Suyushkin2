package lab_5;

import java.util.Random;

public class Example_5 {
    public static void main(String[] args) {
        Random random = new Random();
        Value value = new Value();

        value.setValue(random.nextInt(150));
        System.out.println(value.getValue());

        value.setValue();
        System.out.println(value.getValue());
    }
}

class Value {
    private int value = 0;

    public void setValue(int value) {
        if (value > 100)
            this.value = 100;
        else
            this.value = value;
    }

    public void setValue() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }


}
