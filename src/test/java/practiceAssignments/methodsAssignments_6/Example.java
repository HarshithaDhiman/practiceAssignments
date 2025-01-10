package practiceAssignments.methodsAssignments_6;

public class Example {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.instanceMethod();
        Example.staticMethod();
    }
    public void instanceMethod() {
        System.out.println("Instance Method");
    }
    public static void staticMethod() {
        System.out.println("Static Method");
    }
}
