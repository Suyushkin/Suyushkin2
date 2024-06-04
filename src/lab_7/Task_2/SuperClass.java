package lab_7.Task_2;

public class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void setFields(String text) {
        this.text = text;
    }

    public void setFields() {
        this.text = "";
    }

    public String getText() {
        return this.text;
    }
    public int getLength() {
        return text.length();
    }
}
