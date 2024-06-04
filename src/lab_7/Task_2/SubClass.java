package lab_7.Task_2;

public class SubClass extends SuperClass {
    public int value;

    public SubClass(int value, String text) {
        super(text);
        this.value = value;
    }

    @Override
    public void setFields(String text) {
        super.setFields(text);
    }

    public void setFields(int value) {
        this.value = value;
    }

    public void setFields(String text, int value) {
        super.setFields(text);
        this.value = value;
    }

    @Override
    public void setFields() {
        super.setFields();
        this.value = 0;
    }
}
