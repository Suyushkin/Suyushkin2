package lab_7.Task_4;

class FirstClass {
    public char symbol;

    public FirstClass(char symbol) {
        this.symbol = symbol;
    }

    public FirstClass(FirstClass obj) {
        this.symbol = obj.symbol;
    }
}