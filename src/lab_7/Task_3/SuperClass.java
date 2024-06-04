package lab_7.Task_3;

public class SuperClass {
    public int value;

    public SuperClass(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SuperClass: intValue = " + value;
    }
}
