package lab_7.Task_5;

class SuperClass {
    protected String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void displayInfo() {
        System.out.println("Class: SuperClass, Text: " + text);
    }
}
