package lab_7.Task_5;

class SubClass2 extends SuperClass {
    protected char symbol;

    public SubClass2(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class: SubClass2, Text: " + text + ", charValue: " + symbol);
    }
}
