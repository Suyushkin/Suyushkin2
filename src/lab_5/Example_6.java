package lab_5;

public class Example_6 {
    public static void main(String[] args) {
        MinMax minMax = new MinMax(5, 10);
        minMax.showValues();
        minMax.setValues(20, 10);
        System.out.println("Set values");
        minMax.showValues();
    }
}

class MinMax {
    private int max;
    private int min;

    public MinMax(int max, int min) {
        this.setValues(max, min);
    }

    public void setValues(int max, int min) {
        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }
        this.max = max;
        this.min = min;
    }

    public void showValues() {
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
