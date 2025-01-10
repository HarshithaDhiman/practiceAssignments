package practiceAssignments.ternaryOperatorAssignments_8;

public class Assignment2 {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 15;
        System.out.println((a>b) ? ((b>c)?"a is greater":"b is greater"):"c is greater");
    }
}