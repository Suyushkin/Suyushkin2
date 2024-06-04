package lab_5;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] inChars = {
                in.next().charAt(0),
                in.next().charAt(0)
        };
        Chars_2 chars = new Chars_2(inChars[0], inChars[1]);
        chars.printSymbols();

        in.close();
    }
}

class Chars_2 {
    final char symbol_1;
    final char symbol_2;

    Chars_2(char symbol_1, char symbol_2) {
        this.symbol_1 = symbol_1;
        this.symbol_2 = symbol_2;
    }

    public void printSymbols() {
        System.out.println("Symbols: ");
        if ((int) this.symbol_1 < (int) this.symbol_2) {
            for (int i = this.symbol_1; i <= (int) this.symbol_2; i++) {
                System.out.printf("%c ", (char) i);
            }
        } else if ((int) this.symbol_1 > (int) this.symbol_2) {
            for (int i = this.symbol_1; i >= (int) this.symbol_2; i--) {
                System.out.printf("%c ", (char) i);
            }
        } else {
            System.out.println(this.symbol_1 + " " + this.symbol_2);
        }
    }
}