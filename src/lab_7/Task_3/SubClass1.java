package lab_7.Task_3;

class SubClass1 extends SuperClass {
    public char symbol;

    public SubClass1(int value, char symbol) {
        super(value);
        this.symbol = symbol;
    }

    public void setValue(int value, char symbol) {
        super.value = value;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "SubClass1: intValue = " + value + ", charValue = " + symbol;
    }
}
