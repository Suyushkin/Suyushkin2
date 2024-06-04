package lab_4;

public class Example_1 {
    public static void main(String[] args) {
        int width = 23;
        int height = 11;

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
