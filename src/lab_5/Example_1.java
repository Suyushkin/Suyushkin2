package lab_5;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Chars_1 chars = new Chars_1();

        System.out.println("Input symbol: ");
        char inChar = in.next().charAt(0);
        chars.setSymbol(inChar);

        char sybmol = chars.getSymbol();
        System.out.println("Symbol get: " + sybmol);
        chars.printSymbolAndCode();

        in.close();
    }
}

class Chars_1 {
    private char symbol;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public void printSymbolAndCode() {
        System.out.printf("Symbol: %c\nCode: %d", this.symbol, (int) this.symbol);
    }

}