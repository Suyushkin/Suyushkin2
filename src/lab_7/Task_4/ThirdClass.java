package lab_7.Task_4;

class ThirdClass extends SecondClass {
    public int value;

    public ThirdClass(char symbol, String text, int value) {
        super(symbol, text);
        this.value = value;
    }

    public ThirdClass(ThirdClass obj) {
        super(obj);
        this.value = obj.value;
    }
}
