package practiceAssignments.methodsAssignments_6;

public class PositiveNegativeOrZeroProgram {
    static void checkNumber(int num) {
        if (num==0) {
            System.out.println("The number is zero");
        } else if (num<0) {
            System.out.println("The number is less than zero");
        } else {
            System.out.println("The number is greater than zero");
        }
    }
    public static void main(String[] args) {
        checkNumber(-10);
    }
}


