package lab_7.Task_4;

class SecondClass extends FirstClass {
    public String text;

    public SecondClass(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    public SecondClass(SecondClass obj) {
        super(obj);
        this.text = obj.text;
    }
}