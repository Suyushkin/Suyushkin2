package lab_7.Task_5;

class SubClass1 extends SuperClass {
    protected int value;

    public SubClass1(String text, int value) {
        super(text);
        this.value = value;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class: SubClass1, Text: " + text + ", intValue: " + value);
    }
}
