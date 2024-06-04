package lab_6;

public class Example_1 {
    public static void main(String[] args) {
        StrChar object = new StrChar();

        String str = "Hello World!";
        char symbol = 's';

        System.out.println("Set string:");
        object.setValue(str);
        object.printFields();

        System.out.println("\nSet char:");
        object.setValue(symbol);
        object.printFields();

        System.out.println("\nSet char array length > 1:");
        object.setValue(str.split(" ")[0].toCharArray());
        object.printFields();

        System.out.println("\nSet char array length = 1:");
        object.setValue(str.split(" ")[0].toCharArray()[0]);
        object.printFields();
    }
}

class StrChar {

    private char symbol = ' ';
    private String text = "";

    public void setValue(String str) {
        this.text = str;
    }

    public void setValue(char symbol) {
        this.symbol = symbol;
    }

    public void setValue(char[] symbols) {
        if (symbols.length > 1)
            this.text = new String(symbols);
        else
            this.symbol = symbols[0];
    }

    public void printFields() {
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Text: " + this.text);
    }

}