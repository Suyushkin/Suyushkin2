package lab_7.Task_3;

class SubClass2 extends SubClass1 {
    public String text;

    public SubClass2(int value, char symbol, String text) {
        super(value, symbol);
        this.text = text;
    }

    public void setValue(int value, char symbol, String text) {
        super.value = value;
        super.symbol = symbol;
        this.text = text;
    }

    @Override
    public String toString() {
        return "SubClass2: intValue = " + value + ", charValue = " + symbol + ", stringValue = " + text;
    }
}
